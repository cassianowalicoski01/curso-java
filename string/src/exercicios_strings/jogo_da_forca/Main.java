package exercicios_strings.jogo_da_forca;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        System.out.println("\n--------- JOGO DA FORCA ---------\n");

        System.out.print("Digite a palavra que deseja adicionar a forca: ");
        String palavraForca = scanner.next();
        
        System.out.print("Digite a quantidade máxima de erros que você pode ter: ");
        int tentativa = scanner.nextInt();

        System.out.println("\n---------------------------------\n");
        
        Forca novoJogo = new Forca(palavraForca, tentativa); // Instancio um novo objeto Forca e posso como argumento a palavra da forca e o números maximos de erros que o usuário pode ter.

        while (true) { // Inicio o jogo em um loop infinito verdadeiro. Ele vai rodar até alguma condição for false.

            System.out.print("Faça um palpite de uma letra: ");
            char palpite = scanner.next().charAt(0); // O next() pega todos os caracteres até um espaço em branco, porém eu só quero pegar o primeiro caracter digitado, então uso o charAt e paso que eu quero a posição 0 do que foi digitado no next().

            if (novoJogo.fazerPalpite(String.valueOf(palpite)) == true) { // Verfico se o retorno do método é true, caso seja paro o loop e encerro o jogo, caso retorne false o loop continua.
                scanner.close();
                break;
            }
        }
    }
    
}
