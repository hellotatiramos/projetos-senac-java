public class Animal {

    private String raca;
    private double peso;

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

    public void brincar(String nome){
        System.out.println(nome + "brincando...");
    }
}
