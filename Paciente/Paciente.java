package Paciente;

public class Paciente {

    private String nome, sexo;
    private int peso, altura, idade;

    public Paciente(String nomeInicial, String sexoInicial, int pesoInicial, int alturaInicial, int idadeInicial) {
        if (nomeInicial == "" || nomeInicial == null)
            throw new IllegalArgumentException("Nome não pode ser nulo");
        nome = nomeInicial;
        if (sexoInicial != "F" || sexoInicial != "M")
            throw new IllegalArgumentException("Sexo deve ser M ou F");
        sexo = sexoInicial;
        if (pesoInicial <= 0 || pesoInicial > 150)
            throw new IllegalArgumentException("Peso deve ser maior que 0 e menor que 150 kg");
        peso = pesoInicial;
        if (alturaInicial <= 0 || alturaInicial > 250)
            throw new IllegalArgumentException("Altura deve ser maior que 0 e menor que 250 cm");
        altura = alturaInicial;
        if (idadeInicial < 0 || idadeInicial > 120)
            throw new IllegalArgumentException("Idade deve ser maior que 0 e menor que 120 anos");
        idade = idadeInicial;
    }

    public String getNome() {
        return nome;
    }

    public String getSexo() {
        return sexo;
    }

    public int getPeso() {
        return peso;
    }

    public int getAltura() {
        return altura;
    }

    public int getIdade() {
        return idade;
    }

    public void setNome(String novoNome) {
        if (novoNome == "" || novoNome == null)
            throw new IllegalArgumentException("Nome não pode ser nulo");
        nome = novoNome;
    }

    public void setSexo(String novoSexo) {
        if (novoSexo != "F" || novoSexo != "M")
            throw new IllegalArgumentException("Sexo deve ser M ou F");
        sexo = novoSexo;
    }

    public void setPeso(int novoPeso) {
        if (novoPeso <= 0 || novoPeso > 150)
            throw new IllegalArgumentException("Peso deve ser maior que 0 e menor que 150 kg");
        peso = novoPeso;
    }

    public void setAltura(int novaAltura) {
        if (novaAltura <= 0 || novaAltura > 250)
            throw new IllegalArgumentException("Altura deve ser maior que 0 e menor que 250 cm");
        altura = novaAltura;
    }

    public void setIdade(int novaIdade) {
        if (novaIdade < 0 || novaIdade > 120)
            throw new IllegalArgumentException("Idade deve ser maior que 0 e menor que 120 anos");
        idade = novaIdade;
    }

    public double imc() {
        return peso / Math.pow(altura, 2);
    }

    public double pesoIdeal() {
        double aux = 0;
        if (sexo == "M") {
            aux = 72.7 * altura - 58.0;
        } else
            aux = 62.1 * altura - 44.7;
        return aux;
    }

    public String faixaDeRisco() {
        String aux;
        if (imc() < 20)
            aux = "abaixo do peso";
        else if (imc() < 25)
            aux = "normal";
        else if (imc() < 30)
            aux = "excesso de peso";
        else if (imc() < 35)
            aux = "obesidade";
        else
            aux = "obesidade mórbida";
        return aux;
    }
}