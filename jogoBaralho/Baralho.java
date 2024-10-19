import java.util.Random;

public class Baralho {
    private Carta baralho[];
    private String naipeCartas[] = {"Copas", "Espadas", "Ouros", "Paus"};
    private Random gerador;

    public Baralho() {  //Set
        baralho = new Carta[52];  // É declara no vetor baralho as caracteristicas da class Carta que possui 52 cartas
        gerador = new Random();   // É declarado essa variavel para embaralhar as cartas com essa função importada
        int cont = 0;   

        for (String naipe : naipeCartas) {   // fors para preencher o vetor com todas as cartas de cada naipe
            for (int i = 1; i < 14; i++) {
                baralho[cont] = new Carta(naipe, i);
                cont++;
            }
        }
    }

    public Carta[] getBaralho() {  // Get de Baralho
        return baralho;
    }

    public void embaralhar() {   // Metodo para embaralhar as cartas do baralho
        for (int i = baralho.length - 1; i > 0; i--) {
            int num = gerador.nextInt(i + 1);
            Carta aux = baralho[i];

            baralho[i] = baralho[num];   // Troca as posições das cartas
            baralho[num] = aux;
        }
    }

    public Carta[] distribuirCartas(int quantCartas) {   // Metodo para distribuir as cartas
        Carta retornoCartas[] = new Carta[quantCartas];
        int cont = 0, i = 0;

        while (cont < quantCartas) {
            if (baralho[i] != null) {    // É testado se a posição não é null, se aquela carta não foi distribuida ainda
                retornoCartas[cont] = baralho[i];
                baralho[i] = null;
                cont++;
            }
            i++;
        }
        return retornoCartas;
    }
}