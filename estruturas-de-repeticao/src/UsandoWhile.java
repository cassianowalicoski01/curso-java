import java.util.Scanner;

public class UsandoWhile {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int numeroSorteado = 7, tentativas = 5, chutesFeitos = 0;

        // Utilizando While
        while (tentativas > 0) {
            System.out.println("Adivinhe o número de 1 a 10:");
            int numeroDigitado = scanner.nextInt();

            if (numeroDigitado == numeroSorteado) {
                chutesFeitos++;
                System.out.println("\nParabéns! Você acertou em " + chutesFeitos + " tentativas.");
                break;
            } else {
                tentativas--;
                chutesFeitos++;
                System.out.println("\nErrou! Tente novamente...\nTentativas restantes: " + tentativas + "\n");
            }
        }

        if (tentativas == 0) {
            System.out.println("O jogo acabou! O número correto era " + numeroSorteado);
        }

        // Utilizando Do While
        do {
            System.out.println("Adivinhe o número de 1 a 10:");
            int numeroDigitado = scanner.nextInt();

            if (numeroDigitado == numeroSorteado) {
                chutesFeitos++;
                System.out.println("\nParabéns! Você acertou em " + chutesFeitos + " tentativas.");
                break;
            } else {
                tentativas--;
                chutesFeitos++;
                System.out.println("\nErrou! Tente novamente...\nTentativas restantes: " + tentativas + "\n");
            }
        } while (tentativas > 0);

        if (tentativas == 0) {
            System.out.println("O jogo acabou! O número correto era " + numeroSorteado);
        }

        scanner.close();
    }
}
