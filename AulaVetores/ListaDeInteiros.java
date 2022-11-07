package AulaVetores;

import java.util.Random;

/*a) Cria a lista de inteiros com um tamanho informado por parametro
  b) Preencher a lista com valores aleatórios OK
  c) Devolver a soma dos elementos da lista OK
  d) Devolver a media dos elementos da lista OK
  e) Encontrar o maior valor da lista OK
  f) Quantidade de valores pares existentes na lista OK
  e) Inverte a lista(numeros nao print) OK
  i) Coloca os valores da lista em ordem crescente OK
  j) Verifica se um valor esta na lista OK
  k) SUbstitui um valor da lista por outro OK
  l) QUantidade de valores primos existentes na lista OK
  m) Devolve os valores impares da lista 
  n) Devolve os valores primos da lista
  o) Devolve os valores distintos (sem repetiçao) --FAZER
  p) Devolve os n maiores valores (n eh parametro) -- FAZER
  r) Calcula a moda dos elementos  -- FAZER
  s) Calcula a mediana dos elementos -- FAZER
  t) Organiza o vetor colocando os pares no inicio e os impares no final --FAZER
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

    public int sumOfNumbers() {
        int sum = 0;
        for (int i = 0; i < list.length; i++) {
            sum += list[i];
        }
        return sum;
    }

    public double averageOfNumbers() {
        return (double) sumOfNumbers() / list.length;
    }

    public int highestNumber() {
        int highestNumber = list[0];
        for (int i = 0; i < list.length; i++) {
            if (list[i] > highestNumber)
                highestNumber = list[i];
        }
        return highestNumber;
    }

    public int evenQuantity() {
        int evenQuantity = 0;
        for (int i = 0; i < list.length; i++) {
            if (list[i] % 2 == 0)
                evenQuantity++;
        }
        return evenQuantity;
    }

    public void invertList() {
        int[] invertList = new int[list.length];
        int j = list.length - 1;
        for (int i = 0; i < list.length; i++) {
            invertList[i] = list[j];
            j--;
        }
        for (int i = 0; i < list.length; i++) {
            list[i] = invertList[i];
        }
    }

    public void invertListUpgrade() {
        int j = list.length - 1;
        int aux;
        int limit = list.length / 2;
        for (int i = 0; i < list.length; i++) {
            aux = list[i];
            list[i] = list[j];
            list[j] = aux;
            j--;
        }
    }

    public void sortList() {
        int aux;
        // 3 < 3
        for (int i = 0; i < list.length - 1; i++) {
            // 3< 3
            for (int j = 0; j < list.length - 1 - i; j++) {
                if (list[j] > list[j + 1]) {
                    aux = list[j]; // 10
                    list[j] = list[j + 1];
                    list[j + 1] = aux;
                }
            }
        }
    }

    public boolean checkNumber(int number) {
        for (int i = 0; i < list.length; i++) {
            if (list[i] == number)
                return true;
        }
        return false;
    }

    public int replaceNumber(int index, int number) {
        for (int i = 0; i < list.length; i++) {
            if (index >= 0 && index < list.length) {
                int aux = list[index];
                list[index] = number;
                return aux;
            }
        }
        return -1;
    }

    public int primeQuantity() {
        int primeQuantity = 0;
        for (int i = 0; i < list.length; i++) {
            if (Operations.primo(list[i]) == true)
                primeQuantity++;
        }
        return primeQuantity;
    }

    public int[] oddList() {
        int[] oddList;
        int oddListSize = 0;
        for (int i = 0; i < list.length; i++) {
            if (list[i] % 2 != 0) {
                oddListSize++;
            }
        }
        oddList = new int[oddListSize];
        int j = 0;
        for (int i = 0; i < oddListSize; i++) {
            if (list[i] % 2 != 0) {
                oddList[j] = list[i];
                j++;
            }
        }
        return oddList;
    }

    public int[] primeList() {
        int primeListSize = primeQuantity();
        if (primeListSize == 0)
            return null;
        int[] primeList = new int[primeListSize];
        int j = 0;
        for (int i = 0; i < primeList.length; i++) {
            if (Operations.primo(list[i]) == true) {
                primeList[j] = list[i];
                j++;
            }
        }
        return primeList;
    }

    public int[] modaList() {
        for (int i = 0; i < list.length; i++) {
            
        }
    }
}