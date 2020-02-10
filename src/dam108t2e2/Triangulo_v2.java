package Dam108t2e2;

public class Triangulo_v2 extends Figura2D_v2 {
    public String estilo;
    
    /* CONSTRUCTOR HIJO */
    Triangulo_v2(){}
    Triangulo_v2(double al, double an, String es){
        super(al, an);
        this.estilo = es;
    }
    
    public void verEstilo(){
        System.out.println(estilo);
    }
    public double area(){
        return ( this.getAlto() * this.getAncho() )/2;
    }
    
}
