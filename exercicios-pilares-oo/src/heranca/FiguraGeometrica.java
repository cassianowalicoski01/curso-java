package heranca;

/*
 * Crie uma classe chamada FiguraGeometrica, que deve ser uma classe abstrata. Essa classe deve conter um atributo tipo (String), que deve estar acessível apenas para as suas subclasses.
 * Declare um método abstrato chamado getArea , que deve retornar um Integer e deve ser implementado pelas subclasses.
 */

public abstract class FiguraGeometrica { // O modificador abstract faz com que essa class não possa ser usada para criar um objeto a partir dessa class, somente as class que extends essa class.
    protected String tipo; // O modificador protected permite somente o acesso pelas sub classes ou pelas classes que estão no mesmo pacote (mesma pasta).

    public abstract Integer getArea(); // Método abstrato que deve ser incrementado pelas classes que herdam essa class.
}
