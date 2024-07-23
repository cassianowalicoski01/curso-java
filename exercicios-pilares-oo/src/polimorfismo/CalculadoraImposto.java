package polimorfismo;

/*
 * Crie uma classe CalculadoraImposto com o método main, que cria um array de impostos com um ImpostoPessoaJuridica e ImpostoPessoaFisica, ambos com rendaAnual de 100000. 
 * Ao final, itere sobre o array de impostos e imprima em linhas diferentes o retorno do método calcularImposto.
 */

public class CalculadoraImposto {
    public static void main(String[] args) {

        Imposto impostos[] = {
                new ImpostoPessoaJuridica(100000.0),
                new ImpostoPessoaFisica(100000.0)
        };

        for (Imposto imposto : impostos) {
            System.out.println(imposto.calcularImposto());

        }
    }
}
