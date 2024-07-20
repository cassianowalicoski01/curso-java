import java.util.Scanner;

/*
 * Implementar um batalha naval, onde dado um mapa o usuário tenta adivinhar onde estão os navios.
 * Considere um tabuleiro de tamanho 5 x 5 e 10 tentativas para acertar a posição de 3 navios que estão no mapa (navio ocupa apenas uma posição). 
 * 
 * O jogo deve solicitar primeiro a posição dos 3 navios, e então preencher o mapa com água (~) e com os navios (N).
 * Após isso, devem ser lidas a linha e a coluna que o usuário acha que o navio está. Caso ele consiga acertar antes das tentativas esgotarem, ele verá uma mensagem de vitória:
 */

public class BatalhaNaval {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String[][] mar = new String[5][5];

        System.out.println("\nDigite as posições dos navios:\n");

        // Navio 1
        System.out.println("NAVIO 1 (linha - coluna): ");
        int linhaNavio1 = scanner.nextInt();
        int colunaNavio1 = scanner.nextInt();

        // Navio 2
        System.out.println("NAVIO 2 (linha - coluna): ");
        int linhaNavio2 = scanner.nextInt();
        int colunaNavio2 = scanner.nextInt();

        while (linhaNavio2 == linhaNavio1 && colunaNavio2 == colunaNavio1) { // Verifica se o usuário não está tentando adicionar o segundo navio na mesma posição do primeiro
            System.out.println("\nVocê já adicionou um navio nessa posição!\n");
            System.out.println("NAVIO 2 (linha - coluna): ");
            linhaNavio2 = scanner.nextInt();
            colunaNavio2 = scanner.nextInt();
        }

        // Navio 3
        System.out.println("NAVIO 3 (linha - coluna): ");
        int linhaNavio3 = scanner.nextInt();
        int colunaNavio3 = scanner.nextInt();

        while (linhaNavio3 == linhaNavio2 && colunaNavio3 == colunaNavio2 || linhaNavio3 == linhaNavio1 && colunaNavio3 == colunaNavio1) { // Verifica se o usuário não está tentando adicionar o terceiro navio na mesma posição do primeiro ou na mesma posição do segundo navio
            System.out.println("\nVocê já adicionou um navio nessa posição!\n");
            System.out.println("NAVIO 3 (linha - coluna): ");
            linhaNavio3 = scanner.nextInt();
            colunaNavio3 = scanner.nextInt();
        }

        // Adicionando os navios no array
        for (int i = 0; i < mar.length; i++) {
            for (int k = 0; k < mar.length; k++) {
                mar[linhaNavio1][colunaNavio1] = "N"; // Adiciono cada navio na posição linha e coluna, usando os
                mar[linhaNavio2][colunaNavio2] = "N"; // valores armazenados pelas variáveis acima
                mar[linhaNavio3][colunaNavio3] = "N";
                if (mar[i][k] == null) { // Aqui verifico quais colunas de cada linha não tem nenhum valor, e então se
                    mar[i][k] = "~"; // não tiver adiciono um "~" para representar a água.
                }
            }
        }

        int tentativas = 10;
        int afundouNavio = 0;

        System.out.println("\nBem-vindo ao jogo de Batalha Naval!");
        System.out.println("Você tem " + tentativas + " tentativas para afundar 3 navios.\n\n");

        while (tentativas >= 0) {
            
            System.out.println("\n  0 1 2 3 4"); // Mostrar as posições da coluna emcima do tabuleiro
            for (int p = 0; p < mar.length; p++) {
                System.out.print(p + " ");
                for (String posicao : mar[p]) {
                    System.out.print(posicao + " ");
                }
                System.out.println();
            }

            if (tentativas == 0) { // Aqui se tentativas for igual a 0 o programa acaba, pois se o programa fosse parar seguindo o while (tentativas >= 0) ele não imprimiria esse último tabuleiro
                System.out.println("\nInfelizmente suas tentativas acabaram, inicie o jogo outra vez...");
                scanner.close();
                return;
            }

            System.out.println("\nTentativas restantes: " + tentativas);

            // Chute do usuário para tentar acertar a posição do navio
            System.out.println("\nDigite a linha e a coluna:");
            int chuteLinhaNavio = scanner.nextInt();
            int chuteColunaNavio = scanner.nextInt();

            tentativas--;
            
            // Adicionando um X na posição do navio caso o usuário acerte a posição do navio
            if (mar[chuteLinhaNavio][chuteColunaNavio] == "N") {
                System.out.println("\nVocê acertou um navio!\n");
                afundouNavio++; // Cada vez que o usuário acerta um návio, essa variável recebe +1 para que no final eu possa verificar se o número e navios afundados é igual a 3 e então terminar o jogo
                mar[chuteLinhaNavio][chuteColunaNavio] = "X";       
            }

            if (afundouNavio == 3) {
                System.out.println("Parabéns! Você afundou todos os navios.");
                scanner.close();
                return;
            }

        }

        scanner.close();
    }
}