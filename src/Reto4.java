import java.util.Scanner;
public class Reto4 {
    public static void main(String[] args) {
        int aleatorio;
        int opcion;
        int puntos=10;

        aleatorio= (int) (Math.random()*3+1);


        Scanner lectura=new Scanner(System.in);

        System.out.println("Ingrese (1) para seleccionar papel, (2) para seleccionar piedra  y (3) para seleccionar tijera");
        opcion=lectura.nextInt();

        if (aleatorio==opcion){
            System.out.println("Usted esta empatado");
            System.out.println("Usted ha empatado por lo que sus puntos se mantienen en "+puntos);
        }else if(aleatorio==1 & opcion==2){
            System.out.println("Usted ha perdido");
            puntos=puntos-3;
            System.out.println("Usted ha perdido dos puntos, en total tiene "+puntos+" puntos");
        }else if(aleatorio==1 & opcion==3){
            System.out.println("Usted ha ganado");
            puntos=puntos+3;
            System.out.println("Usted ha ganado dos puntos, en total tiene "+puntos+" puntos");
        }else if(aleatorio==2 & opcion==1){
            System.out.println("Usted ha ganado");
            puntos=puntos+3;
            System.out.println("Usted ha ganado dos puntos, en total tiene "+puntos+" puntos");
        }else if(aleatorio==2 & opcion==3){
            System.out.println("Usted ha perdido");
            puntos=puntos-3;
            System.out.println("Usted ha perdido dos puntos, en total tiene "+puntos+" puntos");
        }else if(aleatorio==3 & opcion==1){
            System.out.println("Usted ha perdido");
            puntos=puntos-3;
            System.out.println("Usted ha perdido dos puntos, en total tiene "+puntos+" puntos");
        }else if(aleatorio==3 & opcion==2){
            System.out.println("Usted ha ganado");
            puntos=puntos+3;
            System.out.println("Usted ha ganado dos puntos, en total tiene "+puntos+" puntos");
        }else{
            System.out.println("Ha ingresado valores invalidos");
        }
        System.out.println("El numero aleatorio generado por la maquina ha sido "+aleatorio);
        lectura.close();
    }
}
