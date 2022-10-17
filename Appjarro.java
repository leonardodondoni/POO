
/**
 * Escreva a descri��o da classe App aqui.
 * 
 * @author (seu nome) 
 * @version (n�mero de vers�o ou data)
 */
public class Appjarro
{
    public static void main(String args[]){
        Jarro j1 = new Jarro(4);
        Jarro j2 = new Jarro(3);
        
        System.out.println("\fInicio:");
        System.out.println("Estado do Jarro1: " + j1.getLitros());
        System.out.println("Estado do Jarro2: " + j2.getLitros());
        j1.encher();
        System.out.println("Apos encher jarro1:");
        System.out.println("Estado do Jarro1: " + j1.getLitros());
        System.out.println("Estado do Jarro2: " + j2.getLitros());
        j1.despejar(j2);
        System.out.println("Apos despejar jarro1 no jarro2:");
        System.out.println("Estado do Jarro1: " + j1.getLitros());
        System.out.println("Estado do Jarro2: " + j2.getLitros());
    }
}
