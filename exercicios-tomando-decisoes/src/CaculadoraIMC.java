import java.util.Scanner;

public class CaculadoraIMC {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("\nCALCULADORA DE IMC\n");

        System.out.println("Digite a altura em metros (ex: 1,80):");
        double altura = scanner.nextDouble();
        System.out.println("Digite o peso em kg (80,0):");
        double peso = scanner.nextDouble();

        double imc;
        if (altura > 9.9) {
            // Caso o usuário digite a altura (ex: 1.90 -> 190)
            imc = peso / ((altura / 100) * (altura / 100));
        } else {
            // Se o usuário digitar certo (ex; 1.80 -> 1,80)
            imc = peso / (altura * altura);
        }

        String classificacao;
        if (imc < 18.5) {
            classificacao = "MAGREZA";
        } else if (imc >= 18.5 && imc <= 24.9) {
            classificacao = "NORMAL";
        } else if (imc >= 25.0 && imc <= 29.9) {
            classificacao = "SOBREPESO";
        } else if (imc >= 30.0 && imc <= 39.9) {
            classificacao = "OBSIDADE II";
        } else {
            classificacao = "OBSIDADE III";
        }

        System.out.printf("\nSeu IMC é %.1f\nClassificação: %s\n", imc, classificacao);

        scanner.close();
    }
}
