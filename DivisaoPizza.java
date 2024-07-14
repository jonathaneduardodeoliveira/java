import java.util.Scanner;

public class DivisaoPizza {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Digite o número de membros da família: ");
        int numeroMembros = scanner.nextInt();

        System.out.print("Digite o número de fatias da pizza: ");
        int numeroFatias = scanner.nextInt();

        if (numeroMembros > 0) {
            int fatiasPorPessoa = numeroFatias / numeroMembros;
            int fatiasSobrando = numeroFatias % numeroMembros;

            System.out.printf("Cada membro da família receberá %d fatias.%n", fatiasPorPessoa);

            if (fatiasSobrando > 0) {
                System.out.printf("Haverá %d fatia(s) sobrando.%n", fatiasSobrando);
                int fatiasNecessarias = numeroMembros - fatiasSobrando;
                System.out.printf("Para que todos recebam a mesma quantidade de fatias, serão necessárias mais %d fatia(s).%n", fatiasNecessarias);
            } else {
                System.out.println("A pizza foi dividida igualmente entre todos os membros da família.");
            }
        } else {
            System.out.println("Número de membros da família deve ser maior que zero.");
        }

        scanner.close();
    }
}
