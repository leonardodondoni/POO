package AulaVetores;

import java.util.Scanner;
import java.util.Random;

public class exercicio1Vetores {
    public static void main(String args[]) {

        Scanner input = new Scanner(System.in);
        Random random = new Random();

        int[] num = new int[10];

        for (int i = 0; i < 10; i++) {
            System.out.println("Informe os valores do vetor A: ");
            num[i] = random.nextInt(5000);
        }

        for (int i = 0; i < 10; i++) {
            if (num[i] % 2 != 0) {
                System.out.println("Valores ímpares de A: " + num[i]);
            }
            if (i % 2 != 0) {
                System.out.println("Valor das posições ímpares de A: " + num[i]);
            }
            if (num[i] % 2 != 0 && i % 2 == 0) {
                System.out.println("Valor ímpares de A em posições pares: " + num[i]);
            }
        }
        for (int i = 9; i > 0; i--) {
                System.out.println("Invertido: " + num[i]);
        }
    }
}