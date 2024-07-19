/*
 * Crie um programa Java que solicita ao usuário uma série de números e quando ele digitar um número negativo, o programa irá encerrar e imprimir o maior número entre os digitados.
 * Você deve utilizar estruturas de repetição para coletar os números e determinar qual é o maior.
 * 
 * Ex: Suponha que o usuário insira os seguintes números: 5, 12, 8, 25, 3, -1. A saída do programa deve ser: 25.
 */

import java.util.Scanner;

public class Exercise4 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int maiorNumeroDigitado = 0;
        while (true) {
            int numeroDigitado = scanner.nextInt();

            if (numeroDigitado < 0) {
                break;
            } else {
                if (maiorNumeroDigitado < numeroDigitado) {
                    maiorNumeroDigitado = numeroDigitado;
                }
            }
        }

        System.out.println(maiorNumeroDigitado);

        scanner.close();
    }
}