package dam108t2e2;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.util.Objects;

public class Bicicleta {
    public String marca;
    public String modelo;
    public float precio;
    public float descuento;
    public LocalDate fechaFinDes;
    
    Bicicleta(String m, String mo, float p){
        this.marca = m;
        this.modelo = mo;
        this.precio = p;
    }
    
    public void fijarDesucento(){
        this.descuento = 10;
        LocalDateTime fhoy = LocalDateTime.now();
        this.fechaFinDes = fhoy.toLocalDate().plusMonths(1);
    }
    
    public void fijarDesucento(float d){
        this.descuento = d;
        LocalDateTime fhoy = LocalDateTime.now();
        this.fechaFinDes = fhoy.toLocalDate().plusMonths(1);
    }
    
    public void fijarDesucento(float d, int n){
        this.descuento = d;
        LocalDateTime fhoy = LocalDateTime.now();
        this.fechaFinDes = fhoy.toLocalDate().plusMonths(n);
    }

    @Override
    public int hashCode() {
        int hash = 3;
        return hash;
    }

    @Override
    public boolean equals(Object obj) {
        if (obj instanceof Bicicleta && ((Bicicleta)obj).marca.equals(this.marca) && ((Bicicleta)obj).modelo.equals(this.modelo)) return true;
        else return false;
    }

    @Override
    public String toString() {
        return "Bicicleta{" + "marca=" + marca + ", modelo=" + modelo + ", precio=" + precio + ", descuento=" + descuento + "%, precio Final " + precioTotal() + ", Fecha que finaliza el descuento " + fechaFinDes + '}';
    }
    
    public float precioTotal(){
        return precio - ((precio * descuento)/100f );
    }

    public String getMarca() {
        return marca;
    }

    public void setMarca(String marca) {
        this.marca = marca;
    }

    public String getModelo() {
        return modelo;
    }

    public void setModelo(String modelo) {
        this.modelo = modelo;
    }

    public float getPrecio() {
        return precio;
    }

    public void setPrecio(float precio) {
        this.precio = precio;
    }

    public float getDescuento() {
        return descuento;
    }

    public void setDescuento(float descuento) {
        this.descuento = descuento;
    }
    
}
