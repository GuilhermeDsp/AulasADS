public class CalculoDaHipotenusa {
    public static void main(String[] args) {
        
        // Definindo Variaveis

        double cateto1,cateto2,hipotenusa;

        // Inicializaçao de variaveis

        cateto1 =3;
        cateto2 =4;

        // Calculando a hipotenusa

        hipotenusa = Math.sqrt(cateto1 * cateto1 + cateto2 * cateto2);

        // Impressao dos resultados

        System.out.println("O valor da Hipotenusa e:" + hipotenusa);
    }
    
}
