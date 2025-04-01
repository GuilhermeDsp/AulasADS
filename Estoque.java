import java.util.Scanner;

public class Estoque {
public static void main(String[] args) {
    
    Scanner scanner = new Scanner(System.in);

    //Solicitar ao usuario a quantidade em estoque de 5 produtos

    int[] estoque = new int[5];
    String[] produtos = {"Produto1", "Produto2", "Produto3", "Produto4", "Produto5"};

    // Prencher o estoque com a quantidade inicial 

    for (int i = 0; i < 5; i++) {
        System.out.print("Digite a quantidade em estoque para o " + produtos[i] + ": ");
        estoque[i] = scanner.nextInt();
    }

    // Permitir que o usuario atualize a quantidade de um produto especifico

    System.out.println("\nVoce pode atualizar a quantidade do produto.");
    System.out.print("Digite o numero do produto que deseja atualizar (1 a 5): ");
    int produtoEscolhido = scanner.nextInt() -1; 

    if (produtoEscolhido >= 0 && produtoEscolhido < 5) {
        System.out.print("Digite a nova quantidade para " + produtos[produtoEscolhido] + ": ");
        int novaQuantidade = scanner.nextInt();
        estoque[produtoEscolhido] = novaQuantidade; // atualiza a quantidade no estoque
        System.out.println("Quantidade do " + produtos[produtoEscolhido] + "atualizado com sucesso! ");
    }
    else {
        System.out.println("Numero de produto invalido. ");
    }

    // Exibir o estoque atualizado 

    System.out.println("\nEstoque atualizado:");
    for (int i = 0; i < 5; i++) {
        System.out.println(produtos[i] + " : " + estoque[i] + "unidades");
    }

    // Calcular e exibir  o total  de itens no estoque

    int totalEstoque = 0;
    for (int quantidade : estoque) {
        totalEstoque += quantidade;
    }

    System.out.println("\nTotal de itens no estoque " + totalEstoque);

    scanner.close();
}

    
}
