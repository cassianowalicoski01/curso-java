package encapsulamento;

public class Main {
    public static void main(String[] args) {
        ContaBancaria minhaConta = new ContaBancaria(1201, 998.87, "Cassiano");

        minhaConta.depositar(100.0);
        minhaConta.sacar(100.0);
        System.out.println(minhaConta.toString());
    }
}
