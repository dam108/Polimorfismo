package dam108t2e2;
import java.util.*;
public class dam108t2e211 {
    public static void main(String[] args) {
        Scanner tec = new Scanner(System.in);
        String IBAN ="";
        ArrayList<CuentaCorriente> cuentas = new ArrayList<>();
        int opt = 0;
        do{
            System.out.println("1. añadir cuenta\n2. eliminar cuenta\n3. ingresar \n4. retirar\n5. Para datos de las cuentas\n6 Para salir");
            opt = tec.nextInt();
            
            switch(opt){
                case 1:
                    System.out.println("1. Para cuanta Corriente\n2. Para cuenta a plazo");
                    int tipo = tec.nextInt();tec.nextLine();
                    System.out.println("Introduce el Iban");
                    IBAN = tec.nextLine();
                    if(tipo == 1){
                        cuentas.add(new CuentaCorriente(IBAN));
                    }else if (tipo == 2){
                        cuentas.add(new CuentaPlazo(IBAN));
                    }else System.out.println("Tipo de cuenta no valido");
                    break;
                case 2:
                    System.out.println("Introduce el Iban");
                    tec.nextLine();
                    IBAN = tec.nextLine();
                    System.out.println(IBAN);
                    
                    CuentaCorriente x = new CuentaCorriente(IBAN);
                    int pos = cuentas.indexOf(x);
                    cuentas.remove(cuentas.get(pos));
                    break;
                case 3:
                    System.out.println("Introduce el Iban");
                    tec.nextLine();
                    IBAN = tec.nextLine();
                    System.out.println(IBAN);
                    
                    CuentaCorriente y = new CuentaCorriente(IBAN);
                    pos = cuentas.indexOf(y);
                    System.out.println("Cuanto quiere ingresar");
                    float dinero = tec.nextFloat();
                    if (pos >=0 ){
                       if(cuentas.get(pos) instanceof CuentaCorriente){
                        cuentas.get(pos).ingresar(dinero);
                        }
                        else if (cuentas.get(pos) instanceof CuentaPlazo){
                           ((CuentaPlazo) cuentas.get(pos)).ingresar(dinero);
                        }
                    }
                    else System.out.println("no se a encontrado la cuenta");
                    break;
                case 4:
                    System.out.println("Introduce el Iban");
                    tec.nextLine();
                    IBAN = tec.nextLine();
                    System.out.println(IBAN);
                    
                    CuentaCorriente z = new CuentaCorriente(IBAN);
                    pos = cuentas.indexOf(z);
                    
                    System.out.println("Cuanto quiere retirar");
                    float dineroRetirar = tec.nextFloat();
                    
                    if(cuentas.get(pos) instanceof CuentaCorriente){
                        cuentas.get(pos).retirar(dineroRetirar);
                    }
                    else if (cuentas.get(pos) instanceof CuentaPlazo){
                       boolean retirarDinero = ((CuentaPlazo)cuentas.get(pos)).retirar(dineroRetirar);
                       if (retirarDinero) System.out.println("Se has retirado "+dineroRetirar+" euros.");
                    }
                    break;
                case 5: 
                    for (int i = 0; i < cuentas.size(); i++) {
                        System.out.println(cuentas.get(i).toString());
                    }
                    break;
            }
            
        }while(opt != 6);

    } // Fin main
} // Fin Class
