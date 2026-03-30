package cineTeatro;

public class Ingresso {
    private int id;
    private String assento, tipo;
    private float preco;

    public Ingresso(int id, String assento, String tipo, float preco) {
        this.id = id;
        this.assento = assento;
        this.tipo = tipo;
        this.preco = preco;
    }

    public Ingresso(){}

    @Override
    public String toString() {
        return "Ingresso{" +
                "id=" + id +
                ", assento='" + assento + '\'' +
                ", tipo='" + tipo + '\'' +
                ", preco=" + preco +
                '}';
    }
}
