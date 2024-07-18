import java.util.Scanner;

/*
 * Escreva um programa que checa se um ano é bissexto.
 * 
 * Um ano bissexto é divisível por 4, reseltando uma divisão inteira.
 * Entretanto para ser um ano bissexto, mesmo ele sendo divisível por 4, ele deve ser divisível por 100 e por 400, resultando uma divisão inteira.
 * 
 * EX: O ano 2000 foi um ano bissexto porque é divisível por 400,
 * mas o ano de 1900 não foi bissexto poque é divisível por 100, mas não por 400.
 */

public class AnoBissexto {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Digite o ano para ver se ele é bissexto ou não:");
        int ano = scanner.nextInt();

        if (ano % 4 != 0 || (ano % 100 == 0 && ano % 400 != 0)) {
            System.out.println("O ano " + ano + " não é bissexto."); 
        } else {
            System.out.println("O ano " + ano + " é bissexto.");
        }
        
        scanner.close();
    }
}
