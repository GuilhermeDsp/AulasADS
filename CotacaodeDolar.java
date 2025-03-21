import java.util.Scanner;

public class CotacaodeDolar {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Conversao de dolar para real
        System.out.println("Digite a cotaçao do Dólar: ");

        float CotacaoDolar = scanner.nextFloat();
        System.out.println("Digite o valor em Dólares: ");

        float valorDolar = scanner.nextFloat();
        float valorReal = CotacaoDolar * valorDolar;

        System.out.println("Valor em Reais: " + valorReal);
        
    }
    
}
