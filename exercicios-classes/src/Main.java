import com.walicoski.kauan.cassiano.curriculo.Curriculo;

public class Main {
    public static void main(String[] args) {
        Curriculo meuCurriculo = new Curriculo();

        String imprimirCurriculo = meuCurriculo.sobreMim();
        System.out.println(imprimirCurriculo);
    }
}
