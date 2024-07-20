/*
 * Crie um programa que lê um número inteiro n que representa a quantidade de números a serem inseridos pelo usuário e, em seguida, lê esses n números, e finalmente os imprime de volta ao usuário.
 * 
 * Obs: Cada número deve ser impresso numa linha separada. Além disso a impressão deve ser feita depois da leitura de todos os números, e não durante.
 */

import java.util.Scanner;

public class ImprimirArrayNumeros {
    public static void main (String[] args) {
        Scanner scanner = new Scanner(System.in);

        int quantidadeNumeros = scanner.nextInt();

        int [] numeros = new int[quantidadeNumeros];

        for (int i = 0; i < numeros.length; i++) {
            int numerosDigitados = scanner.nextInt();
            numeros[i] = numerosDigitados;
        }

        for (int numero : numeros) {
            System.out.println(numero);
        }

        scanner.close();
    }
}