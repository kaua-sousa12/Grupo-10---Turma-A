public class Programa {
    // Kauã Sousa Silva
    // João Pedro Gama
    public static void main(String[] args) {
        RPG jogo = new RPG();

        // Código ANSI para azul-ciano
        String CYAN = "\u001B[36m";
        String RESET = "\u001B[0m";

        String titulo = CYAN + """         
  .d8888b.                             888          d8b                           888                                     888 d8b                  \s
 d88P  Y88b                            888          Y8P                           888                                     888 Y8P                  \s
 888    888                            888                                        888                                     888                      \s
 888         8888b.  888  888  8888b.  888  .d88b.  888 888d888 .d88b.        .d88888  .d88b.        .d8888b .d88b.   .d88888 888  .d88b.   .d88b. \s
 888            "88b 888  888     "88b 888 d8P  Y8b 888 888P"  d88""88b      d88" 888 d88""88b      d88P"   d88""88b d88" 888 888 d88P"88b d88""88b\s
 888    888 .d888888 Y88  88P .d888888 888 88888888 888 888    888  888      888  888 888  888      888     888  888 888  888 888 888  888 888  888\s
 Y88b  d88P 888  888  Y8bd8P  888  888 888 Y8b.     888 888    Y88..88P      Y88b 888 Y88..88P      Y88b.   Y88..88P Y88b 888 888 Y88b 888 Y88..88P\s
  "Y8888P"  "Y888888   Y88P   "Y888888 888  "Y8888  888 888     "Y88P"        "Y88888  "Y88P"        "Y8888P "Y88P"   "Y88888 888  "Y88888  "Y88P" \s
                                                                                                                                       888         \s
                                                                                                                                  Y8b d88P         \s
                                                                                                                                   "Y88P"    \s                                                                                                                                                                                                                                            ^"===*"`              \s
 """ + RESET;

        jogo.menu(titulo);
    }
}
