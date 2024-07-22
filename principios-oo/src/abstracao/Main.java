package abstracao;

public class Main {
    public static void main(String[] args) {
        TV minhaTV = new TV();

        minhaTV.ligarDesligar();
        minhaTV.aumentarVolume();
        minhaTV.aumentarVolume();
        minhaTV.abaixarVolume();
        minhaTV.mudarDeCanal(8);
        minhaTV.ligarDesligar();
    }
}
