
/**
 * Escreva a descrição da classe App aqui.
 * 
 * @author (seu nome) 
 * @version (número de versão ou data)
 */
public class App
{
    public static void main(String args[]){
        Margem esquerda = new Margem ("esquerda");
        Margem direita = new Margem("direita");
        Barco b1 = new Barco(direita);
        direita.inicializa();
        
        System.out.println("\finicio");
        System.out.println(esquerda);
        System.out.println(direita);
        System.out.println(b1);
        
        b1.embarcar('c');
        b1.embarcar('c');
        //System.out.println(b1.embarcar('c'));
        System.out.println("apos embarcar 2 canibais");
        System.out.println(esquerda);
        System.out.println(direita);
        System.out.println(b1);
        
        b1.navegarPara(esquerda);
        b1.desembarcar('c');
        //System.out.println(b1.desembarcar('c'));
        System.out.println("apos navegar");
        System.out.println(esquerda);
        System.out.println(direita);
        System.out.println(b1);
    }
}
