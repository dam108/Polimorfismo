package dam108t2e2;
import java.util.*;
public class dam108t2e212 {
    public static void main(String[] args) {
        
        Bicicleta bici1 = new Bicicleta("RockUSA","Mountain Bike",1000f);
        Bicicleta bici2 = new Bicicleta("RockUSA","BMX",1500f);
        Bicicleta bici3 = new Bicicleta("RockUSA","Mountain Bike",2000f);
        
        System.out.println("es la bici 1 igual que la dos");
        System.out.println(bici1.equals(bici2));
        
        System.out.println("es la bici 1 igual que la tres");
        System.out.println(bici1.equals(bici3));
        
        System.out.println("Sobrecarga 1");
        bici1.fijarDesucento();
        bici2.fijarDesucento();
        bici3.fijarDesucento();
        System.out.println(bici1.toString());
        System.out.println(bici2.toString());
        System.out.println(bici3.toString());
        
        System.out.println("Sobrecarga 2");
        bici1.fijarDesucento(20f);
        bici2.fijarDesucento(20f);
        bici3.fijarDesucento(20f);
        System.out.println(bici1.toString());
        System.out.println(bici2.toString());
        System.out.println(bici3.toString());
        
        System.out.println("Sobrecarga 3");
        bici1.fijarDesucento(20f, 3);
        bici2.fijarDesucento(20f, 3);
        bici3.fijarDesucento(20f, 3);
        System.out.println(bici1.toString());
        System.out.println(bici2.toString());
        System.out.println(bici3.toString());
        
        
    } // Fin main
} // Fin Class
