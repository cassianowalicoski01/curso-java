package polimorfismo;

public class Programador implements Trabalhador {

    @Override // Como eu estou implementando da inteface Trabalhador onde os métodos só podem ser criados, aqui eu preciso sobreescrever o método contido nele e inicíaliza-lo.
    public void trabalhar() {
        System.out.println("Escrever código.");
    }
    
}
