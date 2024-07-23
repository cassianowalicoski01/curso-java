package heranca;

public abstract class SuperHeroi { // O modificador abstract faz com que essa class não possa ser usada para criar um objeto a partir dessa class, somente as classes que extends essa class. O modificador protected permite somente o acesso pelas sub classes ou pelas classes que estão no mesmo pacote (mesma pasta). Se eu usar o modificador final eu estou dizendo que essa class não pode ser extendida, ou seja, não pode ser herdada por outras classes.
    protected String nome; 
    protected String traje;
    protected String[] superPoderes;
    public static final boolean tendencia = true; // Significa que esse atríbuto é constante e precisa ser inicializado na declaração, ele é imutável, ou seja, não pode ser alterado. Ele pode ser visualizado, mas não modificado. Normalmente é definido como static pois não sobre alteração, assim não é necessário instanciar um objeto para ter acesso a ele, bastar usar a propria class para chama-lo.

    public SuperHeroi(String nome, String traje, String[] superPoderes) { // Construtor -> inicializa os atributos da class, nesse caso através dos valores que ele recebe por parâmetro.
        this.nome = nome;
        this.traje = traje;
        this.superPoderes = superPoderes;
    }

    // Métodos

    public abstract String usarTraje(); // Se eu usar o modificador abstract em um método, eu não posso definir uma função para esse método para essa class, porém as classes que extends essa agora são obrigadas a criar a lógica para dentro desse método. E esse métodos abstratos só podem existir se a class for abstrata também.
        // return this.nome + " vestiu seu traje: " + this.traje; -> Isso só é possível se o método não for abstrato.

    public void usarSuperPoderes(int indicePoder) { // Se eu usar o modificador final aqui significar que esse método não pode ser sobreescrito por ninguem, ninguem pode tentar modificar ele. Deve ser utilizado quando queremos proteger o codigo de modificações.
        String poderUsado = superPoderes[indicePoder];
        System.out.println("O heroí " + this.nome + ", usou o poder: " + poderUsado);
    }

}
