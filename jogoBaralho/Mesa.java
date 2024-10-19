import java.util.Scanner;

public class Mesa {
    public static void main(String[] args) {   // Metodo main
        Scanner scanner = new Scanner(System.in);
        Baralho baralho = new Baralho();
        Jogador jogadorA = new Jogador(5);  // Jogador A
        Jogador jogadorB = new Jogador(5);  // Jogador B
        
        while (true) {   // O while vai rodar enquanto não compilar nenhum break
            System.out.println("Mesa embaralhando...");
            baralho.embaralhar();   // Chama o metodo 'embaralhar'

            System.out.println("Informe o número de cartas a distribuir para os jogadores: ");
            int quantCartas = scanner.nextInt();   // Lê a quantidade de cartas a serem distribuidas 

            System.out.println("Mesa distribui as " + quantCartas + " cartas para jogador A e para o jogador B.");
            jogadorA.receberCartas(baralho.distribuirCartas(quantCartas));   // Atribui as cartas para o jogador A
            jogadorB.receberCartas(baralho.distribuirCartas(quantCartas));   // Atribui as cartas para o jogador B

            Carta maiorCartaA = jogadorA.maiorCarta();   // Atribui a carta maior do jogador A
            Carta maiorCartaB = jogadorB.maiorCarta();   // Atribui a carta maior do jogador B

            System.out.println("O jogador A joga a " + maiorCartaA);
            System.out.println("O jogador B joga a " + maiorCartaB);

            if (maiorCartaA.getNumero() < maiorCartaB.getNumero()) {   // Verifica se o jogador B tem a maior carta
                System.out.println("O jogador B venceu o jogo!");
                break;
            } else if (maiorCartaA.getNumero() > maiorCartaB.getNumero()) {   // Verifica se o jogador A tem a maior carta
                System.out.println("O jogador A venceu o jogo!");
                break;
            } else {
                if (maiorCartaA.getNaipe().equals("Ouros")) {   // Verifica se o jogador A tem carta de 'Ouros', caso as cartas sejam de numero iguais
                    System.out.println("O jogador A venceu o jogo!");
                    break;
                } else if (maiorCartaB.getNaipe().equals("Ouros")) {   // Verifica se o jogador B tem carta de 'Ouros', caso as cartas sejam de numero iguais
                    System.out.println("O jogador B venceu o jogo!");
                    break;
                } else {
                    System.out.println("Como os valores das cartas são iguais e nenhum jogador tem carta de Ouros, o jogo ficou empatado!");   // Caso não satisfaça nenhuma das condições o codigo é compilado novamente
                    System.out.println("Jogando novamente...");
                }
            }
        }
        scanner.close();   // Fecha o scanner
    }
}
