package AulaVetores;
public class Operations {
    public static double media3Valores(double v1, double v2, double v3) {

        double m;
        m = (v1 + v2 + v3) / 3.0;
        return m;
    }

    public static double maior(double n1, double n2, double n3) {

        double maior = 0;

        // maior = n1;
        // if(n2>maior) maior = n2;
        // if(n3>maior) maior = n3;

        Double[] values = { n1, n2, n3 };
        for (Double value : values) {
            if (value > maior)
                maior = value;
        }

        return maior;

    }

    public static int segundos(int horas, int minutos, int segundos) {

        segundos = horas * 3600 + minutos * 60 + segundos;
        return segundos;
    }

    public static double distanciaEuclidiana(double x1, double y1, double x2, double y2) {

        double distanciaEuclidiana = Math.sqrt(Math.pow(x1 - x2, 2) + Math.pow(y1 - y2, 2));
        return distanciaEuclidiana;
    }

    public static double distanciaManhattan(double x1, double y1, double x2, double y2) {

        double distanciaManhattan = Math.abs(x1 - x2) + Math.abs(y1 - y2);
        return distanciaManhattan;
    }

    public static double pesoIdeal(double altura, double sexo) {

        double pesoIdeal = 0;

        if (sexo == 1) {
            pesoIdeal = (72.7 * altura) - 58;
        } else {
            pesoIdeal = (62.1 * altura) - 44.7;
        }
        return pesoIdeal;
    }

    public static double credito(double saldoMedio) {

        double credito = 0;

        if (saldoMedio < 501) {
            credito = 0;
        } else if (saldoMedio < 1501) {
            credito = (saldoMedio * 10) / 100.0;
        } else if (saldoMedio < 2501) {
            credito = (saldoMedio * 15) / 100.0;
        } else if (saldoMedio < 4001) {
            credito = (saldoMedio * 20) / 100.0;
        } else {
            credito = (saldoMedio * 25) / 100.0;
        }

        return credito;

    }

    public static double media(double nota1, double nota2, double nota3, int metodo) {

        double media;

        if (metodo == 1) {
            media = (nota1 + nota2 + nota3) / 3.0;
        } else if (metodo == 2) {
            media = ((nota1 * 3) + (nota2 * 3) + (nota3 * 4)) / 10.0;
        } else {
            media = 3.0 / ((1.0 / nota1) + (1.0 / nota2) + (1.0 / nota3));
        }

        return media;
    }

    public static int duracao(int horaroInicialEmMinutos, int horarioFinalEmMinutos) {

        int duracaoTotal;

        if (horaroInicialEmMinutos < horarioFinalEmMinutos)
            duracaoTotal = horarioFinalEmMinutos - horaroInicialEmMinutos;
        else {
            duracaoTotal = 24 * 60 - horaroInicialEmMinutos + horarioFinalEmMinutos;
        }
        return duracaoTotal;
    }

    public static double mediaAproveitamento(double nota1, double nota2, double nota3, double mediaExercicios) {

        double mediaAproveitamento = (nota1 + (nota2 * 2) + (nota3 * 3) + mediaExercicios) / 7.0;

        return mediaAproveitamento;
    }

    public static char conceito(double mediaAproveitamento) {

        char notaConceito;

        if (mediaAproveitamento < 4.0) {
            notaConceito = 'E';
        } else if (mediaAproveitamento < 6.0) {
            notaConceito = 'D';
        } else if (mediaAproveitamento < 7.5) {
            notaConceito = 'C';
        } else if (mediaAproveitamento < 9.0) {
            notaConceito = 'B';
        } else {
            notaConceito = 'A';
        }
        return notaConceito;
    }

    public static String aprovacao(double mediaAproveitamento) {

        String aprovacao;

        if (mediaAproveitamento >= 6.0) {
            aprovacao = "APROVADO";
        } else {
            aprovacao = "REPROVADO";
        }
        return aprovacao;

    }

    public static int somatorio(int num) {

        int somatorio = 0;
        for (int i = 1; i <= num; i++) {
            somatorio = somatorio + i;
        }
        return somatorio;
    }

    public static void divisoresTela(int num) {

        for (int i = 1; i <= num; i++) {
            if (num % i == 0) {
                System.out.println(i);
            }

        }

    }

    public static int divisores(int num) {

        int divisores = 0;

        for (int i = 1; i <= num; i++) {
            if (num % i == 0) {
                divisores++;
            }

        }
        return divisores;
    }

    public static int primosIntervalo(int maior, int menor) {

        int cont = 0;
        for (; menor <= maior; menor++) {
            if (Operations.divisores(menor) == 2) {
                cont++;
            }

        }

        return cont;

    }

    public static String semVogais(String exercicio) {

        String semVogais = exercicio.replaceAll("[aeiouAEIOU]", "");
        return semVogais;
    }

    public static String reverse(String exercicio) {

        int length = exercicio.length();

        String reverse = "";
        for (int i = length - 1; i >= 0; i--)
            reverse = reverse + exercicio.charAt(i);
        return reverse;
    }

    public static double exercise42(int num) {

        double S = 0, totalS = 0;
        ;

        for (int i = 1; i <= num; i++) {
            S = 1.0 / i;
            totalS = totalS + S;
        }
        return totalS;

    }

    public static boolean primo(int num) {
        boolean primo = true;
        if (Operations.divisores(num) == 2)
            primo = true;
        else
            primo = false;
        return primo;
    }

    public static int values(int num) {
        int value = 1;
        for (int i = 1; i < num; i++) {
            value++;
        }
        return value;
    }

    public static boolean perfectNumberChecker(int num) {

        int soma = 0;
        for (int i = 1; i <= num; i++) {

            if (num % i == 0) {
                soma = soma + i;
            }
        }
        if (soma - num == num)
            return true;
        else
            return false;

    }

    public static int fibonacci(int num) {

        int n1 = 0, n2 = 1, fibonacci = 1;
        for (int i = 2; i <= num; i++) {
            fibonacci = n1 + n2;
            n1 = n2;
            n2 = fibonacci;
        }
        return fibonacci;
    }
    public static double power(int x, int y) {
    
        if (y == 0)
            return 1;
        else return x * power(x, y - 1);
    }
    public static boolean isPalindrome(String word){

        boolean palindrome;

        if(Operations.reverse(word) == word){
            palindrome = true;
        }
        else palindrome = false;

        return palindrome;
    }
    
    public static int somatorioR(int num){
        if (num < 2){
            return 1;
        }
        return somatorioR(num - 1) + num;
    }
    public static double calculoSRecursivo(int num){
        if (num < 2){
            return 1;
        }
        return calculoSRecursivo(num - 1) + num / (2.0 * num - 1);
    }

    public static int fibonacciRecursivo(int num){
        if(num <=2)
        return 1;
        return fibonacciRecursivo(num - 2) + fibonacci(num -1);
    }
    public static double exercise14(int x, int y){
        double resultado = 0;
        double totalResultado = 0;
        for(int i = 1;i <= y; i++){
            resultado = Math.pow(x , i) / i;
            totalResultado = totalResultado + resultado;
        }
        return totalResultado;
    }
}