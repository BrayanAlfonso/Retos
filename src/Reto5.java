import java.util.Scanner;

public class Reto5 {
    public static void main(String[] args) {
        String empleado;
        String nuevoEmpleado = "brayan";
        String nuevoCliente = "jorge";
        String cliente="";
        String fechaFact;
        String producto;
        double precioProd;
        String bucle1;
        String bucle2="si";
        int cont = 0;
        int i = 0;

        Scanner lectura = new Scanner(System.in);

        System.out.println("Registrar venta");

        do {
            
        
        System.out.println("Ingrese el nombre del cliente");
        cliente = lectura.next();

        if (nuevoCliente.equals(cliente)) {
            System.out.println("Ingrese el nombre del empleado que hace la venta");
            empleado = lectura.next();
    
    
            if (nuevoEmpleado.equals(empleado)) {
                System.out.println("Ingrese la fecha de la venta (DD/MM/AAAA)");
                fechaFact = lectura.next();
                do {
        
        
                    System.out.println("Ingrese el producto vendido");
                    producto = lectura.next();
        
                    System.out.println("Ingrese el valor del producto");
                    precioProd = lectura.nextDouble();
        
                    System.out.println("¿Desea registrar otro producto?");
                    bucle1 = lectura.next();
                    cont++;
                } while (bucle1.equals("si"));
    
            } else {
                    System.out.println("Registro nuevo empleado");
                    System.out.println("Ingrese el nombre del nuevo empleado");
                    nuevoEmpleado=lectura.next();
                }
            
        }else{
            System.out.println("Registro nuevo cliente");
            System.out.println("Ingrese el nombre del nuevo cliente");
            nuevoCliente=lectura.next();
        }
        System.out.println("Desea volver a iniciar el proceso de registro de venta?");
        bucle2=lectura.next();
        cont++;
    } while (bucle2.equals("si"));

    }
}