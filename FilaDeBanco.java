public class FilaDeBanco {
    private static final int TAMANHO = 5;
    private String [] fila = new String[TAMANHO];
    private int inicio = 0;
    private int fim = 0;
    private int tamanhoAtual = 0;

    // Adiciona um cliente no final da fila 

    public void enqueue (String cliente) {
        if (tamanhoAtual == TAMANHO) {
            System.out.println("Fila cheia. Nao e possivel adicionar " + cliente);
            return;
        }

        fila[fim] = cliente;
        fim = (fim + 1) % TAMANHO;
        tamanhoAtual ++;
        System.out.println(cliente + " entrou na fila. ");
    }

    // Remove o primeiro cliente da fila 

    public void dequeue() {
        if (tamanhoAtual == 0) {
            System.out.println("Fila vazia , Nenhum cliente para atender. ");
            return;
        }
        String atendido = fila[inicio];
        fila[inicio] = null;
        inicio = (inicio +1) % TAMANHO;
        tamanhoAtual--;
        System.out.println("Atendendo: " + atendido);
    }

    // Mostra o proximo cliente a ser atendido 

    public void peek() {
        if (tamanhoAtual == 0) {
            System.out.println("Fila vazia. Nenhum cliente para mostrar. ");
            return;
        }
        System.out.println("Proximo a ser atendido: " + fila[inicio]);
    }

    public static void main (String[] args) {
        FilaDeBanco banco = new FilaDeBanco();

        banco.enqueue("Guilherme ");
        banco.enqueue("Joao ");
        banco.enqueue("Gustavo ");
        banco.enqueue("Felipe ");
        banco.enqueue("Danielle ");

        banco.peek();
        banco.dequeue();
        banco.peek();
        banco.dequeue();
        banco.peek();
        banco.dequeue();
        banco.peek();
        banco.dequeue();
        banco.peek();
        banco.dequeue();
    }
    
}
