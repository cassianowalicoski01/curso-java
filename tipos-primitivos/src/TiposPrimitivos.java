public class TiposPrimitivos {
    /*
     * Notas de estudo sobre os tipos primitivos em Java.
     * Tipos primitivos são providos prela linguagem nativamente.
     */
    public static void main(String[] args) {
        // Caracteres ou Characters
        char primeiraLetraDoNome = 'C';
        char primeiraLetraDoNomeASCII = 67;

        System.out.println(primeiraLetraDoNome);
        System.out.println(primeiraLetraDoNomeASCII);

        // Inteiros ou Integers
        byte nota = 10; // -128 até 127
        short itensComprados = 2; // -32768 até 32767
        int quantidadeEstoque = 23_366; // -2.147.483.648 até 2.147.483.647 -> Posso utilizar o _ para separar como (10.066 -> 10_066)
        long numeroMuitoGrande = 237863475725462572L; // 19 dígitos (é necessário usar o L ao final do número)

        // Decimais
        float peso = 86.5f; // 6 - 7 casas decimais
        double preco = 24.99; // ~ 15 casas decimais

        // Booleanos ou Booleans
        boolean verdadeiro = true; // 1
        boolean falso = false; // 0
        
    }
}
