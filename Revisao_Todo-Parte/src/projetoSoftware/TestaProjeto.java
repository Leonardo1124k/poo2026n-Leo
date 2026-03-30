package projetoSoftware;

public class TestaProjeto {
    public static void main(String[] args){
        Programador pr1 = new Programador(101, "José", "Python");
        Projeto pro1 = new Projeto(52, "Shark Tank");
        pro1.agregaProgramador(pr1);
        System.out.println(pro1);

        Programador pr2 = new Programador(102, "Willian", "JavaScript");
        pro1.agregaProgramador(pr2);
        System.out.println(pro1);

        pro1.listaProgramadores();
    }
}
