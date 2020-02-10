package Dam108t2e2;

public class Triangulo_v5 extends Figura2D_v5 {
    public String estilo;
    
    /* CONSTRUCTOR HIJO */
    Triangulo_v5(){
        this.estilo = null;
    }
    Triangulo_v5(double al){
        super(al);
        this.estilo = "igual Base Altura";
    }
    Triangulo_v5(double al, double an, String es){
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
