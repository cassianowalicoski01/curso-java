import java.util.InputMismatchException;
import java.util.Scanner;

public class TryCatch {
    public static void main(String[] args) {
        
        Integer[] idades = new Integer[] {10, 20, 88, 14, 90};

        // Esse é um exemplo de excepition onde eu tento iterar sobre um índice que não existe no array idades.
        for (int i = 0; i < 6; i++) {
            try { // Tentar -> o try tenta executar o código do seu bloco
                System.out.println(idades[i]);
            } catch (Exception erro) { // Capturar -> catch (<ClassExeption> <nome_para_exeption>). Eu posso passar a class Excepition que abrange todas as exceptions ou passar a própria class da exception.
                System.out.println("[ERRO ENCONTRADO] -> " + erro.getMessage()); // Mostra qual foi a exceção (erro).
                System.out.println("[ERRO ENCONTRADO] -> " + erro.fillInStackTrace()); // Mostra qual é a class da exceção e qual foi a exceção (erro).
                System.out.println("[ERRO ENCONTRADO] -> " + erro.getClass()); // Mostra a class da exceção.
                erro.printStackTrace(); // Mostra a class da exceção, qual foi a exceção (erro) e em que class o catch capturou essa exceção.
            } finally { // Esse bloco de código finally sempre vai ser executado, idependente se teve uma exception ou não.
                System.out.println("Sempre vou ser executado");
            }
        }


        Scanner scanner = new Scanner(System.in);

        // Nesse exemplo o sistema espera uma entrada de dados do tipo int, porém pode ser que o usuário digite outro tipo de dado, o que causa uma exception nesse caso InputMismatchException.
        try {
            System.out.print("\n\nDigite sua idade: ");
            int idade = scanner.nextInt();   
            System.out.println("Seu idade é " + idade);
        } catch (InputMismatchException erro) {
            System.out.println("Tem um erro aqui...");
            System.out.println("ERRO: " + erro); // Desse jeito vai mostrar só a class daw exception
            erro.printStackTrace(); // Dessa forma vai mostrar a class da exceção, qual foi a exceção (erro) e em que class o catch capturou essa exceção. Vai mostrar igual quando eu não uso o try catch, aqui a diferença é que o programa não vai parar por causa do erro.
        } catch (Exception erro) { // Eu posso usar quantos catch eu quiser, porém como a class Exception é a class super todas as outras exceptions herdam dela, ou seja se eu for usar um catch com a class Exception, esse catch deve estar abaixo dos catch expecificos, caso contrário a exceção sempre vai cair nesse catch da class Exception.
            System.out.println("Erro genérico...");
        }

        scanner.close();
    }
}
