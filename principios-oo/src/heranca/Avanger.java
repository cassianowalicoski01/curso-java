package heranca;

public interface Avanger {
    boolean ehLider(); // Ele é public por padrão, é um metétodo, eu só posso criar métodos usando o interface, e esses métodos não podem ter corpo, só podem ser criados. Isso é um método abstrato

    default void entrarNoPredio() { // Eu posso ter métodos não abstratos se eu usar o default
        System.out.println("Entrando no prédio...");
    }
}
