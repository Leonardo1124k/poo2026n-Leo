package edificio;

import java.util.ArrayList;

public class Edificio {
    private String nome, endereco;
    private ArrayList<Apartamento> apart;

    public void construirApartamento(int num, int andar){
        this.apart.add(new Apartamento(num,andar));
    }

    public Edificio(String nome, String endereco) {
        this.nome = nome;
        this.endereco = endereco;
        this.apart = new ArrayList<>();
    }

    public Edificio(){}

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getEndereco() {
        return endereco;
    }

    public void setEndereco(String endereco) {
        this.endereco = endereco;
    }

    public ArrayList<Apartamento> getApart() {
        return apart;
    }

    public void setApart(ArrayList<Apartamento> apart) {
        this.apart = apart;
    }

    @Override
    public String toString() {
        return "Edificio{" +
                "nome='" + nome + '\'' +
                ", endereco='" + endereco + '\'' +
                ", apart=" + apart +
                '}';
    }
}
