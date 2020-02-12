package dam108t2e2;
import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.*;

public class Paciente {
    public String nombre;
    public LocalDate fechaNac;

    public String getNombre() {
        return nombre;
    }

    public LocalDate getFechaNac() {
        return fechaNac;
    }

    public DateTimeFormatter getFormato() {
        return formato;
    }
    public DateTimeFormatter formato;
    
    Paciente(){}
    Paciente(String nom, String fecha){
        nombre = nom;
        formato = DateTimeFormatter.ofPattern("dd/MM/yyyy");
        fechaNac = LocalDate.parse(fecha, formato);
    }
}

class Consultas extends Paciente{
    public String motivo;
    public int PRECIOCONSULTA = 100;
    
    
    Consultas(){}    
    Consultas(String nom, String fecha,String mot){
        super(nom, fecha);
        motivo = mot;
    }
    
    public int facturar(){
       return PRECIOCONSULTA;
    }
}

class Recetas extends Paciente{
    public int listaMedicamentos;
    public int PRECIORECETA = 5;
    
    Recetas(){}
    Recetas(String nom, String fecha, int list){
       super(nom, fecha); 
       listaMedicamentos = list;
    }
    
    public int facturar(){
       return listaMedicamentos * PRECIORECETA;
    }
}

class Revision extends Paciente{
    public LocalDate fechaUltimaRevision;
    public int edadPaciente;
    public int MAYOREDAD = 65;
    public int PRECIOBARATO = 30;
    public int PRECIOCARO = 50;
    
    Revision(){}
    Revision(String nom, String fecha, String fecURev){
        super(nom, fecha);
        fechaUltimaRevision = LocalDate.parse(fecURev, formato);
        //no me complico resto los años y ya esta
        edadPaciente = LocalDate.now().getYear() - super.fechaNac.getYear();
    }
    
    public int facturar(){
        if (edadPaciente >= MAYOREDAD){
            return PRECIOBARATO;
        }
        else return PRECIOCARO;
    }
}