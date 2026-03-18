import java.util.ArrayList;

public class Disciplina {
    private int id;
    private String nome;
    private String professor;
    private ArrayList<Aluno> aluno;
    private ArrayList<Avaliacao> avaliacao;

    public void matricularAluno(Aluno a){
        this.aluno.add(a);
    }

    public void criarAvaliacao(int id, String nome){
        Avaliacao aux = new Avaliacao(id, nome);
        this.avaliacao.add(aux);
    }

    public Disciplina(int id, String nome, String professor) {
        this.id = id;
        this.nome = nome;
        this.professor = professor;
        this.aluno = new ArrayList<>();
        this.avaliacao = new ArrayList<>();
    }

    public Disciplina(){

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

    public String getProfessor() {
        return professor;
    }

    public void setProfessor(String professor) {
        this.professor = professor;
    }

    public ArrayList<Aluno> getAluno() {
        return aluno;
    }

    public void setAluno(ArrayList<Aluno> aluno) {
        this.aluno = aluno;
    }

    public ArrayList<Avaliacao> getAvaliacao() {
        return avaliacao;
    }

    public void setAvaliacao(ArrayList<Avaliacao> avaliacao) {
        this.avaliacao = avaliacao;
    }

    @Override
    public String toString() {
        return "Disciplina{" +
                "id=" + id +
                ", nome='" + nome + '\'' +
                ", professor='" + professor + '\'' +
                ", aluno=" + aluno +
                ", avaliacao=" + avaliacao +
                '}';
    }
}
