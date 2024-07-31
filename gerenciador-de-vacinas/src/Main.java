import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        try (Scanner scanner = new Scanner(System.in)) { // O try-with-resources com Scanner fechará o recurso (Scanner) automaticamente ao sair do bloco try, seja porque o programa está encerrando normalmente (usuário escolheu a opção 5), ou se uma exceção for lançada dentro do bloco try e capturada.
            GerenciadorDeVacinas novaVacinacao = new GerenciadorDeVacinas(scanner);

            System.out.println("+----------------------------------------------+");
            System.out.println("|----------- GERENCIADOR DE VACINAS -----------|");
            System.out.println("+----------------------------------------------+");
            while (true) {
                imprimirTitulo("MENU DE OPÇÕES");
                System.out.println(""" 
                    1 - CADASTRAR NOVA VACINAÇÃO
                    2 - LISTAR DADOS CADASTRADOS
                    3 - CONSULTAR DADOS POR CPF
                    4 - DELETAR CADASTRO
                    5 - SAIR
                    """);

                System.out.print("O que deseja fazer: ");
                int opcaoSelecionada = scanner.nextInt();
                scanner.nextLine(); // Limpar buffer do teclado

                while (opcaoSelecionada > 5 || opcaoSelecionada < 1) {
                    System.out.print("\n[ATENÇÃO] Digite uma opção válida: ");
                    opcaoSelecionada = scanner.nextInt();
                    scanner.nextLine(); // Limpar buffer do teclado
                }

                switch (opcaoSelecionada) {
                    case 1 -> {
                        imprimirTitulo("CADASTRAR NOVA VACINAÇÃO");
                        System.out.print("Digite o CPF do paciente: ");
                        Integer cpf = scanner.nextInt();
                        scanner.nextLine(); // Limpar buffer do teclado
                        novaVacinacao.cadastrarNovaVacinacao(cpf);
                        imprimirDivisor("CADASTRAR NOVA VACINAÇÃO");
                    }
                    case 2 -> {
                        imprimirTitulo("LISTAR DADOS CADASTRADOS");
                        novaVacinacao.listarDados();
                    }
                    case 3 -> { // Remover tarefa
                        imprimirTitulo("CONSULTAR DADOS POR CPF");
                        System.out.print("Digite o CPF do paciente: ");
                        Integer cpf = scanner.nextInt();
                        System.out.println(); // Pular uma linha
                        scanner.nextLine(); // Limpar buffer do teclado
                        novaVacinacao.consultarInformacoes(cpf);
                        imprimirDivisor("CONSULTAR DADOS POR CPF");
                    } 
                    case 4 -> {
                        imprimirTitulo("DELETAR CADASTRO");
                        System.out.print("Digite o CPF do paciente: ");
                        Integer cpf = scanner.nextInt();
                        novaVacinacao.deletarCadastro(cpf); 
                        imprimirDivisor("DELETAR CADASTRO");
                    } // Não vou precisar usar o Default pois já faço validações para opções inválidas antes do switch.
                    case 5 -> {
                        System.out.println("\nPROGRAMA FINALIZADO!\n");
                        break; // Finaliza o loop
                    }
                }
            
            }

        } catch (Exception erro) {
            System.out.println("Ocorreu um erro: " + erro.getMessage());
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
        inserirDivisor.repeat("-", titulo.length() + 15);
        System.out.println("\n" + inserirDivisor + "\n");
    }
}