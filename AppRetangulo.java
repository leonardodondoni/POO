import java.util.Scanner;

public class AppRetangulo {
    public static void main(String args[]) {

        Scanner input = new Scanner(System.in);

        System.out.println("Informe a base do retângulo: ");
        double base = input.nextDouble();
        System.out.println("Informe a altura do retângulo: ");
        double altura = input.nextDouble();
        Retangulo retangulo1 = new Retangulo(base, altura);

        System.out.println("Base atual do retângulo 1: " + retangulo1.getBase());
        System.out.println("Altura atual do retângulo 1: " + retangulo1.getAltura());
    

        //settando novos valores para a base e altura do retangulo1;

        retangulo1.setBase(10);
        retangulo1.setAltura(15);

        System.out.print(retangulo1.toString());
    }
}
