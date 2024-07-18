import java.util.Scanner;

public class AreaFiguraGeometrica {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("""
                FIGURAS GEOMÉTRICAS\n
                1 - RETÂNGULO
                2 - TRIÂNGULO
                3 - CÍRCULO
                """);

        System.out.println("DIGITE O NÚMERO DA FIGURA ESCOLHIDA:");
        int figuraGeometrica = scanner.nextInt();

        
        switch (figuraGeometrica) {
            case 1 -> {
                System.out.println("\nSELECIONADO RETÂNGULO\n");

                System.out.println("BASE:");
                double base = scanner.nextDouble();
                System.out.println("ALTURA:");
                double altura = scanner.nextDouble();
                
                double area = base * altura;

                System.out.println("A área desse retângulo é de " + area);
            }
            case 2 -> {
                System.out.println("\nSELECIONADO TRIÂNGULO\n");

                System.out.println("BASE:");
                double base = scanner.nextDouble();
                System.out.println("ALTURA:");
                double altura = scanner.nextDouble();
                
                double area = (base * altura) / 2;

                System.out.println("A área desse triângulo é de " + area);
            }
            case 3 -> {
                System.out.println("\nSELECIONADO CÍRCULO\n");
                
                System.out.println("RAIO:");
                double raio = scanner.nextDouble();
                
                double area = 3.14 * (raio * raio);

                System.out.println("A área desse círculo é de " + area);
            }
            default -> System.out.println("Escolha uma opção válida!");
        }

        scanner.close();
    }
}
