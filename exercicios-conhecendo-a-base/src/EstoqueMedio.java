/*
 * Faça um programa para calcular o estoque médio de uma peça, seguindo a fórmula:
 * estoqueMedio = (quantidadeMinima + quantidadeMaxima) / 2
 * 
 * Ex: quantidadeMinima = 3, quantidadeMaxima = 8: -> Perceba que o resultado é 11 / 2 = 5.5, porém só iria aparecer 5, para isso posso usar um casting explicito (double) ou 
 * simplismente dividir por 2.0 em vez de 2.
 * O estoque médio é de 5 unidades.
 */

import java.util.Scanner;

public class EstoqueMedio {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Digite a quantidade minima no estoque:");    
        int quantidadeMinima = scanner.nextInt();
        System.out.println("Digite a quantidade minima no estoque:");
        int quantidadeMaxima = scanner.nextInt();
        
        double estoqueMedio = (quantidadeMinima + quantidadeMaxima) / 2.0;
        
        System.out.println("O estoque médio é de " + estoqueMedio + " unidades.");

        scanner.close();
    }
}
