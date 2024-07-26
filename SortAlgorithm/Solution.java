import java.util.Arrays;

public class Solution {
    public static int[] ordenar(int[] input) {
        Arrays.sort(input);
        return input;
    }

    public static void main(String[] args) {
        int[] dados = {5, 3, 8, 1, 2};
        int[] dadosOrdenados = ordenar(dados);
        System.out.println(Arrays.toString(dadosOrdenados));
    }
}
