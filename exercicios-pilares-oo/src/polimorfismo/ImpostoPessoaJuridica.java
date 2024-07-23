package polimorfismo;

/*
 * Defina uma classe ImpostoPessoaJuridica que implementa Imposto e possui um atributo privado rendaAnual (Double). 
 * Crie seu construtor canônico e método calcularImposto que retorna 10% do valor da rendaAnual. 
 * Finalmente, crie o método getRendaAnual, para retornar o valor desse atributo.
 */

public class ImpostoPessoaJuridica implements Imposto {
    private Double rendaAnual;

    public ImpostoPessoaJuridica(Double rendaAnual) { // O construtor serve para que eu possa inicializar os atributos da class, sendo já passando um valor fixo, ou recebendo um valor através dos paramêtros, caso o construtor tenha parâmetros.
        this.rendaAnual = rendaAnual;
    }

    public Double calcularImposto() {
        return (this.rendaAnual * 10) / 100; // Retorna 10% da renda anual.
    }

    public Double getRendaAnual() {
        return this.rendaAnual; // Retorna o valor da renda anual.
    }
}
