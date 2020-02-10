package Dam108t2e2;

public class TrianColor_v8 extends Triangulo_v8 {
    private String color;
    
    
    /* CONSTRUCCTOR */
    
    TrianColor_v8(){}
    TrianColor_v8(double al, double an,  String es, String co, String nom) {
        super(al, an, es, nom);
        this.color =  co;
    }
    /* FIN CONSTRUCCTOR */
    
    /* GETTERS Y SETTERS */
    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }
    
}
