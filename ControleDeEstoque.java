import java.util.Scanner;

public class ControleDeEstoque {
    public static void main(String[] args) {
        Scanner scanner = new Scanner (System.in);

        //Solicita o codigo do produto
        System.out.println("Digite o codigo do Produto: ");
        int codigo = scanner.nextInt();

        //Verifica o codigo do produto usando switch-case
        switch (codigo) {
            case 101:
            System.out.println("Produto: Caneta");
            System.out.println("Quantidade em estoque: 50");
            System.out.println("Preço unitario: R$ 2,50");
            break;

            case 102:
            System.out.println("Produto: Caderno");
            System.out.println("Quantidade em estoque: 30");
            System.out.println("Preço unitario: R$ 15,00");
            break;

            case 103:
            System.out.println("Produto: Borracha");
            System.out.println("Quantidade em estoque: 100");
            System.out.println("Preço unitario: R$ 1,00");
            break;
            default:
            System.out.println("Codigo de produto invalido. Produto nao encontrado");
        }
        scanner.close(); // Fecha o Scanner
    }
    
}
