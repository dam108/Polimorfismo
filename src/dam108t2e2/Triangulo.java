package dam108t2e2;

// con esta linea declaramos la herencia de la clase triangulo como hijo de la clase padre Figura2D
public class Triangulo extends Figura2D {
    public String estilo;
    
    /* CONSTRUCTOR HIJO */
    Triangulo(){}
    Triangulo(double al, double an, String es){
        super(al, an);
        this.estilo = es;
    }
    
    
    public void verEstilo(){
        System.out.println(estilo);
    }
    public double area(){
        return (super.alto * super.ancho)/2;
    }
    
    /* FORMATEAMOS EL OBJETO YA LISTO PARA IMPRIMIR */
    @Override
    public String toString() {
        return "Triangulo{" + "estilo=" + estilo + '}';
    }
    
    
}
