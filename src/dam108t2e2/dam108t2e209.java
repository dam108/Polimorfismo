package dam108t2e2;
import java.util.*;
public class dam108t2e209 {
    public static ArrayList<Paciente> colaPacientes;
    public static ArrayList<Integer> facturas;
    public static Scanner teclado = new Scanner(System.in);
    public static void main(String[] args) {
        int numMenu = 0;
        // creamos un ArrayList para la cola de pacientes
        colaPacientes =  new ArrayList<Paciente>();
        
        // creamos un ArrayList para guardar las facturas a cada paciente
        facturas = new ArrayList<Integer>();
        
        //creamos un menu para registrar, llamar a consulta, consultar el total facturado
        do {
            System.out.println("1. Registrar Paciente\n2. Llamar a consulta\n3. Consultar Facturado\n0. Salir");
            numMenu = teclado.nextInt();teclado.nextLine();
        
            switch(numMenu){
                case 1:
                    // creamos un menu para meter en la cola a los pacientes
                    registrarLlegada(); break;
                case 2:
                    llamarConsulta(); break;
                case 3:
                    int facturado = totalFacturado(); 
                    System.out.println("De momento se ha facturado "+facturado+" euros.");
                    break;
            }
        }while(numMenu != 0);

    } // Fin main
    
    public static void registrarLlegada(){
        int opt;
        System.out.println("¿Como se llama?");
        String nombre = teclado.nextLine();//teclado.nextInt();
        System.out.println("Cual es tu fecha de nacimiento ( dd/MM/aaaa):");
        String fechaNacimiento = teclado.nextLine();//teclado.nextInt();
        System.out.println("¿Cual es el motivo de la visita?");
        System.out.println("1. Para Consultas\n2. Para Recetas\n3. Para Revision");
        opt = teclado.nextInt();teclado.nextLine();
        
        switch(opt){
            case 1:
                System.out.println("¿Cual es el motivo de la consulta?");
                String motivo = teclado.nextLine();//teclado.nextInt();
                colaPacientes.add(new Consultas(nombre, fechaNacimiento, motivo));
                break;
            case 2:
                System.out.println("¿Cuantos medicamentos necesita?");
                int medicamentos =  teclado.nextInt();
                colaPacientes.add(new Recetas(nombre, fechaNacimiento, medicamentos));
                break;
            case 3:
                System.out.println("¿Cual es la fehca de su ultima visita? (dd/MM/aaaa)");
                String fech = teclado.nextLine();//teclado.nextInt();
                colaPacientes.add(new Revision(nombre, fechaNacimiento, fech));
                break;
        }
        System.out.println("Ya hemos registrado su llegada, espere a ser llamado.");
    }
    
    public static void llamarConsulta(){
        if (colaPacientes.size() > 0){
            if (colaPacientes.get(0) instanceof Consultas){
                String nombre = ((Consultas) colaPacientes.get(0)).getNombre();
                System.out.println("El/la Paciente "+nombre+" ya puede pasar a consultas.");
                System.out.println("Se esta atendiendo al Paciente.");
                System.out.println("Se ha atendido al paciente");
                int factura = ((Consultas) colaPacientes.get(0)).facturar();
                System.out.println("La factura de este paciente es de "+ factura + " euros." );
                facturas.add(factura);
                colaPacientes.remove(0);
            }
            else if (colaPacientes.get(0) instanceof Recetas){
                String nombre = ((Recetas) colaPacientes.get(0)).getNombre();
                System.out.println("El/la Paciente "+nombre+" ya puede pasar a Recetas.");
                System.out.println("Se esta atendiendo al Paciente.");
                System.out.println("Se ha atendido al paciente");
                int factura = ((Recetas) colaPacientes.get(0)).facturar();
                System.out.println("La factura de este paciente es de "+ factura + " euros." );
                facturas.add(factura);
                colaPacientes.remove(0);
            }
            else if (colaPacientes.get(0) instanceof Revision){
                String nombre = ((Revision) colaPacientes.get(0)).getNombre();
                System.out.println("El/la Paciente "+nombre+" ya puede pasar a Revision.");
                System.out.println("Se esta atendiendo al Paciente.");
                System.out.println("Se ha atendido al paciente");
                int factura = ((Revision) colaPacientes.get(0)).facturar();
                System.out.println("La factura de este paciente es de "+ factura + " euros." );
                facturas.add(factura);
                colaPacientes.remove(0);
            }
        }
        else System.out.println("no quedan pacientes.");
    }
    
    public static int totalFacturado(){
        int totalFacturado = 0;
        for( int i : facturas){
            totalFacturado += i; 
        }
        return totalFacturado;
    }
} // Fin Class
