package exercicios;
/*
 * Você irá criar uma aplicação que permite realizar transações bancárias. Siga os seguintes passos:
 * 
 * Crie uma classe Conta com o atributo saldo (Double). A classe deve ter um construtor que permita inicializar esse saldo.
 * 
 * Crie o método sacar que recebe um valor (Double) e subtrai do saldo. Não permita que o saldo fique negativo, caso o valor seja maior que o saldo lance uma exceção do tipo SaldoInsuficienteException (será criada por você).
 * 
 * Crie um método getSaldo que retorna o saldo da conta.
 * 
 * Crie uma classe SaldoInsuficienteException que vai ser a exceção customizada do tipo RuntimeException.
 * 
 * Crie uma classe TransacaoBancaria com um método main. Nele, crie uma conta com saldo 100.0, saque 50.0, e depois tente sacar 100.0. Imprima uma mensagem "Saldo Insuficiente" caso o saque não dê certo e lance a exceção novamente.
 */

public class Conta {
    private Double saldo;

    public Conta(Double saldo) {
        this.saldo = saldo;
    }

    public void sacar(Double valorSaque) throws SaldoInsuficienteException {
        if (valorSaque <= this.saldo) 
            this.saldo -= valorSaque;
        else throw new SaldoInsuficienteException();
    }

    public Double getSaldo() {
        return this.saldo;
    }
}
