import java.util.Iterator;
import java.util.*;

public class implementacion {
    public static void main(String[]args){
        Scanner sc = new Scanner(System.in);
        Random random = new Random();


        System.out.println("Ingresa el numero de soldados");
        int n = sc.nextInt();
        ListaCircular<Integer> romanos = new ListaCircular<Integer>();
        for(int i = 1; i < n+1; i++){
            romanos.agrega(i);
        }

        Iterator<Integer> iterador = romanos.iterator();

        int contador = 1;
        while(iterador.hasNext() && romanos.getTamanio() > 1){
            int j = random.nextInt(100);
            
            for(int i = 1; i<j; i++){
               
               iterador.next();
            }
            
            System.out.println("el salto numero " + contador + " es de " + j + " saltos");
            iterador.remove();
            contador ++;
        }

        System.out.println("la posicion del sobreviviente es: " + romanos.toString());

    }   

}
