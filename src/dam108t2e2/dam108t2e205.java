package dam108t2e2;
import java.util.*;

public class dam108t2e205 {
    public static Scanner teclado = new Scanner(System.in);
    public static MovilPrepago movil;
    public static void main(String[] args) {
        int n;
        
        n = seleccionarTarifa();
        crearMovil(n);
        menu();
        


    } // Fin main
    
    public static int seleccionarTarifa(){
        System.out.println("1. Para Tarifa normal");
        System.out.println("2. Para Tarifa Plana");
        System.out.println("3. Para Tarifa Movil Plus");
        return teclado.nextInt();
    }
    
    public static void crearMovil(int opc){
        float saldo;
        long numero = 605489536;
        float costeEstable = 0.15f, costeMinuto = 0.05f, costeMB = 0.1f;
        
        System.out.println("Con cuanto saldo quieres empezar");
        saldo = teclado.nextFloat();
        
        switch(opc){
            case 1: 
                movil = new MovilPrepago(numero, costeEstable, costeMinuto,costeMB, saldo);
                break;
            case 2: 
                movil = new MovilTarifaPlana(numero,costeEstable,costeMinuto,costeMB,saldo);
                break;
            case 3:
                movil = new MovilPlus(numero, costeMinuto,costeMB,saldo);
                break;
        }
    }
    
    public static void menu(){
        int opc = 0;
        int minutos, segundos = 0,ingresar;
        do {
            System.out.println("1. Para consultar Saldo");
            System.out.println("2. Para consultar navegar");
            System.out.println("3. Para consultar llamar");
            System.out.println("4. Para consultar recargar");
            System.out.println("5. Para consultar videollamar");
            System.out.println("0. Para salir");
            opc = teclado.nextInt();
            
            switch(opc){
                case 1:
                    System.out.println(" Su saldo es :"+movil.consultarSaldo());
                    break;
                case 2:
                    System.out.println("Cuantos megas quieres navegar");
                    int mb = teclado.nextInt();
                    movil.navegar(mb);
                    break;
                case 3:
                    System.out.println("Cuantos minutos quieres hablar");
                    minutos = teclado.nextInt();
                    segundos = minutos * 60;
                    movil.efectuarLlamada(segundos);
                    break;
                case 4:
                    System.out.println("Cuanto saldo quieres ingresar");
                    ingresar = teclado.nextInt();
                    boolean recargar = movil.recargar(ingresar);
                    if(recargar)System.out.println("Se ha ingresado con exito");
                    else System.out.println("No se ha podido ingresar");
                    System.out.println(" Su saldo es :"+movil.consultarSaldo());
                    break;
                case 5: /*NO FUNCIONA REVISAR*/
                    System.out.println("¿Cuantos segundos quieres videollamar?");
                    segundos = teclado.nextInt();
                    if (movil instanceof MovilPlus){
                        ((MovilPlus) movil).videollamada(segundos);
                    } else System.out.println("No dispones de videollamadas");
                    break;
            }
            
        } while(opc != 0);
        

    }
} // Fin Class
