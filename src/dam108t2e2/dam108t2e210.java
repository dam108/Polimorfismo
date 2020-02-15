package dam108t2e2;
import java.util.*;
public class dam108t2e210 {
    public static Scanner tec = new Scanner(System.in);
    public static void main(String[] args) {
        Parking park = new Parking();
        
        int opt;
        do{
            System.out.println("1. Para Estacionar\n2. Para Sacar el Vehiculo\n3. Para Mostrar Lista de vehiculos\n4. Para salir");
            opt = tec.nextInt();
            int matricula = 0, tipo, plaza = 0, pos = -1;
            float precio = 0;
                        
            switch (opt){
                case 1:
                    System.out.println("Introduce la matricula");
                    matricula = tec.nextInt();
                    System.out.println("Introduce el tipo de vehiculo");
                    System.out.println("1. Para Coche\n2. Para Furgoneta\n3. Para Autobus");
                    tipo = tec.nextInt();
                    switch (tipo){
                        case 1:
                            plaza = park.aparcar(new Coches(matricula));
                            break;
                        case 2:
                            int m;
                            System.out.println("¿Cuanto mide la Furgoneta?");
                            m = tec.nextInt();
                            plaza = park.aparcar(new Furgonetas(matricula, m));
                            break;
                        case 3:
                            int a;
                            System.out.println("¿Cuantos asientos tiene el autobus?");
                            a = tec.nextInt();
                            plaza = park.aparcar(new Autobuses(matricula, a));
                            break;
                    }
                    if(plaza != -1) System.out.println("Su vehiculo a sido aparcado en la plaza numero: "+plaza);
                    else System.out.println("El vehiculo no ha podido aparcarse.");
                    break;
                    
                case 2:
                    System.out.println("Introduce la matricula");
                    matricula = tec.nextInt();
                    pos = park.buscarCoche(matricula); // encontrar el Vehiculo
                    //calcular precio
                    if (pos >= 0){
                        if (park.vehiculos.get(pos) instanceof Coches){
                            precio = ((Coches) park.vehiculos.get(pos)).calcularPrecio();
                          }
                          else if (park.vehiculos.get(pos) instanceof Furgonetas){
                            precio = ((Furgonetas) park.vehiculos.get(pos)).calcularPrecio();
                          }
                          else if (park.vehiculos.get(pos) instanceof Autobuses){
                            precio = ((Autobuses) park.vehiculos.get(pos)).calcularPrecio();
                          }
                          
                        System.out.println("El precio por la estancia es de "+precio+" euros");
                        boolean sacar = park.desaparcar(park.vehiculos.get(pos).matricula); // sacarlo
                        if (sacar) System.out.println("El coche con matricula "+matricula+" ha sido retirardo");
                          
                    }
                    else System.out.println("Su coche no se ha encontrado");
                    break;
                    
                case 3:
                    park.mostrarParking();
                    System.out.println("El total de plazas que hay ocupadas en el parking es "+park.plazasOcupadas());
                    break;
            }
            
        }while(opt !=4);
        

    } // Fin main
} // Fin Class
