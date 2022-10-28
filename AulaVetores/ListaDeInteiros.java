package AulaVetores;

import java.util.Random;

/*a) Cria a lista de inteiros com um tamanho informado por parametro
  b) Preencher a lista com valores aleatórios 
  c) Devolver a soma dos elementos da lista
  d) Devolver a media dos elementos da lista
  e) Encontrar o maior valor da lista
  f) Quantidade de valores pares existentes na lista
  e) Inverte a lista(numeros nao print)
  i) Coloca os valores da lista em ordem crescente
  j) Verifica se um valor esta na lista
  k) SUbstitui um valor da lista por outro
  l) QUantidade de valores primos existentes na lista
  m) Devolve os valores impares da lista
  n) Devolve os valores primos da lista
   */

public class ListaDeInteiros {

    private int[] list;

    public ListaDeInteiros(int quantidade) {
        if (quantidade < 2)
            quantidade = 10;
        list = new int[quantidade];
    }

    public void fillRandomNumbers() {
        Random random = new Random();
        for (int i = 0; i < list.length; i++) {
            list[i] = random.nextInt(13);
        }
    }

    public String toString() {
        String msg = "";
        for (int i = 0; i < list.length; i++) {
            msg += list[i] + " ";
        }
        return msg;
    }
}
