public class App {
    public static void main(String[] args) {

        Gato gato = new Gato();
        Cachorro cachorro = new Cachorro();
        Jacare jacare = new Jacare();

        gato.setCor("Preto");
        gato.setRaca("Vira lata");
        gato.setPeso(1);

        cachorro.setCor("Caramelo");
        cachorro.setRaca("Golden Retriever");
        cachorro.setPeso(10);


        gato.brincar();
        gato.emitirSom();
        gato.saltar();

        cachorro.brincar();
        cachorro.emitirSom();
        cachorro.saltar();

        jacare.brincar("Jacaré: ");
    }
}