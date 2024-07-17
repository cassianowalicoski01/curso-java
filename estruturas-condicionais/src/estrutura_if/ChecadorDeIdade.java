package estrutura_if;

import java.util.Scanner;

public class ChecadorDeIdade {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Qual sua idade?");
        int idade = scanner.nextInt();

        if (idade < 18) // { -> Se for executado apenas uma instrução não é necessaário usar as chaves.
            System.out.println("Com " + idade + " anos de idade você ainda é de menor.");
        else
            System.out.println("Com " + idade + " anos de idade você já é de maior.");
        // } -> Não é necessário em apenas uma instrução.


        // If ternário -> condicao ? expressao1 : expressao2;

        String mensagem = (idade >= 18) ? "Pode assistir o filme!" : "Esse filme é só para maiores de idade";

        System.out.println(mensagem);

        scanner.close();
    }
}
