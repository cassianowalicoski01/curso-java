/*
 * Crie um programa Java que lê um número n (no exemplo abaixo n é igual a 5) e gera um padrão de números crescentes da seguinte forma:
 * 1
 * 12
 * 123
 * 1234
 * 12345
 * 
 * Dica: Utilize loops aninhados para resolver o problema.
 */

import java.util.Scanner;

public class Exercise3 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Minha resolução
        int numeroFinal = scanner.nextInt();

        for (int i = 1; i <= numeroFinal; i++) {
            for (int j = 1; j <= numeroFinal; j++) {
                System.out.print(j);
                if (j == i) {
                    break;
                }
            }
            System.out.println();
        }

        // Resolução do curso
        int numberOfRows = scanner.nextInt();

        for (int i = 1; i <= numberOfRows; i++) {
            for (int j = 1; j <= i; j++) {
                System.out.print(j);
            }
            System.out.println();
        }

        scanner.close();
    }
}