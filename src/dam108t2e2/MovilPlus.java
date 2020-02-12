package dam108t2e2;

public class MovilPlus extends MovilPrepago {
    private float costeEstablecLlamada = 0f;
    
    MovilPlus(long nM, float cML, float cMB, float s){
        super(nM, 0f, cML, cMB, s);
        
    }
    public void videollamada (int segs){
        super.navegar(segs * 2);
    }
}
