package dam108t2e2;

public class MovilTarifaPlana extends MovilPrepago {

    MovilTarifaPlana(long nM, float cEL, float cML, float cMB, float s){
        super(nM, cEL, cML, cMB, s);
    }
    
    @Override
    public void navegar(int mB){
        /*super.setSaldo(super.consultarSaldo());*/
        super.navegar(mB * 0);
    }
}
