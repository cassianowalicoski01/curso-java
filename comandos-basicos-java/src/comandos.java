public class comandos {
    public static void main(String[] args) {
        
        String nome = "Cassiano";
        String sobrenome = "Walicoski";

        nome.length(); // Mostra o tamanho da string
        nome.toUpperCase(); // Deixa a string com todas as letras em maiúsculo
        nome.toLowerCase(); // Deixa a string com todas as letras em maiúsculo
        nome.concat(sobrenome); // Junta nome + sobrenome
        nome.indexOf("a"); // Retorna a posição em que aparece a primeira vez a letra a no nome

        int num1 = 4;
        int num2 = 9;
        int num3 = 16;

        Math.max(num1, num2); // Retorna o maior número -> 9
        Math.min(num1, num2); // Retorna o menor número -> 4
        Math.sqrt(num3); // Retorna a raiz quadrada de um número -> 4
        Math.random(); // Randomiza um número aleatório
    }
}
