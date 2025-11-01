import java.util.Scanner;

public class RPG {
    Scanner sc = new Scanner(System.in);
    int conhecimento = 0;
    // VARIÁVEL ADICIONADA: Vida do Cavaleiro
    int vida = 10;

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

            // Tratamento básico para garantir que a entrada seja um inteiro
            if (sc.hasNextInt()) {
                opcao = sc.nextInt();
            } else {
                // Se não for um inteiro, define uma opção inválida e limpa o buffer
                opcao = 0;
                sc.next();
            }

            // Limpa a linha pendente após a leitura de nextInt()
            // sc.nextLine();

            switch (opcao) {
                case 1:
                    instrucoes();
                    break;
                case 2:
                    // Reseta os valores antes de jogar
                    conhecimento = 0;
                    vida = 10;
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
        System.out.println("Respostas corretas aumentam seu conhecimento. Erros causam DANO!");
        System.out.println("Sua vida inicial é " + vida + ".");
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

    // JOGAR
    // ==================== JOGAR ====================
    public void jogar() {

        // -- INTRODUÇÃO (NOVA HISTÓRIA) --
        System.out.println("\n--------------------------------------\nVocê acorda em meio a um clarão azul, sua visão ainda está embaralhada...");
        System.out.println("...quando percebe: está dentro de um mundo feito de linhas de código, janelas flutuantes e pastas brilhantes.");
        System.out.println("O chão parece feito de circuitos, e o céu pulsa como uma tela de computador.");

        System.out.println("\nUma voz ecoa:");
        System.out.println("“Bem-vindo, jovem programador, você foi transportado para o Reino de System32.");
        System.out.println("Aqui, o caos reina desde que o Rei dos Bugs corrompeu o código-mestre.”");

        System.out.println("A voz se identifica como Cortanix, a guardiã do sistema.");
        System.out.println("Ela explica que para restaurar a ordem, você precisa dominar os comandos condicionais:");
        System.out.println("as forças que regem o equilíbrio desse mundo: if/else e switch/case.");

        System.out.println("\n--- STATUS INICIAL ---");
        System.out.println("Vida: " + vida);
        System.out.println("Conhecimento: " + conhecimento);

        // --- CAPÍTULO 1: O PRIMEIRO IF (Com Histórico e Escolha) ---
        System.out.println("\n=== CAPÍTULO 1 – O PRIMEIRO IF ===");
        System.out.println("Você chega a uma vila chamada InputVille. Os habitantes correm em pânico.");

        System.out.println("\nUm velho programador se aproxima:");
        System.out.println("“As portas da Muralha Lógica foram trancadas! Só podem ser abertas por quem entende o poder do ‘se… então… senão…’.”");

        System.out.println("\nVocê encontra duas alavancas:");
        System.out.println("1 - Puxar a alavanca marcada com “if”");
        System.out.println("2 - Puxar a alavanca marcada com “else”");
        System.out.print("Escolha: ");
        int escolha = sc.nextInt();

        if (escolha == 1) {
            System.out.println("\nA muralha brilha e abre lentamente, você fez a escolha lógica. Conhecimento +2.");
            conhecimento += 2;
        } else {
            int dano = 2;
            vida -= dano;
            System.out.println("\nO chão se abre! Você foi arremessado para um labirinto de erros, lendo mensagens como 'Syntax Error'.");
            System.out.println("Você perdeu " + dano + " de vida para escapar!");
            conhecimento += 1;
        }

        // Cortanix reaparece
        System.out.println("\nCortanix reaparece:");
        System.out.println("“Aprenda, jovem. Cada escolha lógica abre um caminho diferente.”");

        // --- VERIFICAÇÃO DE MORTE APÓS CAPÍTULO 1 ---
        if (vida <= 0) {
            System.out.println("\n*** GAME OVER ***");
            System.out.println("Seu cavaleiro foi consumido pelos erros do Capítulo 1.");
            return; // Termina o método jogar()
        }

        System.out.println("\n--- STATUS ATUAL ---");
        System.out.println("Vida: " + vida);
        System.out.println("Conhecimento: " + conhecimento);


        // === CAPÍTULO 2: O REI DOS BUGS (PERGUNTA CORRIGIDA) ===
        boolean chavePresente = false;
        System.out.println("\n=== CAPÍTULO 2: O REI DOS BUGS (Ponte Levadiça) ===");
        // ... (restante do código do Capítulo 2 - com a nova lógica) ...

        System.out.println("\nO Rei dos Bugs bloqueou a ponte. Você deve usar a lógica reversa.");
        System.out.println("O estado atual da chave para a ponte é: boolean chavePresente = " + chavePresente + ";");

        // A pergunta de lógica:
        System.out.println("\nQual é o 'if' correto para fazer a ponte baixar AGORA?");
        System.out.println("\n1 - if (chavePresente == false)");
        System.out.println("2 - if (chavePresente == true)");
        System.out.print("Escolha: ");
        int resposta = sc.nextInt();

        if (resposta == 1) { // RESPOSTA CORRETA, pois 'chavePresente' é 'false'
            System.out.println("Lógica dominada! O compilador aceita a condição 'false' e a ponte baixa!");
            conhecimento += 3;
        } else {
            // APLICA DANO AO ERRAR
            int dano = 4;
            vida -= dano;
            System.out.println("Lógica incorreta! A ponte não se move. O Rei dos Bugs lhe causa " + dano + " de dano!");
            conhecimento -= 1;
        }

        // --- VERIFICAÇÃO DE MORTE APÓS CAPÍTULO 2 ---
        if (vida <= 0) {
            System.out.println("\n*** GAME OVER ***");
            System.out.println("Seu cavaleiro sucumbiu ao Rei dos Bugs. Tente novamente!");
            return;
        }
    }
}