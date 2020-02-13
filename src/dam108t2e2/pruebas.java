package dam108t2e2;
import java.time.LocalDateTime;
import java.time.LocalTime;
import java.util.*;
import java.time.LocalTime;
import static java.time.temporal.ChronoUnit.*;


public class pruebas {

    public static void main(String[] args) {
        ArrayList<Integer> numeros = new ArrayList<Integer>();
        
        numeros.add(1);
        numeros.add(2);
        numeros.add(3);
        numeros.add(4);
        numeros.add(5);
        numeros.add(6);
        numeros.add(7);
        
        numeros.remove(0);
        
        System.out.println(numeros.get(0));
        
        numeros.remove(0);
        
        System.out.println(numeros.get(0));
        
        
        /* RESTAR HORAS Y SACAR LOS SEGUNDOS ENTRE ESAS HORAS */
        LocalDateTime localDateTime = LocalDateTime.now();
        LocalTime horaEntrada = localDateTime.toLocalTime();
        
                
        LocalTime horaSalida = horaEntrada.plusHours(2).plusMinutes(32).plusSeconds(13);
        
        
        long tiempoTotal = Math.abs(SECONDS.between(horaSalida, horaEntrada));
        
        
        
        
        System.out.println(horaEntrada);
        System.out.println(horaSalida);
        System.out.println(tiempoTotal);

        
        
        for (int i = 0; i < 1000; i++) {
            int n = (int) (Math.random() * 100);
            if (n==0)
            System.out.println(n);
        }
        
    }
    
}
