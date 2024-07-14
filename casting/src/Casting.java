/*
 * Casting: Operação de transformar um tipo de dado em outro
 * Widening Casting VS Narrowing Casting
 */

public class Casting {
    public static void main(String[] args) {
        // Widening Casting (Implícito) -> No exemplo estou armazenando uma variável byte que é menor em uma variável int que é maior.
        byte variavelPequena = 1;
        int variavelGrande = variavelPequena;

        short variavelshort = 10;
        int variavelInt = variavelshort;

        System.out.println(variavelGrande); // 1
        System.out.println(variavelInt); // 10

        // Narrowing Casting (Explícito) -> No exemplo estou armazenando uma variável long que é maior em uma variável int que é menor, para isso ser possivel tenho que usar o (int) para deixar explicito que quero converter para o tipo inteiro. Lembrando que vou ter perda de dados pois o número da variável long é maior do que a variável int consegue suportar.
        long variavelLong = 83264735563563879L;
        int variavelInt2 = (int) variavelLong;

        System.out.println(variavelInt2); // -107658393

        // Operações de divisão entre números inteiros. -> No exemplo estou dividindo dois números inteiros e obtendo o resultado com casas decimais.
        int numero1 = 9;
        int numero2 = 2;
        float resultadoDivisao = ((float) numero1) / numero2;
        System.out.println(resultadoDivisao); // 4.5
    }
}
