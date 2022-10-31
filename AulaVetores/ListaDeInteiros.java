package AulaVetores;

import java.util.Random;

/*a) Cria a lista de inteiros com um tamanho informado por parametro
  b) Preencher a lista com valores aleatórios ok
  c) Devolver a soma dos elementos da lista ok
  d) Devolver a media dos elementos da lista ok
  e) Encontrar o maior valor da lista ok
  f) Quantidade de valores pares existentes na lista ok
  e) Inverte a lista(numeros nao print) ok
  i) Coloca os valores da lista em ordem crescente ok
  j) Verifica se um valor esta na lista ok
  k) SUbstitui um valor da lista por outro ok
  l) QUantidade de valores primos existentes na lista ok
  m) Devolve os valores impares da lista ok
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

    public int sumOfNumbers() {
        int sum = 0;
        for (int i = 0; i < list.length; i++) {
            sum += list[i];
        }
        return sum;
    }

    public int averageOfNumbers() {
        int average = 0;
        int aux = 0;
        for (int i = 0; i < list.length; i++) {
            aux += list[i];
        }
        average = aux / list.length;
        return average;
    }

    public int highestNumber() {
        int highestNumber = Integer.MIN_VALUE;
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

    public int[] invertList() {
        int[] invertList = new int[list.length];
        for (int i = list.length; i > -1; i--) {
            for (int j = 0; j < list.length; i++) {
                list[j] = list[i];
            }
        }
        return invertList;
    }

    public int[] sortList() {
        for (int i = 0; i < list.length; i++) {
            int j = i;
            while (j > 0 && list[j - 1] > list[j]) {
                list[j] = list[j - 1];
                j--;
            }
        }
        return list;
    }

    public boolean checkNumber(int number) {
        for (int i = 0; i < list.length; i++) {
            if (list[i] == number)
                return true;
        }
        return false;
    }

    public void replaceNumber(int number, int index) {
        for (int i = 0; i < list.length; i++) {
            if (i == index) {
                list[i] = number;
            }
        }
    }

    public int primeQuantity() {
        int primeQuantity = 0;
        int aux = 0;
        for (int i = 0; i < list.length; i++) {
            if (list[i] % i == 0)
                aux++;
            if (aux == 2) {
                primeQuantity++;
                aux = 0;
            }
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
        for (int i = 0; i < oddListSize; i++) {
            if (list[i] % 2 != 0) {
                oddList[i] = list[i];
            }
        }
        return oddList;
    }

    public int[] primeList() {
        int[] primeList;
        int primeListSize = 0;
        int aux = 0;
        for (int i = 0; i < list.length; i++) {
            if (list[i] % i == 0) {
                aux++;
            }
            if (aux == 2) {
                primeListSize++;
                aux = 0;
            }
        }
        primeList = new int[primeListSize];
        for (int i = 0; i < primeListSize; i++) {
            if (list[i] % i == 0) {
                primeList[i] = list[i];
            }
        }
        return primeList;
    }
}