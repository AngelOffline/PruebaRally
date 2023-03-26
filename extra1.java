import java.util.Iterator;
import java.util.*;
import java.util.random.*;


public class extra1 {
    public static void main(String[]args){
        Scanner sc = new Scanner(System.in);
        Random random = new Random();

        String[] soldNom = {"Angel", "Jose", "Itzel", "Hector", "Antonio", "Saul", "Miguel", "Vladimir", "Carlos", "Ricardo", "Alejandro", "Jeronimo", "Andres", "Victor", "Daniel", "Michael", "Jesus", "Leon","Sebastian","Valentin" }; 
        String[] solApe = {"Jose", "Carreon", "Dominguez", "Luna", "Rosas", "Garcia", "Renteria", "Mora", "Iturbide", "Rosalio", "Vazquez", "Gonzales", "Guzman", "Emiliano", "Zapata"};
        System.out.println("Ingresa el numero de soldados");
        int n = sc.nextInt();
        ListaCircular<String> romanos = new ListaCircular<String>();
        for(int i = 1; i < n+1; i++){
            int randomNom = random.nextInt(19);
            int randomApe = random.nextInt(14);
            romanos.agrega(soldNom[randomNom] + " " + solApe[randomApe]);
        }


        Iterator<String> iterador = romanos.iterator();

        int contador = 1;
        while(iterador.hasNext() && romanos.getTamanio() > 1){ // genera el circulo con eleiminaciones
            int j = random.nextInt(100);
            String sold= " ";
            for(int i = 1; i<j; i++){ // genera los saltos aleatorios usando j como variable random
               
               sold = iterador.next();
            }
            
            System.out.println("el salto numero " + contador + " es de " + j + " saltos y murió el soldado " + sold);
            iterador.remove();
            contador ++;
        }

        System.out.println("la posicion del sobreviviente es: " + romanos.toString());



     

    }   

}
