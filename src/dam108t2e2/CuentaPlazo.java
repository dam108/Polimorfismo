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
        return "CuentaPlazo{" + "IBAN=" + IBAN + ", saldo=" + saldo + " fecha=" + fecha + '}';
    }
    
    @Override
    public boolean retirar(float importe){
        if (importe <= saldo) {
            saldo -= importe;
            contadorIngresos = 0;
            return true;
        }
        else return false;
    }
}
