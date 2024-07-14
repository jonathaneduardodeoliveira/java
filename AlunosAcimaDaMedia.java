import java.util.Scanner;

public class AlunosAcimaDaMedia {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Digite a quantidade de alunos na turma: ");
        int quantidadeAlunos = scanner.nextInt();
        scanner.nextLine();

        String[] nomes = new String[quantidadeAlunos];
        double[] notas = new double[quantidadeAlunos];

        int contador = 0;
        while (contador < quantidadeAlunos) {
            System.out.printf("Digite o nome do aluno %d: ", contador + 1);
            nomes[contador] = scanner.nextLine();

            System.out.printf("Digite a nota do aluno %s: ", nomes[contador]);
            notas[contador] = scanner.nextDouble();
            scanner.nextLine();

            contador++;
        }

        double somaNotas = 0;
        contador = 0;
        while (contador < quantidadeAlunos) {
            somaNotas += notas[contador];
            contador++;
        }
        double mediaNotas = somaNotas / quantidadeAlunos;

        System.out.println("\nAlunos com notas acima da média:");
        contador = 0;
        while (contador < quantidadeAlunos) {
            if (notas[contador] > mediaNotas) {
                System.out.printf("%s: %.2f%n", nomes[contador], notas[contador]);
            }
            contador++;
        }

        scanner.close();
    }
}
