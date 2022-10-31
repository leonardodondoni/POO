package AulaVetores;

public class AppListaDeInteiros {
    public static void main(String args[]) {

        ListaDeInteiros numbers = new ListaDeInteiros(5);
        numbers.fillRandomNumbers();
        System.out.println("\fValores iniciais: " + numbers.toString());
        System.out.println("Soma dos elementos: " + numbers.sumOfNumbers());
        System.out.println("Média dos elementos: " + numbers.averageOfNumbers());
        System.out.println("Maior elemento: " + numbers.highestNumber());
        numbers.invertList();
        System.out.println(numbers.toString());
        
    }
}
