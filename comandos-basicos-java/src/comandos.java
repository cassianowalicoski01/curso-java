public class comandos {
    public static void main(String[] args) {
        
        String nome = "Cassiano";
        String sobrenome = "Walicoski";
        String texto = "Esse é um texto";
        String texto2 = "Segundo, texto, aqui";
        String idade = "10";
        Integer cep = 102030;

        // Strings -> toda string é um conjunto de caractéres

        nome.length(); // Mostra o tamanho da string.
        nome.toUpperCase(); // Deixa a string com todas as letras em maiúsculo.
        nome.toLowerCase(); // Deixa a string com todas as letras em maiúsculo.
        nome.concat(sobrenome); // Junta nome + sobrenome.
        nome.indexOf("a"); // Retorna a posição em que aparece a primeira vez a letra a no nome.

        char[] arrayDeNome = nome.toCharArray(); // Transforma cada caracter de nome em um array, assimé possível percorrer cada letra de nome caso precise.

        nome.charAt(0); // Retorna a letra referênte a indíce que foi passado.

        nome.charAt(nome.length() - 1); // Para retornar a última letra de nome, o -1 é por que o length vai começar em 1, mas o array de caracteres começa na posição 0.

        String[] arrayDeTexto = texto.split(" "); // Retorna um array de palavras, ou seja a cada espaço em branco que ele encontrar ele vai adicionar a palavra anterior ao array, lembrando que eu poderia passar qualquer coisa entre parenteses como função de divisor de palavras.

        texto2.replace(",", ":"); // Aqui passamos primeiro oq dejamos substituir e depois pelo que queremos substituir, ou seja, quero substituir as , de texto2 por :
        
        Integer.valueOf(idade); // Aqui estou convertendo a idade que está como uma string em um inteiro. Passo primeiro para que tipo quero converter, depois valueOf e depois a string
        String.valueOf(cep); // Aqui estou conventendo o cep que é um Integer em uma String

        String concatenacao = "Essa " + "concatenação " + "é " + "muito " + "comum."; // Para fazer isso podemos usar a class abaixo:
        StringBuilder concatenaPalavras = new StringBuilder();
        concatenaPalavras.append("Essa ");
        concatenaPalavras.append("concatenação ");
        concatenaPalavras.append("é ");
        concatenaPalavras.append("muito ");
        concatenaPalavras.append("comum.");
        String palavraJaConcatenada = concatenaPalavras.toString();

        String meuNome = "Cassiano";
        String pais = "Brasil";
        String uf = "SC";

        String textoFormatado1 = "Olá, eu sou o " + meuNome + " morro no " + pais + ", em " + uf; // Não fica muito legivel, ainda mais se o texto for grande.
        String textoFormatado2 = "Olá, eu sou o %s morro no %s, em %s".formatted(meuNome, pais, uf); // Fica bem mais legivel, basta eu adicionar os identificadores de tipo no texto e depois passar como argumento na ordem certa as variáveis que vão substituir esses identificadores.
        
        // Números

        int num1 = 4;
        int num2 = 9;
        int num3 = 16;

        Math.max(num1, num2); // Retorna o maior número -> 9
        Math.min(num1, num2); // Retorna o menor número -> 4
        Math.sqrt(num3); // Retorna a raiz quadrada de um número -> 4
        Math.random(); // Randomiza um número aleatório


        System.out.println(arrayDeNome);
        System.out.println(arrayDeTexto);
        System.out.println(concatenacao);
        System.out.println(palavraJaConcatenada);
        System.out.println(textoFormatado1);
        System.out.println(textoFormatado2);
    }
}
