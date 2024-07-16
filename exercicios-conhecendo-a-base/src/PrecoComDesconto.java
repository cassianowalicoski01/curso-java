/*
 * Imprimir preço de um produto com base no desconto à vista e o valor economizado.
 * 
 * 1. Ler preço
 * 2. Ler % de desconto
 * 3. Imprimir novo preço e valor descontado em reais
 * 
 * Ex: R$100,00 com 10% de desconto = O preço com desconto é R$90,00 e o valor economizado foi R$10,00.
 */

import java.util.Scanner;

public class PrecoComDesconto {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Insira o preço do produto:");
        double preco = scanner.nextDouble();
        System.out.println("Insira o desconto em %:");
        double desconto = scanner.nextDouble();

        double valorDesconto = (desconto * preco) / 100;
        double precoComDesconto = preco - valorDesconto;

        System.out.printf("R$%.2f com %.0f%% de desconto.", preco, desconto);
        System.out.printf("\nO valor final com o desconto ficou R$%.2f e o valor economizado nessa compra foi de R$%.2f.", precoComDesconto, valorDesconto);

        scanner.close();
    }
}