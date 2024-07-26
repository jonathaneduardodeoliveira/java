public class Monitor {
    public static void main(String[] args) {
        java.util.Scanner scanner = new java.util.Scanner(System.in);
        System.out.println("Digite algo e pressione Enter:");
        String input = scanner.next();
        System.out.println("Você digitou: " + input);
        scanner.close();
    }
}
