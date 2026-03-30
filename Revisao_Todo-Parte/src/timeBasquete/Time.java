package timeBasquete;

import java.util.ArrayList;

public class Time {
    private int id;
    private String nome, tecnico;
    private ArrayList<Atleta> atleta;

    public Time(int id, String nome, String tecnico) {
        this.id = id;
        this.nome = nome;
        this.tecnico = tecnico;
        this.atleta = new ArrayList<>();
    }

    public Time() {
        this.atleta = new ArrayList<>();
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getTecnico() {
        return tecnico;
    }

    public void setTecnico(String tecnico) {
        this.tecnico = tecnico;
    }

    public ArrayList<Atleta> getAtleta() {
        return atleta;
    }

    public void setAtleta(ArrayList<Atleta> atleta) {
        this.atleta = atleta;
    }

    public void contratarAtleta(Atleta a){
        this.atleta.add(a);
    }

    public void demitirAtleta(Atleta a){
        this.atleta.remove(a);
    }

    @Override
    public String toString() {
        return "Time{" +
                "id=" + id +
                ", nome='" + nome + '\'' +
                ", tecnico='" + tecnico + '\'' +
                ", atleta=" + atleta +
                '}';
    }
}
