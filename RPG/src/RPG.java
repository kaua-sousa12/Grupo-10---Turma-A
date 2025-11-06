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

            opcao = sc.nextInt();

            switch (opcao) {
                case 1:
                    instrucoes();
                    break;
                case 2:
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
                }""");
        pausar(1500);

        System.out.println("\nE perguntam:");
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

        // Capítulo 2 – O Desafio Lógico dos Portais
        System.out.println("\nCapítulo 2 – O Desafio Lógico dos Portais");
        pausar(1200);
        System.out.println("Após atravessar as ruínas do Templo Switch, você encontra uma parede de código enigmática...");
        pausar(1500);
        System.out.println("Nela, uma voz digital ecoa:");
        System.out.println("\"Apenas quem entende a lógica poderá escolher o portal certo.\"");
        pausar(1500);
        System.out.println("\nAparece a pergunta na tela:");
        pausar(1000);
        System.out.println("Se uma variável 'x' vale 10 e 'y' vale 5, o que o seguinte código imprime?");
        System.out.println("\nif (x > y && y * 2 == x)");
        System.out.println("    System.out.println(\"A\");");
        System.out.println("else if (x == y)");
        System.out.println("    System.out.println(\"B\");");
        System.out.println("else");
        System.out.println("    System.out.println(\"C\");");
        System.out.print("\nQual letra será exibida? ");
        String respostaLogica = sc.next().toUpperCase();

        pausar(1000);
        System.out.println("\nOs portais começam a brilhar de acordo com sua resposta...");
        pausar(1500);

        // O portal é escolhido automaticamente conforme a resposta
        switch (respostaLogica) {
            case "A":
                System.out.println("\nO portal da Luz se abre diante de você!");
                pausar(1000);
                System.out.println("Um robô chamado Byte surge e se junta a você, oferecendo dicas em batalha!");
                conhecimento += 3;
                break;

            case "B":
                System.out.println("\nSua resposta ativa o portal da Sombra...");
                pausar(1500);
                System.out.println("Você sente um poder sombrio fluir, mas o código ao redor começa a se distorcer!");
                int dano = (int) (Math.random() * 3) + 1;
                vida -= dano;
                conhecimento += 2;
                System.out.println("Você ganhou +2 de conhecimento, mas perdeu " + dano + " de vida!");
                break;

            case "C":
                System.out.println("\nO portal do Eco ressoa com sua resposta...");
                pausar(1500);
                System.out.println("Um som distante revela um atalho secreto para o castelo do Rei dos Bugs!");
                conhecimento += 4;
                break;

            default:
                System.out.println("\nO portal vibra violentamente!");
                pausar(1500);
                System.out.println("O chão se abre e o sistema entra em colapso!");
                pausar(1500);
                System.out.println("Você é lançado de volta ao início do jogo com uma mensagem piscando:");
                System.out.println("\"Nem todo caminho é seguro quando o caso é errado.\"");
                vida = 0;
                return;
        }

        // === CAPÍTULO 3 – O CÓDIGO PERDIDO ===
        System.out.println("\n=== CAPÍTULO 3 – O CÓDIGO PERDIDO ===");
        pausar(1200);
        System.out.println("Nas ruínas próximas ao Templo Switch, você encontra uma antiga torre de dados.");
        pausar(1500);
        System.out.println("Dentro dela, há um terminal piscando com uma mensagem:");
        System.out.println("\"Arquivo perdido: Source_Origin.sys.\"");
        pausar(2000);
        System.out.println("Cortanix surge diante de você, com expressão preocupada...");
        pausar(1500);
        System.out.println("\"Esse arquivo contém parte da lógica original do sistema...\"");
        pausar(1500);
        System.out.println("\"Mas o Rei dos Bugs tentou apagá-lo completamente.\"");
        pausar(1500);
        System.out.println("\nVocê precisa decidir como recuperá-lo:");
        System.out.println("1 - Restaurar o arquivo com um comando de reparo.");
        System.out.println("2 - Acessar o código manualmente para entender sua estrutura.");
        System.out.print("Escolha: ");
        int escolha = sc.nextInt();
        pausar(1000);

        if (escolha == 1) {
            System.out.println("\nVocê digita: System.restore('Source_Origin.sys');");
            pausar(1500);
            System.out.println("O arquivo começa a se reconstituir, bits e linhas de código se realocam...");
            pausar(1500);
            System.out.println("Mas algo parece... incompleto. Algumas falhas permanecem.");
            conhecimento += 2;
            pausar(1500);
            System.out.println("Cortanix diz: \"Você fez bem, mas talvez o Rei dos Bugs tenha deixado algo escondido.\"");
        } else if (escolha == 2) {
            System.out.println("\nVocê acessa o código manualmente, linha por linha...");
            pausar(1500);
            System.out.println("O terminal mostra instruções complexas:");
            System.out.println("\nint x = 5, y = 10;");
            System.out.println("if (x * 2 == y || y / x == 3)");
            System.out.println("    System.out.println(\"Verdade Revelada\");");
            System.out.println("else if (y - x == 5 && !(x == 5))");
            System.out.println("    System.out.println(\"Engano Detectado\");");
            System.out.println("else");
            System.out.println("    System.out.println(\"Falha no Sistema\");");
            System.out.print("\nO que será exibido no console? ");
            String resposta3 = sc.next().toUpperCase();

            switch (resposta3) {
                case "VERDADE":
                case "VERDADE REVELADA":
                    System.out.println("\nO terminal emite um som agudo!");
                    pausar(1500);
                    System.out.println("Linhas ocultas aparecem: comentários antigos do criador de System32...");
                    pausar(1500);
                    System.out.println("Você descobre que o Rei dos Bugs não foi o primeiro erro — havia outro programador.");
                    conhecimento += 4;
                    break;

                case "ENGANO":
                case "ENGANO DETECTADO":
                    System.out.println("\nO código pisca em vermelho. Algo está errado!");
                    pausar(1500);
                    System.out.println("Parte do arquivo se perde e Cortanix grita: \"Saia daí! É uma armadilha lógica!\"");
                    int danoEngano = (int) (Math.random() * 4) + 2; // dano aleatório entre 2 e 5
                    vida -= danoEngano;
                    System.out.println("Você perde " + danoEngano + " de vida tentando escapar!");
                    conhecimento += 1;
                    break;

                default:
                    System.out.println("\nO sistema entra em colapso total!");
                    pausar(1500);
                    System.out.println("O terminal exibe: \"Falha no Sistema\" e o arquivo se autodeleta.");
                    int danoFalha = (int) (Math.random() * 5) + 3; // dano maior para erro grave
                    vida -= danoFalha;
                    System.out.println("O colapso causa " + danoFalha + " de dano!");
                    if (vida <= 0) {
                        System.out.println("*** GAME OVER ***");
                        return;
                    }
                    break;
            }

        } else {
            System.out.println("\nVocê hesita e o terminal entra em modo de segurança...");
            pausar(1000);
            int danoHesito = (int) (Math.random() * 3) + 1; // leve penalidade
            vida -= danoHesito;
            System.out.println("O arquivo se fecha para sempre e você perde " + danoHesito + " de vida.");
        }

        pausar(1500);
        System.out.println("\n--- STATUS ATUAL ---");
        System.out.println("Vida: " + vida);
        System.out.println("Conhecimento: " + conhecimento);
        pausar(1500);

        System.out.println("\nCortanix olha para o horizonte de dados e murmura:");
        pausar(1500);
        System.out.println("\"O Rei dos Bugs... ele não foi o primeiro erro. Há algo mais profundo em System32.\"");
        pausar(1500);
        System.out.println("O som de linhas sendo compiladas ecoa pela torre...");
        pausar(1500);
        System.out.println("Você sente que a verdadeira origem do caos está prestes a ser revelada...");
    }
}
