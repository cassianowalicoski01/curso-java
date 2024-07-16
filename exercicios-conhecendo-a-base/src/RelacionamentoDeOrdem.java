/*
 * Escreva um programa que informe os relacionamentos de ordem existentes entre dois números:
 * Igual, não igual, maior, menor, maior ou igual, menor ou igual.
 * 
 * 1. Ler dois números
 * 2. Imprimir relacionamentosde ordem
 * 
 * Ex: Dados os números 2 e 3:
 * 2 = 3 ? false, 2 != 3 ? true, ...
 */

import java.util.Scanner;

public class RelacionamentoDeOrdem {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Digite o primeiro número: ");
        int numero1 = scanner.nextInt();
        System.out.println("Digite o segundo número: ");
        int numero2 = scanner.nextInt();

        System.out.printf("%d == %d ? %b\n", numero1, numero2 ,numero1 == numero2);
        System.out.printf("%d != %d ? %b\n", numero1, numero2 ,numero1 != numero2);
        System.out.printf("%d > %d ? %b\n", numero1, numero2 ,numero1 > numero2);
        System.out.printf("%d < %d ? %b\n", numero1, numero2 ,numero1 < numero2);
        System.out.printf("%d >= %d ? %b\n", numero1, numero2 ,numero1 >= numero2);
        System.out.printf("%d <= %d ? %b\n", numero1, numero2 ,numero1 <= numero2);

        scanner.close();
    }
}
