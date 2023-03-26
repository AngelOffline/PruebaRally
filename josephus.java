import java.util.Iterator;

public class josephus {
    public static void main(String[]args){
        ListaCircular<Integer> romanos = new ListaCircular<Integer>();
        
        for(int i=1; i<42; i++){
            romanos.agrega(i);
        }
      
        

       System.out.println(romanos.toString());  
       
       Iterator<Integer> iterador = romanos.iterator();
        while(iterador.hasNext() && romanos.getTamanio() > 1){
            for(int i=1; i<3; i++){
                iterador.next();
            }
            iterador.remove();
            System.out.println(romanos.toString());
        }
       
        System.out.println("la posicion de josephus para poder sobrevivir es en la posicion: " + romanos.toString());
     }
}
