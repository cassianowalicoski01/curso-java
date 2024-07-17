package estrutura_switch;

import java.util.Scanner; // Posso importar usando o comando ALT + SHIFT + O

public class MenuDeOpcoes {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("MENU DE OPÇÕES:\n");
        System.out.println("""
        1 - Cadastrar usuário
        2 - Consultar cfp
        3 - Listar usuários cadastrados
        4 - Deletar conta usuário
        """);
        System.out.println("Digite o número da opção selecionada:");
        int opcaoSelecionada = scanner.nextInt();

        // Primeira forma
        switch (opcaoSelecionada) {
            case 1 -> System.out.println("Cadastrar usuário.");
            case 2 -> {
                System.out.println("Consultar cpf.");
                System.out.println("Digite o cpf para consultar: ");
            }
            case 3 -> System.out.println("Listar usuários cadastrados.");
            case 4 -> System.out.println("Deletar conta usuário.");
            default -> System.out.println("Escolha uma opção válida!");
        }

        // Segunda forma
        String retornaOpcao = switch (opcaoSelecionada) {
            case 1 -> "Cadastrar usuário.";
            case 2 -> {
                System.out.println("Consultar cpf.");
                yield "Digite o cpf para consultar:"; // Em um bloco de execução temos que utilizar o yield
            }
            case 3 -> "Listar usuários cadastrados.";
            case 4 -> "Deletar conta usuário.";
            default -> "Escolha uma opção válida!";
        };

        System.out.println(retornaOpcao);

        scanner.close();
    }
}
