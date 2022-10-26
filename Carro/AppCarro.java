package Carro;

import java.util.Scanner;

public class AppCarro {
    public static void main(String args[]) {

        Scanner input = new Scanner(System.in);

        System.out.println("Informe a placa do carro: ");
        String placa = input.nextLine();
        System.out.println("Informe a marca do carro: ");
        String marca = input.nextLine();
        System.out.println("Informe o modelo do carro: ");
        String modelo = input.nextLine();
        System.out.println("Informe a cordo carro: ");
        String cor = input.nextLine();
        System.out.println("Informe a kilometragem do carro: ");
        int kilometragem = input.nextInt();
        System.out.println("Informe a capacidade do tanque de combustível do carro: ");
        int capacidadeTanque = input.nextInt();
        System.out.println("Informe a quantidade de gasolina no tanque de combustível do carro: ");
        int quantidadeTanque = input.nextInt();
        System.out.println("Informe o consumo médio do carro(em km/L): ");
        int consumoMedio = input.nextInt();

        Carro carro = new Carro(placa, marca, modelo, cor, kilometragem, capacidadeTanque, quantidadeTanque, consumoMedio);

        }
}
