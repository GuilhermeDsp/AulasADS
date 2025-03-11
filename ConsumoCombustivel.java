public class ConsumoCombustivel{
    public static void main(String[] args) {
        // Declarando Variavel
        int distanciaPercorrida =300; // Declarando distancia
        int combustivelConsumido =25; // Combustivel Gasto

        //Processamento
        int consumoMedio = distanciaPercorrida / combustivelConsumido;
        System.out.println(distanciaPercorrida);
        System.out.println(combustivelConsumido);

        // Imprimir consumo medio

        System.out.println("O consumo medio e de:" + consumoMedio + " km/1");
    }
}
