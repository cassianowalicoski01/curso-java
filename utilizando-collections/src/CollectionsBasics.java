import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;

public class CollectionsBasics {
    public static void main(String[] args) {

        // Primeira forma
        List<String> nomes = new ArrayList<>(); // O tamanho padrão desse array é 10.
        nomes.add("Cassiano");
        nomes.add("Gatão");
        nomes.add("Gatona");
        nomes.add("Aldimara"); // O add() adiciona o elemento ao final do array.

        //Segunda forma
        List<Integer> numeros = new ArrayList<>() {{
            add(1);
            add(8);
            add(2);
            add(4);
        }};

        // Get
        nomes.get(0); // Obter o elemento pelo indice passado.

        // Insert / Update
        nomes.set(1, "Maile"); // Sobreescreve o valor que está no índice passado pelo novo valor passado. Só podemos usar índices que existem no array.

        // Delete
        nomes.remove(0); // Remove em elemnto do array a partir do seu índice.
        nomes.remove("Gatona"); // Posso remover também passando o próprio elemento e não seu índice.

        // Sort
        Collections.sort(numeros); // Ordena o array por ordem crescente, se for usado para strings ordena por ordem alfabética.

        System.out.println(nomes);
        System.out.println(numeros);

        // Iterar (percorrer) o array -> Sem usar o for.
        Iterator<String> iteradorArray = nomes.iterator();
        while (iteradorArray.hasNext()) { // O hasNext() verifica se eu ainda tenho um elemento na lista. Funciona como um ponteiro, começa apontando para o primeiro elemento e vai andando para a direita até acabar os elementos.
            String itemAtual = iteradorArray.next();
            System.out.println(itemAtual);
        }

        // Converter arrays primitivos em listas ou listas em arrays primitivos
        List<String> listaDeNomes = List.of("Cassiano", "Osmar", "Aldimara", "Thomaz");
        System.out.println(listaDeNomes);

        String[] arrayDeNomes = {"Maile", "Gatão", "Gatona"};
        List<String> arrayConvertidoEmLista = Arrays.asList(arrayDeNomes); // Converte um array primitivo em uma lista, permitindo assim se necessário redimensionar seu tamanho.
        System.out.println(arrayConvertidoEmLista);

        String[] arrayConvertido = arrayConvertidoEmLista.toArray(new String[0]); // O toArray converte a lista em um array de objetos, então se queremos converter em um array de strings temos que passar dentro do parentes uma nova string com tamanho 0.
        System.out.println(Arrays.toString(arrayConvertido));

        // MAP -> ele não é uma lista

        // Map<tipo_chave, tipo_valor> -> é igual um dicionário em Python porém só aceita o tipo de valor que foi passado no operador diamante.
        Map<String, String> mapaDeUsuarios = new HashMap<>();

        // Put
        mapaDeUsuarios.put("usuario", "Cassiano"); // Adiciona chave e valor no map, a chave só pode ser única.
        mapaDeUsuarios.put("email", "cassiano@email.com");

        // Get
        mapaDeUsuarios.get("usuario"); // Busca o elemento atrávez da chave

        // Update
        mapaDeUsuarios.put("usuario", "Gatona"); // É usado o mesmo comando de inserir, pois se eu passar uma chave já existente e um novo valor, esse valor vai substituir o antigo.

        // Remove
        mapaDeUsuarios.remove("email"); // Passo a chave que desejo remover, assim remove tanto a chave como o valor dela.

        // Iterar sobre os valores
        for (String pegaSoValor : mapaDeUsuarios.values()) { // Usamos o value() para pegarmos só os valores do map sem suas chaves.
            System.out.println(pegaSoValor);
        }

        // Iterar sobre as chaves
        for (String pegaSoChave : mapaDeUsuarios.keySet()) { // Usamos o keySet() para pegarmos as chaves do map sem seus valores.
            System.out.println(pegaSoChave);
        }
    }
}
