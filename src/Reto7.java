    import java.util.Scanner;;
public class Reto7 {
    public static void main(String[] args) {
        int aleatorio;
        int opcion,cantDinero;
        String repetir="si";
        int i=3;
        int cont=0;

        


        Scanner lectura=new Scanner(System.in);

        System.out.println("Ingrese la cantidad de dinero que desee apostar");
        cantDinero=lectura.nextInt();

        while(repetir.equals("si") && i>0){

        System.out.println("Ingrese (1) para seleccionar papel, (2) para seleccionar piedra  y (3) para seleccionar tijera");
        opcion=lectura.nextInt();
        
        aleatorio= (int) (Math.random()*3+1);
        if (aleatorio==opcion){
            System.out.println("Usted esta empatado");
            
        }else if(aleatorio==1 & opcion==2){
            System.out.println("Usted ha perdido");
            System.out.println("Usted ha perdido, se restan 5000 a su saldo");
            cantDinero=cantDinero-5000;
            i=i-1;
        }else if(aleatorio==1 & opcion==3){
            System.out.println("Usted ha ganado");
            System.out.println("Usted ha ganado, se suman 5000 a su saldo"); 
            cantDinero=cantDinero+5000;
        }else if(aleatorio==2 & opcion==1){
            System.out.println("Usted ha ganado");
            System.out.println("Usted ha ganado, se suman 5000 a su saldo"); 
            cantDinero=cantDinero+5000;
        }else if(aleatorio==2 & opcion==3){
            System.out.println("Usted ha perdido");
            System.out.println("Usted ha perdido, se restan 5000 a su saldo");
            cantDinero=cantDinero-5000;
            i=i-1;
        }else if(aleatorio==3 & opcion==1){
            System.out.println("Usted ha perdido");
            System.out.println("Usted ha perdido, se restan 5000 a su saldo");
            cantDinero=cantDinero-5000;
            i=i-1;
        }else if(aleatorio==3 & opcion==2){
            System.out.println("Usted ha ganado");
            System.out.println("Usted ha ganado, se suman 5000 a su saldo"); 
            cantDinero=cantDinero+5000;
        }else{
            System.out.println("El numero digitado no es valido");
        }
        System.out.println("El numero aleatorio generado por la maquina ha sido "+aleatorio);
        

        System.out.println("Su saldo actual es "+cantDinero);
        System.out.println("Desea apostar de nuevo?");
        repetir=lectura.next();
        cont++;

        }
        System.out.println("El juego ha terminado");
        System.out.println("Usted ha jugado "+cont+" veces");


        System.out.println("Su saldo final ha sido "+cantDinero);
        lectura.close();
    }
}
