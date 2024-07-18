public class JumpStatements {
    public static void main(String[] args) {

        // Break
        for (int i = 0; i <= 10; i++) {
            if (i == 5) {
                break; // Para a execução do códico. No exemplo mesmo o loop sendo uma contagem até dez, quando i for igual a 5 o código já vai ser parado.
            }
            System.out.println(i); // 0 1 2 3 4
        }

        // Continue
        for (int i = 0; i <= 10; i++) {
            if (i % 2 != 0) {
                continue; // Não termina a execução do restante das linhas abaixo do continue do loop, porém não para o loop como o break. No exemplo quando o resto da divisão do número é diferente de 0 (números ímpares), ela não terminha a execução de todas as linhas do bloco de código, ou seja não vai imprimir esses números porque já uso o continue, e já faz outra verificação no loop novamente. Ele pula uma iteracão.
            }
            System.out.println(i); // 0 2 4 6 8 10
        }

        // Return
        for (int i = 0; i <= 10; i++) {
            if (i == 5) {
                System.out.println(i); // 5
                return; // O return encerra a execução de todo o resto do códico dentro ou fora do for/while, no caso ele encerra a execução de todo o metódo em que ele está contido. Por exemplo o código abaixo não vai ser executado, pois a execucão de tuda essa class main foi parada usando o comando return nesse for.
            }
        }

        // Esse código não será executado por conta do return acima.
        System.out.println("Olá Mundo!");
    }
}
