package pugs;

public class Dog {

    private final String nome;
    private final boolean ronca;
    private final int peso;
    private final RACA raca;

    public Dog(String nome, boolean ronca, int peso, RACA raca){
        this.nome = nome;
        this.ronca = ronca;
        this.peso = peso;
        this.raca = raca;
    }

    public enum RACA{
        PUG, BULLDOG, PASTOR, PINSCHER, SRD
    }

    public String getNome() {
        return nome;
    }

    public boolean isRonca() {
        return ronca;
    }

    public int getPeso() {
        return peso;
    }

    public RACA getRaca() {
        return raca;
    }

}
