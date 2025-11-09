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

        // ==================== NOVA PARTE: BAÚ DE CÓDIGO ====================
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
        System.out.println("Nela, uma voz digital ecoa:");
        printPause("\"Apenas quem entende a lógica poderá escolher o portal certo.\"", 2500);

        printPause("\nAparece a pergunta na tela:", 1500);
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
            case "A":
                printPause("\nO portal da Luz se abre diante de você!", 1500);
                System.out.println("Um robô chamado Byte surge e se junta a você, oferecendo dicas em batalha!");
                conhecimento += 3;
                break;
            case "B":
                printPause("\nSua resposta ativa o portal da Sombra...", 2000);
                System.out.println("Você sente um poder sombrio fluir, mas o código ao redor começa a se distorcer!");
                int dano = (int) (Math.random() * 3) + 1;
                vida -= dano;
                conhecimento += 2;
                System.out.println("Você ganhou +2 de conhecimento, mas perdeu " + dano + " de vida!");
                break;
            case "C":
                printPause("\nO portal do Eco ressoa com sua resposta...", 2000);
                System.out.println("Um som distante revela um atalho secreto para o castelo do Rei dos Bugs!");
                conhecimento += 4;
                break;
            default:
                printPause("\nO portal vibra violentamente!", 1500);
                printPause("O chão se abre e o sistema entra em colapso!", 2000);
                System.out.println("Você é lançado de volta ao início do jogo com uma mensagem piscando:");
                System.out.println("\"Nem todo caminho é seguro quando o caso é errado.\"");
                vida = 0;
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
        printPause("\n=== CAPÍTULO 3 – O CÓDIGO PERDIDO ===", 2000);
        System.out.println("Você acessa o terminal antigo e vê uma mensagem piscando:");
        System.out.println("\"Arquivo perdido: Source_Origin.sys.\"");
        printPause("Um fragmento de código aparece — resolveu-se em enigmas. Resolva para recuperar pedaços do arquivo.", 2000);

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

        // sorteia uma pergunta aleatória
        Random rnd = new Random();
        Pergunta q = perguntas.get(rnd.nextInt(perguntas.size()));

        printPause("\nO terminal exibe o seguinte código:", 1200);
        System.out.println(q.codigo);
        printPause("", 1500);

        System.out.println("\nPergunta: " + q.enunciado);
        for (String alt : q.alternativas) System.out.println(alt);

        int errosSeguidos = 0;
        boolean acertou = false;

        while (!acertou && vida > 0) {
            System.out.print("\n➡ Sua resposta (a/b/c): ");
            String resposta = sc.nextLine().trim().toLowerCase();
            if (resposta.isEmpty()) { // caso algum newline pendente
                resposta = sc.nextLine().trim().toLowerCase();
            }

            if (!resposta.equals("a") && !resposta.equals("b") && !resposta.equals("c")) {
                System.out.println("Resposta inválida. Digite 'a', 'b' ou 'c'.");
                continue;
            }

            if (resposta.equals(q.correta)) {
                printPause("\nO código se recompila com sucesso! Você recupera fragmentos do arquivo.", 1400);
                conhecimento += 4;
                acertou = true;
            } else {
                errosSeguidos++;
                int dano = (int) (Math.random() * 4) + 2; // dano mais alto por ser capítulo mais difícil
                vida -= dano;
                System.out.println("\nResposta incorreta. O terminal faz curto e você é ferido pela sobrecarga.");
                System.out.println("Você sofreu " + dano + " de dano. Vida atual: " + vida);
                printPause("", 1200);

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

    // ==================== CAPÍTULO 4 ====================
    private void capitulo4() {
        printPause("\n=== CAPÍTULO 4 – A CÓPIA CORROMPIDA ===", 2000);
        printPause("No Setor de Memória Profunda, você encara uma cópia defeituosa de si mesmo...", 2000);
        printPause("A cópia propõe uma disputa de lógica: melhor de três. Apenas o dev com raciocínio impecável vencerá.", 2000);

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

        // ===== Sistema de melhor de 3 =====
        Random rnd = new Random();
        int acertos = 0;
        int erros = 0;

        // Seleciona 3 perguntas aleatórias sem repetir
        Collections.shuffle(perguntas);
        List<Pergunta> selecionadas = perguntas.subList(0, 3);

        for (int i = 0; i < 3 && vida > 0; i++) {
            Pergunta q = selecionadas.get(i);

            System.out.println("\n--- Rodada " + (i + 1) + " ---");
            printPause("A cópia te desafia com o seguinte código:", 1200);
            System.out.println(q.codigo);
            printPause("", 1500);

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

            // condição de vitória ou derrota antecipada
            if (acertos == 2) break; // já ganhou
            if (erros == 2) break;   // já perdeu
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