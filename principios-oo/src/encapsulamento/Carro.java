package encapsulamento;
/*
 * ENCAPSULAMENTO:
 * 
 *  Ele é usado para manter a integridade dos objetos, garantindo que seus dados sejam acessados e manipulados apenas por meio de métodos específicos da classe.
 */

public class Carro { // Se eu retirar o public da class (e deixar só class Carro) a class vai ficar com o modificador default, ou seja essa class vai ser vísivel apenas para os arquivos que estiverem na mesma pasta(pacote).

    private String volante; // Usando o private esses atributos só são visíveis dentro dessa class Caro, seu  eu quiser visualizar ou alterar o valor desses atributos eu devo usar os getters e os setters (para escrever os getters e setters basta usar o atalho Ctrl + . e selecionar a opção de gerar eles)
    private String pedais;
    private String motor;
    private int velocidadeMaxima;
    private String placa;

    public Carro() { // Esse é o construtor -> é onde a gente inicializa os atributos(variáveis da class), se eu quisesse que esses atributos já tivessem algum valor esse é o local para eu fazer isso.
        this.velocidadeMaxima = 200; // Exemplo de inicialização usando o construtor
        this.placa = "AHF-9801";
    }

    public void ligarCarro() {
        System.out.println("Ligando o carro...");
    }

    public void acelerar() {
        System.out.println("Acelerando...");
    }

    /*
    private void usarAirbags() { // Pensando em um cenário da vida real, uma pessoa não deve ter acesso ao uso dos airbags, pois eles devem ser acionados de forma automática, por isso usei o private
        System.out.println("Airbag usado...");
    } 
    */

    // Getters e Setters

    public String getVolante() {
        return volante;
    }

    public void setVolante(String volante) {
        this.volante = volante;
    }

    public String getPedais() {
        return pedais;
    }

    public void setPedais(String pedais) {
        this.pedais = pedais;
    }

    public String getMotor() {
        return motor;
    }

    public void setMotor(String motor) {
        this.motor = motor;
    }

    public int getVelocidadeMaxima() {
        return velocidadeMaxima;
    }

    public void setVelocidadeMaxima(int velocidadeMaxima) {
        this.velocidadeMaxima = velocidadeMaxima;
    }

    public String getPlaca() {
        return placa;
    }

    public void setPlaca(String placa) {
        this.placa = placa;
    }    
}
