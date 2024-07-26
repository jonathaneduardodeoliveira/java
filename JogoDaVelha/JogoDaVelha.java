import java.util.Scanner;
import java.util.Random;

public class JogoDaVelha {
    private static final int SIZE = 3;
    private static char[][] tabuleiro = new char[SIZE][SIZE];
    private static String jogador1, jogador2;
    private static int pontosJogador1 = 0, pontosJogador2 = 0, totalPartidas = 0;
    private static Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {
        System.out.println("Bem-vindo ao jogo da velha de Jonathan Eduardo de Oliveira!");
        System.out.println("Para sair do jogo, pressione 'q'.");

        while (true) {
            iniciarJogo();
            jogar();
            System.out.println("Pressione 'Enter' para continuar ou 'q' para sair.");
            String continuar = scanner.nextLine();
            if (continuar.equalsIgnoreCase("q")) {
                break;
            }
        }
    }

    private static void iniciarJogo() {
        inicializarTabuleiro();
        exibirTabuleiro();
        System.out.println("Insira o nome do Jogador 1:");
        jogador1 = scanner.nextLine();
        System.out.println("Insira o nome do Jogador 2:");
        jogador2 = scanner.nextLine();

        if (jogador1.isEmpty() || jogador2.isEmpty()) {
            System.out.println("Ambos os jogadores devem fornecer seus nomes.");
            iniciarJogo();
        }
    }

    private static void jogar() {
        boolean jogoAtivo = true;
        char jogadorAtual = escolherPrimeiroJogador();
        while (jogoAtivo) {
            exibirTabuleiro();
            System.out.println("Vez de " + (jogadorAtual == 'X' ? jogador1 : jogador2) + ". Faça sua jogada (exemplo: 01X):");
            String jogada = scanner.nextLine();

            if (jogada.equalsIgnoreCase("q")) {
                System.out.println("Saindo do jogo...");
                System.exit(0);
            }

            if (jogadaValida(jogada)) {
                realizarJogada(jogada, jogadorAtual);
                if (verificarVencedor(jogadorAtual)) {
                    exibirTabuleiro();
                    System.out.println("Parabéns " + (jogadorAtual == 'X' ? jogador1 : jogador2) + ", você venceu!");
                    if (jogadorAtual == 'X') pontosJogador1++;
                    else pontosJogador2++;
                    totalPartidas++;
                    exibirPlacar();
                    jogoAtivo = false;
                } else if (tabuleiroCheio()) {
                    exibirTabuleiro();
                    System.out.println("Empate!");
                    totalPartidas++;
                    exibirPlacar();
                    jogoAtivo = false;
                }
                jogadorAtual = (jogadorAtual == 'X') ? 'O' : 'X';
            } else {
                System.out.println("Jogada inválida. Tente novamente.");
            }
        }
    }

    private static void inicializarTabuleiro() {
        for (int i = 0; i < SIZE; i++) {
            for (int j = 0; j < SIZE; j++) {
                tabuleiro[i][j] = ' ';
            }
        }
    }

    private static void exibirTabuleiro() {
        System.out.println("  0 1 2");
        for (int i = 0; i < SIZE; i++) {
            System.out.print(i + " ");
            for (int j = 0; j < SIZE; j++) {
                System.out.print(tabuleiro[i][j]);
                if (j < SIZE - 1) System.out.print("|");
            }
            System.out.println();
            if (i < SIZE - 1) System.out.println("  -----");
        }
    }

    private static boolean jogadaValida(String jogada) {
        if (jogada.length() != 3) return false;
        try {
            int linha = Integer.parseInt(jogada.substring(0, 1));
            int coluna = Integer.parseInt(jogada.substring(1, 2));
            char simbolo = jogada.charAt(2);
            return linha >= 0 && linha < SIZE && coluna >= 0 && coluna < SIZE &&
                   (simbolo == 'X' || simbolo == 'O') && tabuleiro[linha][coluna] == ' ';
        } catch (Exception e) {
            return false;
        }
    }

    private static void realizarJogada(String jogada, char jogador) {
        int linha = Integer.parseInt(jogada.substring(0, 1));
        int coluna = Integer.parseInt(jogada.substring(1, 2));
        tabuleiro[linha][coluna] = jogador;
    }

    private static boolean verificarVencedor(char jogador) {
        // Verificar linhas, colunas e diagonais
        for (int i = 0; i < SIZE; i++) {
            if (tabuleiro[i][0] == jogador && tabuleiro[i][1] == jogador && tabuleiro[i][2] == jogador) return true;
            if (tabuleiro[0][i] == jogador && tabuleiro[1][i] == jogador && tabuleiro[2][i] == jogador) return true;
        }
        if (tabuleiro[0][0] == jogador && tabuleiro[1][1] == jogador && tabuleiro[2][2] == jogador) return true;
        if (tabuleiro[0][2] == jogador && tabuleiro[1][1] == jogador && tabuleiro[2][0] == jogador) return true;
        return false;
    }

    private static boolean tabuleiroCheio() {
        for (int i = 0; i < SIZE; i++) {
            for (int j = 0; j < SIZE; j++) {
                if (tabuleiro[i][j] == ' ') return false;
            }
        }
        return true;
    }

    private static char escolherPrimeiroJogador() {
        Random random = new Random();
        return random.nextBoolean() ? 'X' : 'O';
    }

    private static void exibirPlacar() {
        System.out.println("Placar:");
        System.out.println(jogador1 + ": " + pontosJogador1 + " pontos");
        System.out.println(jogador2 + ": " + pontosJogador2 + " pontos");
        System.out.println("Total de partidas: " + totalPartidas);
    }
}
