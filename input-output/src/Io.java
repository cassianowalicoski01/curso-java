/*
 * Entrada e Saída (I/O) de dados no Java.
 * 
 * Entrada de dados: Ler dados digitados pelo usuário.
 * Saída de daos: Escrever dados para o usuário.
 */

import java.util.Scanner;

public class Io {
    public static void main(String[] args) {
        // Leitura de dados de entrada (input)
        System.out.println("Digite um número: ");
        Scanner escreverDados = new Scanner(System.in);
        int valorDigitado = escreverDados.nextInt();
        System.out.println("O valor digitado foi: " + valorDigitado);
        escreverDados.close();

        // Saída de dados (output) formatada usando o printf
        float qualquerNumero = 4.4f;
        String nome = "Cassiano";
        boolean resposta = true;
        char caractere = 'C';

        System.out.printf("O número digitado foi: %f", qualquerNumero);
        System.out.printf("\nMeu nome é %s ", nome);
        System.out.printf("\nA reposta é %b", resposta);
        System.out.printf("Letra %c", caractere);

        /*
            ESPECIFICADORES:

            %d: usado para formatar valores inteiros (int, long, byte, short) em decimal;
            %f: usado para formatar valores de ponto flutuante (float, double) em decimal;
            %s: usado para formatar valores de tipo String;
            %c: usado para formatar caracteres;
            %b: usado para formatar valores booleanos;
            %o: usado para formatar valores inteiros em octal;
            %x: usado para formatar valores inteiros em hexadecimal;
            %e ou %E: usado para formatar valores de ponto flutuante em notação científica
         */
    }
}
