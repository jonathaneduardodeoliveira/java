import java.util.Arrays;

public class Solution {
    public static String geraRecibo(double[] input) {
        // Verifica se há pelo menos duas peças para aplicar a promoção
        if (input.length < 2) {
            return "Não é possível aplicar a promoção com menos de duas peças.";
        }
        
        // Ordena o array de preços em ordem crescente
        Arrays.sort(input);
        
        // Calcula o valor total sem descontos
        double valorTotal = 0.0;
        for (double price : input) {
            valorTotal += price;
        }
        
        // Calcula o desconto (50% sobre o menor preço)
        double desconto = input[0] * 0.5;
        
        // Calcula o valor total a pagar
        double valorAPagar = valorTotal - desconto;
        
        // Formata a saída conforme especificado
        String output = String.format("Valor total: %.1f | Valor de descontos: %.1f | Valor a pagar: %.1f", 
                                      valorTotal, desconto, valorAPagar);
        
        return output;
    }
    
    public static void main(String[] args) {
        // Exemplos de uso conforme o enunciado
        double[] compra1 = {20.0, 40.0};
        System.out.println(geraRecibo(compra1));
        
        double[] compra2 = {20.0, 40.0, 30.0};
        System.out.println(geraRecibo(compra2));
        
        double[] compra3 = {20.0, 80.0, 60.0, 40.0};
        System.out.println(geraRecibo(compra3));
    }
}
