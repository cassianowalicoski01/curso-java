package polimorfismo;

/*
 * Defina uma classe ImpostoPessoaFisica que implementa Imposto e possui um atributo privado rendaAnual (Double). 
 * Crie seu construtor canônico e método calcularImposto que retorna 20% do valor da rendaAnual. 
 * Finalmente, crie o método getRendaAnual, para retornar o valor desse atributo.
 */

public class ImpostoPessoaFisica implements Imposto {
    private Double rendaAnual;

    public ImpostoPessoaFisica(Double rendaAnual) {
        this.rendaAnual = rendaAnual;
    }

    public Double calcularImposto() {
        return (this.rendaAnual * 20) / 100;
    }

    public Double getRendaAnual() {
        return this.rendaAnual;
    }
}
