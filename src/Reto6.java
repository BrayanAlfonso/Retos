import java.util.Scanner;
public class Reto6 {
    public static void main(String[] args) {
        int cantDinero=0,aleatorio=0,opcion=0,cont=0;
        int i=3;
        String repetir="si";

        Scanner bucle= new Scanner(System.in);

        

        System.out.println("Ingrese la cantidad de dinero que desee apostar");
        cantDinero=bucle.nextInt();

        while(repetir.equals("si") && i>0){

        System.out.println("Ingrese (1) para seleccionar cara y (2) para seleccionar sello");
        opcion=bucle.nextInt();
        
        aleatorio= (int) (Math.random()*3+1);
        if(opcion==aleatorio){
            System.out.println("Usted ha ganado, se suman 5000 a su saldo"); 
            cantDinero=cantDinero+5000;
        }else{
            System.out.println("Usted ha perdido, se restan 5000 a su saldo");
            cantDinero=cantDinero-5000;
            i=i-1;
        }
        System.out.println("Su saldo actual es "+cantDinero);
        System.out.println("Desea apostar de nuevo?");
        repetir=bucle.next();
        cont++;
    } 

        System.out.println("El juego ha terminado");
        System.out.println("Usted ha jugado "+cont+" veces");


        System.out.println("Su saldo final ha sido "+cantDinero);
        bucle.close();
    }
}
