package biblioteca;

import java.time.LocalDate;

public class TestaBiblioteca {
    public static void main(String[] args){
        Leitor le1= new Leitor(101, "Lucas");
        LocalDate dataInicial = LocalDate.of(2026, 3, 20);
        LocalDate dataFinal = LocalDate.of(2026, 4, 20);
        Livro li1 = new Livro(52, "Revolucao dos Bichos", "George Orwell");

        Emprestimo em1 = new Emprestimo(dataInicial, dataFinal, le1, li1);


        System.out.println(em1.toString());
    }
}
