import java.util.*;
import java.util.Iterator;
import java.time.*;
import java.time.temporal.TemporalAdjusters;
import java.time.format.DateTimeFormatter;

public class cafetera {
    public static void main(String[]args){
        ListaCircular<String> matematicos = new ListaCircular<>(); // lista circular de los integrantes
         
        DateTimeFormatter formato = DateTimeFormatter.ofPattern("dd/MM/yyyy"); //cambiar el formato de fecha

        LocalDateTime hoy = LocalDateTime.now(); //fecha actual

        // se agregan a los integrantes
        matematicos.agrega("Ricardo");
        matematicos.agrega("Alejandro");
        matematicos.agrega("Nestaly");
        matematicos.agrega("Alma");

        System.out.println("Los integrantes son: " + matematicos.toString());

        LocalDate proxLun = hoy.toLocalDate().with(TemporalAdjusters.next(DayOfWeek.MONDAY)); //da la fecha proxima a lunes

        System.out.println("el proximo lunes es " + proxLun); 

        
        Iterator<String> iterador = matematicos.iterator();//iterador con los elementos de los integrantes
        for(int i = 1; i<4; i++){ // arreglar el orden de integrantes al imprimir
            iterador.next();
        }
        
        
        LocalDate semana = proxLun;
        int diasSumar = 7;
        for(int i = 1; i<17; i++){
            String fecha = semana.format(formato);
            System.out.println("El integrante " + iterador.next() + " limpiara el lunes " + fecha );
            semana = semana.plusDays(diasSumar);
        }
        

        
    }
}
