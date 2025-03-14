import java.util.Scanner;

public class EntradaDeDados {
    public static void main(String[] args) throws java.io.IOException {
    Scanner input = new Scanner(System.in);

    System.out.println("Digite qualquer tecla");
    char ch = (char) input.next().charAt(0);

    System.out.println("A tecla digitada foi: " + ch);

    input.close();

}

}