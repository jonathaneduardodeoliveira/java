import java.util.Scanner;

public class JogoABC {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String caracteres = "abcdefghijklmnopqrstuvwxyz";
        int pontuacao = 0;
        int totalChances = caracteres.length(); // 26 chances, uma para cada letra do alfabeto

        System.out.println("Bem-vindo ao Jogo A B C MEU FILHO APROVEITA !");
        System.out.println("Você precisa digitar o caractere que aparecer no console.");
        System.out.println("Para sair do jogo, digite 'sair'.\n");

        for (int i = 0; i < totalChances; i++) {
            char caractereAleatorio = caracteres.charAt((int) (Math.random() * caracteres.length()));
            System.out.println("Digite o caractere: " + caractereAleatorio);

            String entradaUsuario = scanner.nextLine();
            if (entradaUsuario.equalsIgnoreCase("sair")) {
                break;
            }

            try {
                if (entradaUsuario.charAt(0) == caractereAleatorio) {
                    pontuacao++;
                    System.out.println("Correto!");
                } else {
                    System.out.println("Incorreto!");
                }
            } catch (Exception e) {
                System.out.println("Erro: por favor, digite apenas um caractere.");
            }
        }

        System.out.println("Jogo terminado! Sua pontuação final é: " + pontuacao);
        scanner.close();
    }
}
