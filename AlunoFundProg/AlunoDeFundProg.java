package AlunoFundProg;

public class AlunoDeFundProg {

    private String nome;
    private int matricula, frequencia;
    private double p1, p2, p3, mediaExerc, g1, g2;
    private String regex = "[0-9]+";

    public AlunoDeFundProg(String nomeInicial, int matriculaInicial, int frequenciaInicial, double p1Inicial,
            double p2Inicial, double p3Inicial, double mediaExercInicial, double g1Inicial, double g2Inicial) {
        if (nomeInicial == null)
            throw new IllegalArgumentException("Não insira nome vazio");
        if (nomeInicial == regex)
            throw new IllegalArgumentException("Não insira números no nome");
        else
            nome = nomeInicial;
        if (matriculaInicial <= 0)
            throw new IllegalArgumentException("Número de matricula inválido.");
        else
            matricula = matriculaInicial;
        if (frequenciaInicial < 0 || frequenciaInicial > 100)
            throw new IllegalArgumentException("Número de frequencia inválido.");
        else
            frequencia = frequenciaInicial;
        if (p1Inicial < 0 || p1Inicial > 10)
            throw new IllegalArgumentException("Nota da P1 inválida.");
        else
            p1 = p1Inicial;
        if (p2Inicial < 0 || p2Inicial > 10)
            throw new IllegalArgumentException("Nota da P2 inválida.");
        else
            p2 = p2Inicial;
        if (p3Inicial < 0 || p3Inicial > 10)
            throw new IllegalArgumentException("Nota da P3 inválida.");
        else
            p3 = p3Inicial;
        if (mediaExercInicial < 0 || mediaExercInicial > 10)
            throw new IllegalArgumentException("Nota da média exercícios inválida.");
        else
            mediaExerc = mediaExercInicial;
        if (g1Inicial < 0 || g1Inicial > 10)
            throw new IllegalArgumentException("Nota da G1 inválida.");
        else
            g1 = g1Inicial;
        if (g2Inicial < 0 || g2Inicial > 10)
            throw new IllegalArgumentException("Nota da G2 inválida.");
        else
            g2 = g2Inicial;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nomeNovo) {
        if (nomeNovo == null)
            throw new IllegalArgumentException("Não insira nome vazio");
        if (nomeNovo == regex)
            throw new IllegalArgumentException("Não insira números no nome");
        else
            nome = nomeNovo;
    }

    public int getMatricula() {
        return matricula;
    }

    public void setMatricula(int matriculaNova) {
        if (matriculaNova == 0)
            throw new IllegalArgumentException("Número de matricula inválido.");
        else
            matricula = matriculaNova;
    }

    public int getFrequencia() {
        return frequencia;
    }

    public void setFrequencia(int frequenciaNova) {
        if (frequenciaNova < 0 || frequenciaNova > 100)
            throw new IllegalArgumentException("Número de frequencia inválido.");
        else
            frequencia = frequenciaNova;
    }

    public double getP1() {
        return p1;
    }

    public void setP1(double p1Novo) {
        if (p1Novo < 0 || p1Novo > 10)
            throw new IllegalArgumentException("Nota da P1 inválida.");
        else
            p1 = p1Novo;
    }

    public double getP2() {
        return p2;
    }

    public void setP2(double p2Novo) {
        if (p2Novo < 0 || p2Novo > 10)
            throw new IllegalArgumentException("Nota da P2 inválida.");
        else
            p2 = p2Novo;
    }

    public double getP3() {
        return p3;
    }

    public void setP3(double p3Novo) {
        if (p3Novo < 0 || p3Novo > 10)
            throw new IllegalArgumentException("Nota da P3 inválida.");
        else
            p3 = p3Novo;
    }

    public double getMediaExerc() {
        return mediaExerc;
    }

    public void setMediaExerc(double mediaExercNova) {
        if (mediaExercNova < 0 || mediaExercNova > 10)
            throw new IllegalArgumentException("Nota da média exercícios inválida.");
        else
            mediaExerc = mediaExercNova;
    }

    public double getG1() {
        return g1;
    }

    public void setG1(double g1Novo) {
        if (g1Novo < 0 || g1Novo > 10)
            throw new IllegalArgumentException("Nota da G1 inválida.");
        else
            g1 = g1Novo;
    }
    public double getG2() {
        return g2;
    }
    public void setG2(double g2Novo) {
        if (g2Novo < 0 || g2Novo > 10)
            throw new IllegalArgumentException("Nota da G2 inválida.");
            else
                g2 = g2Novo;
    }
    public boolean verificaAprovado() {
        if (p1 + p2 + p3 + mediaExerc / 4.0 >= 7 && frequencia > 75)
        return true;
        else return false;
    }
    public String toString(){
        return "Nome: " + nome + "\nMatrícula: " + matricula + "\nFrequência: " + frequencia + "\nNota P1: " + p1 + "\nNota P2: " + p2 + "\nNota P3:" + p3 + "\nMédia de exercícios: " + mediaExerc + "\nG1: " + g1 + "\nG2: " + g2;
    }
}