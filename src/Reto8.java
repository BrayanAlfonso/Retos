import java.util.Scanner;

public class Reto8 {
    public static void main(String[] args) {
        String nombreAprendiz, auxilio, nuevoAprendiz="", bucle, subsidio;
        int i=0, cont=0, numId, edad;
        Scanner lectura=new Scanner(System.in);

        do {
                
            System.out.println("Ingrese el nombre del aprendiz");
            nombreAprendiz = lectura.next();


    
            if (nombreAprendiz.equals(nuevoAprendiz)) {
                
                System.out.println("Ingrese el numero de identificacion del aprendiz");
                numId=lectura.nextInt();
    
                System.out.println("Ingrese la edad del aprendiz");
                edad=lectura.nextInt();

                System.out.println("El aprendiz estta registrado a algun subsidio como jovenes en accion?");
                subsidio=lectura.next();
                if(subsidio.equals("si")){
                    System.out.println("Lo sentimos debido a que esta afiliado a un subsidio del estado no puede aplicar al beneficio del auxilio");
                }else{
                    System.out.println("Ingrese el auxilio al que se va a registrar");
                    auxilio = lectura.next();
                    System.out.println("Felicidades el aprendiz "+nombreAprendiz+" ha sido registrado en el auxilio de "+auxilio );
                }
    

                
            }else{
                System.out.println("Lo sentimos el aprendiz digitado no ha sido encontrado, a continuacion digite el nombre del aprendiz para registrarlo.");
                System.out.println("Ingrese el nombre del nuevo aprendiz");
                nuevoAprendiz=lectura.next(); 
            }
            System.out.println("Desesa volver ha hacer el proceso de registro con el nuevo aprendiz?");
            bucle=lectura.next();
            cont++;
        } while (bucle.equals("si"));

        lectura.close();
    }
}
