public class dias {
    public static int idadeEmDias(int[] input) {
        int anos = input[0];
        int meses = input[1];
        int dias = input[2];
        
        int total_dias = anos * 365 + meses * 30 + dias;
        
        return total_dias;
    }
    
    public static void main(String[] args) {
        int[] entrada1 = {5, 4, 14};
        int[] entrada2 = {10, 8, 16};
        
        System.out.println("Saída para entrada1: " + idadeEmDias(entrada1));
        System.out.println("Saída para entrada2: " + idadeEmDias(entrada2));
    }
}
