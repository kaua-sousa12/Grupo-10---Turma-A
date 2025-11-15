import java.util.*;

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
        printPause("\n--------------------------------------", 1500);
        printPause("Você acorda em meio a um clarão azul...", 2500);
        printPause("Sua visão ainda está embaralhada, o chão parece feito de circuitos...", 2500);
        printPause("E o céu pulsa como uma tela de computador.", 2000);
        printPause("\nUma voz ecoa:", 1500);
        printPause("“Bem-vindo, jovem programador, você foi transportado para o Reino de System32.”", 2000);
        printPause("“Aqui, o caos reina desde que o Rei dos Bugs corrompeu o código-mestre.”", 2000);
        printPause("A voz se identifica como Cortanix, a guardiã do sistema...", 2000);

        System.out.println("\n--- STATUS INICIAL ---");
        System.out.println("Vida: " + vida);
        System.out.println("Conhecimento: " + conhecimento);
        pausar(1500);

        capitulo1();

        if (vida <= 0) return;
        capitulo2();

        if (vida <= 0) return;
        capitulo3();

        if (vida <= 0) return;
        capitulo4();

        capitulo5();
        if (vida <= 0) return;

        capitulo6();
        if (vida <= 0) return;

    }

    private void verificarVida() {
        if (vida <= 0) {
            System.out.println("\n💀 Sua vida chegou a 0...");
            System.out.println("*** GAME OVER ***");
            pausar(1500);

            Scanner sc = new Scanner(System.in);
            System.out.print("\nDeseja tentar novamente? (s/n): ");
            String resposta = sc.nextLine().trim().toLowerCase();

            if (resposta.equals("s")) {
                System.out.println("\nReiniciando o jogo...");
                pausar(2000);
                vida = 10; // vida inicial
                conhecimento = 0; // reset do progresso
                jogar(); // volta para o início
            } else {
                System.out.println("\nEncerrando sessão...");
                pausar(1500);
                System.exit(0);
            }
        }
    }

    // Método que imprime e pausa automaticamente
    private void printPause(String texto, long ms) {
        System.out.println(texto);
        pausar(ms);
    }

    // ==================== CAPÍTULO 1 ====================
    private void capitulo1() {
        printPause("\n=== CAPÍTULO 1 – A ARMADILHA LÓGICA ===", 2000);
        printPause("Você entra na Floresta Binária, onde os dados flutuam no ar...", 2500);
        printPause("De repente, três CAPANGAS do Reino dos Bugs surgem e bloqueiam seu caminho!", 2500);
        printPause("\nO líder deles ri:", 2000);
        printPause("“Se quer passar, responda corretamente, pequeno dev! Vamos ver se entende de lógica!”", 2500);

        ArrayList<String[]> perguntas = new ArrayList<>();

        perguntas.add(new String[]{
                """
if (condicao1) {
   // faz algo
} else if (condicao2) {
    // faz outra coisa
} else {
    // ???? 
}
""",
                "Se as condições 'condicao1' e 'condicao2' forem FALSAS, o que será executado?",
                "1 - Nada será executado.",
                "2 - O bloco dentro do 'else' será executado.",
                "3 - O programa entra em loop infinito.",
                "2"
        });

        perguntas.add(new String[]{
                """
int x = 5;
if (x > 10) {
    System.out.println("Maior que 10");
} else {
    System.out.println("Menor ou igual a 10");
}
""",
                "O que será impresso na tela?",
                "1 - Maior que 10",
                "2 - Menor ou igual a 10",
                "3 - Nenhum dos dois",
                "2"
        });

        perguntas.add(new String[]{
                """
boolean teste = false;
if (teste) {
    System.out.println("Verdadeiro");
} else {
    System.out.println("Falso");
}
""",
                "O que será impresso?",
                "1 - Verdadeiro",
                "2 - Falso",
                "3 - Erro de compilação",
                "2"
        });

        Random random = new Random();
        String[] questao = perguntas.get(random.nextInt(perguntas.size()));

        printPause("\nOs capangas mostram uma placa com o seguinte código:", 2000);
        printPause(questao[0], 2000);

        System.out.println("\nE perguntam:");
        printPause(questao[1], 2500);
        System.out.println("\n" + questao[2]);
        System.out.println(questao[3]);
        System.out.println(questao[4]);

        boolean acertou = false;
        while (!acertou && vida > 0) {
            System.out.print("\nEscolha: ");
            int resposta = sc.nextInt();

            if (String.valueOf(resposta).equals(questao[5])) {
                printPause("\nOs capangas se surpreendem!", 2000);
                printPause("“Correto! Sua lógica é afiada, jovem dev!”", 2000);
                printPause("Você derrotou os capangas com sabedoria! +3 de conhecimento!", 2000);
                conhecimento += 3;
                acertou = true;
            } else {
                printPause("\nOs capangas riem alto: “ERRADO!”", 2000);
                printPause("O chão se parte, revelando uma armadilha cheia de exceções fatais!", 2000);

                int dano = (int) (Math.random() * 3) + 1;
                vida -= dano;
                printPause("Você sofreu " + dano + " de dano! Vida atual: " + vida, 2000);

                if (vida <= 0) {
                    printPause("\nVocê foi consumido pelo temido ‘NullPointerException’...", 2000);
                    System.out.println("\n*** GAME OVER ***");
                    return;
                }

                System.out.println("\nOs capangas ainda te encaram, esperando uma nova resposta...");
            }
        }

        printPause("\nAssim que você pensa ter vencido...", 2000);
        printPause("Mais DOIS capangas escondidos saltam dos arbustos!", 2500);
        printPause("“Achou que era só aquilo? Agora vamos ver se você aguenta lógica de verdade!”", 2500);

        ArrayList<String[]> perguntas2 = new ArrayList<>();

        perguntas2.add(new String[]{
                """
int a = 10;
int b = 20;
if (a < b && b == 20) {
    System.out.println("OK");
} else {
    System.out.println("FAIL");
}
""",
                "O que será impresso?",
                "1 - OK",
                "2 - FAIL",
                "3 - Erro de compilação",
                "1"
        });

        perguntas2.add(new String[]{
                """
int valor = 7;
if (valor % 2 == 0) {
    System.out.println("Par");
} else {
    System.out.println("Ímpar");
}
""",
                "O número 7 é:",
                "1 - Par",
                "2 - Ímpar",
                "3 - Nenhum dos dois",
                "2"
        });

        perguntas2.add(new String[]{
                """
boolean ativo = true;
if (!ativo) {
    System.out.println("Desativado");
} else {
    System.out.println("Ativado");
}
""",
                "O que será impresso?",
                "1 - Ativado",
                "2 - Desativado",
                "3 - Nada",
                "1"
        });

        String[] questao2 = perguntas2.get(random.nextInt(perguntas2.size()));

        printPause("\nOs novos capangas erguem outra placa de código:", 2000);
        printPause(questao2[0], 2000);

        System.out.println("\nE perguntam:");
        printPause(questao2[1], 2500);
        System.out.println("\n" + questao2[2]);
        System.out.println(questao2[3]);
        System.out.println(questao2[4]);

        boolean acertou2 = false;
        while (!acertou2 && vida > 0) {
            System.out.print("\nEscolha: ");
            int resposta = sc.nextInt();

            if (String.valueOf(resposta).equals(questao2[5])) {
                printPause("\nO capanga recua assustado!", 2000);
                printPause("“NÃÃÃO! Ele entende lógica condicional!!”", 2000);
                printPause("Você derrota a segunda onda! +4 conhecimento!", 2000);
                conhecimento += 4;
                acertou2 = true;
            } else {
                printPause("\nO capanga golpeia sua barra de vida com um 'BUG CRÍTICO'!", 2000);

                int dano = (int) (Math.random() * 4) + 2;
                vida -= dano;
                printPause("Você sofreu " + dano + " de dano! Vida atual: " + vida, 2000);

                if (vida <= 0) {
                    printPause("\nVocê sucumbiu diante dos Capangas Avançados...", 2000);
                    System.out.println("\n*** GAME OVER ***");
                    return;
                }

                System.out.println("\nEles aguardam outra resposta...");
            }
        }
        System.out.println("\nCom os capangas derrotados, a floresta se divide em dois caminhos de código brilhante...");
        pausar(2500);
        System.out.println("1 - Caminho da Lógica Clara (seguro, mas simples)");
        System.out.println("2 - Caminho das Condições Corrompidas (arriscado, mas poderoso)");
        System.out.print("\nQual trilha você segue? ");
        int escolha = sc.nextInt();

        if (escolha == 1) {
            System.out.println("\nVocê segue com cautela, analisando cada byte do terreno...");
            pausar(2000);
            System.out.println("A jornada é lenta, mas seu entendimento aumenta. +2 de conhecimento!");
            conhecimento += 2;
        } else {
            System.out.println("\nVocê corre por linhas instáveis de código bugado...");
            pausar(2000);
            System.out.println("Explosões de exceções te cercam! Você ganha +4 conhecimento, mas perde 2 de vida!");
            conhecimento += 4;
            vida -= 2;
        }

        // ==================== BAÚ DE CÓDIGO ====================
        System.out.println("\nNo final do caminho, você encontra um misterioso Baú de Código Antigo...");
        pausar(2000);
        System.out.println("Ele emite luzes coloridas... deseja abri-lo? (s/n)");
        String abrir = sc.next().toLowerCase();

        if (abrir.equals("s")) {
            System.out.println("\nVocê abre o baú lentamente...");
            pausar(2000);

            int recompensa = random.nextInt(3);
            switch (recompensa) {
                case 0:
                    System.out.println("💎 Dentro há um *Fragmento de Conhecimento*! +2 conhecimento!");
                    conhecimento += 2;
                    break;
                case 1:
                    System.out.println("🩸 Você encontra um *Elixir de Debug*! +3 vida!");
                    vida += 3;
                    break;
                case 2:
                    System.out.println("⚙️ Um bug salta do baú e te ataca! -2 vida!");
                    vida -= 2;
                    break;
            }
        } else {
            printPause("\nVocê decide deixar o baú para trás. A sabedoria nem sempre está em abrir tudo...", 2000);
        }

        mostrarStatus();
        verificarVida();
        System.out.println("\n--- Fim do Capítulo 1 ---");
        System.out.println("[Pressione ENTER para continuar]");
        sc.nextLine();
        sc.nextLine();
    }

    // ==================== CAPÍTULO 2 ====================
    private void capitulo2() {
        printPause("\n=== CAPÍTULO 2 – O DESAFIO LÓGICO DOS PORTAIS ===", 2000);
        printPause("Após atravessar as ruínas do Templo Switch, você encontra uma parede de código enigmática...", 2500);
        System.out.println("A voz digital ecoa:");
        printPause("\"Apenas quem domina a lógica poderá escolher o portal correto.\"", 2000);

        // Lista expandida de perguntas
        ArrayList<Pergunta> perguntas = new ArrayList<>();

        perguntas.add(new Pergunta(
                """
                int x = 10, y = 5;
                if (x > y && y * 2 == x)
                    System.out.println("A");
                else if (x == y)
                    System.out.println("B");
                else
                    System.out.println("C");
                """,
                "O que será impresso?",
                new String[]{"a) A", "b) B", "c) C"},
                "a"
        ));

        perguntas.add(new Pergunta(
                """
                int a = 3, b = 7;
                if (a + b > 10)
                    System.out.println("OK");
                else
                    System.out.println("NOK");
                """,
                "Qual a saída?",
                new String[]{"a) OK", "b) NOK", "c) Nenhuma"},
                "a"
        ));

        perguntas.add(new Pergunta(
                """
                int n = 4;
                if (n % 2 == 0)
                    if (n > 10)
                        System.out.println("X");
                    else
                        System.out.println("Y");
                """,
                "O que será impresso?",
                new String[]{"a) X", "b) Y", "c) Nada"},
                "b"
        ));

        perguntas.add(new Pergunta(
                """
                int x = 5;
                if (x == 10)
                    System.out.println("Igual");
                else
                    System.out.println("Diferente");
                """,
                "Qual saída?",
                new String[]{"a) Igual", "b) Diferente", "c) Erro"},
                "b"
        ));

        perguntas.add(new Pergunta(
                """
                int z = 8;
                if (z > 2 && z < 10)
                    System.out.println("Intervalo");
                else
                    System.out.println("Fora");
                """,
                "O que será exibido?",
                new String[]{"a) Intervalo", "b) Fora", "c) Nada"},
                "a"
        ));

        // Escolhe pergunta aleatória
        Random rnd = new Random();
        Pergunta q = perguntas.get(rnd.nextInt(perguntas.size()));

        printPause("\nAparece na pedra brilhante o seguinte código:", 1500);
        System.out.println(q.codigo);

        printPause("\nPergunta: " + q.enunciado, 1500);
        for (String alt : q.alternativas) System.out.println(alt);

        System.out.print("\nSua resposta: ");
        String resposta = sc.next().toLowerCase();

        switch (resposta) {
            case "a":
                printPause("\nO PORTAL AZUL BRILHA AO SEU REDOR!", 1500);
                printPause("Um espírito-guia chamado Byte++ aparece e concede +4 conhecimento!", 2000);
                conhecimento += 4;
                break;

            case "b":
                printPause("\nO PORTAL VERMELHO SE ABRE...", 1500);
                printPause("Uma rajada de calor te atinge — você ganha +2 conhecimento, mas perde vida!", 2000);
                int dano = rnd.nextInt(3) + 2;
                vida -= dano;
                conhecimento += 2;
                System.out.println("Você perdeu " + dano + " de vida.");
                break;

            case "c":
                printPause("\nO PORTAL CINZA TREME...", 1500);
                printPause("Ele te leva por um atalho perigoso, mas revelador. +5 conhecimento!", 2000);
                conhecimento += 5;
                break;

            default:
                printPause("\nO código colapsa!", 1500);
                printPause("Você ativou um 'case default' inesperado!", 2000);
                vida = 0;
                System.out.println("*** GAME OVER ***");
                return;
        }

        verificarVida();
        mostrarStatus();

        System.out.println("\n--- Fim do Capítulo 2 ---");
        System.out.println("[Pressione ENTER para continuar]");
        sc.nextLine();
        sc.nextLine();
    }

    // Classe auxiliar para perguntas
    class Pergunta {
        String codigo;         // bloco de código mostrado
        String enunciado;      // pergunta/descrição
        String[] alternativas; // alternativas (a, b, c)
        String correta;        // "a", "b" ou "c"

        Pergunta(String codigo, String enunciado, String[] alternativas, String correta) {
            this.codigo = codigo;
            this.enunciado = enunciado;
            this.alternativas = alternativas;
            this.correta = correta.toLowerCase();
        }
    }

    // ==================== CAPÍTULO 3 ====================
    private void capitulo3() {
        printPause("\n=== CAPÍTULO 3 – O CÓDIGO PERDIDO (EXPANDIDO) ===", 2000);
        System.out.println("Você acessa o terminal antigo e vê uma mensagem piscando:");
        System.out.println("\"Arquivo perdido: Source_Origin.sys.\"");
        printPause("Fragmentos de código aparecem — resolva os enigmas para recuperar o arquivo.", 1500);

        ArrayList<Pergunta> perguntas = new ArrayList<>();

        perguntas.add(new Pergunta(
                """
                        int x = 5, y = 10;
                        if (x * 2 == y || y / x == 3)
                            System.out.println("Verdade Revelada");
                        else
                            System.out.println("Falha no Sistema");
                        """,
                "O que será impresso?",
                new String[]{
                        "a) Verdade Revelada",
                        "b) Falha no Sistema",
                        "c) Nenhuma das opções"
                },
                "a"
        ));

        perguntas.add(new Pergunta(
                """
                        int a = 3;
                        if (a > 2)
                            if (a < 5)
                                System.out.println("A");
                            else
                                System.out.println("B");
                        else
                            System.out.println("C");
                        """,
                "Qual a saída deste bloco?",
                new String[]{
                        "a) A",
                        "b) B",
                        "c) C"
                },
                "a"
        ));

        perguntas.add(new Pergunta(
                """
                        int n = 8;
                        if (n % 2 == 0 && n > 5)
                            System.out.println("Par e grande");
                        else if (n % 2 == 0)
                            System.out.println("Par");
                        else
                            System.out.println("Ímpar");
                        """,
                "Qual será a saída?",
                new String[]{
                        "a) Par",
                        "b) Par e grande",
                        "c) Ímpar"
                },
                "b"
        ));

        perguntas.add(new Pergunta(
                """
                        int i = 0;
                        if (i > 0)
                            System.out.println("Positivo");
                        else if (i == 0)
                            System.out.println("Zero");
                        else
                            System.out.println("Negativo");
                        """,
                "O que será impresso?",
                new String[]{
                        "a) Positivo",
                        "b) Zero",
                        "c) Negativo"
                },
                "b"
        ));

        perguntas.add(new Pergunta(
                """
                        boolean t = true;
                        boolean f = false;
                        if (t && !f)
                            System.out.println("OK");
                        else
                            System.out.println("NO");
                        """,
                "Qual saída?",
                new String[]{
                        "a) OK",
                        "b) NO",
                        "c) Erro"
                },
                "a"
        ));

        perguntas.add(new Pergunta(
                """
                        int x = 2;
                        if (x > 1)
                            System.out.println("Maior");
                        if (x > 2)
                            System.out.println("Muito Maior");
                        """,
                "O que será impresso?",
                new String[]{
                        "a) Maior",
                        "b) Maior e Muito Maior",
                        "c) Nada"
                },
                "a"
        ));

        perguntas.add(new Pergunta(
                """
                        int a = 1, b = 2, c = 3;
                        if (a + b == c)
                            System.out.println("Igual");
                        else
                            System.out.println("Diferente");
                        """,
                "Qual será impresso?",
                new String[]{
                        "a) Igual",
                        "b) Diferente",
                        "c) Erro"
                },
                "a"
        ));

        perguntas.add(new Pergunta(
                """
                        int m = 9;
                        if (m % 3 == 0)
                            if (m % 2 == 0)
                                System.out.println("Divisível por 6");
                            else
                                System.out.println("Divisível por 3");
                        else
                            System.out.println("Não divisível por 3");
                        """,
                "Qual será a saída?",
                new String[]{
                        "a) Divisível por 6",
                        "b) Divisível por 3",
                        "c) Não divisível por 3"
                },
                "b"
        ));

        // Sorteia uma pergunta aleatória do conjunto
        Random rnd = new Random();
        Pergunta q = perguntas.get(rnd.nextInt(perguntas.size()));

        printPause("\nO terminal exibe o seguinte código:", 1200);
        System.out.println(q.codigo);
        printPause("", 800);

        System.out.println("\nPergunta: " + q.enunciado);
        for (String alt : q.alternativas) System.out.println(alt);

        int errosSeguidos = 0;
        boolean acertou = false;

        while (!acertou && vida > 0) {
            System.out.print("\n➡ Sua resposta (a/b/c): ");
            String resposta = sc.nextLine().trim().toLowerCase();
            if (resposta.isEmpty()) resposta = sc.nextLine().trim().toLowerCase();

            if (!resposta.equals("a") && !resposta.equals("b") && !resposta.equals("c")) {
                System.out.println("Resposta inválida. Digite 'a', 'b' ou 'c'.");
                continue;
            }

            if (resposta.equals(q.correta)) {
                printPause("\nO código se recompila com sucesso! Você recupera fragmentos do arquivo.", 900);
                conhecimento += 4;
                acertou = true;
            } else {
                errosSeguidos++;
                int dano = (int) (Math.random() * 4) + 2; // dano alto por ser capítulo importante
                vida -= dano;
                System.out.println("\nResposta incorreta. O terminal faz curto e você é ferido pela sobrecarga.");
                System.out.println("Você sofreu " + dano + " de dano. Vida atual: " + vida);
                pausar(800);

                if (vida <= 0) {
                    System.out.println("\nO sistema entra em colapso... *** GAME OVER ***");
                    return;
                }

                if (errosSeguidos >= 2) {
                    System.out.println("\nVocê errou duas vezes seguidas. O terminal bloqueia o acesso e você é desconectado.");
                    vida = 0;
                    System.out.println("\n*** GAME OVER ***");
                    return;
                } else {
                    System.out.println("\nTente novamente (um erro adicional encerrará a sessão).");
                }
            }
        }

        mostrarStatus();
        System.out.println("\n--- Fim do Capítulo 3 ---");
        System.out.println("[Pressione ENTER para continuar]");
        sc.nextLine();
    }

    // ==================== CAPÍTULO 4 (EXPANDIDO - 10 perguntas, melhor de 3) ====================
    private void capitulo4() {
        printPause("\n=== CAPÍTULO 4 – A CÓPIA CORROMPIDA", 2000);
        printPause("No Setor de Memória Profunda, você encara uma cópia defeituosa de si mesmo...", 1500);
        printPause("A cópia propõe uma disputa de lógica: melhor de três. Apenas o dev com raciocínio impecável vencerá.", 1500);

        ArrayList<Pergunta> perguntas = new ArrayList<>();

        perguntas.add(new Pergunta(
                """
                        int vida = 10;
                        int defesa = 5;
    
                        if (vida > 0)
                            if (defesa > 10)
                                System.out.println("Protegido!");
                            else
                                System.out.println("Inconsciente!");
                        """,
                "O que será impresso?",
                new String[]{
                        "a) Protegido!",
                        "b) Inconsciente!",
                        "c) Nada será impresso."
                },
                "b"
        ));

        perguntas.add(new Pergunta(
                """
                        int energia = 5;
                        int modoFuria = 3;
    
                        if (energia > 4 || modoFuria > 5)
                            System.out.println("Ataque liberado!");
                        else
                            System.out.println("Energia insuficiente!");
                        """,
                "O que será impresso?",
                new String[]{
                        "a) Ataque liberado!",
                        "b) Energia insuficiente!",
                        "c) Nenhuma mensagem."
                },
                "a"
        ));

        perguntas.add(new Pergunta(
                """
                        int codigo = 42;
    
                        if (codigo < 20)
                            System.out.println("Código Fraco");
                        else if (codigo < 40)
                            System.out.println("Código Regular");
                        else
                            System.out.println("Código Forte");
                        """,
                "Qual será a saída?",
                new String[]{
                        "a) Código Fraco",
                        "b) Código Regular",
                        "c) Código Forte"
                },
                "c"
        ));

        perguntas.add(new Pergunta(
                """
                        int x = 7;
                        if (x > 5)
                            if (x < 10)
                                System.out.println("Dentro do intervalo");
                            else
                                System.out.println("Maior ou igual a 10");
                        else
                            System.out.println("Menor ou igual a 5");
                        """,
                "Qual será a saída?",
                new String[]{
                        "a) Dentro do intervalo",
                        "b) Maior ou igual a 10",
                        "c) Menor ou igual a 5"
                },
                "a"
        ));

        perguntas.add(new Pergunta(
                """
                        int a = 2, b = 3, c = 5;
                        if (a + b > c)
                            System.out.println("Verdadeiro");
                        else if (a + b == c)
                            System.out.println("Igualdade");
                        else
                            System.out.println("Falso");
                        """,
                "O que será impresso?",
                new String[]{
                        "a) Verdadeiro",
                        "b) Igualdade",
                        "c) Falso"
                },
                "c"
        ));

        // Novas perguntas adicionadas (5 -> 10)
        perguntas.add(new Pergunta(
                """
                        int p = 0;
                        if (p != 0)
                            System.out.println("Não zero");
                        else
                            System.out.println("Zero");
                        """,
                "O que será impresso?",
                new String[]{
                        "a) Não zero",
                        "b) Zero",
                        "c) Erro"
                },
                "b"
        ));

        perguntas.add(new Pergunta(
                """
                        int r = 4;
                        if (r > 2 && (r % 2) == 0)
                            System.out.println("Par e grande");
                        else
                            System.out.println("Outro");
                        """,
                "Qual saída?",
                new String[]{
                        "a) Par e grande",
                        "b) Outro",
                        "c) Nada"
                },
                "a"
        ));

        perguntas.add(new Pergunta(
                """
                        boolean x = false;
                        if (!x)
                            System.out.println("Negado");
                        else
                            System.out.println("Afirma");
                        """,
                "O que será exibido?",
                new String[]{
                        "a) Negado",
                        "b) Afirma",
                        "c) Erro"
                },
                "a"
        ));

        perguntas.add(new Pergunta(
                """
                        int t = 1;
                        if (t > 0)
                            System.out.println(\"Positivo\");
                        else
                            System.out.println(\"Não positivo\");
                        """,
                "Qual saída?",
                new String[]{
                        "a) Positivo",
                        "b) Não positivo",
                        "c) Nada"
                },
                "a"
        ));

        perguntas.add(new Pergunta(
                """
                        int s = 6;
                        if (s < 5)
                            System.out.println(\"Pequeno\");
                        else if (s == 6)
                            System.out.println(\"Seis\");
                        else
                            System.out.println(\"Grande\");
                        """,
                "Qual será impresso?",
                new String[]{
                        "a) Pequeno",
                        "b) Seis",
                        "c) Grande"
                },
                "b"
        ));

        // Shuffle e seleciona 3 sem repetir
        Collections.shuffle(perguntas);
        List<Pergunta> selecionadas = perguntas.subList(0, 3);

        int acertos = 0;
        int erros = 0;

        for (int i = 0; i < 3 && vida > 0; i++) {
            Pergunta q = selecionadas.get(i);

            System.out.println("\n--- Rodada " + (i + 1) + " ---");
            printPause("A cópia te desafia com o seguinte código:", 600);
            System.out.println(q.codigo);
            printPause("", 400);

            System.out.println("\nPergunta: " + q.enunciado);
            for (String alt : q.alternativas) System.out.println(alt);

            System.out.print("\n➡ Sua resposta (a/b/c): ");
            String resposta = sc.nextLine().trim().toLowerCase();
            if (resposta.isEmpty()) resposta = sc.nextLine().trim().toLowerCase();

            if (!resposta.equals("a") && !resposta.equals("b") && !resposta.equals("c")) {
                System.out.println("Resposta inválida. Você hesitou e perdeu tempo!");
                i--;
                continue;
            }

            if (resposta.equals(q.correta)) {
                System.out.println("\nCorreto! O código da cópia falha e parte dela se desintegra!");
                conhecimento += 2;
                acertos++;
            } else {
                int dano = (int) (Math.random() * 3) + 1;
                vida -= dano;
                System.out.println("\nErrado! A cópia distorce a realidade e te fere com lógica invertida.");
                System.out.println("Você sofreu " + dano + " de dano. Vida atual: " + vida);
                erros++;
                verificarVida();
            }

            if (acertos == 2) break;
            if (erros == 2) break;
        }

        System.out.println("\n===============================");
        if (acertos >= 2) {
            System.out.println("🎉 Você venceu a Cópia Corrompida! Sua lógica é impecável!");
            conhecimento += 5;
        } else {
            System.out.println("💀 A cópia venceu a disputa... Ela absorve parte do seu código!");
            vida = 0;
            System.out.println("\n*** GAME OVER ***");
        }

        mostrarStatus();
        System.out.println("\n--- Fim do Capítulo 4 ---");
        System.out.println("[Pressione ENTER para continuar]");
        sc.nextLine();
    }

    // ==================== STATUS ====================
    private void mostrarStatus() {
        pausar(1000);
        System.out.println("\n--- STATUS ATUAL ---");
        System.out.println("Vida: " + vida);
        System.out.println("Conhecimento: " + conhecimento);
        pausar(1000);
    }

    // ==================== CAPÍTULO 5 ====================
    private void capitulo5() {
        printPause("\n=== CAPÍTULO 5 – O LOOP ESQUECIDO ===", 1200);
        printPause("Você entra em um túnel que se repete infinitamente...", 1500);
        printPause("Uma voz diz: \"Este é um loop sem condição de parada.\"", 1500);

        System.out.println("\nO que você faz?");
        System.out.println("1 - Procurar o ponto que quebra o loop.");
        System.out.println("2 - Observar a repetição e tentar entender seu sentido.");
        System.out.print("Escolha: ");
        int escolha = sc.nextInt();
        pausar(1000);

        switch (escolha) {
            case 1 -> {
                printPause("\nVocê decide procurar o ponto que quebra o loop...", 1500);
                printPause("Um padrão se repete nas paredes do túnel, como se fossem linhas de código:", 1200);

                String[] padrao = {"--->", "--->", "--->", "--X>", "--->", "--->"};
                for (int i = 0; i < padrao.length; i++) {
                    System.out.println((i + 1) + ": " + padrao[i]);
                    pausar(400);
                }

                System.out.print("\nDigite o número da linha que parece diferente: ");
                int linha = sc.nextInt();

                if (linha == 4) {
                    System.out.println("\nVocê identifica a linha que muda! O loop se desfaz e uma passagem se abre.");
                    conhecimento += 3;
                } else {
                    printPause("\nA linha escolhida não era o ponto de quebra...", 1200);
                    printPause("O túnel reinicia, mas você tenta novamente e encontra a linha com o 'X'.", 1200);
                    printPause("O loop se desfaz e você segue adiante.", 1200);
                    conhecimento += 2;
                }
            }
            case 2 -> {
                printPause("\nVocê para e observa a repetição, tentando entender seu sentido...", 1500);
                printPause("Depois de algum tempo, o ciclo se encerra sozinho e uma porta se abre à sua frente.", 1200);
                conhecimento += 2;
            }
            default -> {
                printPause("\nVocê hesita e o túnel se reinicia infinitamente...", 1500);
                printPause("Você decide tentar novamente e finalmente encontra a saída.", 1200);
                conhecimento += 1;
            }
        }
        verificarVida();
        mostrarStatus();
    }

    // ==================== CAPÍTULO 6 ====================
    private void capitulo6() {
        printPause("\n=== CAPÍTULO 6 – O PACOTE CORROMPIDO ===", 1200);
        printPause("Um alerta surge na tela: \"Pacote desconhecido detectado: Bug_Residual.exe\".", 1500);
        System.out.println("O que você faz?");
        System.out.println("1 - Abrir o pacote.");
        System.out.println("2 - Deletar o pacote sem abrir.");
        System.out.print("Escolha: ");
        int escolha = sc.nextInt();
        pausar(1000);

        switch (escolha) {
            case 1 -> {
                printPause("\nVocê abre o pacote com cautela...", 1500);
                printPause("Dentro, encontra uma IA chamada Glitch.", 1200);
                printPause("Glitch: \"Vejo que você veio corrigir falhas. Aqui vão três dicas rápidas para estabilizar o sistema:\"", 2000);
                printPause(" - Verifique referências nulas antes de usá-las.", 1200);
                printPause(" - Isole processos suspeitos em sandboxes temporários.", 1200);
                printPause(" - Registre eventos antes e depois de operações críticas para poder reverter mudanças.", 1500);
                printPause("Com essas dicas, o sistema começa a recuperar integridade.", 1500);
                printPause("Glitch oferece acompanhamento opcional para futuras missões...", 1500);
                conhecimento += 4;
            }
            case 2 -> {
                printPause("\nVocê deleta o pacote imediatamente.", 1500);
                printPause("O sistema emite uma mensagem de agradecimento por remover a ameaça.", 1200);
                printPause("Enquanto caminha, sente que perdeu uma ajuda valiosa que poderia ter prevenido problemas adiante...", 1200);
                conhecimento += 1;
            }
            default -> {
                printPause("\nVocê hesita e o pacote se executa sozinho!", 1500);
                int dano = (int) (Math.random() * 3) + 2;
                vida -= dano;
                System.out.println("Glitch tenta corromper o sistema, mas você consegue conter parte do dano. -" + dano + " de vida!");
                if (vida <= 0) {
                    System.out.println("\nO Bug_Residual tomou conta do sistema... GAME OVER!");
                    return;
                }
            }
        }
        verificarVida();
        mostrarStatus();
    }
}