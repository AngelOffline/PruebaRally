import java.util.*;
import java.util.Iterator;
import java.time.*;
import java.time.temporal.TemporalAdjuster;
import java.time.temporal.TemporalAdjusters;
import java.time.format.DateTimeFormatter;
import java.util.random.*;

public class extra2 {
    public static void main(String[]args){
        ListaCircular<String> matematicos = new ListaCircular<>(); // lista circular de los integrantes
        Scanner sc = new Scanner(System.in);
        Scanner ad = new Scanner(System.in);
        DateTimeFormatter formato = DateTimeFormatter.ofPattern("dd/MM/yyyy"); //cambiar el formato de fecha
        Random random = new Random();
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
        
        System.out.println("los integrantes eligen cuando lavarán la cafetera (de lunes a domingo)");
        for(int i = 1; i<matematicos.getTamanio()+1; i++){ //asignar a cada integrante un dia de limpieza

        }

        


        ListaCircular<DayOfWeek> dias = new ListaCircular<>();
        for(int i = 0; i<matematicos.getTamanio(); i++){
            int alearDayNum = random.nextInt(7)+1;
            DayOfWeek aleaDay = DayOfWeek.of(alearDayNum); //genera un dia aleatorio de lunes a domingo para asignarle a un integrante
            dias.agrega(aleaDay);
        }
        
        ListaCircular<LocalDateTime> diasintegrantes = new ListaCircular<>();
        Iterator<DayOfWeek> iteradorweek = dias.iterator();// arreglando el orden para que se asigne al primer integrante
        Iterator<String> iterador = matematicos.iterator();//iterador con los elementos de los integrantes
        

        LocalDateTime cont = hoy;
        
       
        
        for(int i = 0; i<matematicos.getTamanio(); i++){
            diasintegrantes.agrega(cont.with(TemporalAdjusters.next(iteradorweek.next()))); //asigna fecha a cada ddia
            
            cont = cont.plusWeeks(1); 
           
            
        }
        
        
        Iterator<LocalDateTime> iteradorfecha = diasintegrantes.iterator(); //fecja que le toca a cada integrante
         
        for(int i = 1; i<contador; i++){
            iterador.next();
            
            iteradorfecha.next();
        }
        
        
      
       

        
            
        
        
         for(int i = 0; i<matematicos.getTamanio();i++){
           
            String integrante = iterador.next();
            DayOfWeek dia = iteradorweek.next();
            LocalDateTime fecha = iteradorfecha.next();
         
            System.out.println(" integrante " + integrante + " escogio el dia " + dia +  " en la fecha " + fecha.format(formato));
            
        }
        int n = 1;
        int con = 0;
        int p = matematicos.getTamanio();
        for(int i = 0; i<16-matematicos.getTamanio(); i++){
            
            if(con==p){
                n++;
                p=p*2;
            }
            String integrante = iterador.next();
            DayOfWeek dia = iteradorweek.next();
            LocalDateTime fecha = iteradorfecha.next().plusWeeks(n * matematicos.getTamanio());
            
            System.out.println(" integrante " + integrante + " escogio el dia " + dia +  " en la fecha " + fecha.format(formato));
            con++; 
        }

        
    }
}
