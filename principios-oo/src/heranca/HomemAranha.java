package heranca;

public class HomemAranha extends SuperHeroi implements Avanger { // Eu não posso ter mais de uma herança, porém posso ter várias interfaces

    public HomemAranha(String nome, String traje, String[] superPoderes) { // Quando eu herdo os atributos e métodos de uma class super preciso criar o construtor com os mesmos parãmetros da class super, e usar esse comando abaixo.
        super(nome, traje, superPoderes);
        
    }

    public void usarSuperPoderes(int index) {
        System.out.println("Falar com a Mary Jane"); // Aqui alterei o método da class super para atender as necessidades
        super.usarSuperPoderes(index);
    }

    public String usarTraje() { // Eu foi obrigado a definir oq acontece nesse método, aqui na class HomemAranha que extends de SuperHeroi, pois usei o modificador abstract nesse métodolo la na class SuperHeroi
        return super.traje;
    }

    public boolean ehLider() {
        return false;
    }
    
    
}
