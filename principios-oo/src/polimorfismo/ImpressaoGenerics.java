package polimorfismo;

import java.util.Arrays;

public class ImpressaoGenerics {
    public static void main(String[] args) {

        imprimir(new String[] {"texto 1", "texto 2"});
        imprimir(new Integer[] {1, 2, 3, 4, 5, 6});
    }

    private static <T> void imprimir(T[] arrayParaImprimir) {
        System.out.println(Arrays.toString(arrayParaImprimir));
    }
}
