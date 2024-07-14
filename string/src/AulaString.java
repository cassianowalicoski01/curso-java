import java.util.Scanner;

public class AulaString {
    public static void main(String[] args) {
        // String nõa é um tipo primitivo, ela é um tipo de referência provido pelo Java que representa uma cadeia de caracteres.
        String texto = "Esse é um texto para ser imprimido.";
        System.out.println(texto);

        System.out.println("Digite seu nome: ");
        Scanner scanner = new Scanner(System.in);
        String nome = scanner.nextLine(); // O nextLine() retorna todo o texto escrito, já o next() retorna só a primeira palavra escrita.
        System.out.printf("Seu nome é %s", nome);
        scanner.close();
    }
}
