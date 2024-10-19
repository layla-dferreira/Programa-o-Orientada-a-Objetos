public class Teste {
    public static void main(String[] args) {
        Carta minha;
        minha = new Carta();  //Chama o metodo construtor

        minha.setNaipe("Ouros");
        minha.setNumero(4);

        System.out.println("Minha carta tem naipe igual a: " + minha.getNaipe());

        Carta sua;
        sua = new Carta("Espadas", 4);   //Chama o metodo construtor e já atribui os valores

        System.out.println("Sua carta tem naipe igual a: " + sua.getNaipe());

        System.out.println(minha.comparaNumero(sua));   //Chama o medoto compara para comparar os numeros das cartas. Aqui compara a minha com a sua

        System.out.println(sua.comparaNumero(minha));   //Chama o medoto compara para comparar os numeros das cartas. Aqui compara a sua com a minha

    }

}