/*
 * Leia um número e imprima se ele é par ou ímapar.
 */

import java.util.Scanner;

public class ParOuImpar {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Digite um número:");
        int numero = scanner.nextInt();

        String resultado;
        if (numero % 2 == 0) {
            resultado = "PAR.";
        } else {
            resultado = "ÍMPAR.";
        }

        System.out.println("O número " + numero + " é " + resultado);

        scanner.close();
    }
}
