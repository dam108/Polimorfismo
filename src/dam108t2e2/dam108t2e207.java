package dam108t2e2;
import java.util.*;
public class dam108t2e207 {
    static Scanner teclado;
    public static ArrayList <Trabajador> trabajadores;
    public static void main(String[] args) {
        teclado =new Scanner(System.in);
        
        //creamos ArrayList Polimorfico con trabajadores
        trabajadores = new ArrayList<>();
        
        trabajadores.add(new Asalariado(01, "Juan", "1980/01/22", 650.25f));
        trabajadores.add(new Asalariado(02, "Jesus", "1981/02/07", 650.25f));
        trabajadores.add(new Asalariado(03, "Pedro", "1982/04/12", 650.25f));
        trabajadores.add(new ConsultorExterno(101, "Silvia", "1986/03/21"));
        trabajadores.add(new ConsultorExterno(102, "Maria Asuncion", "1987/05/11"));
        
        // aumentamos horas extras y horas trabajadas
        // fijamos el importe de la hora extra a 20 euros
        // modificamos las hora del consultor a 100 euros
        
        System.out.println("Mostramos los todos los trabajadores antes de modificar nada.");
        for (int i = 0; i < trabajadores.size(); i++) {
            System.out.println( trabajadores.get(i).toString() );
            if(trabajadores.get(i) instanceof Asalariado ) {
                ((Asalariado) trabajadores.get(i)).setHorasExtra(15);
                ((Asalariado) trabajadores.get(i)).calcularSalarioFinal(20);
            }
            else if (trabajadores.get(i) instanceof ConsultorExterno){
                ((ConsultorExterno) trabajadores.get(i)).setHorasTrabajadas(45);
                ((ConsultorExterno) trabajadores.get(i)).calcularSalarioFinal(100);
            }
        }
        
        // mostramos el contenido del ArrayList con for each
        System.out.println("Mostramos todos los trabajadores ahora con las horas modificadas");
        float totalAsalariados = 0, totalConsultores = 0;
        
        for (Trabajador x : trabajadores){
            if (x instanceof Asalariado)
                totalAsalariados += ((Asalariado)x).getSalarioFinal();
            else if ( x instanceof ConsultorExterno){
                totalConsultores +=  ((ConsultorExterno)x).getSalarioFinal();
            }
            System.out.println(x.toString());
        }
            
        System.out.println("El total que se va gastar en sueldos es: "+ (totalConsultores + totalAsalariados));
        
    } // Fin Main
}     // Fin Class
