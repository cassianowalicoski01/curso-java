/*
 * Crie um programa que leia um nome e imprima uma saudação utilizando o Console ao invés do Scanner.
 * Obs: O Console não consegue ler números, somente strings.
 */

import java.io.Console;

public class SaudacaoConsole {
    public static void main(String[] args) {
        Console console = System.console();

        System.out.println("Qual seu nome?");
        String nome = console.readLine();

        System.out.println("Olá, " + nome);
    }
}
