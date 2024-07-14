import java.util.Scanner;

public class CalculoMediaTurma{
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);

        System.out.print("Digite o número de alunos na turma: ");
        int n = entrada.nextInt();

        // Verificar se o número de alunos é válido
        while (n <= 0) {
            System.out.println("Número inválido. Digite um valor maior que zero:");
            n = entrada.nextInt();
        }

        double somaNotas = 0.0;
        double media;
        int contador = 0;

        // Utilizando um loop while para coletar as notas
        while (contador < n) {
            System.out.print("Digite a nota do aluno " + (contador + 1) + ": ");
            double nota = entrada.nextDouble();

            // Verificar se a nota é válida
            if (nota >= 0 && nota <= 10) {
                somaNotas += nota;
                contador++;
            } else {
                System.out.println("Nota inválida. Digite uma nota entre 0 e 10.");
            }
        }

        // Calcular a média
        if (contador > 0) {
            media = somaNotas / contador;
            System.out.println("A média da turma é: " + media);
        } else {
            System.out.println("Não foi possível calcular a média. Nenhum aluno inserido.");
        }

        entrada.close();
    }
}
