/*
 * Escreva um programa Java que imprime números de 1 à 10 utilizando a estrutura de repetição while.
 * O programa deve imprimir cada número em uma linha diferente.
 */

public class Exercise1 {
    public static void main(String[] args) {
      int numero = 1, contador = 10;

      while (numero <= contador) {
        System.out.println(numero);
        numero++;
      }
    }
  }