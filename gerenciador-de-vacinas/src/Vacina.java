import java.util.Map;
import java.util.Random;
import java.util.HashMap;
import java.util.Iterator;

public class Vacina {
    private String nomePaciente;
    private Integer cfp;
    private Map<String, String> vacinasAplicadas = new HashMap<>();
    private String dataAplicacao;
    private Integer codigo;

    // Construtor
    public Vacina(String nomePaciente, Integer cpf, String vacinaAplicada, String dataAplicacao) {
        this.nomePaciente = nomePaciente;
        this.cfp = cpf;
        this.vacinasAplicadas.put(dataAplicacao, vacinaAplicada);
        this.dataAplicacao = dataAplicacao;
        this.codigo = gerarCodigoPaciente(); // Atribui um código aleatório entre 0 e 999.
    }

    public void adicionarVacina(String data, String vacina) { // Recebe a data e a vacina por parâmetro e adiciona ao map vacinasAplicadas.
        this.vacinasAplicadas.put(data, vacina);
    }

    public void exibirInformacoes(Integer cpf) {
        if (this.cfp.equals(cpf)) { // Exibi os dados do this.cpf que for igual ao cpf passado por parâmetro
            StringBuilder dadosPaciente = new StringBuilder();

            dadosPaciente.append("CÓDIGO: " + this.codigo);
            dadosPaciente.append("\nPACIENTE: " + this.nomePaciente);
            dadosPaciente.append("\nCPF: " + this.cfp);

            dadosPaciente.append("\n\nVACINAS:\n");
            Iterator<Map.Entry<String, String>> it = vacinasAplicadas.entrySet().iterator(); // Itero sobre chave e valor do map vacinasAplicadas 
            while (it.hasNext()) { // hasNext() verifica se há mais elementos para iterar.
                Map.Entry<String, String> entry = it.next(); // Cada Entry representa um par chave-valor. O it.next() retorna o próximo elemento no conjunto de entradas do Map. Cada elemento é do tipo Map.Entry, que contém métodos como getKey() e getValue() para obter a chave e o valor associados.
                dadosPaciente.append("\n- " + entry.getKey());
                dadosPaciente.append(": " + entry.getValue());
            }

            System.out.println(dadosPaciente);
        }
    }

    public Integer gerarCodigoPaciente() {
        Random random = new Random();
        return random.nextInt(1000); // Gera um código aleatório entre 0 e 999.
    }

    // Getters
    public String getNomePaciente() {
        return nomePaciente;
    }

    public Integer getCfp() {
        return cfp;
    }

    public Map<String, String> getVacinasAplicadas() {
        return vacinasAplicadas;
    }

    public String getDataAplicacao() {
        return dataAplicacao;
    }

    public Integer getCodigo() {
        return codigo;
    }

}
