package dam108t2e2;
public class Figura2D_v8 {
    private double ancho;
    private double alto;
    private String nombre;
    
    /* CONSTRUCTOR PADRE */
    
    Figura2D_v8(){
        this.alto = 0; this.ancho = 0;
        this.nombre = null;
    }
    Figura2D_v8(double al, String nom){
        this.alto = al; this.ancho = al; this.nombre = nom;
    }
    Figura2D_v8(double al, double an, String nom){
        this.alto = al; this.ancho = an; this.nombre = nom;
    }
    Figura2D_v8(Figura2D_v8 obj){
        this(obj.alto, obj.ancho, obj.nombre);
    }

    public double getAncho() {
        return ancho;
    }

    public void setAncho(double ancho) {
        this.ancho = ancho;
    }

    public double getAlto() {
        return alto;
    }

    public void setAlto(double alto) {
        this.alto = alto;
    }
    
    public String getNombre() {
        return nombre;
    }
    public void setNombre(String nombre) {
        this.nombre = nombre;
    }
    
    public void verDim(){
        System.out.printf("El alto es %.2f y el ancho es %.2f \n", this.alto, this.ancho);
    }
        
}
