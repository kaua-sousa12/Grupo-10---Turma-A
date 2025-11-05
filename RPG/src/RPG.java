import java.util.Scanner;

public class RPG {
    Scanner sc = new Scanner(System.in);
    int conhecimento = 0;
    int vida = 10;

    // Função de pausa personalizada
    private void pausar(long ms) {
        try {
            Thread.sleep(ms);
        } catch (InterruptedException e) {
            Thread.currentThread().interrupt();
        }
    }

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

            if (sc.hasNextInt()) {
                opcao = sc.nextInt();
            } else {
                opcao = 0;
                sc.next();
            }

            switch (opcao) {
                case 1 -> instrucoes();
                case 2 -> {
                    conhecimento = 0;
                    vida = 10;
                    jogar();
                }
                case 3 -> creditos();
                case 4 -> sair();
                default -> System.out.println("Opção inválida. Tente novamente.");
            }

        } while (opcao != 4);
    }

    public void instrucoes() {
        System.out.println("\n=== INSTRUÇÕES ===");
        System.out.println("Você é o Cavaleiro do Código, enviado para restaurar a lógica em System32!");
        System.out.println("Durante o jogo, você fará escolhas baseadas em estruturas condicionais (if/else).");
        System.out.println("Respostas corretas aumentam seu conhecimento. Erros causam DANO!");
        System.out.println("Sua vida inicial é " + vida + ".");
        System.out.println("Boa sorte, programador!");
    }

    public void creditos() {
        System.out.println("\n=== CRÉDITOS ===");
        System.out.println("Desenvolvido por: Kauã, João e Denner");
        System.out.println("Disciplina: Algoritmos e Programação");
        System.out.println("Tema: RPG Educativo - Aprendendo If/Else");
    }

    public void sair() {
        System.out.println("\nEncerrando o jogo...");
    }

    // ==================== JOGAR ====================
    public void jogar() {

        System.out.println("\n--------------------------------------");
        pausar(1000);
        System.out.println("Você acorda em meio a um clarão azul...");
        pausar(2500);
        System.out.println("Sua visão ainda está embaralhada, o chão parece feito de circuitos...");
        pausar(2500);
        System.out.println("E o céu pulsa como uma tela de computador.");
        pausar(2000);

        System.out.println("\nUma voz ecoa:");
        pausar(1000);
        System.out.println("“Bem-vindo, jovem programador, você foi transportado para o Reino de System32.”");
        pausar(2000);
        System.out.println("“Aqui, o caos reina desde que o Rei dos Bugs corrompeu o código-mestre.”");
        pausar(2000);
        System.out.println("A voz se identifica como Cortanix, a guardiã do sistema...");
        pausar(2000);

        System.out.println("\n--- STATUS INICIAL ---");
        System.out.println("Vida: " + vida);
        System.out.println("Conhecimento: " + conhecimento);
        pausar(1500);

        // === CAPÍTULO 1: A ARMADILHA LÓGICA ===
        System.out.println("\n=== CAPÍTULO 1 – A ARMADILHA LÓGICA ===");
        pausar(1000);
        System.out.println("Você entra na Floresta Binária, onde os dados flutuam no ar...");
        pausar(1500);
        System.out.println("De repente, três CAPANGAS do Reino dos Bugs surgem e bloqueiam seu caminho!");
        pausar(1500);
        System.out.println("\nO líder deles ri:");
        pausar(1000);
        System.out.println("“Se quer passar, responda corretamente, pequeno dev! Vamos ver se entende de lógica!”");
        pausar(1500);

        System.out.println("\nEles mostram uma placa com o seguinte código:");
        pausar(1000);
        System.out.println("""
if (condicao1) {
    // faz algo
} else if (condicao2) {
    // faz outra coisa
} else {
    // ????
}
""");
        pausar(1500);

        System.out.println("E perguntam:");
        System.out.println("“Se as condições 'condicao1' e 'condicao2' forem FALSAS, o que será executado?”");
        System.out.println("\n1 - Nada será executado.");
        System.out.println("2 - O bloco dentro do 'else' será executado.");
        System.out.println("3 - O programa entra em loop infinito.");
        System.out.print("Escolha: ");
        int resposta = sc.nextInt();

        if (resposta == 2) {
            System.out.println("\nOs capangas se surpreendem!");
            pausar(1000);
            System.out.println("“Correto! O bloco 'else' é executado quando todas as condições anteriores são falsas!”");
            pausar(1500);
            System.out.println("Você derrotou os capangas com lógica pura! +3 de conhecimento!");
            conhecimento += 3;
        } else {
            System.out.println("\nOs capangas riem alto: “ERRADO!”");
            pausar(1000);
            System.out.println("O chão se parte, revelando uma armadilha cheia de exceções fatais!");
            pausar(1500);
            System.out.println("Você cai e é consumido pelo temido ‘NullPointerException’...");
            pausar(1500);
            System.out.println("\n*** GAME OVER ***");
            System.out.println("\nOs capangas retornam ao castelo do Rei dos Bugs, celebrando sua derrota.");
            vida = 0;
            return;
        }
        pausar(1500);

        System.out.println("\nCortanix aparece e diz:");
        pausar(1000);
        System.out.println("“Você está aprendendo rápido, jovem programador. Mas o Rei dos Bugs ainda o aguarda...”");
        pausar(1500);

        System.out.println("\n--- STATUS ATUAL ---");
        System.out.println("Vida: " + vida);
        System.out.println("Conhecimento: " + conhecimento);
        pausar(1500);

        // === CAPÍTULO 2 ===
        boolean chavePresente = false;
        System.out.println("\n=== CAPÍTULO 2: O REI DOS BUGS (Ponte Levadiça) ===");
        pausar(1000);
        System.out.println("\nO Rei dos Bugs bloqueou a ponte. Você deve usar a lógica reversa.");
        pausar(1000);
        System.out.println("O estado atual da chave para a ponte é: boolean chavePresente = " + chavePresente + ";");
        pausar(1000);

        System.out.println("\nQual é o 'if' correto para fazer a ponte baixar AGORA?");
        System.out.println("1 - if (chavePresente == false)");
        System.out.println("2 - if (chavePresente == true)");
        System.out.print("Escolha: ");
        resposta = sc.nextInt();

        if (resposta == 1) {
            System.out.println("Lógica dominada! O compilador aceita a condição 'false' e a ponte baixa!");
            conhecimento += (int)(Math.random() * 4) + 1;
        } else {
            int dano = (int)(Math.random() * 4) + 1;
            vida -= dano;
            System.out.println("Lógica incorreta! O Rei dos Bugs lhe causa " + dano + " de dano!");
            conhecimento -= 1;
        }

        if (vida <= 0) {
            System.out.println("\n*** GAME OVER ***");
            System.err.println("Seu cavaleiro sucumbiu ao Rei dos Bugs. Tente novamente!");
        }
    }
}
