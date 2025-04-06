import java.util.Scanner;

public class GerenciadorDeTarefas {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String[] tarefas = new String[10];
        int opcao;

        do{
            System.out.println("\n--- Gerenciador de Tarefas ---");
            System.out.println("1. Adicionar Tarefa");
            System.out.println("2. Remover Tarefa");
            System.out.println("3. Listar Tarefa");
            System.out.println("4. Sair");
            System.out.print("Escolha uma Opcao: ");
            opcao = scanner.nextInt();
            scanner.nextLine(); // consumir a quebra de linha 

            switch (opcao) {
                case 1:
                boolean adicionada = false;
                for (int i =0; i < tarefas.length; i++) {
                    if (tarefas[i] == null ) {
                        System.out.print("Digite a Tarefa: ");
                        tarefas[i] = scanner.nextLine();
                        System.out.println("Tarefa adicionada na posicao " + i + ".");
                        adicionada = true;
                        break;
                    }
                }

                if (!adicionada) {
                    System.out.println("Lista cheia ! Nao e possivel adicionar mais tarefas. ");
                }
                break;

                case 2:
                System.out.print("Digite o indice da tarefa a remover ( 0 a 9 ): ");
                int indice = scanner.nextInt();
                if (indice >= 0 && indice < tarefas.length && tarefas[indice] != null ) {
                    System.out.println("Tarefa \"" + tarefas[indice] + "\" removida. ");
                    tarefas[indice] = null;
                } else {
                    System.out.println("Indice invalido ou tarefa ja esta vazia. ");
                }
                break;

                case 3:
                System.out.println("\n--- Lista de tarefas ---");
                for (int i = 0; i < tarefas.length; i++) {
                    if (tarefas[i] != null) {
                        System.out.println(i + ":" + tarefas[i] );
                    } else {
                        System.out.println(i + " : [vazio] ");
                    }
                }
                break;

                case 4:
                System.out.println("Saindo do Gerenciador. Ate mais! ");
                break;

                default:
                System.out.println("Opcao invalida! Tente novamente. ");
            }
    } while (opcao != 4);

    scanner.close();
}
}
