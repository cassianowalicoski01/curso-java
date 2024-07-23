package heranca;

public class SuperMan extends SuperHeroi implements Avanger { // Eu não posso ter mais de uma herança, porém posso ter várias interfaces

    public SuperMan(String nome, String traje, String[] superPoderes) {
        super(nome, traje, superPoderes);
    }

    @Override // Significa que esse método foi sobescrito
    public String usarTraje() { // Eu foi obrigado a definir oq acontece nesse método, aqui na class SuperMan que extends de SuperHeroi, pois usei o modificador abstract nesse métodolo la na class SuperHeroi
        return super.traje;
    }

    public boolean ehLider() {
        return true;
    }
}
