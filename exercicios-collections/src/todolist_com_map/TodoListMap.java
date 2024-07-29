package todolist_com_map;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;

/*
 * Crie a classe TodoListMap com um atributo todos que armazena a lista de Todo.
 * Crie um construtor padrão que apenas construir a todos como um ArrayList vazio.
 * Crie um método adicionarTarefa que recebe uma String titulo como parâmetro. Não deve ser permitido adicionar tarefas repetidas (com o mesmo título).
 * Crie um método concluirTarefa que recebe uma String titulo como parâmetro e conclui a tarefa encontrada com esse título.
 * Crie um método removerTarefa que recebe uma String titulo como parâmetro e remove a tarefa encontrada com esse título.
 * Crie o método toString que imprime a lista de tarefas seguindo o formato:
 * 
 * [ ] Tarefa 1
 * [x] Tarefa 2
 * [ ] Tarefa 3
 */

public class TodoListMap {
    private Map<Todo, String> todos; // Aqui digo que o map vai receber como keys objetos Todo ou seja objetos criados a partir da class Todo e como value String.

    public TodoListMap() {
        this.todos = new HashMap<>();
    }

    public void adicionarTarefa(String tituloTarefa, String tarefa) {
        Todo titulo = new Todo(tituloTarefa.toUpperCase()); // Crio uma nova instância da class Todo que espera um título para a tarefa, então passo como argumento o valor que recebo no parâmetro tituloTarefa como upperCase.
        if (!this.todos.containsKey(titulo)) { // Aqui verifico se o map de todos não contém nenhuma chave com o mesmo titulo da tarefa que acabou de ser criada.
            this.todos.put(titulo, tarefa); // Então adiciono ao map a chave como o titulo da tarefa criada e o value com valor passado no parâmetro tarefa que é a tarefa em si..
            System.out.println("* Adicionada tarefa: " + titulo);
        } else { // Caso já exista alguma tarefa com o titulo da tarefa que foi criada.
            System.out.println("[ATENÇÃO] Você já tem uma tarefa com o nome: " + tituloTarefa);
        }
    }

    public void concluirTarefa(String tituloTarefa) {
        boolean temEssaTarefa = false;
        if (!this.todos.isEmpty()) { // Primeiro verifico se o map não é vazio.
            for (Todo tarefa : todos.keySet()) { // Percorro as chaves do map todos.
                if (tarefa.getTitulo().equals(tituloTarefa.toUpperCase())) { // Verifico se o título da tarefa atual é igual ao tituloTarefa em upperCase passado no parâmetro.
                    if (tarefa.isConcluida() == false) { // Verifico se a tarefa que estou tentando marcar como concluída já está marcada como concluída, se não estiver então a concluo abaixo.
                        tarefa.concluir(); // Então chamo o método concluir que é da class Todo, como tarefa é um objeto de Todo tenho acesso a esse método, assim como o isConcluida e o getTitulo que usei acima.
                        System.out.println("* A tarefa " + tarefa + " foi marcada como concluída.");
                        temEssaTarefa = true;
                    } else { // Caso a tarefa já tenha sido marcada como concluída.
                        System.out.println("[ATENÇÃO] Essa tarefa já foi marcada como concluida.");
                    }
                } else {
                    temEssaTarefa = false;
                }
            }
            if (temEssaTarefa == false) // Se essa variável for false significa que não existe nenhuma tarefa para concluir com o mesmo titulo do que foi passado no parâmetro.
                System.out.println("[ATENÇÃO] Você não tem nenhuma tarefa com o título: " + tituloTarefa);
        } else { // Caso o map seja vazio.
            System.out.println("[ATENÇÃO] A sua lista de tarefas ainda está vazia.");
        }
    }

    public void removerTarefa(String tituloTarefa) {
        boolean temEssaTarefa = false;
        if (!this.todos.isEmpty()) { // Primeiro verifico se o map não é vazio.
            Iterator<Todo> it = this.todos.keySet().iterator(); // Itero (percorro) sobre as chaves de todos, passo no operador diamante Todo pois vou interar sobre as keys que são objetos do tipo Todo.
            while (it.hasNext()) { // O método hasNext() verifica se ainda há elementos na coleção para serem percorridos.
                Todo chave = it.next(); // O método next() retorna o próximo elemento na coleção e avança o cursor interno do Iterator para o próximo elemento.
                if (chave.getTitulo().equals(tituloTarefa.toUpperCase())) { // Se o título da chave atual for igual ao titiloTarefa passado no parâmetro.
                    it.remove(); // Removo o elemento do map utilizando o iterator, poís se utiliza-se um for por exemplo, receberia um erro caso não usasse um break para parar o loop depois de remover o elemento, pois estou modificando o estado do map ou list que estou percorrendo. Aqui com o iterator posso remover o elemento durante a iteração sem erros, ele é uma boa prática.
                    System.out.println("* A tarefa: " + chave + " foi deletada da lista de tarefas.");
                    temEssaTarefa = true;
                } else {
                    temEssaTarefa = false;
                }
            }
            if (temEssaTarefa == false) // Se essa variável for false significa que não existe nenhuma tarefa para remover com o mesmo titulo do que foi passado no parâmetro.
                System.out.println("[ATENÇÃO] Você não tem nenhuma tarefa com o título: " + tituloTarefa);
        } else { // Caso o map seja vazio.
            System.out.println("[ATENÇÃO] A sua lista de tarefas ainda está vazia.");
        }
    }

    public String toString() {
        if (!this.todos.isEmpty()) { // Primeiro verifico se o map não é vazio.
            StringBuilder imprimirTarefa = new StringBuilder();
            for (Map.Entry<Todo, String> tarefa : this.todos.entrySet()) { // O método entrySet() retorna um conjunto de objetos do tipo Map.Entry<K, V>, onde K é o tipo da chave e V é o tipo do valor associado na coleção Map.
                if (tarefa.getKey().isConcluida() == true) { // Verifico se a chave da tarefa atual foi marcada como concluída.
                    imprimirTarefa.append("[x]" + tarefa.getKey() + "\n    - " + tarefa.getValue());
                } else { // Caso a tarefa não esteja marcada como concluída.
                    imprimirTarefa.append("[ ]" + tarefa.getKey() + "\n    - " + tarefa.getValue());
                }
            }
            return imprimirTarefa.toString(); // Retorno a impressão das tarefas com o formato acima de acordo se ela está ou não concluída.
        } else { // Caso o map seja vazio.
            return "[ATENÇÃO] A sua lista de tarefas ainda está vazia.";
        }
    }
}
