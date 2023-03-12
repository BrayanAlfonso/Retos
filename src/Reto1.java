
import java.util.Scanner;

public class Reto1 {
    public static void main(String[] args ) {
       
        double gradosCent=0;
        double gradosKelv=0;
        int cantPersonas=0;
        double totalKilos=0;      

        Scanner calculadora = new Scanner(System.in);
        System.out.println ("Ingrese los grados centigrados");
        gradosCent=calculadora.nextDouble();

        gradosKelv= gradosCent+273.15;

        System.out.println("Ingrese la cantidad de personas para las que sera el pastel");
        cantPersonas=calculadora.nextInt();

        totalKilos= (cantPersonas*13.0)/1000;

        


        System.out.println("El total de harina que necesita es = "+ totalKilos+" Kilogramos(Kg)");
        System.out.println ("La temperatura del horno debe ser = "+ gradosKelv+" grados Kelvin (K)");


        calculadora.close();
    }
}