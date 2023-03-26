import java.util.*;
import java.util.Iterator;
import java.time.*;
import java.time.temporal.TemporalAdjusters;
import java.time.format.DateTimeFormatter;

public class generico {
    public static void main(String[]args){
        ListaCircular<String> matematicos = new ListaCircular<>(); // lista circular de los integrantes
        Scanner sc = new Scanner(System.in);
        Scanner ad = new Scanner(System.in);
        DateTimeFormatter formato = DateTimeFormatter.ofPattern("dd/MM/yyyy"); //cambiar el formato de fecha

        LocalDateTime hoy = LocalDateTime.now(); //fecha actual

        // se agregan a los integrantes
        matematicos.agrega("Ricardo");
        matematicos.agrega("Alejandro");
        matematicos.agrega("Nestaly");
        matematicos.agrega("Alma");

        
        System.out.println("Los integrantes son: " + matematicos.toString());
        int contador = 4; //para arreglar el orden de la lista
        int eleccion = 1;
        while(eleccion==1){
        System.out.println("Deseas meter a mas integrantes? \n 1=si, 2=no");
        eleccion = sc.nextInt();
        if(eleccion == 1){
            System.out.println("ingresa el nombre del integrante");
            String integrante = ad.nextLine();
            matematicos.agrega(integrante);
            contador++;
        }else if(eleccion != 1 || eleccion != 2){
            System.out.println("ingresa valores previamente solicitados");
            break;
        }
        System.out.println("los integrantes ahora son " + matematicos.toString());
        }
        
        LocalDate proxLun = hoy.toLocalDate().with(TemporalAdjusters.next(DayOfWeek.MONDAY)); //da la fecha proxima a lunes

        System.out.println("el proximo lunes es " + proxLun); 

        
        Iterator<String> iterador = matematicos.iterator();//iterador con los elementos de los integrantes
        for(int i = 1; i<contador; i++){
            iterador.next();

        }
        
        
        LocalDate semana = proxLun;
        int diasSumar = 7;
        for(int i = 1; i<17; i++){
            String fecha = semana.format(formato);
            String becario = iterador.next();
            System.out.println("El integrante " + becario + " limpiara el lunes " + fecha );
            semana = semana.plusDays(diasSumar);
        }
        

        
    }
}
