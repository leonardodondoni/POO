package Paciente;
import java.util.Scanner;
public class AppPaciente {
        public static void main(String args[]){

            Scanner input = new Scanner(System.in);

            System.out.println("Informe o nome do paciente: ");
            String nome = input.nextLine();
            System.out.println("Informe o sexo do paciente, use M para masculino e F para feminino: ");
            String sexo = input.nextLine();
            System.out.println("Informe o peso do paciente: ");
            double peso = input.nextDouble();
            System.out.println("Informe a altura do paciente em cm: ");
            int altura = input.nextInt();
            System.out.println("Informe a idade do paciente: ");
            int idade = input.nextInt();

            Paciente paciente = new Paciente(nome, sexo, peso, altura, idade);

            System.out.println(paciente.getNome());
            System.out.println(paciente.getPeso());
            System.out.println(paciente.getSexo());
            System.out.println(paciente.getAltura());
            System.out.println(paciente.getIdade());
            System.out.println(paciente.imc());
            System.out.println(paciente.pesoIdeal());
            System.out.println(paciente.faixaDeRisco());

            System.out.println(paciente.toString());
            
            

        }
    
}
