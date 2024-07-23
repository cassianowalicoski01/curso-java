package polimorfismo;

public class Calculadora {
    public static void main(String[] args) {
        // Sobrecarga de Métodos
        System.out.println(soma(2, 2));
        System.out.println(soma(2.5, 6.7)); // Perceba que as 2 funções tem o mesmo nome, porém com os valores que eu passo como argumentos, eu só vou ter certeza de qual método vou executar a partir dos argumentos que passei.
    }

    // Perceba que eu crie 2 funções com o mesmo nome, porém com funções diferentes

    static int soma(int a, int b) {
        return a + b;
    }

    static double soma(double a, double b) {
        return a + b;
    }
}
