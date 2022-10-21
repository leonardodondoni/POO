import java.util.Scanner;
public class AppRetangulo {
    public static void main(String args[]){

        Scanner input = new Scanner(System.in);

        System.out.println("Informe a base do retângulo: ");
        double base = input.nextDouble();
        System.out.println("Informe a altura do retângulo: ");
        double altura = input.nextDouble();
        Retangulo retangulo = new Retangulo(base, altura);
        System.out.println("Área desse retângulo: " + retangulo.area());
        System.out.println("Perímetro desse retângulo: " + retangulo.perimetro());
    }   
}
