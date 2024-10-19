public class Main {
    public static void main(String[] args) {

        Cavalo cavalo;
        cavalo = new Cavalo();

        cavalo.setNome("Ze Ivaldo");
        cavalo.setCorPelo("Marrom");
        cavalo.setConsumo(30.0);

        Galinha galinha;
        galinha = new Galinha();

        galinha.setNome("Willian");
        galinha.setCorPelo("branca");
        galinha.setCosumo(10.0);

        Vaca vaca;
        vaca = new Vaca();

        vaca.setNome("Marlon");
        vaca.setCorPelo("manchada");
        vaca.setConsumo(40.0);

        double consumoTotal = cavalo.getConsumo() + galinha.getConsumo() + vaca.getConsumo();

        System.out.println("O consumo de ração total dos animais são: " + consumoTotal + " kg");
    }
}
