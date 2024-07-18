import java.util.Scanner;

public class Calculadora {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Primeiro número: ");
        double numero1 = scanner.nextDouble();
        
        System.out.println("Operação (+)(-)(*)(/): ");
        String operador = scanner.next();

        System.out.println("Segundo número: ");
        double numero2 = scanner.nextDouble();

        double resultado = 0;
        switch (operador) {
            case "+" -> resultado = (numero1 + numero2);
            case "-" -> resultado = (numero1 - numero2);
            case "*" -> resultado = (numero1 * numero2);
            case "/" -> resultado = (numero1 / numero2);
            default -> System.out.println("Operador inválido!");
        }

        System.out.printf("%.1f %s %.1f = %.1f" ,numero1, operador, numero2, resultado);

        scanner.close();
    }
}
