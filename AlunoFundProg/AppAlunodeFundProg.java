package AlunoFundProg;
import java.util.Scanner;

public class AppAlunodeFundProg{
    public static void main(String args[]){
        Scanner input = new Scanner(System.in);

        System.out.println("Informe seu nome: ");
        String nome = input.nextLine();
        System.out.println("Informe seu número de matrícula: ");
        int matricula = input.nextInt();
        System.out.println("Informe sua frequência: ");
        int frequencia = input.nextInt();
        System.out.println("Nota da P1: ");
        double p1 = input.nextDouble();
        System.out.println("Nota da P2: ");
        double p2 = input.nextDouble();
        System.out.println("Nota da P3: ");
        double p3 = input.nextDouble();
        System.out.println("Nota da média dos exercícios: ");
        double mediaExerc = input.nextDouble();

        double notaG1 = (p1 + p2 + p3 + mediaExerc) / 4.0;

        double notaG2 = 0;

        if (notaG1 < 7 && notaG1 > 4 && frequencia >75){
            System.out.println("Informe sua nota do G2: ");
            notaG2 = input.nextDouble();
        }
        else notaG2 = 0;

        

        AlunoDeFundProg aluno = new AlunoDeFundProg(nome, matricula, frequencia, p1, p2, p3, mediaExerc, notaG1, notaG2);

        System.out.println(aluno.toString());

        

    }
}
