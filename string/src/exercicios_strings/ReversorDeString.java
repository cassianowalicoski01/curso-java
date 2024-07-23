package exercicios_strings;

/*
 * Escreva um programa em Java que contenha uma classe chamada ReversorDeString. 
 * Essa classe deve ter um método estático chamado reverterString que recebe uma string como parâmetro e retorna a string revertida.
 */

public class ReversorDeString {
    // Minha resolução
    public static String reverterString(String stringParaReverter) {
        String[] arrayPalavra = stringParaReverter.split("");
        String texto = "";

        for (int i = stringParaReverter.length() - 1 ; i >= 0; i--)
            texto += arrayPalavra[i];

        return texto;
    }

    // Resolução do exercício
    public static String reverter(String texto) {
        String textoRevertido = "";
        for (int i = texto.length() - 1; i >= 0; i--)
            textoRevertido += texto.charAt(i);
        return textoRevertido;
    }

    // Tarefa de casa utilizando o StringBuffer
    public static String reverterAString(String texto) {
        StringBuffer textoReverso = new StringBuffer();
        for (int i = texto.length() - 1; i >= 0; i--)
            textoReverso.append(texto.charAt(i));

        return String.valueOf(textoReverso);
    }

    // Tarefa de casa utilizando o StringBuffer com o método reverse() -> Muito mais fácile e eficiente
    public static String reverterTexto(String texto) {
        StringBuffer textoReverso = new StringBuffer();
        textoReverso.append(texto).reverse();

        return String.valueOf(textoReverso);
    }
}

class Main {
    public static void main(String[] args) {
        System.out.println(ReversorDeString.reverterString("Aldimara Maidl Walicoski"));
        System.out.println(ReversorDeString.reverter("Aldimara Maidl Walicoski"));
        System.out.println(ReversorDeString.reverterAString("Aldimara Maidl Walicoski"));
        System.out.println(ReversorDeString.reverterTexto("Aldimara Maidl Walicoski"));
    }
}
