package AulaVetores;

public class AppListaDeInteiros {
    public static void main(String args[]) {

        ListaDeInteiros numbers = new ListaDeInteiros(5);
        numbers.fillRandomNumbers();
        System.out.println("\fValores iniciais: " + numbers.toString());
        
    }
}
