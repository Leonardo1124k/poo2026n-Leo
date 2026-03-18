public class TestaAcademico {
    public static void main(String[] args){
        Aluno alu1 = new Aluno(4856, "Leo", "48561", "Engenharia de Software");
        Aluno alu2 = new Aluno(4752, "Renato", "47562", "ADS");

        Disciplina dis1 = new Disciplina(1, "POO", "Daniel");

        dis1.matricularAluno(alu1);
        dis1.matricularAluno(alu2);

        dis1.criarAvaliacao(01,"Prova Semestral");

        dis1.getAvaliacao().get(0).adicionarQuestao(1, "Quando Trump nasceu?", 3.33f);
        dis1.getAvaliacao().get(0).adicionarQuestao(2, "Quando o Brasil foi descoberto?", 3.33f);
        dis1.getAvaliacao().get(0).adicionarQuestao(3, "Quem comprou o Alasca?", 3.33f);

        System.out.println(dis1.toString());
    }
}
