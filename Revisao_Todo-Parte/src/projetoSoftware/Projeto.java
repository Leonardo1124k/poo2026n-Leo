package projetoSoftware;

import java.util.ArrayList;

public class Projeto {
    private int id;
    private String nomeProjeto;
    private ArrayList<Programador> programador;

    public Projeto(int id, String nomeProjeto) {
        this.id = id;
        this.nomeProjeto = nomeProjeto;
        this.programador = new ArrayList<>();
    }

    public Projeto(){
        this.programador = new ArrayList<>();
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getNomeProjeto() {
        return nomeProjeto;
    }

    public void setNomeProjeto(String nomeProjeto) {
        this.nomeProjeto = nomeProjeto;
    }

    public ArrayList<Programador> getProgramador() {
        return programador;
    }

    public void setProgramador(ArrayList<Programador> programador) {
        this.programador = programador;
    }

    public void agregaProgramador(Programador p){
        this.programador.add(p);
    }

    public void listaProgramadores(){
        if(programador != null){
            for (Programador p : this.programador){
                System.out.println(p.getNome());
            }
        }else{
            System.out.println("Não há");
        }
    }

    @Override
    public String toString() {
        return "Projeto{" +
                "id=" + id +
                ", nomeProjeto='" + nomeProjeto + '\'' +
                ", programador=" + programador +
                '}';
    }
}
