package AulaVetores;

import java.util.Scanner;
import java.util.Random;

public class vetores {
    public static void main(String args[]) {

        Scanner input = new Scanner(System.in);

        // tipo[] nomeDaVariavel;
        // tipo[] nomeDaVariavel = new tipo[quantidade]
        // ex: int[] idades = new int[quantidade];

        int[] idades = new int[10];

        // Como acessar a cada elemento do vetor
        System.out.println("Primeiro valor: " + idades[0]);
        System.out.println("Segundo valor: " + idades[1]);

        // Maioria das vezes é utilitado for para printar todos os valores:
        System.out.println("Escrevendo o vetor: ");
        for (int i = 0; i < 10; i++) {
            System.out.println("Indíce: " + i + " Idade: " + idades[i]);

        }

        // Alteração de dados
        idades[0] = 10;
        idades[1] = 100;

        Random gera = new Random();

        // Inicialização

        System.out.println("Escrevendo o vetor: ");
        for (int i = 0; i < 10; i++) {
            // idades[i] = i + 1;
            // idades[i] = 20;
            // System.out.print("Informe a idade da posição " + i + ": ");
            // idades[i] = input.nextInt();
            // idades[i] = gera.nextInt();
            // idades[i] = gera.nextInt(30);
            // idades[i] = 1+ gera.nextInt(100);
            idades[i] = 1 + gera.nextInt(100);
            System.out.println("Indíce: " + i + " Idade: " + idades[i]);
        }

        // Media
        int soma = 0;
        for (int i = 0; i < 10; i++) {
            soma += idades[i];
        }
        System.out.println("Média: " + soma / 10);

        //Maior
        int maior = idades[0];
        for (int i = 1; i < 10; i++) {
            if(idades[i] > maior) maior = idades[i];
        }

        System.out.println("Maior: " + maior);

    }
}
