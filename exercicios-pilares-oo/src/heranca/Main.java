package heranca;

public class Main {
    public static void main(String[] args) {
        Triangulo triangulo = new Triangulo(10, 5);
        Retangulo retangulo = new Retangulo(5, 10);

        System.out.println(triangulo.getArea());
        System.out.println(triangulo.toString());

        System.out.println(retangulo.getArea());
        System.out.println(retangulo.toString());
    }
}
