package dam108t2e2;

public class Triangulo_v3 extends Figura2D_v3 {
    public String estilo;
    
    /* CONSTRUCTOR HIJO */
    Triangulo_v3(){}
    Triangulo_v3(double al, double an, String es){
        // como los atributos alto y ancho en el padre son privados 
        // utilizamos los getters y setters para darle esos valores y a la vez utilizamos el constructor por defecto
        super.setAlto(al);super.setAncho(an);
        this.estilo = es;
    }
    public void verEstilo(){
        System.out.println(estilo);
    }
    public double area(){
        return ( this.getAlto() * this.getAncho() )/2;
    }
    
}
