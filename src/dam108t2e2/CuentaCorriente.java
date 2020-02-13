package dam108t2e2;

import java.util.Objects;

public class CuentaCorriente {
    public String IBAN;
    public float saldo;
    public int contadorIngresos;
    public static float porcentajeComision;
    public static float minimoComision;
    

CuentaCorriente (String i) {
    IBAN = i; 
    saldo =0;
    contadorIngresos = 0;
}    

    @Override
    public String toString() {
        return "CuentaCorriente{" + "IBAN=" + IBAN + ", saldo=" + saldo + '}';
    }

    
public static void setComision (float pc, float mc) {
    porcentajeComision = pc;
    minimoComision = mc;
}
public static float getPorcentajeComision ()                      {return porcentajeComision;}
public static float getMinimoCosmision ()                         {return minimoComision;}
public float        getSaldo ()                                   {return (saldo);}
public void         setSaldo (float newSaldo)                     { this.saldo = newSaldo;} 
public int          getcontadorIngresos ()                        {return (contadorIngresos);}
public void         setcontadorIngresos (int newContIngresos)     { this.contadorIngresos = newContIngresos;} 

public void ingresar (float importe) {
    float bonus=0;
    if (++contadorIngresos == 3) {
       contadorIngresos = 0; 
       bonus =0.7f;
    }    
    saldo += importe + bonus;
}

public boolean retirar (float importe) {
    float comision;
    if (porcentajeComision * importe < minimoComision) 
        comision = minimoComision;
    else 
        comision = porcentajeComision * importe;
    if (importe + comision <= saldo) {
       saldo -= importe+comision;  //resta (importe+comision)
       contadorIngresos = 0;
       return true;
    }
    else return false; 
}

@Override
    public int hashCode() {
        int hash = 7;
        return hash;
    }

    @Override
    public boolean equals(Object obj) {
        if (obj instanceof CuentaCorriente && ((CuentaCorriente)obj).IBAN.equals(this.IBAN)) return true;
        else return false;
    }

} // fin clase