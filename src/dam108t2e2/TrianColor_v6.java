package dam108t2e2;

public class TrianColor_v6 extends Triangulo_v6 {
    private String color;
    
    
    /* CONSTRUCCTOR */
    
    TrianColor_v6(){}
    TrianColor_v6(double al, double an,  String es, String co) {
        super(al, an, es);
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
