/*
 * Escreva um programa Java que imprima a soma dos números de 1 até um número inteiro positivo N, onde N é fornecido pelo usuário.
 * O programa deve solicitar ao usuário que insira o valor de N e, em seguida, calcular e exibir a soma dos números de 1 até N.
 * 
 * Ex: Se N = 5, a soma de 1 a N será 15.
 */

import java.util.Scanner;

public class Exercise2 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Digite até que número deseja somar: ");
        int numeroFinalLoop = scanner.nextInt();

        int soma = 0;
        for (int i = 1; i <= numeroFinalLoop; i++) {
            soma += i;
        }

        System.out.println(soma);

        scanner.close();
    }
}