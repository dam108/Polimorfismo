package dam108t2e2;
import java.util.*;
public class dam108t2e208 {
    public static void main(String[] args) {
        Consola con = new Consola();
        int n1,n2,n3,n4;
        
        System.out.println("Introduce una edad");
        n1 = Consola.leerEntero();
        System.out.println(n1);
        
        n2 = Consola.leerEntero("Introduce una edad");
        System.out.println(n2);
        
        n3 = Consola.leerEntero("Introduce una edad entre 50 y 100", 50, 100);
        System.out.println(n3);
        
        System.out.println("Introduce una edad entre 5 y 10");        
        n4 = Consola.leerEntero(5, 10);
        System.out.println(n4);
        
    } // Fin main
} // Fin Class
