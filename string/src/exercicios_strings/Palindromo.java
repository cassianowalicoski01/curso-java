package exercicios_strings;

/*
 * Escreva um programa em Java que contenha uma classe chamada Palindromo. Essa classe deve ter um método estático chamado isPalindromo que recebe uma string como parâmetro e retorna um valor booleano indicando se a string é um palíndromo ou não.
 * 
 * Um palíndromo é uma sequência de caracteres que é lida da mesma forma tanto da esquerda para a direita quanto da direita para a esquerda, desconsiderando espaços e diferenciação entre maiúsculas e minúsculas.
 * 
 * Por exemplo, "Socorram me subi no onibus em Marrocos" é um palíndromo.
 * 
 * Para a classe ReversorDeString, você deve utilizar a sua solução do exercício anterior, e com ela reverter a String para verificar se ela é ou não um palíndromo.
 */

public class Palindromo {
    
    public Boolean isPalindromo(String texto) {
        // Minha resolução
        String textoAgrupado = texto.replace(" ", ""); // Aqui estou pegando o texto recebido no parâmetro e trocando os espaços vazios por sem espaço nenhum. Juntando tudo.
        String textoEmMinusculo = textoAgrupado.toLowerCase(); // Aqui já pego o texto que agora está agrupado e deixo ele tudo em letras minusculas.
        String textoInvertido = ReversorDeString.reverterTexto(textoEmMinusculo); // Aqui estou reutilizando o método criado na class do exercício anterior que reverte a string recebida, note que como se trata de um método static eu não preciso instanciar um novo objeto, basta somente acessar esse método usando a própria class ReversorDeString.

        if (textoEmMinusculo.equals(textoInvertido)) { // Aqui eu uso o equals para verificar se o valor de uma string é igual a outra. Se eu usa-se == ele verificaria se o endereço da mémoria é igual e não os valores, o que retornaria false, pois são duas variáveis diferentes.
            return true;
        } else {
            return false;
        }
    }

    // Resolução do exercício do curso
    public static boolean ehPalindromo(String texto) {
        String textoFormatado = "";
        
        for(char letra : texto.toCharArray()) {
            if (!Character.isWhitespace(letra))
                textoFormatado += letra;
        }
        
        String textoRevertido = ReversorDeString.reverter(textoFormatado);
        
        return textoFormatado.toLowerCase().equals(textoRevertido.toLowerCase());
    }
}

class Main {
    public static void main(String[] args) {
        Palindromo ehPalindromo = new Palindromo();

        Boolean verificaSeEhPalindomo = ehPalindromo.isPalindromo("O galo ama o lago");
        //Boolean verificaSeEhPalindomoCurso = ehPalindromo.ehPalindromo("O galo ama o lago");

        System.out.println(verificaSeEhPalindomo);
        //System.out.println(verificaSeEhPalindomoCurso);
        

    }
}