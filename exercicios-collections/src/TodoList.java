/*
 * Crie uma aplicação de lista de tarefas simples usando uma List para armazenar as tarefas. Cada tarefa deve ter um título e o status (concluída ou não). Siga as seguintes etapas:
 * 
 * Crie a classe Todo com os atributos titulo (String) e concluida (boolean). 
 * Crie um construtor que inicializa o titulo da Todo.
 * Crie o método concluir que marca o atributo concluida como true.
 * Crie os métodos getTitulo e isConcluida que retornam os atributos titulo e concluida respectivamente.
 * Sobrescreva o método equals que compara se os atributos titulo das tarefas são iguais.
 * Crie a classe TodoList com um atributo todos que armazena a lista de Todo.
 * Crie um construtor padrão que apenas construir a todos como um ArrayList vazio.
 * Crie um método adicionarTarefa que recebe uma String titulo como parâmetro. Não deve ser permitido adicionar tarefas repetidas (com o mesmo título).
 * Crie um método concluirTarefa que recebe uma String titulo como parâmetro e conclui a tarefa encontrada com esse título.
 * Crie um método removerTarefa que recebe uma String titulo como parâmetro e remove a tarefa encontrada com esse título. Utilize o Iterator para remover a tarefa de forma segura.
 * 
 * Crie o método toString que imprime a lista de tarefas seguindo o formato:
 * [ ] Tarefa 1
 * [x] Tarefa 2
 * [ ] Tarefa 3
 */

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class TodoList {
    private List<String> todos = new ArrayList<>(); // Lista que armazena a lista de tarefas.
    private boolean temEssaTodo; // Boolean que verfica se já existe uma tarefa na lista de tarefas.
    private List<String> todosConcluidas = new ArrayList<>(); // Armazena quais tarefas foram marcadas como concluída.
    
    // Método adicionarTarefa
    public void adicionarTarefa(String titulo) {
        if (this.todos.isEmpty() == false) { // Se a lista de todos não for vazia
            for (String todo : todos) { // Percorro a lista
                if (todo.equals(titulo.toUpperCase())) { // Se a todo atual for igual o titulo passado no parâmetro, o atríbuto temEssatarefa recebe true. Esse atríbuto serve para eu fazer a verificação se existe ou não uma tarefa com o título passado.
                    temEssaTodo = true;
                    System.out.println("\n- [ATENÇÃO] Você já tem uma tarefa com esse título.");
                    break; // Se eu encontrar alguma tarefa com o mesmo nome eu paro o loop for, poís senão parar o temEssaTodo vai receber false quando verificar as proximas todos, e consequentemente vai permitir adicionar uma tarefa com o mesmo nome.
                } else {
                    temEssaTodo = false; // Se não tem nenhuma tarefa que tem o mesmo título do título passado no parâmetro então o atríbuto temEssaTarefa recebe false.
                }
            }

            if (temEssaTodo == false) { // Se esse atríbuto for false significa que ainda não existe uma tarefa com o mesmo título que foi passado por parâmetro, então adiciono esse título a lista de tarefas.
                this.todos.add(titulo.toUpperCase());
                System.out.println("\n- Adicionada nova tarefa: " + titulo.toUpperCase());
            }
            
        } else { // Caso a lista ainda esteja vazia adiciono o título da tarefa na lista
            this.todos.add(titulo.toUpperCase());
            System.out.println("\n- Adicionada nova tarefa: " + titulo.toUpperCase());
        }
    }

    // Método concluirTarefa
    public void concluirTarefa(String titulo) {
        if (this.todos.isEmpty() == false) { // Antes de qualquer verificação, verifico se a lista de tarefas é vazia, por que poder ser que não tenha sido adicionada nenhuma tarefa ainda.
            for (String todo : this.todos) { // Percorro a lista de todos.
                if (todo.equals(titulo.toUpperCase())) { // Verfico se tem alguma tarefa com o mesmo título do que foi passado por parâmetro.
                    if (this.todosConcluidas.contains(todo) == false) { // Verifico se a tarefa já não foi adicionada na lista de tarefas concluídas usando o contains e passando a todo.
                        todosConcluidas.add(titulo.toUpperCase()); // Adiciona a tarefa na lista de tarefas concluídas.
                        temEssaTodo = true;
                        System.out.println("\n- A tarefa: " + todo + " foi marcada como concluída.");
                        break;
                    } else {
                        temEssaTodo = true;
                        System.out.println("\n- [ATENÇÃO] A tarefa " + todo + " já foi marcada como concluída.");
                        break;
                    }
                    
                } else {
                    temEssaTodo = false;
                }
            }

            if (temEssaTodo == false) { // Se esse atríbuto for false significa que não existe uma tarefa com o mesmo título que foi passado por parâmetro.
                System.out.println("\n- [ATENÇÃO] Você não possuí nenhuma tarefa: " + titulo.toUpperCase());
            }
        } else { // Se a lista de tarefas for vazia imprimo a mensagem abaixo.
            System.out.println("\n- [ATENÇÃO] Você ainda não adicionou nenhuma tarefa!");
        }
    }

    // Método removerTarefa
    public void removerTarefa(String titulo) {
        if (this.todos.isEmpty() == false) { // Antes de qualquer verificação, verifico se a lista de tarefas é vazia, por que poder ser que não tenha sido adicionada nenhuma tarefa ainda.
            Iterator<String> iteradorTodos = this.todos.iterator();
            while (iteradorTodos.hasNext()) { // O hasNext() verifica se eu ainda tenho um elemento na lista. Funciona como um ponteiro, começa apontando para o primeiro elemento e vai andando para a direita até acabar os elementos.
                String todoAtual = iteradorTodos.next();
                if (todoAtual.equals(titulo.toUpperCase())) { // Uso o equals() para comparar a igualdade de seus valores e não ==, pois eles comparam se o espaço da mémoria é igual.
                    if (this.todosConcluidas.isEmpty() == false) { // Verifico se a lista de todos concluídas não está vazia.
                        for (String todoConcluida : this.todosConcluidas) { // Percorro a lista de todos concluídas.
                            if (todoAtual.equals(todoConcluida)) { // Verifico se a todo atual é igual a todo concluída
                                this.todosConcluidas.remove(todoConcluida); // Esse método de remoção dentro de um loop pode gerar ploblemas, pois estou tentando remover algo de que estou percorrendo. Eu poderia após fazer a verificação com o equals chama só iteradorTodos.remove() e depois break que iria remover a tarefa sem problemas.
                                this.todos.remove(todoAtual); // Removo o item da lista de todos a partir de seu titulo.
                                temEssaTodo = true;
                                break; // Tenho que parar o loop while depois de encontrar as tarefas.
                            }
                        }
                    } 

                    this.todos.remove(todoAtual); // Removo o item da lista a partir de seu titulo.
                    System.out.println("\n- Tarefa: " + todoAtual + " foi deletada.");                    
                    temEssaTodo = true;
                    break; // Tenho que parar o loop while depois de encontrar as tarefas.
                } else {
                    temEssaTodo = false;
                }
            }

            if (temEssaTodo == false) { // Se esse atríbuto for false significa que não existe uma tarefa com o mesmo título que foi passado por parâmetro.
                System.out.println("\n- [ATENÇÃO] Você não possuí nenhuma tarefa com o nome: " + titulo);
            }
        } else { // Se a lista de tarefas for vazia imprimo a mensagem abaixo.
            System.out.println("\n- [ATENÇÃO] Você ainda não adicionou nenhuma tarefa!");
        }
    }

    // Método que imprime a lista de tarefas
    public void mostrarListaTodos() {
        if (this.todos.isEmpty() == false) { // Antes de qualquer verificação, verifico se a lista de tarefas é vazia, por que poder ser que não tenha sido adicionada nenhuma tarefa ainda.
            for (String todo : this.todos) { // Percorro a lista de todos.
                if (todosConcluidas.isEmpty() == false) { // Verifico se a lista de tarefas concluídas não é vazia.
                    for (String todoConcluida : this.todosConcluidas) { // Percorro a lista de todos concluídas.
                        if (todo.equals(todoConcluida)) { // Se a todo do lista de todos for igual a todo da lista de todos concluídas, então eu imprimo com um "x" a tarefa, caso não seja igual imprimo " ".
                            System.out.println("[x] " + todoConcluida);
                        } else {
                            System.out.println("[ ] " + todo);
                        }
                    }
                } else { // Caso a lista de tarefas concluídas seja vazia imprimo todas a tarefas da lista de todos sem o "x".
                    System.out.println("[ ] " + todo);
                }
            }
        } else { // Se a lista de tarefas for vazia imprimo a mensagem abaixo.
            System.out.println("- [ATENÇÃO] Você ainda não adicionou nenhuma tarefa!");
        }
    }
}
