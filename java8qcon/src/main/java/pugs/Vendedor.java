package pugs;

public class Vendedor {

    private final String nome;
    private final String cidade;

    public Vendedor( String nome,
                     String cidade ) {
        this.nome = nome;
        this.cidade = cidade;
    }

    @Override
    public String toString() {
        return "Vendedor{" +
                "nome='" + nome + '\'' +
                ", cidade='" + cidade + '\'' +
                '}';
    }

    public String getNome() {
        return nome;
    }

    public String getCidade() {
        return cidade;
    }
}
