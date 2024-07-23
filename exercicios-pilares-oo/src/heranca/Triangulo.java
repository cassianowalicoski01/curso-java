package heranca;

/*
 * Crie uma classe Triangulo que vai herdar de FiguraGeometrica. Essa classe deve ter os atributos privados base (Integer) e altura (Integer). 
 * A classe deve ter um construtor canônico para inicializar seus atributos e também deve inicializar o atributo herdado tipo com o valor "Triangulo". 
 * Implemente o método getArea herdado da superclasse, usando a fórmula: (base * altura) / 2. 
 * Finalmente, crie o método toString retornando os dados do triângulo no seguinte formato: { base: 4, altura: 2, tipo: Triangulo }.
 */

public class Triangulo extends FiguraGeometrica { // Classe Concreta que estende FiguraGeometrica
    private Integer base;
    private Integer altura;

    public Triangulo(Integer base, Integer altura) {

        this.base = base;
        this.altura = altura;
        super.tipo = "Triangulo";
    }

    public Integer getArea() {
        return (base * altura) / 2;
    }

    public String toString() {
        return "{ base: " + this.base + ", altura: " + this.altura + ", tipo: " + super.tipo + " }";
    }

}
