public class ArraysMultidimensionais {
    public static void main(String[] args) {
        int [][] numeros = { {1, 2, 3, 4}, 
                             {5, 6}, 
                             {9, 10, 11, 12}, 
                             {13, 14, 15} }; // Cada chave é uma linha, e cada valor é uma coluna
        
        // Percorrendo Matrizes com for
        for (int linha = 0; linha < numeros.length; linha++) { // Esse loop percorre as linhas 
            for (int coluna = 0; coluna < numeros[linha].length; coluna++) { // Esse loop percorre as colunas referênte a posição que o loop anterior está.
                System.out.print(numeros[linha][coluna]  + " "); // O numeros[linha].length acima é para verificar o tamanho da linha atual que o loop está, por que podemos ter linhas com numeros de colunas diferentes
            }
            System.out.println();
        }

        // Percorrendo Matrizes com For-Each -> Nesse exemplo é array de arrays
        for (int[] linhaArray : numeros) { // Para cada linha em numeros
            for (int colunaArray : linhaArray) { // Para cada coluna em linha, ou seja para cada linha eu vou percorrer todas as suas colunas
                System.out.print(colunaArray + " "); // Mostre a coluna 
            }
            System.out.println();
        }
    }
}
