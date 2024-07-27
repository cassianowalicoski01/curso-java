import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        TodoList tarefas = new TodoList();

        while (true) {
            System.out.println(""" 

                LISTA DE TAREFAS

                1 - ADICIONAR NOVA TAREFA
                2 - MARCAR TAREFA COMO CONCLUÍDA
                3 - REMOVER TAREFA
                4 - MOSTRAR LISTA DE TAREFAS
                5 - SAIR
                """);

            System.out.print("O QUE DESEJA FAZER: ");
            int opcaoSelecionada = scanner.nextInt();
            scanner.nextLine(); // Limpar buffer do teclado
            while (opcaoSelecionada > 5 || opcaoSelecionada < 1) {
                System.out.print("\nATENÇÃO! DIGITE UMA OPÇÃO VÁLIDA\nO QUE DESEJA FAZER: ");
                opcaoSelecionada = scanner.nextInt();
                scanner.nextLine(); // Limpar buffer
            }

            if (opcaoSelecionada == 5) {
                System.out.println("\nPROGRAMA FINALIZADO!\n");
                scanner.close();
                return;
            } else {
                switch (opcaoSelecionada) {
                    case 1 -> { // Adicionar nova tarefa
                        System.out.println("\n------ ADICIONAR UMA NOVA TAREFA ------\n");
                        System.out.print("DÊ UM NOME PARA A SUA TAREFA: \n>> ");
                        String tituloTarefa = scanner.nextLine();
                        tarefas.adicionarTarefa(tituloTarefa);
                    }
                    case 2 -> { // Marcar tarefa como concluída 
                        System.out.println("\n------ MARCAR TAREFA COMO CONCLUÍDA ------\n");
                        System.out.print("DIGITE O NOME DA TAREFA QUE DESEJA MARCAR COMO CONCLUÍDA: \n>> ");
                        String tituloTarefaConcluida = scanner.nextLine();
                        tarefas.concluirTarefa(tituloTarefaConcluida);
                    }
                    case 3 -> { // Remover tarefa
                        System.out.println("\n------ REMOVER UMA TAREFA ------\n");
                        System.out.print("DIGITE O NOME DA TAREFA QUE DESEJA DELETAR: \n>> ");
                        String tituloTarefaParaRemover = scanner.nextLine();
                        tarefas.removerTarefa(tituloTarefaParaRemover);
                    } 
                    case 4 -> tarefas.mostrarListaTodos(); // Não vou precisar usar o Default pois já faço validações para opções inválidas antes do switch.
                }
            }
        }        
        
    }
}
