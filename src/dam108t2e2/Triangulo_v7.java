package Dam108t2e2;

public class Triangulo_v7 extends Figura2D_v7 {
    public String estilo;
    
    /* CONSTRUCTOR HIJO */
    Triangulo_v7(){
        this.estilo = null;
    }
    Triangulo_v7(double al){
        super(al);
        this.estilo = "igual Base Altura";
    }
    Triangulo_v7(double al, double an, String es){
        super(al, an);
        this.estilo = es;
    }
    Triangulo_v7(Triangulo_v7 obj){
        this(obj.getAlto() , obj.getAncho(), obj.getEstilo());
        /*otra opcion:
            this.alto = obj.alto;
            this.ancho = obj.ancho;
            this.estilo = obj.estilo;
        
        otra opcion :
            super((Figura2D_v7) obj); casteamos el triangulo en figura 2D
       o sin casting pero igual:
            super(obj);
        */
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
