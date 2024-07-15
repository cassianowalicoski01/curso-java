/*
 * Imprimir a tabuada de um número
 * 
 * 1. Ler um número
 * 2. Imprimir sua  tabuada
 * 
 * 1 a 10 -> 1 x 1 = 1, 1 x 2 = 2, ... 1 x 10 = 10.
 */

import java.util.Scanner;

public class Tabuada {
    public static void main(String[] args) {
        System.out.println("Digite um número para ver sua tabuada: ");
        Scanner scanner = new Scanner(System.in);
        int numero = scanner.nextInt();

        System.out.println("---- Tabuada do número " + numero + " ----");
        System.out.println(numero + " x 1 = " + (numero*1));
        System.out.println(numero + " x 2 = " + (numero*2));
        System.out.println(numero + " x 3 = " + (numero*3));
        System.out.println(numero + " x 4 = " + (numero*4));
        System.out.println(numero + " x 5 = " + (numero*5));
        System.out.println(numero + " x 6 = " + (numero*6));
        System.out.println(numero + " x 7 = " + (numero*7));
        System.out.println(numero + " x 8 = " + (numero*8));
        System.out.println(numero + " x 9 = " + (numero*9));
        System.out.println(numero + " x 10 = " + (numero*10));

        scanner.close();
    }
}
