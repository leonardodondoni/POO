package AlunoFundProg;

public class AlunoDeFundProgFacul {

    private String nome, matricula;
    private double frequencia, p1, p2, p3, mediaExercicios, pG2;

    public AlunoDeFundProgFacul(String nomeInicial, String matriculaInicial){
        nome = nomeInicial;
        matricula = matriculaInicial;
        frequencia = p1 = p2 = p3 = mediaExercicios = pG2 = 0;
    }

    public String getNome() {
        return nome;
    }

    public String getMatricula() {
        return matricula;
    }

    public double getFrequencia() {
        return frequencia;
    }

    public double getP1() {
        return p1;
    }

    public double getP2() {
        return p2;
    }

    public double getP3() {
        return p3;
    }

    public double getMediaExercicios() {
        return mediaExercicios;
    }

    public double getPG2() {
        return pG2;
    }

    public void setNome(String novoNome) {
        nome = novoNome;
    }

    public void setFrequencia(double novaFrequencia) {
        if (novaFrequencia >= 0 && novaFrequencia <= 100)
            frequencia = novaFrequencia;
    }

    public void setP1(double nota) {
        if (nota >= 0 && nota <= 10)
            p1 = nota;
    }

    public void setP2(double nota) {
        if (nota >= 0 && nota <= 10)
            p2 = nota;
    }

    public void setP3(double nota) {
        if (nota >= 0 && nota <= 10)
            p3 = nota;
    }

    public void setMediaExercicios(double nota) {
        if (nota >= 0 && nota <= 10)
            mediaExercicios = nota;
    }

    public void setPG2(double nota) {
        if (nota >= 0 && nota <= 10)
            pG2 = nota;
    }

    public double calculaG1() {
        return (p1 + p2 + p3 + mediaExercicios) / 4;
    }

    public double calculaGrauFinal() {
        double g1 = calculaG1();
        if (g1 >= 7)
            return g1;
        return (g1 + pG2) / 2;
    }

    public String verificaAprovacao(){
        double g1 = calculaG1();
        if(g1 < 4 || frequencia < 75) return "Reprovado";
        else if(g1 >= 7) return "Aprovado";
            else if((g1 + pG2) / 2 >= 5) return "Aprovado";
                else return "Reprovado";
    }

    public String toString(){
        return "Matrícula: " + matricula + " - Nome: " + nome + "\nNotas: P1: " + p1 + "P2: " + p2 + "P3: " + p3 + "Média dos exercícios: " + mediaExercicios; 
    }

}
