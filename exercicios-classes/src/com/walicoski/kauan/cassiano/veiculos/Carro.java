package com.walicoski.kauan.cassiano.veiculos;

/*
 * Crie uma classe chamada Carro com os seguintes atributos: modelo, ano, cor e velocidade.
 * Adicione um método chamado acelerar que aumenta a velocidade em 10 unidades.
 * 
 * Finalmente, crie um método getDetalhes, que imprima todas as informações do carro no seguinte formato: "Modelo: Fusca Ano: 2020 Cor: Azul Velocidade: 10".
 * Crie um construtor que inicializa todos os atributos.
 * 
 * Na classe Main, instancie um objeto da classe Carro chamado meuCarro com o modelo "Fusca", ano 2020, e cor "azul", via construtor.
 * Acelere o carro chamando o método acelerar e imprima o valor retornado pela operação getDetalhes.
 */

public class Carro {
    private String modelo; // Deixando esse atributos em private eu só consigo acessalos nessa class Carro, já na class Main que criei abaixo eles não ficam visiveis, então
    private int ano;      // não conseguiria usar um (meuCarro.modelo) por exemplo, já seu deixar eles public isso é possível.
    private String cor;
    private int velocidade; // Integer velocidade = 0 se eu usar Integer eu tenho que inicializar esse atributo em alguma parte do código, pois o Integer é um tipo de referência, então não tem um valor default caso não seja inicializado, diferente do int que tem por default 0 caso não seja inicializado.

    public Carro(String modeloCarro, int anoCarro, String corCarro) {
        this.modelo = modeloCarro;
        this.ano = anoCarro;
        this.cor = corCarro;
    }

    public void acelerar() {
        velocidade += 10;
    }

    public String getDetalhes() {
        return "Modelo: " + modelo + "\nAno: " + ano + "\nCor: " + cor + "\nVelocidade: " + velocidade;
    }
}

// Class Main (Poderia estar em outro arquivo)
class Main {
    public static void main(String[] args) {
        Carro meuCarro = new Carro("Fusca", 2020, "azul");

        // System.out.println(meuCarro.modelo); -> Só é possível se os atributos da class Carro sejam public

        meuCarro.acelerar();
        System.out.println(meuCarro.getDetalhes());
    }
}