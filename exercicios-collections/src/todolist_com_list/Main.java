package todolist_com_list;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        TodoList tarefas = new TodoList();

        System.out.println("+----------------------------------------+");
        System.out.println("|---------- LISTA DE TAREFAS ------------|");
        System.out.println("+----------------------------------------+");
        while (true) {
            imprimirTitulo("MENU DE OPÇÕES");
            System.out.println(""" 
                1 - ADICIONAR NOVA TAREFA
                2 - MARCAR TAREFA COMO CONCLUÍDA
                3 - REMOVER TAREFA
                4 - MOSTRAR LISTA DE TAREFAS
                5 - SAIR
                """);

            System.out.print(">> O QUE DESEJA FAZER: ");
            int opcaoSelecionada = scanner.nextInt();
            scanner.nextLine(); // Limpar buffer do teclado
            while (opcaoSelecionada > 5 || opcaoSelecionada < 1) {
                System.out.print("\nATENÇÃO! DIGITE UMA OPÇÃO VÁLIDA\n>> O QUE DESEJA FAZER: ");
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
                        imprimirTitulo("ADICIONAR UMA NOVA TAREFA");
                        System.out.print("DÊ UM NOME PARA A SUA TAREFA: \n>> ");
                        String tituloTarefa = scanner.nextLine();
                        tarefas.adicionarTarefa(tituloTarefa);
                        imprimirDivisor("ADICIONAR UMA NOVA TAREFA");
                    }
                    case 2 -> { // Marcar tarefa como concluída 
                        imprimirTitulo("MARCAR TAREFA COMO CONCLUÍDA");
                        System.out.print("DIGITE O NOME DA TAREFA QUE DESEJA MARCAR COMO CONCLUÍDA: \n>> ");
                        String tituloTarefaConcluida = scanner.nextLine();
                        tarefas.concluirTarefa(tituloTarefaConcluida);
                        imprimirDivisor("MARCAR TAREFA COMO CONCLUÍDA");
                    }
                    case 3 -> { // Remover tarefa
                        imprimirTitulo("REMOVER UMA TAREFA");
                        System.out.print("DIGITE O NOME DA TAREFA QUE DESEJA DELETAR: \n>> ");
                        String tituloTarefaParaRemover = scanner.nextLine();
                        tarefas.removerTarefa(tituloTarefaParaRemover);
                        imprimirDivisor("REMOVER UMA TAREFA");
                    } 
                    case 4 -> {
                        imprimirTitulo("LISTA DE TAREFAS");
                        tarefas.mostrarListaTodos(); // Não vou precisar usar o Default pois já faço validações para opções inválidas antes do switch.
                        imprimirDivisor("LISTA DE TAREFAS");
                    }
                }
            }
        }        
        
    }

    public static void imprimirTitulo(String titulo) {
        StringBuilder formatarTitulo = new StringBuilder();
        formatarTitulo.repeat("-", titulo.length() + 14);
        System.out.println("\n" + formatarTitulo);
        System.out.println("------ " + titulo + " ------\n"); 
    }

    public static void imprimirDivisor(String titulo) {
        StringBuilder inserirDivisor = new StringBuilder();
        inserirDivisor.repeat("-", titulo.length() + 14);
        System.out.println("\n" + inserirDivisor + "\n");
    }
}
