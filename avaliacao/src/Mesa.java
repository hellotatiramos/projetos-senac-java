public class Mesa {

    private double altura;
    private String cor;
    private int numeroDePernas;
    private double pesoMaximoSuportado;

    public void trocarCor(String cor){
        System.out.println("Deseja trocar a cor da sua mesa? " + cor);
    }

    public void suportarPeso(double peso){
        if (peso <= 10.0){
            System.out.println("Peso suportado!");
        } if (peso > 10.0){
            System.out.println("Peso não suportado! Retire por favor!");
        }
    }

    public String colocarObjeto(String objeto){
        System.out.println("Qual objeto gostaria de usar para decorar sua mesa? " + objeto);
        return objeto;
    }

    public String removerObjeto(String objeto){
        System.out.println("Qual objeto gostaria de remover da sua mesa? " + objeto);
        return objeto;
    }

    public void dobrarMesa(String valor){
        System.out.println("Sua mesa dobra? " + valor);
    }

    public double getAltura() {
        return altura;
    }

    public void setAltura(double altura) {
        this.altura = altura;
    }

    public String getCor() {
        return cor;
    }

    public void setCor(String cor) {
        this.cor = cor;
    }

    public int getNumeroDePernas() {
        return numeroDePernas;
    }

    public void setNumeroDePernas(int numeroDePernas) {
        this.numeroDePernas = numeroDePernas;
    }

    public double getPesoMaximoSuportado() {
        return pesoMaximoSuportado;
    }

    public void setPesoMaximoSuportado(double pesoMaximoSuportado) {
        this.pesoMaximoSuportado = pesoMaximoSuportado;
    }
}
