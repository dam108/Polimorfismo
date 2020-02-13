package dam108t2e2;
import java.util.*;
import java.time.LocalDate;
public final class CuentaPlazo extends CuentaCorriente {
    private LocalDate fecha;
    
    CuentaPlazo(String i){
        super(i);
        this.fecha = LocalDate.now();
    }

    @Override
    public String toString() {
        return "CuentaPlazo{" + "IBAN=" + IBAN + ", saldo=" + super.getSaldo() + " fecha=" + fecha + '}';
    }
    
    @Override
    public boolean retirar(float importe){
        if (importe <= super.getSaldo()) {
            super.setSaldo(super.getSaldo() - importe);
            super.setcontadorIngresos(0);
            return true;
        }
        else return false;
    }
}
