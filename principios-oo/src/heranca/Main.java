package heranca;

public class Main {
    public static void main(String[] args) {
        SuperHeroi[] novoHeroi = {
            new HomemAranha("Homem Aranha", "Roupa vermelha e azul com teias", new String[] {"Soltar teias de aranha", "Voar usando as teias"}),
            new SuperMan("Super Man", "Roupa azul com capa vermelha", new String[] {"Força", "Voar"})
        };

        Avanger avanger = new HomemAranha("Homem Aranha", "Roupa vermelha e azul com teias", new String[] {"Soltar teias de aranha", "Voar usando as teias"});
        System.out.println(avanger.ehLider());
        avanger.entrarNoPredio();

        validar(novoHeroi);

        for (SuperHeroi superHeroi : novoHeroi) {
            System.out.println(superHeroi.usarTraje());
            superHeroi.usarSuperPoderes(0);
        }

    }

    static void validar(SuperHeroi[] superHerois) {
        if (superHerois[0] instanceof HomemAranha) {
            System.out.println("Lógica de validação do Homem Aranha...");
        }
    }
}