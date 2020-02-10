package Dam108t2e2;

public class Rectangulo_v8 extends Figura2D_v8 {
    
    Rectangulo_v8(){}
    Rectangulo_v8(double al, String nom){
        super(al, nom);
    }
    Rectangulo_v8(double al, double an, String nom){
        super(al, an, nom);
    }
    
    public boolean esCuadrado(){
        if (this.getAncho() == this.getAlto()) return true;
        else return false;
    }
}
