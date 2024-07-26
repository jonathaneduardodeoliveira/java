import java.util.Scanner;

public class Bhaskara {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Digite os valores de a, b e c da equação ax^2 + bx + c = 0:");

        System.out.print("a: ");
        double a = scanner.nextDouble();

        System.out.print("b: ");
        double b = scanner.nextDouble();

        System.out.print("c: ");
        double c = scanner.nextDouble();

        if (a == 0) {
            System.out.println("Não é uma equação quadrática (a deve ser diferente de zero).");
        } else {
            double delta = b * b - 4 * a * c;

            if (delta < 0) {
                System.out.println("A equação não possui raízes reais (delta negativo).");
            } else {
                double x1 = (-b + Math.sqrt(delta)) / (2 * a);
                double x2 = (-b - Math.sqrt(delta)) / (2 * a);

                System.out.println("Raiz x1: " + x1);
                System.out.println("Raiz x2: " + x2);
            }
        }

        scanner.close();
    }
}
