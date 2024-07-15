import java.util.Scanner;

/* 
 * Exercício 1:
 * 
 * Dadas 3 notas, imprimir a média aritmética do aluno.
 * 
 * 1. Ler 3 notas
 * 2. Calcular média
 * 3. Imprimir resultado
 * 
 * Fórmula: MA = (n1 + n2 + n3) / 3
 */

public class MediaAritmetica {
    public static void main(String[] args) {

        Scanner lerNotas = new Scanner(System.in);

        System.out.println("Digite a primeira nota: ");
        double nota1 = lerNotas.nextDouble();
        System.out.println("Digite a segunda nota: ");
        double nota2 = lerNotas.nextDouble();
        System.out.println("Digite a terceira nota: ");
        double nota3 = lerNotas.nextDouble();

        lerNotas.close();

        double media = (nota1 + nota2 + nota3) / 3;

        System.out.printf("A média do aluno foi: %.2f", media);
    }
}