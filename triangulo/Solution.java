public class Solution {
    public static boolean eUmTriangulo(int[] input) {
        if (input.length != 3) {
            return false;
        }
        
        int lado1 = input[0];
        int lado2 = input[1];
        int lado3 = input[2];
        
        // Cada lado deve ser menor que a soma dos outros dois
        boolean condicao1 = (lado1 < lado2 + lado3);
        boolean condicao2 = (lado2 < lado1 + lado3);
        boolean condicao3 = (lado3 < lado1 + lado2);
        
        return condicao1 && condicao2 && condicao3;
    }

    public static void main(String[] args) {
        int[] exemplo1 = {2, 2, 5};
        System.out.println("Entrada: [2, 2, 5]");
        System.out.println("Saída: " + eUmTriangulo(exemplo1)); // Saída esperada: false
        
        int[] exemplo2 = {3, 3, 5};
        System.out.println("Entrada: [3, 3, 5]");
        System.out.println("Saída: " + eUmTriangulo(exemplo2)); // Saída esperada: true
    }
}
