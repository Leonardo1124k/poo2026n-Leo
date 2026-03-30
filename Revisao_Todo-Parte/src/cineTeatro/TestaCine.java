package cineTeatro;

import java.time.LocalDateTime;

public class TestaCine {
    public static void main(String[] args) {
        Filme f1 = new Filme(1, "Batman", "Heroi", 120);
        Filme f2 = new Filme(2, "Duna", "Ficcao", 150);

        Sessao s1 = new Sessao(1, LocalDateTime.of(2026, 7, 20, 20, 0), 3);

        s1.vincularFilme(f1);

        s1.venderIngresso(1, "A1", "inteira", 50.00f);

        s1.venderIngresso(2, "A2", "inteira", 50.00f);

        s1.venderIngresso(3, "A3", "inteira", 50.00f);

        System.out.println(s1.toString());
    }
}
