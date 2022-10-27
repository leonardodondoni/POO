package Paciente;

public class Paciente {

    private String nome, sexo;
    private int peso, altura, idade;

    public Paciente(String nomeInicial, String sexoInicial, int pesoInicial, int alturaInicial, int idadeInicial){
        if(nomeInicial == "" || nomeInicial == null)
            throw new IllegalArgumentException("Nome não pode ser nulo");
        nome = nomeInicial;
        if(sexoInicial != "F" || sexoInicial != "M")
            throw new IllegalArgumentException("Sexo deve ser M ou F");
        sexo = sexoInicial;
        if(pesoInicial <= 0 || pesoInicial >= 150)
        
        
    }

}
