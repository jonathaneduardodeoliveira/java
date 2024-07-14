public class Solution {
    public static double salarioComComissao(double[] input) {
        // Extrair os valores do array de entrada
        int numCarrosVendidos = (int) input[0]; // Número de carros vendidos
        double valorTotalVendas = input[1];     // Valor total das vendas
        double salarioFixo = input[2];          // Salário fixo de Pedrinho
        double valorPorCarro = input[3];        // Valor fixo por carro vendido
        
        double comissaoPorVendas = 0.05 * valorTotalVendas;
        
        // Calcular a comissão por cada carro vendido
        double comissaoPorCarro = numCarrosVendidos * valorPorCarro;
        
        double salarioTotal = salarioFixo + comissaoPorVendas + comissaoPorCarro;
        
        salarioTotal = Math.round(salarioTotal * 100.0) / 100.0;
        
        // Retornar o salário total calculado
        return salarioTotal;
    }

    public static void main(String[] args) {
        double[] exemplo1 = {3, 20000.00, 2000.00, 250.00};
        System.out.println("Entrada: [3, 20000.00, 2000.00, 250.00]");
        System.out.println("Saída: " + salarioComComissao(exemplo1)); // Saída esperada: 3750.00
        
        double[] exemplo2 = {4, 25000.00, 3500.00, 100.00};
        System.out.println("Entrada: [4, 25000.00, 3500.00, 100.00]");
        System.out.println("Saída: " + salarioComComissao(exemplo2)); // Saída esperada: 5150.00
    }
}
