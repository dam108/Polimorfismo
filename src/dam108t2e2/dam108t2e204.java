package dam108t2e2;
import java.util.*;

public class dam108t2e204 {
    public static Scanner teclado = new Scanner(System.in);
    public static void main(String[] args) {
        int contadorRectangulos = 0, contadorTriangulos = 0;
        double area = 0 , totalAreas = 0;
        ArrayList <Figura2D_v8> figs = new ArrayList<>();
        
        figs.add(new Rectangulo_v8(10, 10, "Juan"));
        figs.add(new Rectangulo_v8(20, 5, "Pedro"));
        figs.add(new Triangulo_v8(10, 15, "estilo1", "ivan"));
        figs.add(new Triangulo_v8(10, 15, "estilo2", "Carlos"));
        figs.add(new TrianColor_v8(10, 15, "estilo3", "rojo", "maria"));
        figs.add(new TrianColor_v8(10, 15, "estilo3", "verde", "lucia"));
        
        //sumar el area de todas ellas
        for (int i = 0; i < figs.size(); i++) {
           if(figs.get(i) instanceof Rectangulo_v8){
               contadorRectangulos++;
           }
           if(figs.get(i) instanceof Triangulo_v8){
               area = ((Triangulo_v8) figs.get(i)).area();
               totalAreas+= area;
               contadorTriangulos++;
           }
        }
        
        System.out.println("El area total de todas las figuras a las que se les puede calcular el area es: "+totalAreas);
        System.out.println("Tenemos "+contadorRectangulos+" Rectangulos");
        System.out.println("Tenemos "+contadorTriangulos+" Triangulos");

    } // Fin main
} // Fin Class
