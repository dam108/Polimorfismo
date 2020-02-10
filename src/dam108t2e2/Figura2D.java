package Dam108t2e2;
public class Figura2D {
    public double ancho;
    public double alto;
    
    /* CONSTRUCTOR PADRE */
    
    Figura2D(){}
    Figura2D(double al, double an){
        this.alto = al; this.ancho = an;    
    }
    
    public void verDim(){
        System.out.printf("El alto es %.2f y el ancho es %.2f \n", this.alto, this.ancho);
    }
        
}
