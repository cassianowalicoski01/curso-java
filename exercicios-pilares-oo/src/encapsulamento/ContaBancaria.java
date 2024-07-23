package encapsulamento;

/*
 * Crie uma classe chamada ContaBancaria com os atributos privados numeroConta (Integer), saldo (Double), e titular (String). 
 * Utilize um construtor canônico para inicializar os atributos. 
 * Implemente dois métodos públicos para depositar e sacar dinheiro. 
 * O programa não deve permitir que a conta fique com saldo negativo!
 * 
 * Ao final, crie um método toString que retorne os dados da conta no seguinte formato: { numeroConta: 1, titular: Giuliana, saldo: 10.0 }.
 */

public class ContaBancaria {
    private Integer numeroConta;
    private Double saldo;
    private String titular;

    public ContaBancaria(Integer numeroConta, Double saldo, String titular) {
        this.numeroConta = numeroConta;
        this.saldo = saldo;
        this.titular = titular;
    }

    public void depositar(Double valorDeposito) {
        this.saldo += valorDeposito;
    }

    public void sacar(Double valorSaque) {
        if (valorSaque > this.saldo) {
            System.out.println("Saldo insuficiente para realizar o saque!");
        } else {
            this.saldo -= valorSaque;
        }
    }

    public String toString() {
        return "{ numeroConta: " + numeroConta + ", titular: " + titular + ", saldo: " + saldo + " }";
    }

}
