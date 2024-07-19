/*
 * Você deve criar um programa Java que permita ao usuário calcular o fatorial de um número inteiro positivo.
 * Lembre-se de que o fatorial de um número n é o produto de todos os inteiros positivos de 1 a n.
 * 
 * Por exemplo, se o usuário informar o número 7, o programa deve imprimir o fatorial de 7 que é 5040.
 */

import java.util.Scanner;

public class Exercise5 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Minha solução
        long numeroParaFatorar = scanner.nextInt();

        for (long i = (numeroParaFatorar - 1); i >= 1; i--) {
            System.out.println(numeroParaFatorar *= i);
        }

        System.out.println(numeroParaFatorar); // O máximo que vai mostrar é o fatorial de 20, depois dele o valor do fatorial já é maior do que a variável long consegue suportar.

        // Solução exercício
        /*int numero = scanner.nextInt();

        if (numero == 0 || numero == 1) {
          System.out.println(1);
          return;
        }
    
        long fatorial = 1;
        for (int i = 2; i <= numero; i++) {
          fatorial *= i;
        }
        System.out.println(fatorial);*/

        scanner.close();
    }
}

