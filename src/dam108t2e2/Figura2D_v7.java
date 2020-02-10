package dam108t2e2;
public class Figura2D_v7 {
    private double ancho;
    private double alto;
    
    /* CONSTRUCTOR PADRE */
    
    Figura2D_v7(){
        this.alto = 0; this.ancho = 0;
    }
    Figura2D_v7(double al){
        this.alto = al; this.ancho = al;
    }
    Figura2D_v7(double al, double an){
        this.alto = al; this.ancho = an;    
    }
    Figura2D_v7(Figura2D_v7 obj){
        this.alto = obj.alto;
        this.ancho = obj.ancho;
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
