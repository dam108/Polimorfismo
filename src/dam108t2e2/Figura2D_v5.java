package Dam108t2e2;
public class Figura2D_v5 {
    private double ancho;
    private double alto;
    
    /* CONSTRUCTOR PADRE */
    
    Figura2D_v5(){
        this.alto = 0; this.ancho = 0;
    }
    Figura2D_v5(double al){
        this.alto = al; this.ancho = al;
    }
    Figura2D_v5(double al, double an){
        this.alto = al; this.ancho = an;    
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
    
    public void verDim(){
        System.out.printf("El alto es %.2f y el ancho es %.2f \n", this.alto, this.ancho);
    }
        
}