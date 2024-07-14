import java.util.Scanner;

public class VerificaPrimo {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Digite um número: ");
        int numero = scanner.nextInt();

        if (numero <= 1) {
            System.out.println(numero + " não é um número primo.");
        } else {
            boolean isPrimo = verificaPrimo(numero, 2);
            if (isPrimo) {
                System.out.println(numero + " é um número primo.");
            } else {
                System.out.println(numero + " não é um número primo.");
            }
        }

        scanner.close();
    }

    public static boolean verificaPrimo(int num, int divisor) {
        if (divisor > Math.sqrt(num)) {
            return true;
        } else if (num % divisor == 0) {
            return false;
        } else {
            return verificaPrimo(num, divisor + 1);
        }
    }
}
