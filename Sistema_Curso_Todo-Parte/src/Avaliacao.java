import java.util.ArrayList;

public class Avaliacao {

    private int id;
    private String nome;
    private ArrayList<Questao> questao;

    public void adicionarQuestao(int num, String texto, float peso){
        Questao aux = new Questao(num, texto, peso);
        this.questao.add(aux);
    }

    public Avaliacao(int id, String nome) {
        this.id = id;
        this.nome = nome;
        this.questao = new ArrayList<>();
    }

    public Avaliacao(){
        this.questao = new ArrayList<>();
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

    public ArrayList<Questao> getQuestao() {
        return questao;
    }

    public void setQuestao(ArrayList<Questao> questao) {
        this.questao = questao;
    }

    @Override
    public String toString() {
        return "Avaliacao{" +
                "id=" + id +
                ", nome='" + nome + '\'' +
                ", questao=" + questao +
                '}';
    }
}
