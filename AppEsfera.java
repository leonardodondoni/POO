import java.util.Scanner;
public class AppEsfera
{
    public static void main(String args[]){
        Scanner in = new Scanner(System.in);
        
        System.out.print("Informe o valor do raio da esfera:");
        double r = in.nextDouble();
        Esfera esf1 = new Esfera(r);

        System.out.println("Informe um novo valor do raio da esfera: ");
        double r1 = in.nextDouble();
        esf1.setRaio(r1);

        System.out.println("Volume da esfera: " + esf1.volume());
        System.out.println("Área da esfera: " + esf1.area());
    }
}
