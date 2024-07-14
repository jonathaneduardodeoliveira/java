import java.util.Scanner;

public class CustoViagem {
    public static void main(String[] args) {
        final double CONSUMO_MEDIO = 12.0;
        final double DISTANCIA = 360.0;

        Scanner scanner = new Scanner(System.in);

        System.out.print("Digite o valor do combustível por litro: R$ ");
        double precoPorLitro = scanner.nextDouble();

        double litrosNecessarios = DISTANCIA / CONSUMO_MEDIO;
        double custoTotal = litrosNecessarios * precoPorLitro;

        System.out.printf("Quantidade de combustível necessária: %.2f litros%n", litrosNecessarios);
        System.out.printf("Custo total da viagem: R$ %.2f%n", custoTotal);

        scanner.close();
    }
}
