import java.util.Scanner;

/*
 * Dada a idade do atleta, imprima sua categoria:
 * 
 * Mirim: 10 a 12 anos
 * Infantil: 13 a 15 anos
 * Juvenil: 16 a 18 anos
 */

public class CategoriaAtleta {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Digite sua idade:");
        int idade = scanner.nextInt();

        if (idade >= 10 && idade <= 12) {
            System.out.println("Categoria: MIRIM");
        } else if (idade >= 13 && idade <= 15) {
            System.out.println("Categoria: INFANTIL");
        } else if (idade >= 16 && idade <= 18) {
            System.out.println("Categoria: JUVENIL");
        } else {
            System.out.println("Você não se encaixa em nenhuma categoria.");
        }

        scanner.close();
    }
}
