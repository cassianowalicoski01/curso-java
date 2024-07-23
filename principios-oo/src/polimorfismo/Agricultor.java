package polimorfismo;

public class Agricultor implements Trabalhador {

    @Override // Como eu estou implementando da interface Trabalhador onde os métodos só podem ser criados, aqui eu preciso sobreescrever (implementar) o método contido nele e inicíaliza-lo.
    public void trabalhar() {
        System.out.println("Fazer lavoura.");
    }
    
    public void ligarTrator() {
        System.out.println("Ligando trator.");
    }
}
