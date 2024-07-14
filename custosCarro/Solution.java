public class Solution {
    public static double[] custosCarro(double[] input) {
        double precoFinal = input[0];
        double custoDistribuidor = input[1];
        double custoImpostos = input[2];
        
        double percentualDistribuidor = (custoDistribuidor / precoFinal) * 100;
        double percentualImpostos = (custoImpostos / precoFinal) * 100;
        
        percentualDistribuidor = Math.round(percentualDistribuidor * 100.0) / 100.0;
        percentualImpostos = Math.round(percentualImpostos * 100.0) / 100.0;
        
        return new double[] { percentualDistribuidor, percentualImpostos };
    }
    
    public static void main(String[] args) {
        double[] resultado1 = custosCarro(new double[] { 100000.00, 12000.00, 20000.00 });
        double[] resultado2 = custosCarro(new double[] { 115500.00, 25000.00, 32500.00 });
        
        System.out.println("Saída 1: [" + resultado1[0] + ", " + resultado1[1] + "]");
        System.out.println("Saída 2: [" + resultado2[0] + ", " + resultado2[1] + "]");
    }
}
