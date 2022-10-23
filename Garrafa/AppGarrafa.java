package Garrafa;
import java.util.Scanner;

public class AppGarrafa {
    public static void main(String args[]){
        
        Scanner input = new Scanner(System.in);

        System.out.println("Informe o raio 1 da garrafa: ");
        double raio1 = input.nextDouble();
        System.out.println("Informe o raio 2 da garrafa: ");
        double raio2 = input.nextDouble();
        System.out.println("Informe a altura 1 da garrafa: ");
        double altura1 = input.nextDouble();
        System.out.println("Informe a altura 2 da garrafa: ");
        double altura2 = input.nextDouble();
        System.out.println("Informe a altura 3 da garrafa: ");
        double altura3 = input.nextDouble();

        Garrafa garrafa = new Garrafa(raio1, raio2, altura1, altura2, altura3);

        System.out.println(garrafa.volume());

    }
}
