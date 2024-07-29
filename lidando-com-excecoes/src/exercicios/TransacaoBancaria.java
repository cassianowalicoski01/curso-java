package exercicios;

public class TransacaoBancaria {
    public static void main(String[] args) {
        Conta minhaConta = new Conta(100.0);
        minhaConta.sacar(50.0);
        
        try {
            minhaConta.sacar(100.0);
        } catch (Exception erro) {
            System.out.println("Saldo Insuficiente");
            throw erro;
        }
    }
}
