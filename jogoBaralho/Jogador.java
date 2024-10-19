public class Jogador {
    private Carta jogador[];

    public Jogador(int num) {  // Construtor
        jogador = new Carta[num];
    }

    public void receberCartas(Carta cartasRecebidas[]) {   // O jogador recebe as cartas 
        jogador = cartasRecebidas;
    }

    public Carta maiorCarta() {   // Metodo para verificar a maior carta dos jogadores
        Carta maior = jogador[0];

        for (Carta carta : jogador) {
            if (maior.verificaMaior(carta) == -1){   // Faz a verificação se a carta é maior chamando o metodo 'verificaMaior'
                maior = carta;
            } else if ((carta.getNumero() == maior.getNumero()) && (carta.getNaipe().equals("Ouros"))) {   // Se for igual o numero, é feita a verificação do naipe se é 'Ouros'
                maior = carta;
            }
        }
        return maior;
    }
    
}
