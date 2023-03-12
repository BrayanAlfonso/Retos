import java.util.Scanner;
public class Reto3 {
    public static void main(String[] args) {
        int aleatorio;
        int opcion;
        int puntos=10;

        aleatorio= (int) (Math.random()*2+1);


        Scanner lectura=new Scanner(System.in);

        System.out.println("Ingrese (1) para seleccionar cara y (2) para seleccionar sello");
        opcion=lectura.nextInt();

        if (aleatorio==opcion){
            System.out.println("Usted ha ganado");
            puntos=puntos+2;
            System.out.println("Usted ha ganado dos puntos adicionales, en total tiene "+puntos+" puntos");
        }else{
            System.out.println("Usted ha perdido");
            puntos=puntos-2;
            System.out.println("Usted ha perdido dos puntos, en total tiene "+puntos+" puntos");
        }

        System.out.println("La maquina ha elegido "+aleatorio);
        lectura.close();
    }
}
