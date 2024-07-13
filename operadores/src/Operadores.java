public class Operadores {
    public static void main(String[] args) {

        /* OPERADORES ARITMÉTICOS */

        // Operador de adição (+)
        int numero1 = 2;
        int numero2 = 6;
        int soma = numero1 + numero2;
        System.out.println("A soma entre " + numero1 + " + " + numero2 + " é " + soma);

        // Operador de subtração (-)
        int numero3 = 9;
        int numero4 = 5;
        int subtracao = numero3 - numero4;
        System.out.println("A subtração entre " + numero3 + " - " + numero4 + " é " + subtracao);

        // Operador de multiplicação (*)
        double numero5 = 10.6;
        double numero6 = 8;
        double multiplicacao = numero5 * numero6;
        System.out.println("A multiplicação entre " + numero5 + " * " + numero6 + " é " + multiplicacao);

        // Operador de divisão (/) obs: o valor decimal é desconsiderado se usarmos números inteiros (ex: 71 / 10 é igual a 7,1 porém o resultado será 7)
        int numero7 = 71;
        int numero8 = 10;
        int divisao = numero7 / numero8;
        System.out.println("A divisão entre " + numero7 + " / " + numero8 + " é " + divisao);

        // Operador de módulo (%) -> resto da divisão
        int numero9 = 71;
        int numero10 = 10;
        int restoDivisao = numero9 % numero10;
        System.out.println("O resto da divisão entre " + numero9 + " % " + numero10 + " é " + restoDivisao);

        // Operador de incremento (++)
        int contador = 0;
        contador++; // é igual a (contador = contador + 1)
        System.out.println("O valor do contador é " + contador);

        // Operador de decremento (--)
        int contador1 = 40;
        contador1--; // é igual a (contador = contador - 1)
        System.out.println("O valor do contador é " + contador1);


        /* OPERADORES RELACIONAIS */

        double num1 = 2;
        double num2 = 7;

        System.out.println(num1 > num2); // false
        System.out.println(num1 < num2); // true
        System.out.println(num1 >= num2); // false
        System.out.println(num1 <= num2); // true
        System.out.println(num1 == num2); // false
        System.out.println(num1 != num2); // true

        
        /* OPERADORES DE ATRIBUIÇÃO */

        int variavel = 5;

        System.out.println(variavel += 4); // 9
        System.out.println(variavel -= 3); // 6
        System.out.println(variavel *= 2); // 12
        System.out.println(variavel /= 2); // 6
        System.out.println(variavel %= 2); // 0


        /* OPERADORES LÓGICOS */

        int valor1 = 2;
        int valor2 = 4;
        boolean expressaoAnd = valor1 < 10 && valor2 < 3; // false
        System.out.println(expressaoAnd);
        boolean expressaoOr = valor1 < 10 || valor2 < 3; // true
        System.out.println(expressaoOr);
        boolean expressaoNot = !(2 < 1); // true -> na verdade ela é falsa, porém como estamos negando, ela passa a ser verdadeira
        System.out.println(expressaoNot);
    }
}
