package heranca;

/*
 * Crie uma classe Retangulo que vai herdar de FiguraGeometrica. Essa classe deve ter os atributos privados altura (Integer) e largura (Integer). 
 * A classe deve ter um construtor canônico para inicializar seus atributos e também deve inicializar o atributo herdado tipo com o valor "Retangulo". 
 * Implemente o método getArea herdado da superclasse, usando a fórmula: (altura * largura). 
 * Finalmente, crie o método toString retornando os dados do retângulo no seguinte formato: { altura: 4, largura: 2, tipo: Retangulo }.
 */

public class Retangulo extends FiguraGeometrica { // Classe Concreta que estende FiguraGeometrica
    private Integer altura;
    private Integer largura;

    public Retangulo(Integer altura, Integer largura) {

        this.altura = altura;
        this.largura = largura;
        super.tipo = "Retangulo";
    }

    public Integer getArea() {
        return (this.altura * this.largura);
    }

    public String toString() {
        return "{ altura: " + this.altura + ", largura: " + this.largura + ", tipo: " + super.tipo + " }";
    }

}
