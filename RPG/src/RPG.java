import java.util.Scanner;
import java.util.Random;

public class RPG {
    Scanner sc = new Scanner(System.in);

    int conhecimento = 0; // Pontuação do jogador
    // MENU
    public void menu(String nomeJogo) {
        int opcao;

        do {
            System.out.println("\n" + nomeJogo);
            System.out.println("1 - Instruções");
            System.out.println("2 - Jogar");
            System.out.println("3 - Créditos");
            System.out.println("4 - Sair");
            System.out.print("Escolha uma opção: ");
            opcao = sc.nextInt();

            switch (opcao) {
                case 1:
                    instrucoes();
                    break;
                case 2:
                    jogar();
                    break;
                case 3:
                    creditos();
                    break;
                case 4:
                    sair();
                    break;
                default:
                    System.out.println("Opção inválida. Tente novamente.");
            }

        } while (opcao != 4);
    }

    // INSTRUÇÕES
    public void instrucoes() {
        System.out.println("\n=== INSTRUÇÕES ===");
        System.out.println("Você é o Cavaleiro do Código, enviado para restaurar a lógica em System32!");
        System.out.println("Durante o jogo, você fará escolhas baseadas em estruturas condicionais (if/else).");
        System.out.println("Suas respostas corretas aumentam seu conhecimento. Tente chegar ao nível máximo!");
        System.out.println("Boa sorte, programador!");
    }

    // CRÉDITOS
    public void creditos() {
        System.out.println("\n=== CRÉDITOS ===");
        System.out.println("Desenvolvido por: Kauã, João e Denner");
        System.out.println("Disciplina: Algoritmos e Programação");
        System.out.println("Tema: RPG Educativo - Aprendendo If/Else");
    }

    // SAIR
    public void sair() {
        System.out.println("\nEncerrando o jogo...");
    }

    // ================= JOGAR =================
    public void jogar() {
        System.out.println("\n=== CAPÍTULO 1: O PRIMEIRO IF ===");
        System.out.println("Você está diante de duas alavancas:");
        System.out.println("1 - Puxar a alavanca 'if'");
        System.out.println("2 - Puxar a alavanca 'else'");
        System.out.print("Escolha: ");
        int escolha = sc.nextInt();

        if (escolha == 1) {
            System.out.println("A muralha se abre. Você dominou o 'if'!");
            conhecimento += 2;
        } else {
            System.out.println("Você caiu num labirinto de erros... cuidado com o 'else' mal usado!");
            conhecimento += 1;
        }
    }
}