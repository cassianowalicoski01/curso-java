import java.util.Scanner;

public class ConversorDolarEmReal {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        System.out.println("Quantos dólares deseja converter para reais? U$");
        double valorEmDolar = scanner.nextDouble();
        System.out.println("Qual a cotação do dólar hoje?");
        double cotacaoDolar = scanner.nextDouble();

        double valorConvertido = valorEmDolar * cotacaoDolar;

        System.out.printf("U$%.2f convertido em reais são R$%.2f, levando em consideração a cotação de hoje que está em %.2f.", valorEmDolar, valorConvertido, cotacaoDolar);

        scanner.close();
    }
}