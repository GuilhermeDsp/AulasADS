import java.util.Scanner;

public class FolhaDePagamento {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        String [] funcionarios = {"Guilherme", "Joao", "Gustavo"};
        double [] salariosBruto = new double[3];
        double [] salariosLiquido = new double[3];

        for (int i = 0; i < funcionarios.length; i++){
            System.out.println("Salario bruto de " + funcionarios[i] + ": R$ ");
            salariosBruto [i] = input.nextDouble();
        }

        System.out.println("Salarios liquidos");
        
        for (int j = 0; j < funcionarios.length ; j++){
            if (salariosBruto [j] <= 2000){
                salariosLiquido [j] = (salariosBruto[j] * 0.9);
            }
            else{
                salariosLiquido [j] = (salariosBruto [j] * 0.85);
            }

            System.out.println(funcionarios [j] + ": R$" + salariosLiquido [j]);
        }
        input.close();
    }
    
}
