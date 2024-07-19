public class ArrayStructure {
    public static void main(String[] args) {
        // Declarar e inicializar um Array
        String [] tarefas = {"Estudar Java", "Estudar Postgree", "Estudar Git e GitHub"}; 
        // String [] tarefasAFazer = new String[3]; // O tamanho de um Array deve ser passado na declaração caso ele não seja inicializado.

        // Acessar posições do Array
        System.out.println(tarefas[0]);
        System.out.println(tarefas[1]);
        System.out.println(tarefas[2]);

        // Atualizar posições do Array
        tarefas[2] = "Estudar SQL";
        System.out.println(tarefas[2]);

        // Tamanho do Array
        System.out.println("Você possui " + tarefas.length + " tarefas.");
    }
}
