package abstracao;

/*
 * ABSTRAÇÃO:
 * 
 * É a capacidade de ocultar detalhes irrelevantes ou complexos de um problema e focar nos aspectos essenciais. 
 */

public class TV {
    private boolean ligada;
    private int volume;
    private int canal;

    public void ligarDesligar() {
        this.ligada = !this.ligada;
        System.out.println("A TV está " + (this.ligada ? "ligada" : "desligada"));
    }

    public void aumentarVolume() {
        this.volume += 5;
        System.out.println("O volume foi aumentado para " + this.volume);
    }

    public void abaixarVolume() {
        this.volume -= 5;
        System.out.println("Abaixado o volume para " + this.volume);
    }

    public void mudarDeCanal(int novoCanal) {
        this.canal = novoCanal;
        System.out.println("Você está assistindo o canal " + this.canal);
    }
}
