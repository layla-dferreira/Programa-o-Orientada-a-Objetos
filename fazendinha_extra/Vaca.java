public class Vaca {
    private String nome;
    private String corPelo;
    private double consumo;

    public Vaca() {
        this.nome = " ";
        this.corPelo = " ";
        this.consumo = 0.0;
    }

    public String getNome() {
        return nome;
    }

    public String getCorPelo() {
        return corPelo;
    }

    public double getConsumo() {
        return consumo;
    }

    public void setNome(String nome) {
        this.nome = nome.toUpperCase();
    }

    public void setCorPelo(String corPelo) {
        this.corPelo = corPelo.toUpperCase();
    }

    public void setConsumo(double consumo) {
        this.consumo = consumo;
    }
}
