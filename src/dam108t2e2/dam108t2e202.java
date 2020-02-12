package dam108t2e2;
import java.util.*;
public class dam108t2e202 {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        int n, al, an;
        boolean cuadrado;
        Figura2D_v8 fig1 = new Figura2D_v8();
        System.out.println("1. Para Rectangulo");
        System.out.println("2. Para Triangulo");
        n = teclado.nextInt();
        
        System.out.println("Introduce alto");
        al = teclado.nextInt();
        System.out.println("Introduce ancho");
        an = teclado.nextInt();
        
        switch(n) {
            case 1: 
                fig1 = new Rectangulo_v8(al, an, "pepe");
                break;
            case 2: 
                fig1 = new Triangulo_v8(al, an, "recto", "juan");
                break;
            case 3:
                
                break;
        }
        fig1.verDim();
        
        if (fig1 instanceof Rectangulo_v8){
            cuadrado = ((Rectangulo_v8) fig1).esCuadrado();
            if(cuadrado) System.out.println("Es un cuadrado");
            else System.out.println("No es un cuadrado");
        }
        if (fig1 instanceof Triangulo_v8){
            System.out.println("El area del triangulo es "+ ((Triangulo_v8) fig1).area());
        }

    } // Fin main
} // Fin Class
