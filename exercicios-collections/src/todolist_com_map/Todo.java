package todolist_com_map;

/*
 * Crie a classe Todo com os atributos titulo (String) e concluida (boolean). Crie um construtor que inicializa o titulo da Todo.
 * Crie o método concluir que marca o atributo concluida como true.
 * Crie os métodos getTitulo e isConcluida que retornam os atributos titulo e concluida respectivamente.
 * Sobrescreva o método equals que compara se os atributos titulo das tarefas são iguais.
 */

public class Todo {
    private String titulo;
    private boolean concluida;

    // Construtor
    public Todo(String titulo) {
        this.titulo = titulo;
    }

    public void concluir() {
        this.concluida = true; // Somente deixa o atríbuto concluída como true.
    }

    public String getTitulo() {
        return this.titulo; // Retorna o título recebido atráves do parâmetro do construtor.
    }

    public boolean isConcluida() {
        return this.concluida; // Vai retornar true caso o método concluir() tenha sido usado por alguma tarefa, caso contrário retornara false.
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj) { // Verifica se obj é a mesma instância que this. Se sim, eles são, obviamente, iguais, e o método retorna true imediatamente. Motivo: Essa verificação é muito eficiente, pois evita a necessidade de realizar comparações mais complexas se os dois objetos forem exatamente a mesma instância.
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) { // obj == null: Verifica se o objeto passado é null. Se for, this e null não podem ser iguais, então o método retorna false. getClass() != obj.getClass(): Verifica se obj é da mesma classe que this. getClass() retorna a classe real do objeto em tempo de execução, e compará-la garante que os dois objetos são do mesmo tipo. Motivo: Essas verificações garantem que o objeto passado seja não apenas não nulo, mas também da mesma classe que o objeto atual. Isso evita o uso de casts que podem resultar em exceções.
            return false;
        }
        Todo other = (Todo) obj; // Todo other = (Todo) obj;: Faz o cast seguro do objeto obj para o tipo Todo, uma vez que já foi verificado que o objeto é da mesma classe. Isso é seguro porque a verificação de classe foi feita antes.
        return this.titulo != null ? this.titulo.equals(other.getTitulo()) : other.getTitulo() == null; // this.titulo != null ? this.titulo.equals(other.getTitulo()) : other.getTitulo() == null: Compara o atributo titulo de this com o atributo titulo de other de forma segura. this.titulo != null ? this.titulo.equals(other.getTitulo()): Se this.titulo não for null, usa o método equals da String para comparar this.titulo com other.getTitulo(). other.getTitulo() == null: Se this.titulo for null, verifica se other.getTitulo() também é null. Se ambos forem null, considera os títulos iguais.
    }

    @Override
    public int hashCode() {
        return this.titulo != null ? this.titulo.hashCode() : 0; // Se titulo não for null, o método hashCode da String é usado para calcular o código hash. Se titulo for null, o método retorna 0. Isso é uma prática comum para lidar com valores null, evitando exceções e proporcionando uma maneira consistente de lidar com casos onde o atributo é null.
    }

}
