package polimorfismo;

public class Main {
    public static void main(String[] args) {
        Trabalhador trabalhadores[] = { // A gente sempre referência a interface | Aqui eu criei um array de trabaladores que cria os trabalhadores
            new Agricultor(), new Programador()};

        iniciarTrabalho(trabalhadores);
    }

    private static void iniciarTrabalho(Trabalhador[] trabalhadores) {
        for (Trabalhador trabalhador : trabalhadores) {
            trabalhador.trabalhar(); // trabalhar é genérico, mas ele se comporta de maneira diferente dependendo da class que o implementa (modifica).
            if (trabalhador instanceof Agricultor) { // Aqui eu verifico se cada trabalhador é uma instância da class Agricultor, caso seja executo abaixo:
                ((Agricultor) trabalhador).ligarTrator(); // Aqui faço um casting explícito da class Agricultor para ter acesso aos métodos especificos dessa class e então poder acessá-los.
            }
        }
    }
}
