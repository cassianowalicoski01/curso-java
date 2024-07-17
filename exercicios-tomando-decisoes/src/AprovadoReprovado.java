/*
 * Leia 3 notas de um aluno e imprima se ele foi aprovado ou não.
 * Obs: O aluno deve possuir média 7.0 ou maior para ser aprovado.
 */

import java.util.Scanner;

public class AprovadoReprovado {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Digite 3 notas do aluno:");
        double nota1 = scanner.nextDouble();
        double nota2 = scanner.nextDouble();
        double nota3 = scanner.nextDouble();

        double media = (nota1 + nota2 + nota3) / 3;

        System.out.printf("A média do aluno foi %.1f.\n", media);

        if (media >= 7.0) {
            System.out.println("O aluno está APROVADO! :)");
        } else if (media >= 6.0 && media < 7.0) {
            System.out.println("O aluno está em RECUPERAÇÃO! :/");
        } else {
            System.out.println("O aluno está REPROVADO! :(");
        }

        scanner.close();
    }
}
