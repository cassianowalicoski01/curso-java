/*
 * Crie um programa que lê 2 números, depois dois arrays de números com os tamanhos informados anteriormente e ao final imprime os números comuns que aparecem em ambos os arrays.
 */

import java.util.Scanner;

public class ComparandoArraysNumeros {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Digite o tamanho do primeiro array:");
        int numero1 = scanner.nextInt();

        System.out.println("\nDigite o tamanho do segundo array:");
        int numero2 = scanner.nextInt();

        int [] array1 = new int[numero1];
        int [] array2 = new int[numero2];

        // Primeiro Array
        System.out.printf("\nDigite %d números para o primeiro array: ", numero1);
        for (int i = 0; i < array1.length; i++) {
            array1[i] = scanner.nextInt();
        }
        
        // Segundo Array
        System.out.printf("\nDigite %d números para o segundo array: ", numero2);
        for (int i = 0; i < array2.length; i++) {
            array2[i] = scanner.nextInt();
        }

        // Verificando números iguais dos dois arrays
        for (int num1 : array1) {
            for (int num2 : array2) {
                if (num1 == num2) {
                    System.out.print(num1);
                }
            }
        }

        scanner.close();
    }
  }