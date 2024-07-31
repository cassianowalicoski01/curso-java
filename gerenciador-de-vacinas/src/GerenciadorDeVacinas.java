import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class GerenciadorDeVacinas {
    private Map<Integer, Vacina> vacinas;
    private Scanner scanner; // Para evitar conflitos ao possuir mais de um scanner, estou recebendo o scanner criado na class Main por parâmetro no construtor dessa class, assim ultilizo só um scanner em todo o programa.

    public GerenciadorDeVacinas(Scanner scanner) {
        vacinas = new HashMap<>(); // Inicializo o map vacinas como um HashMap que contém como chave o tipo Integer (vai reber o cpf do paciente) e como valor o tipo Vacina que é um objeto comas informações da nova vacinação.
        this.scanner = scanner; // scanner que recebo da class Main
    }

    public void cadastrarNovaVacinacao(Integer cpfPaciente) { // Para uma nova vacinação inicialmente utilizaremos apenas o cpf para verificar se o usuário já está cadastrado ou não.
        String vacinaAplicada;
        String dataAplicacao;

        if (!vacinas.containsKey(cpfPaciente)) { // Se o map vacinas não conter nenhuma chave com o valor do cpf da nova vacinação.
            System.out.print("\nNome do paciente: ");
            String nomePaciente = scanner.nextLine().toUpperCase();
            System.out.print("Nome do vacina a ser aplicada: ");
            vacinaAplicada = scanner.nextLine().toUpperCase();
            System.out.print("Data da aplicação: ");
            dataAplicacao = scanner.nextLine();

            Vacina novaVacinacao = new Vacina(nomePaciente, cpfPaciente, vacinaAplicada, dataAplicacao); // Crio uma nova instância de Vacina.

            vacinas.put(novaVacinacao.getCfp(), novaVacinacao); // Adiciono ao map, o cpf do paciente como key e o objeto novaVacinacao que contém todos os dados da vacina e do paciente como value.
            System.out.println("\nPaciente cadastrado com sucesso!");

        } else { // Caso o cpf já esteja cadastrado não é preciso cadastrar novamamente, basta cadastrar somente a nova vacina.
            System.out.println("\n[ATENÇÃO] Esse paciente já está cadastrado em nosso sistema.");
            System.out.println("[ATENÇÃO] Cadastre apenas a nova vacina: ");

            System.out.print("\nNome da vacina a ser aplicada: ");
            vacinaAplicada = scanner.nextLine().toUpperCase();
            System.out.print("Data da aplicação: ");
            dataAplicacao = scanner.nextLine();

            vacinas.get(cpfPaciente).adicionarVacina(dataAplicacao, vacinaAplicada); // Busco pelo cpf do paciente que é a key do map com o comando get() que retorna o value referênte a aquela key, como o value é um objeto Vacina então consigo acessar seus métodos, um deles é o adicionarVacina que adiciona a nova vacina no map de vacinas do objeto Vacina, passando como key a String dataAplicacao e como value a String vacinaAplicada.

            System.out.println("\nVacinação cadastrada com sucesso!");
        }
    }

    public void consultarInformacoes(Integer cpf) { // Buscaremos as informações através do cpf do paciente.
        if (vacinas.containsKey(cpf)) { // Verificamos se esse cpf é alguma key (chave) do map vacinas.
            vacinas.get(cpf).exibirInformacoes(cpf); // Busco pelo cpf do paciente que é a key do map com o comando get() que retorna o value referênte a aquela key, como o value é um objeto Vacina então consigo acessar seus métodos, um deles é o exibirInformacoes que exibi as informações relacionadas ao cpf passado no parâmetro.
        } else {
            System.out.println("Nenhum dado relacionado a esse CPF foi encontrado.");
        }
    }

    public void listarDados() {
        if (!vacinas.isEmpty()) { // Se o map vacinas não for vazio
            for (Integer cadastro : vacinas.keySet()) { // Itero sobre as chaves (keys) do map vacinas
                vacinas.get(cadastro).exibirInformacoes(cadastro); // Busco os valores da chave (que é um cpf) passada no get() que recebe um object key e retorno os valores relacionados a ela. Como o value dessa chave é um objeto Vacina então eu consigo acessar seus métodos, nesse caso o método exibirInformacoes() que recebe por argumento um Integer cpf, nesse caso o cadastro que é um Integer. Como estou em um loop for each, vai ser exibido todas as informações de todos os pacientes cadastrados.
                System.out.println("\n--------------------------------------\n");
                
            }
        } else { // Caso o map vacinas seja vazio
            System.out.println("Nenhuma informação foi cadastrada.");
        }
    }

    public void deletarCadastro(Integer cpf) {
        if (!vacinas.isEmpty()) { // Se o map vacinas não for vazio.
            if (vacinas.containsKey(cpf)) { // Verifico se o map vacinas contém alguma chave com o mesmo valor do cpf recebido por parâmetro.
                vacinas.remove(cpf); // Removo essa key, consequentemente remove os valores associados a ela.
                System.out.println("\nCadastro do paciente excluído com sucesso.");
            } else {
                System.out.println("\nO cpf fornecido não está cadastrado em nosso sistema.");
            }
        } else {
            System.out.println("\nNenhuma informação foi cadastrada.");
        }
    }
}
