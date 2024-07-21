package br.com;

import br.com.bb.ContaBancariaBB;
import br.com.nu.ContaBancariaNu;

/*
 * Crie uma classe Main que instancia uma contaNu e uma contaBB, ambas com o titular Udemy. 
 * Após isso, chame o atualizarSaldo com valor 50.0 para a contaNu, e depois chame o atualizarSaldo com valor 50.0 e depois com o valor -50.0, para a contaBB.
 * 
 * Ao final, imprima a contaNu e a contaBB, cada uma em uma linha diferente.
 */

public class Main {
    public static void main(String[] args) {
        ContaBancariaNu contaNu = new ContaBancariaNu("Udemy");
        ContaBancariaBB contaBB = new ContaBancariaBB("Udemy");

        contaNu.atualizarSaldo(50.0);

        contaBB.atualizarSaldo(50.0);
        contaBB.atualizarSaldo(-50.0);

        System.out.println(contaNu.toString());
        System.out.println(contaBB.toString());
    }
}
