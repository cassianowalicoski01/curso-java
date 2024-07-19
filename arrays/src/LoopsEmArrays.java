public class LoopsEmArrays {
    public static void main(String[] args) {
        Integer [] numeros = new Integer[5];

        // Loop comum
        for (int i = 0; i < numeros.length; i++) {
            numeros[i] = i; // Adicionando valores no array atráves de um loop for
            System.out.println(numeros[i]); // Mostrando os valores de cada posição do array
        }

        // For-Each -> Parecido com o for in em Python
        String [] tarefas = {"Limpar a casa", "Mexer no celular", "Estudar", "Ir para a acdemia"};

        // for (<tipo> variável(essa variável é temporária) : nomeDoArray)
        for (String cadaTarefa : tarefas) {
            System.out.println(cadaTarefa);
        }
    }
}
