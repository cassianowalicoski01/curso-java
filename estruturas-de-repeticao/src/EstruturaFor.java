public class EstruturaFor {
    public static void main(String[] args) {
        int num = 8;
        int fatorial = 1;

        for (int i = 1; i <= num; i++) {
            System.out.println("Número: " + i + " - Fatorial: " + (fatorial *= i));
        }

        System.out.println(fatorial);
    }
}
