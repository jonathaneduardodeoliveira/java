import java.util.Scanner;

        public class CalculoMediaAluno {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Digite o primeiro número: ");
        double numero1 = scanner.nextDouble();

        System.out.print("Digite o segundo número: ");
        double numero2 = scanner.nextDouble();

        double resultadoDivisao = numero1 / numero2;
        System.out.println("Resultado da divisão: " + resultadoDivisao);

        scanner.nextLine();

        System.out.print("Digite o nome do aluno: ");
        String nome = scanner.nextLine();

        System.out.print("Digite a nota do primeiro semestre: ");
        double nota1 = scanner.nextDouble();

        System.out.print("Digite a nota do segundo semestre: ");
        double nota2 = scanner.nextDouble();

        double media = (nota1 + nota2) / 2;

        System.out.println("A média do aluno " + nome + " é: " + media);

        scanner.close();
    }
}
