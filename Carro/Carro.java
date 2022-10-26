package Carro;

public class Carro {

    private String placa, marca, modelo, cor;
    private int kilometragem, capacidadeTanque, quantidadeTanque, consumoMedio;

    public Carro(String placaInicial, String marcaInicial, String modeloInicial, String corInicial,
            int kilometragemInicial, int capacidadeTanqueInicial, int quantidadeLitrosNoTanqueInicial,
            int consumoMedioInicial) {
        placa = placaInicial;
        marca = marcaInicial;
        modelo = modeloInicial;
        cor = corInicial;
        if (kilometragemInicial >= 0)
            kilometragem = kilometragemInicial;
        else
            kilometragem = 0;
        if (capacidadeTanqueInicial >= 0)
            capacidadeTanque = capacidadeTanqueInicial;
        else
            capacidadeTanque = 0;
        if (quantidadeLitrosNoTanqueInicial > capacidadeTanqueInicial)
            throw new IllegalArgumentException("Quantidade de litros no tanque é maior do que a capacidade do tanque");
        else
            quantidadeTanque = capacidadeTanqueInicial;
        if (consumoMedio > 0)
            consumoMedio = consumoMedioInicial;
        else
            consumoMedio = 0;
    }

    public String getPlaca() {
        return placa;
    }

    public String getMarca() {
        return marca;
    }

    public String getModelo() {
        return modelo;
    }

    public String getCor() {
        return cor;
    }

    public int getKilometragem() {
        return kilometragem;
    }

    public int getCapacidadeTanque() {
        return capacidadeTanque;
    }

    public int getQuantidadeTanque() {
        return quantidadeTanque;
    }

    public int getConsumoMedio() {
        return consumoMedio;
    }

    public void setPlaca(String novaPlaca) {
        placa = novaPlaca;
    }

    public void setMarca(String novaMarca) {
        marca = novaMarca;
    }

    public void setModelo(String novaModelo) {
        modelo = novaModelo;
    }

    public void setCor(String novaCor) {
        cor = novaCor;
    }

    public void setKilometragem(int novaKilometragem) {
        kilometragem = novaKilometragem;
    }

    public void setCapacidadeTanqueInicial(int novaCapacidadeTanqueInicial) {
        capacidadeTanque = novaCapacidadeTanqueInicial;
    }

    public void setQuantidadeLitrosNoTanqueInicial(int novaQuantidadeTanqueInicial) {
        if (novaQuantidadeTanqueInicial > capacidadeTanque) {
            throw new IllegalArgumentException("Quantidade de litros no tanque é maior do que a capacidade do tanque");
        } else
            quantidadeTanque = novaQuantidadeTanqueInicial;
    }

    public void setConsumoMedio(int novoConsumoMedio) {
        if (novoConsumoMedio > 0)
            consumoMedio = novoConsumoMedio;
    }

    public String toString() {
        return placa + " " + marca + " " + modelo + " " + cor + " " + kilometragem + " " + capacidadeTanque + " "
                + quantidadeTanque + " " + consumoMedio;
    }

    public void abastecerLitros(int litrosAbastecidos) {
        if (litrosAbastecidos + quantidadeTanque > capacidadeTanque) {
            throw new IllegalArgumentException("Quantidade de litros no tanque é maior do que a capacidade do tanque");
        } else
            quantidadeTanque += litrosAbastecidos;
    }

    public void abastecerReais(double preçoLitrosGasolina) {
        double litros = preçoLitrosGasolina / 4.86;
        if (litros > capacidadeTanque) {
            throw new IllegalArgumentException("Quantidade de litros no tanque é maior do que a capacidade do tanque");
        } else
            quantidadeTanque += litros;
    }

    public void andar(double kilometrosPercorridos) {
        double gasolinaGasta = kilometrosPercorridos / consumoMedio;
        quantidadeTanque -= gasolinaGasta;
    }

    public double capacidadeDeslocamento() {
        double capacidadeDeslocamento = quantidadeTanque / consumoMedio;
        return capacidadeDeslocamento;
    }

    public double previsaoCombustivel(int distanciaDesejada) {
        double tanque = capacidadeTanque;
        double previsaoCombustivel = (distanciaDesejada / consumoMedio) / tanque;
        return previsaoCombustivel;

    }
}
