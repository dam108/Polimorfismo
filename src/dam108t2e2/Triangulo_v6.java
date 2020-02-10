package dam108t2e2;

public class Triangulo_v6 extends Figura2D_v6 {
    public String estilo;
    
    /* CONSTRUCTOR HIJO */
    Triangulo_v6(){
        this.estilo = null;
    }
    Triangulo_v6(double al){
        super(al);
        this.estilo = "igual Base Altura";
    }
    Triangulo_v6(double al, double an, String es){
        super(al, an);
        this.estilo = es;
    }
    public void verEstilo(){
        System.out.println(estilo);
    }
    public String getEstilo(){
        return this.estilo;
    }
    public double area(){
        return ( this.getAlto() * this.getAncho() )/2;
    }
    
}
