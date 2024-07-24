package exercicios_strings.jogo_da_forca;

import java.util.Arrays;

public class Forca {
    private String[] forca;
    private String palavra;
    private Integer tentativas;
    private String letrasUsadas;
    private Integer acertos;

    // CONSTRUTOR (inicializador dos atríbutos)
    public Forca(String palavra, Integer tentativas) {
        this.palavra = palavra.toUpperCase(); // Recebo as palavra da forca atrávez do paramêtro e deixo ela toda em letras maiusculas.
        this.tentativas = tentativas;
        this.forca = new String[palavra.length()]; // Inicializa um array de strings com o tamanho da palavra da forca.
        this.letrasUsadas = ""; // Atributo para armazenar as letras que já foram usadas.
        this.acertos = 0;
    }

    // MÉTODO FAZER PALPITE
    public boolean fazerPalpite(String palpite) { // O método retorna um boolean para que eu possa 
        
        String letraPalpite = palpite.toUpperCase(); // Recebo a letra do palpite atrávez do paramêtro e deixo ela em letra maiuscula.
        letrasUsadas += " " + letraPalpite; // Atríbuo o que já tem nesse atríbuto + a letra do palpite
        char[] palavraEmArray = this.palavra.toCharArray(); // Transformo a palavra da forca em um array de caracteres

        for (int i = 0; i < palavraEmArray.length; i++) { // Faço um loop que percorre cada letra do array que crie transformando a palavra da forca em um array de caracteres.
            if (this.forca[i] == null) {
                this.forca[i] = "_"; // Caso o campo for vazio ele recebe um "_".
            }

            if (palavraEmArray[i] == letraPalpite.charAt(0)) { // Ainda dentro do loop verifico se a letra do array é igual a letra de indíce 0 do palpite, porque o usuário pode ter digitado várias letras no input de fazer o palpite, dessa forma verifico apenas a primeira letra digitada.
                this.forca[i] = String.valueOf(letraPalpite); // Caso a letra do palpite do usuário existir na palavra da forca, a letra é adicionada na forca.
                this.acertos++; // Mais um acerto é adicionado.
            } 
        }

        exibirForca(); // Chamada do método para exibir a forca.

        int verficaErro = palavra.indexOf(letraPalpite); // Verifico o índice da letra do palpite na palavra da forca, se essa letra existir, vai retornar a posição da letra na palavra, caso não exista vai retornar -1. Assim consigo verificar se o usuário acertou ou errou o palpite.

        if (verficaErro == -1) { // Aqui verifico se o índice retornado foi -1, dessa forma decremento uma tentativa e mostro as tentativas restantes.
            this.tentativas--;
            System.out.println("\nERROU! TENTATIVAS RESTANTES: " + this.tentativas + "\n");
        }

        System.out.println("LETRAS USADAS:" + letrasUsadas); // Exibo para o usuário os palpites que ele já deu.
        System.out.println("---------------------------------\n");

        // FINALIZAR JOGO
        if (acertos == this.palavra.length()) { // Caso o usuário acertar todas as letras da palavra o jogo acaba.
            System.out.println("PARABÉNS VOCÊ GANHOU! A PALAVRA ERA -> " + this.palavra + " <-\n");
            return true; // Retorno true caso essa condição seja atendida para que eu possa encerrar o programa na class Main.
        } else if (this.tentativas == 0) { // Caso o usuário gaste todas suas tentativas.
            System.out.println("SUAS TENTATIVAS ACABARAM... TENTE NOVAMENTE!\n");
            System.out.println("A PALAVRA ERA -> " + this.palavra + " <-\n");
            return true; // Retorno true caso essa condição seja atendida para que eu possa encerrar o programa na class Main.
        }

        return false; // Retorno false para continuar o programa, ele só encerra caso o retorno for true.
    }

    // MÉTODO EXIBIR FORCA
    public void exibirForca() {
        String exibirForca = Arrays.toString(this.forca); // Como array é um tipo de referência, então uso o método toString() da class Arrays para mostrar o valor de forca.
        String forcaFormatada = String.valueOf(exibirForca).replace(",", "").replace("[", "          ").replace("]", ""); // Remover "," e "[]" do array.

        System.out.println("\n" + forcaFormatada + "\n"); // Exibo a forca customizada.
    }

    // GETTERS E SETTERS
    public String[] getForca() {
        return forca;
    }

    public void setForca(String[] forca) {
        this.forca = forca;
    }

    public String getPalavra() {
        return palavra;
    }

    public void setPalavra(String palavra) {
        this.palavra = palavra;
    }

    public Integer getTentativas() {
        return tentativas;
    }

    public void setTentativas(Integer tentativas) {
        this.tentativas = tentativas;
    }

    public String getLetrasUsadas() {
        return letrasUsadas;
    }

    public void setLetrasUsadas(String letrasUsadas) {
        this.letrasUsadas = letrasUsadas;
    }

    public Integer getAcertos() {
        return acertos;
    }

    public void setAcertos(Integer acertos) {
        this.acertos = acertos;
    }

}