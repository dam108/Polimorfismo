package dam108t2e2;
import java.util.*;

public class dam108t2e206 {
    public static Scanner teclado = new Scanner(System.in);
    public static ArrayList <MovilPrepago> moviles;
    public static void main(String[] args) {
         moviles = new ArrayList<>();
        crearMoviles();
        menu();
    } // Fin main
    
    public static int seleccionarTarifa(){
        System.out.println("1. Para Tarifa normal");
        System.out.println("2. Para Tarifa Plana");
        System.out.println("3. Para Tarifa Movil Plus");
        return teclado.nextInt();
    }
    
    public static void crearMoviles(){
        
        float saldo = 30f, costeEstable = 0.15f, costeMinuto = 0.05f, costeMB = 0.1f;
        
        moviles.add( new MovilPrepago( 650852695 , costeEstable, costeMinuto,costeMB, saldo));
        moviles.add( new MovilPrepago( 635289461 , costeEstable, costeMinuto,costeMB, saldo));
        moviles.add( new MovilTarifaPlana(698636562,costeEstable,costeMinuto,costeMB,saldo));
        moviles.add( new MovilTarifaPlana(674184818,costeEstable,costeMinuto,costeMB,saldo));
        moviles.add( new MovilPlus(673121516, costeMinuto,costeMB,saldo));
        
    }
    
    public static void menu(){
        int opc = 0, movil;
        int minutos, segundos = 0,ingresar;
        do {
            System.out.println("1. Para consultar Saldo");
            System.out.println("2. Para consultar navegar");
            System.out.println("3. Para consultar llamar");
            System.out.println("4. Para consultar recargar");
            System.out.println("5. Para consultar videollamar");
            System.out.println("0. Para salir");
            opc = teclado.nextInt();
            
            System.out.println("Seleccione un movil (numero del 1 al 5)");
            movil =  teclado.nextInt() - 1;
            
            switch(opc){
                case 1:
                    System.out.println(" Su saldo es :"+moviles.get(movil).consultarSaldo());
                    break;
                case 2:
                    System.out.println("Cuantos megas quieres navegar");
                    int mb = teclado.nextInt();
                    moviles.get(movil).navegar(mb);
                    break;
                case 3:
                    System.out.println("Cuantos minutos quieres hablar");
                    minutos = teclado.nextInt();
                    segundos = minutos * 60;
                   moviles.get(movil).efectuarLlamada(segundos);
                    break;
                case 4:
                    System.out.println("Cuanto saldo quieres ingresar");
                    ingresar = teclado.nextInt();
                    boolean recargar = moviles.get(movil).recargar(ingresar);
                    if(recargar)System.out.println("Se ha ingresado con exito");
                    else System.out.println("No se ha podido ingresar");
                    System.out.println(" Su saldo es :"+moviles.get(movil).consultarSaldo());
                    break;
                case 5:
                    System.out.println("¿Cuantos segundos quieres videollamar?");
                    segundos = teclado.nextInt();
                    if (moviles.get(movil) instanceof MovilPlus){
                        ((MovilPlus) moviles.get(movil)).videollamada(segundos);
                    } else System.out.println("No dispones de videollamadas");
                    break;
            }
            
        } while(opc != 0);
    }
} // Fin Class
