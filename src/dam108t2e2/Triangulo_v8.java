package dam108t2e2;

public class Triangulo_v8 extends Figura2D_v8 {
    public String estilo;
    
    /* CONSTRUCTOR HIJO */
    Triangulo_v8(){
        this.estilo = null;
    }
    Triangulo_v8(double al, String nom){
        super(al, nom);
        this.estilo = "igual Base Altura";
    }
    Triangulo_v8(double al, double an, String es, String nom){
        super(al, an, nom);
        this.estilo = es;
    }
    Triangulo_v8(Triangulo_v8 obj){
        this(obj.getAlto() , obj.getAncho(), obj.getEstilo(), obj.getNombre());
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
