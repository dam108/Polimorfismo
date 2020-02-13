package dam108t2e2;
import java.time.LocalDateTime;
import java.time.LocalTime;
import java.util.*;
import static java.time.temporal.ChronoUnit.*;

public class Vehiculo {
    public float tarifa;
    public LocalTime horaEntrada;
    public int matricula;
    
    
    /*CONTRUCTOR*/
    Vehiculo(int matric){
        this.tarifa = 0.04f;
        this.matricula = matric;
        LocalDateTime localDateTime = LocalDateTime.now();
        this.horaEntrada = localDateTime.toLocalTime();
    }

    @Override
    public String toString() {
        return "Vehiculo{" + "horaEntrada=" + horaEntrada + ", matricula=" + matricula + '}';
    }
    
    public float calcularPrecio(){
        LocalDateTime localDateTime = LocalDateTime.now();
        LocalTime horaSalida = localDateTime.toLocalTime();
      
        long tiempoTotal = Math.abs(SECONDS.between(horaSalida, horaEntrada)); 
        return tiempoTotal * this.tarifa;
    }
}

class Coches extends Vehiculo{
    Coches(int matric){
    super(matric);
    }
    
    @Override
    public String toString() {
        return "Coche{" + "horaEntrada=" + horaEntrada + ", matricula=" + matricula + '}';
    }
}

class Furgonetas extends Vehiculo{
    public float extra;
    public int metros;
    /*CONTRUCTOR*/
    Furgonetas(int matric, int m){
        super(matric);
        this.metros = m;
        this.extra = 0.20f;
    }

    @Override
    public String toString() {
        return "Furgonetas{" + "horaEntrada=" + horaEntrada + ", matricula=" + matricula + "metros=" + metros + '}';
    }
    
    @Override
    public float calcularPrecio(){
         return super.calcularPrecio() + ( this.metros * this.extra);
    }
}

class Autobuses extends Vehiculo{
    public float extra;
    public int asientos;
    /*CONTRUCTOR*/
    Autobuses(int matric, int a){
        super(matric);
        this.asientos = a;
        this.extra = 0.25f;
    }

    @Override
    public String toString() {
        return "Autobuses{" + "horaEntrada=" + horaEntrada + ", matricula=" + matricula + "asientos=" + asientos + '}';
    }
    
    @Override
    public float calcularPrecio(){
         return super.calcularPrecio() + ( this.asientos * this.extra);
    }
}