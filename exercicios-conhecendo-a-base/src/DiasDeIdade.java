/*
 * Escreva um programa que leia a idade em anos e imprima essa idade em dias.
 * 
 * Ex: 1 ano -> 365 dias de idade.
 */

import java.util.Scanner;

public class DiasDeIdade {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Qual seu nome: ");
        String nome = scanner.nextLine();

        System.out.println("Digite sua idade em anos: ");
        int idadeEmAnos = scanner.nextInt();

        scanner.close();

        int idadeEmDias = idadeEmAnos * 365;

        System.out.printf("%s, você tem %d anos de idade, portanto já viveu %d dias desde que você nasceu!", nome, idadeEmAnos, idadeEmDias);
    }
}
