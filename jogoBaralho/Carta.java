public class Carta {
    private String naipe;   // Declaração do naipe da carta
    private int numero;     // Declaração do numero da carta

    public Carta(String naipe, int numero) {  //Construtor
        this.naipe = naipe;
        this.numero = numero;
    }

    public void setNaipe(String naipe) {   // Set do naipe
        this.naipe = naipe;
    }

    public String getNaipe() {  // Get do naipe
        return naipe;
    }

    public void setNumero(int numero) {  // Set do numero
        this.numero = numero;
    }

    public int getNumero() {  // Get do numero
        return numero;
    }

    public int verificaMaior(Carta outraCarta) {  // Faz a verificação de qual carta de cada jogador é a maior 
        if (this.numero > outraCarta.getNumero()) {
            return 1;
        } else if (this.numero < outraCarta.getNumero()) {
            return -1;
        }
        return 0;
    }

    @Override
    public String toString() {   // É necessario para usar corretamente o println no metodo main, pois é necessario concatenar uma string com um numero
        return "Carta de naipe " + naipe + " e de valor " + numero;
    }
}
