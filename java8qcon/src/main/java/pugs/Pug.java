package pugs;

import java.util.Optional;

public class Pug {

    private String nome;
    private String color;
    private Integer weight;
    private Optional<Dono> dono = Optional.empty();

    public Optional<Dono> getDono() {
        return dono;
    }

    public Pug( String nome,
                String color,
                Integer size ) {
        this.nome = nome;
        this.color = color;
        this.weight = size;
    }

    public Pug( String nome,
                String color,
                Integer size,
                Dono dono ) {
        this.nome = nome;
        this.color = color;
        this.weight = size;
        this.dono = Optional.of(dono);
    }

    public Integer getWeight() {
        return weight;
    }

    public String getNome() {
        return nome;
    }

    public String getColor() {
        return color;
    }

    @Override
    public String toString() {
        return "Pug{" +
                "nome='" + nome + '\'' +
                ", color='" + color + '\'' +
                ", weight=" + weight +
                '}';
    }

}
