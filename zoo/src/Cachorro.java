public class Cachorro {

    private String cor;
    private String raca;
    private double peso;

    public String getCor() {
        return cor;
    }

    public void setCor(String cor) {
        this.cor = cor;
    }

    public String getRaca() {
        return raca;
    }

    public void setRaca(String raca) {
        this.raca = raca;
    }

    public double getPeso() {
        return peso;
    }

    public void setPeso(double peso) {
        this.peso = peso;
    }

    public void brincar(){
        System.out.println("Cachorro: brincando...");
    }

    public void saltar(){
        System.out.println("Cachorro: brincando...");
    }

    public void emitirSom(){
        if (peso <= 3){
            System.out.println("Cachorro: Au, Au!");
        } if (peso > 3 && peso <= 5){
            System.out.println("Cachorro: Aaaaaau!");
        } if (peso > 5){
            System.out.println("Cachorro: Au, Au, Au!");
        }
    }
}