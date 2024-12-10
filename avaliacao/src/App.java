public class App {
    public static void main(String[] args) {

        Mesa mesa = new Mesa();

        mesa.setCor("Branco");
        mesa.setAltura(1.5);
        mesa.setNumeroDePernas(3);
        mesa.setPesoMaximoSuportado(10.0);


        mesa.suportarPeso(9.0);
        mesa.trocarCor("Não");
        mesa.colocarObjeto("Jarro de flores");
        mesa.removerObjeto("Chaves");
    }
}