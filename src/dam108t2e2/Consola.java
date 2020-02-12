package dam108t2e2;
import java.util.*;

public class Consola {
    public static Scanner teclado = new Scanner(System.in); 
    
    /* CONSTRUCTOR */
    public Consola(){}
    
    /* METODOS */
    public static int leerEntero(){
        int num;
        num = teclado.nextInt();
        return num;
    }
    
    public static int leerEntero(String cad){
        int num;
        System.out.println(cad+" ");
        num = teclado.nextInt();
        return num;
    }
    
    public static int leerEntero(String cad, int n1, int n2){
        int num = 0, menor, mayor;
        if ( n1 > n2 ){
            mayor = n1; menor = n2;
        }else {
            mayor = n2; menor = n1;
        }
        
        System.out.println(cad+" ");
        do {
            num = teclado.nextInt(); 
            if (num < menor || num > mayor) System.out.println("El numero no esta comprendido entre "+menor+" y "+mayor+".");
            
        } while(num < menor || num > mayor);
        
        return num;
    }
    
    public static int leerEntero(int n1, int n2){
        int num = 0, menor, mayor;
        if ( n1 > n2 ){
            mayor = n1; menor = n2;
        }else {
            mayor = n2; menor = n1;
        }
        do {
            num = teclado.nextInt(); 
            if (num < menor || num > mayor) System.out.println("El numero no esta comprendido entre "+menor+" y "+mayor+".");
            
        } while(num < menor || num > mayor);
        
        return num;
    }
    
}
