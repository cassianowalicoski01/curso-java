import java.util.Scanner;

/*
 * Crie uma agenda de compromissos para cada dia da semana. O programa deve exibir os compromissos até então cadastrados e ter a opção de cadastrar novos compromissos para cada dia da semana. 
 * Para cadastrar um compromisso, primeiramente será lido um valor inteiro que representa o dia, sendo o 1 a segunda e o 7 o domingo. Depois de ler o dia, o compromisso será lido.
 * 
 * Os compromissos devem ser exibidos nesse formato exato, para que os testes passem:
 * 
 * Segunda:
 * - Jogar xadrez
 * - Academia
 * 
 * Terça:
 * - Trabalhar
 * 
 * Quarta:
 * - Natação
 * 
 * Quinta:
 * - Estudar
 * 
 * Sexta:
 * - Jogo
 *
 * Sábado:
 * - Arrumar a casa
 * 
 * Domingo:
 * - Igreja
 */

public class AgendaCompromissos {
  public static void main(String[] args) {
    String[] diasDaSemana = { "Segunda", "Terça", "Quarta", "Quinta", "Sexta", "Sábado", "Domingo" };
    String[][] compromissos = new String[7][0];

    Scanner scanner = new Scanner(System.in);

    while (true) {
      // Exibir opções
      System.out.println();
      System.out.println("Escolha uma opção:");
      System.out.println("1. Exibir compromissos");
      System.out.println("2. Cadastrar compromisso");
      System.out.println("3. Sair");

      int opcao = scanner.nextInt();

      switch (opcao) {
        case 1 -> {
          for (int i = 0; i < compromissos.length; i++) { // Faço um loop até o tamanho do array compromissos
            System.out.println(diasDaSemana[i] + ":"); // Imprimo cada dia da semana
            for (String compromisso : compromissos[i]) { // Faço um loop que percore todos os arrays existentes dentro daquela posição i do loop no array compromissos
              System.out.println("- " + compromisso); // Imprimo os compromissos caso exista
            }
            System.out.println(); // Para pular uma linha a cada loop que verifica cada dia da semana
          }
        }
        case 2 -> {
          System.out.println();
          System.out.println("Digite o dia da semana (1, 2, 3, 4, 5, 6, 7):");
          int dia = scanner.nextInt();

          if (dia >= 1 && dia <= 7) {
            scanner.nextLine(); // Consumir a quebra de linha pendente

            System.out.println("Digite o compromisso:");
            String compromisso = scanner.nextLine();

            int diaDaSemana = dia - 1; // Aqui estou diminuindo 1 do dia passado, poís as pisições no array começam em 0, 1... e o dia da semana é passado de 1, 2... Se eu não fizesse isso a posição 0 sempre ia ficar vazia.

            int tamanhoAtualArray = compromissos[diaDaSemana].length; // Aqui estou verificando o tamanho do array na posição passada na variável dia e posteriormente para a variável diaDaSemana que subtraí 1 do dia para igualar coma posição do array. No caso a posição do dia 1 (segunda-feira) será guardada na posição 0 do array agora.

            String[] novosCompromissos = new String[tamanhoAtualArray + 1]; // Aqui estou criando um novo array que posteriormente substituira o array de compromissos na posição passada no dia. Ele deve ter um tamanho maior que o antigo array para que possa receber um novo compromisso. Tenho que criar esse novo array porque o compromissos inicialmente foi criado vazio, então ele não yem espaço para receber um compromisso.

            for (int n = 0; n < tamanhoAtualArray; n++) {
              novosCompromissos[n] = compromissos[diaDaSemana][n]; // Esse for só será válido se ja existir algum compromisso guardado no array compromissos, dessa forma eu atribuo ao array novosCompromissos caso exista o valor que está no array compromissos na linha do dia da semana e na coluna do int n do loop
            }

            novosCompromissos[tamanhoAtualArray] = compromisso; // Aqui estou dizendo que o array novosCompromissos vai receber a variável compromisso na posição da variável que verifica o tamanho do array existente em compromissos, na posição passada na variável dia.

            compromissos[diaDaSemana] = novosCompromissos; // Aqui estou atribuindo (substituindo) o array existente na posição diaDaSemana por esse novo array que já contém o novo compromisso guardado.

          }
        }
        default -> {
          System.out.println("Saindo...");
          scanner.close();
          return;
        }
      }
    }
  }
}