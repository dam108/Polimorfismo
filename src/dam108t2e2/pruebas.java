package dam108t2e2;
import java.util.*;


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
        
    }
    
}
