package dam108t2e2;
import java.util.ArrayList;
import java.util.Objects;

public class Parking {
    public ArrayList<Vehiculo> vehiculos;
    public final int MAXPLAZAS;
    
    /* CONSTRUCTOR */
    Parking(){
        MAXPLAZAS = 99;
        // creamos un ArrayList con 100 plazas vacias
        vehiculos = new ArrayList<>();
        for (int i = 0; i < MAXPLAZAS; i++) {
            vehiculos.add(new Vehiculo(0));
        }
        
    }

  
    public int aparcar(Vehiculo auto){
        //generamos un numero entre 0 y 99
        // comprobamos que esa posicion en el array este vacia y guardamos el coche
        boolean lleno = true;
        for (int i = 0; i < vehiculos.size(); i++) {
            if(vehiculos.get(i).matricula == 0){
                lleno = false; break;
            }
        }
        if (lleno){ // si el parkin esta lleno devolvemos -1
            return -1;
        } else { // si no buscamos posicion y aparcamos y devolvemos la posicion
            int n;
            do{
                n = (int) (Math.random() * 100); // elegimos un numero al azar entre 0 y 99
            } while(vehiculos.get(n).matricula != 0); // mientras la matricula sea diferente de 0

            vehiculos.set(n, auto); // quitamos el placeholder añadimos el objeto vehiculo

            return n;
        }
    }

    public boolean desaparcar(int matric){
        for (int i = 0; i < vehiculos.size(); i++) {
            if(vehiculos.get(i).matricula == matric){
                vehiculos.set(i, new Vehiculo(0));
                return true;    
            }
        }
        return false;
    }
    
    public int plazasOcupadas(){
        int total= 0;
        for (int i = 0; i < vehiculos.size(); i++) {
            if(vehiculos.get(i).matricula != 0){
                total++;
            }
        }
        return total;
    }
    
    public int buscarCoche(int matricula){
       for (int i = 0; i < vehiculos.size(); i++) {
            if(vehiculos.get(i).matricula == matricula){
                return i;
            }
        } 
        return -1;
    }
    
    public void mostrarParking(){
        for (int i = 0; i < vehiculos.size(); i++) {
           if(vehiculos.get(i).matricula != 0){
                if (vehiculos.get(i) instanceof Coches){
                    System.out.println(((Coches) vehiculos.get(i)).toString());
                }
                else if (vehiculos.get(i) instanceof Furgonetas){
                    System.out.println(((Furgonetas) vehiculos.get(i)).toString());
                }
                else if (vehiculos.get(i) instanceof Autobuses){
                    System.out.println(((Autobuses) vehiculos.get(i)).toString());
                }               
            }
        }
    }
}
