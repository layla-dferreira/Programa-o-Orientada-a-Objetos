public class Carta {
    private String naipe; 
    private int numero;

    public Carta() {  //Construtor
        naipe = " ";
        numero = 0;
    }

    public Carta(String naipe, int numero) {
        this.numero = numero;
        setNaipe(naipe);
    }
    
    public String getNaipe() {
        return naipe;
    }

    public int getNumero() {
        return numero;
    }

    public void setNaipe(String naipe) {
        this.naipe = naipe.toUpperCase();  //Tonar letra maiuscula 
    }

    public void setNumero(int numero) {
        this.numero = numero;
    }

    public int comparaNumero(Carta carta) {  //Compara o numero das cartas
        if (this.numero > carta.getNumero()) {
            return 1;
        } else {
            if (this.numero < carta.getNumero()) {
                return -1;
            }
        }
        return 0;
    }
}
