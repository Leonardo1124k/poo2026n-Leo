package clinicaMedica;

public class Medico {
    private int id;
    private String name;
    private String especialidade;

    public Medico(int id, String name, String especialidade) {
        this.id = id;
        this.name = name;
        this.especialidade = especialidade;
    }

    public Medico(){

    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getEspecialidade() {
        return especialidade;
    }

    public void setEspecialidade(String especialidade) {
        this.especialidade = especialidade;
    }

    @Override
    public String toString() {
        return "Medico{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", especialidade='" + especialidade + '\'' +
                '}';
    }
}
