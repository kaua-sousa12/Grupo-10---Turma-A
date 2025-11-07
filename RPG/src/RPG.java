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

        capituloUm();

        if (vida <= 0) return;
        capituloDois();

        if (vida <= 0) return;
        capituloTres();

        if (vida <= 0) return;
        capitulo4();
    }

    // ==================== CAPÍTULO 1 ====================
    private void capituloUm() {
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
        pausar(1000);
        System.out.println("\n1 - Nada será executado.");
        System.out.println("2 - O bloco dentro do 'else' será executado.");
        System.out.println("3 - O programa entra em loop infinito.");

        boolean acertou = false;
        while (!acertou && vida > 0) {
            System.out.print("\nEscolha: ");
            int resposta = sc.nextInt();

            if (resposta == 2) {
                System.out.println("\nOs capangas se surpreendem!");
                pausar(1000);
                System.out.println("“Correto! O bloco 'else' é executado quando todas as condições anteriores são falsas!”");
                pausar(1500);
                System.out.println("Você derrotou os capangas com lógica pura! +3 de conhecimento!");
                conhecimento += 3;
                acertou = true;
            } else {
                System.out.println("\nOs capangas riem alto: “ERRADO!”");
                pausar(1000);
                System.out.println("O chão se parte, revelando uma armadilha cheia de exceções fatais!");
                pausar(1500);

                int dano = (int) (Math.random() * 3) + 1; // dano entre 1 e 3
                vida -= dano;
                System.out.println("Você sofreu " + dano + " de dano! Vida atual: " + vida);
                pausar(1000);

                if (vida <= 0) {
                    System.out.println("\nVocê foi consumido pelo temido ‘NullPointerException’...");
                    pausar(1500);
                    System.out.println("\n*** GAME OVER ***");
                    return;
                }

                System.out.println("\nOs capangas ainda te encaram, esperando uma nova resposta...");
            }
        }

        mostrarStatus();
    }

    // ==================== CAPÍTULO 2 ====================
    private void capituloDois() {
        System.out.println("\n=== CAPÍTULO 2 – O DESAFIO LÓGICO DOS PORTAIS ===");
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
        String resposta = sc.next().toUpperCase();

        switch (resposta) {
            case "A" -> {
                System.out.println("\nO portal da Luz se abre diante de você!");
                pausar(1000);
                System.out.println("Um robô chamado Byte surge e se junta a você, oferecendo dicas em batalha!");
                conhecimento += 3;
            }
            case "B" -> {
                System.out.println("\nSua resposta ativa o portal da Sombra...");
                pausar(1500);
                System.out.println("Você sente um poder sombrio fluir, mas o código ao redor começa a se distorcer!");
                int dano = (int) (Math.random() * 3) + 1;
                vida -= dano;
                conhecimento += 2;
                System.out.println("Você ganhou +2 de conhecimento, mas perdeu " + dano + " de vida!");
            }
            case "C" -> {
                System.out.println("\nO portal do Eco ressoa com sua resposta...");
                pausar(1500);
                System.out.println("Um som distante revela um atalho secreto para o castelo do Rei dos Bugs!");
                conhecimento += 4;
            }
            default -> {
                System.out.println("\nO portal vibra violentamente!");
                pausar(1500);
                System.out.println("O chão se abre e o sistema entra em colapso!");
                pausar(1500);
                System.out.println("Você é lançado de volta ao início do jogo com uma mensagem piscando:");
                System.out.println("\"Nem todo caminho é seguro quando o caso é errado.\"");
                vida = 0;
                return;
            }
        }

        mostrarStatus();
    }

    // ==================== CAPÍTULO 3 ====================
    private void capituloTres() {
        System.out.println("\n=== CAPÍTULO 3 – O CÓDIGO PERDIDO ===");
        pausar(1200);
        System.out.println("Nas ruínas próximas ao Templo Switch, você encontra uma antiga torre de dados...");
        pausar(1500);
        System.out.println("Dentro dela, há um terminal piscando com uma mensagem:");
        System.out.println("\"Arquivo perdido: Source_Origin.sys.\"");
        pausar(2000);
        System.out.println("Cortanix surge diante de você, com expressão preocupada...");
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
            System.out.println("O arquivo começa a se reconstituir, mas pequenas falhas permanecem...");
            conhecimento += 2;
        } else if (escolha == 2) {
            System.out.println("\nVocê acessa o código manualmente...");
            pausar(1500);
            System.out.println("int x = 5, y = 10;");
            System.out.println("if (x * 2 == y || y / x == 3)");
            System.out.println("    System.out.println(\"Verdade Revelada\");");
            System.out.println("else if (y - x == 5 && !(x == 5))");
            System.out.println("    System.out.println(\"Engano Detectado\");");
            System.out.println("else");
            System.out.println("    System.out.println(\"Falha no Sistema\");");
            System.out.print("\nO que será exibido? ");
            String resposta = sc.next().toUpperCase();

            switch (resposta) {
                case "VERDADE", "VERDADE REVELADA":
                    System.out.println("\nVocê descobre segredos ocultos em System32...");
                    conhecimento += 4;
                    break;
                case "ENGANO", "ENGANO DETECTADO":
                    int dano = (int) (Math.random() * 4) + 2;
                    vida -= dano;
                    System.out.println("\nErro lógico! Você perde " + dano + " de vida!");
                    conhecimento += 1;
                    break;
                default:
                    dano = (int) (Math.random() * 5) + 3;
                    vida -= dano;
                    System.out.println("\nFalha crítica no sistema! -" + dano + " de vida!");
                    if (vida <= 0) {
                        System.out.println("*** GAME OVER ***");
                        return;
                    }
            }
        } else {
            int dano = (int) (Math.random() * 3) + 1;
            vida -= dano;
            System.out.println("\nVocê hesita e o arquivo se fecha. -" + dano + " de vida.");
        }

        mostrarStatus();
    }

    // ==================== CAPÍTULO 4 ====================
    private void capitulo4() {
        Scanner sc = new Scanner(System.in);
        int vitorias = 0;
        int derrotas = 0;
        String resposta;

        System.out.println("\n=== CAPÍTULO 4 – A CÓPIA CORROMPIDA ===");

        pausar(2000);
        System.out.println("No Setor de Memória Profunda, você encontra uma cópia defeituosa de si mesmo...");

        pausar(1500);
        System.out.println("a) Enfrentar a cópia em um duelo de lógica.");
        System.out.println("b) Conversar e tentar convencê-la a ajudar.");
        System.out.print("Escolha: ");
        String opcao = sc.nextLine().toUpperCase();

        if (opcao.equals("B")) {
            System.out.println("\nVocê tenta se aproximar da cópia, falando com calma...");
            pausar(1500);
            System.out.println("Cópia: \"Eu... lembro de você. Mas fui criado para te deter...\"");
            pausar(1500);
            System.out.println("Você mostra o código original e explica o plano para restaurar o sistema.");
            pausar(1500);
            System.out.println("Por um instante, os olhos digitais da cópia mudam de cor.");
            pausar(1200);
            System.out.println("Cópia: \"Talvez... eu ainda possa ajudar.\"");
            pausar(1200);
            System.out.println("A cópia se une a você, trazendo fragmentos de memória esquecidos.");
            pausar(1500);
            System.out.println("Cortanix: \"Incrível! Ela ainda possui parte do Source_Origin.sys. Vamos integrá-la.\"");
            pausar(1500);
            System.out.println("Você ganhou +3 de conhecimento!");
            conhecimento += 3;
            return;
        }

        // --- CASO A: DUELO DE LÓGICA ---
        System.out.println("\nVocê decide enfrentar a cópia em um duelo de lógica!");
        pausar(1000);

        // --- RODADA 1 ---
        System.out.println("Rodada 1 – Condições Aninhadas");
        pausar(500);
        System.out.println("""
        int vida = 10;
        int defesa = 5;
        
        if (vida > 0)
            if (defesa > 10)
                System.out.println("Protegido!");
        else
            System.out.println("Inconsciente!");
        """);
        pausar(1000);
        System.out.println("Pergunta: O que será impresso?");
        System.out.println("a) Protegido!");
        System.out.println("b) Inconsciente!");
        System.out.println("c) Nada será impresso.");

        boolean acertou1 = false;
        while (!acertou1 && vida > 0) {
            System.out.print("➡ Sua resposta: ");
            resposta = sc.nextLine();

            if (resposta.equalsIgnoreCase("c")) {
                System.out.println("Correto! O 'else' pertence ao segundo if e não será executado.");
                vitorias++;
                acertou1 = true;
            } else {
                int dano = (int) (Math.random() * 3) + 1;
                vida -= dano;
                derrotas++;
                System.out.println("Errado! A indentação engana, mas o else não cobre o primeiro if.");
                System.out.println("Você sofreu " + dano + " de dano! Vida atual: " + vida);

                if (vida <= 0) {
                    System.out.println("\nVocê foi derrotado pela cópia... GAME OVER!");
                    return;
                }
                if (derrotas == 2) {
                    System.out.println("\nA cópia sobrecarrega o sistema e você é desconectado...");
                    return;
                }
            }
        }

        pausar(1500);

        // --- RODADA 2 ---
        System.out.println("\n⚡ Rodada 2 – Mistura de condições");
        pausar(500);
        System.out.println("""
        int energia = 5;
        int modoFuria = 3;
        
        if (energia > 4 || modoFuria > 5)
            System.out.println("Ataque liberado!");
        else
            System.out.println("Energia insuficiente!");
        """);
        pausar(1000);
        System.out.println("Pergunta: O que será impresso?");
        System.out.println("a) Ataque liberado!");
        System.out.println("b) Energia insuficiente!");
        System.out.println("c) Nenhuma mensagem.");

        boolean acertou2 = false;
        while (!acertou2 && vida > 0) {
            System.out.print("➡ Sua resposta: ");
            resposta = sc.nextLine();

            if (resposta.equalsIgnoreCase("a")) {
                System.out.println("Correto! O operador || torna a condição verdadeira com energia > 4.");
                vitorias++;
                acertou2 = true;
            } else {
                int dano = (int) (Math.random() * 3) + 1;
                vida -= dano;
                derrotas++;
                System.out.println("Errado! Apenas uma condição já bastava.");
                System.out.println("Você sofreu " + dano + " de dano! Vida atual: " + vida);

                if (vida <= 0) {
                    System.out.println("\nVocê foi derrotado pela cópia... GAME OVER!");
                    return;
                }
                if (derrotas == 2) {
                    System.out.println("\nA cópia sobrecarrega o sistema e você é desconectado...");
                    return;
                }
            }
        }

        pausar(1500);

        // --- RODADA 3 ---
        System.out.println("\n Rodada Final – Decisão Múltipla");
        pausar(500);
        System.out.println("""
        int codigo = 42;
        
        if (codigo < 20)
            System.out.println("Código Fraco");
        else if (codigo < 40)
            System.out.println("Código Regular");
        else
            System.out.println("Código Forte");
        """);
        pausar(1000);
        System.out.println("Pergunta: O que será impresso?");
        System.out.println("a) Código Fraco");
        System.out.println("b) Código Regular");
        System.out.println("c) Código Forte");

        boolean acertou3 = false;
        while (!acertou3 && vida > 0) {
            System.out.print("➡ Sua resposta: ");
            resposta = sc.nextLine();

            if (resposta.equalsIgnoreCase("c")) {
                System.out.println("Correto! O 'else' final é executado pois nenhuma condição anterior é verdadeira.");
                vitorias++;
                acertou3 = true;
            } else {
                int dano = (int) (Math.random() * 3) + 1;
                vida -= dano;
                derrotas++;
                System.out.println("Errado! 42 não é menor que 40.");
                System.out.println("Você sofreu " + dano + " de dano! Vida atual: " + vida);

                if (vida <= 0) {
                    System.out.println("\nVocê foi derrotado pela cópia... GAME OVER!");
                    return;
                }
                if (derrotas == 2) {
                    System.out.println("\nA cópia sobrecarrega o sistema e você é desconectado...");
                    return;
                }
            }
        }

        // RESULTADO FINAL
        System.out.println("\nResultado Final:");
        System.out.println("Vitórias: " + vitorias);
        System.out.println("Derrotas: " + derrotas);

        pausar(1200);
        if (vitorias >= 2) {
            System.out.println("\nVocê superou a cópia! O fragmento de código é restaurado.");
            System.out.println("Cortanix: \"Excelente... agora podemos acessar a próxima camada do sistema.\"");
            conhecimento += 5;
        } else {
            System.out.println("\nA cópia te venceu. O setor permanece corrompido...");
            System.out.println("Cortanix: \"Não... perdemos a conexão com o Source_Origin.sys.\"");
            vida = 0;
        }
    }

    // ==================== STATUS ====================
    private void mostrarStatus() {
        pausar(1000);
        System.out.println("\n--- STATUS ATUAL ---");
        System.out.println("Vida: " + vida);
        System.out.println("Conhecimento: " + conhecimento);
        pausar(1000);
    }
}