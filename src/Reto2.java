import java.util.Scanner;

public class Reto2 {
    public static void main(String[] args) {
        double dosisVAc=0.0;
        double pesoBebe=0.0;
        int mesesBebe=0;
        int anoNac=0;
        int anoAct=0;
        String nombDoc="";
        String nombMa="";
        String nombBebe="";


        Scanner calculador=new Scanner(System.in);

        System.out.println("Ingrese el nombre del doctor que aplicara la vacuna");
        nombDoc=calculador.next();

        System.out.println("Ingrese el nombre de la madre del bebe");
        nombMa=calculador.next();

        System.out.println("Ingrese el nombre del bebe");
        nombBebe=calculador.next();

        System.out.println("Ingrese el peso del bebe");
        pesoBebe=calculador.nextDouble();

        System.out.println("Ingrese el año de actual");
        anoAct=calculador.nextInt();

        System.out.println("Ingrese el año de nacimiento del bebe");
        anoNac=calculador.nextInt();


        mesesBebe=(anoAct-anoNac)*12;

        dosisVAc=(pesoBebe+15)/(mesesBebe*10)*8;
        System.out.println("Nombre del doctor: "+nombDoc);
        System.out.println("Nombre de la madre: "+nombMa);
        System.out.println("Nombre del bebe: "+nombBebe);
        System.out.println("La edad de " +nombBebe+ " es: "+mesesBebe+" meses");
        System.out.println("La dosis de la vacuna es: " + dosisVAc);

        calculador.close();

    }
}
