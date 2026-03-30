//package cineTeatro;
//
//import java.time.LocalDateTime;
//import java.util.ArrayList;
//
//public class Sessao {
//    private int id;
//    private LocalDateTime horario;
//    private int sala;
//    private Filme filme;
//    private ArrayList<Ingresso> ingresso;
//
////    public Sessao(int id, LocalDateTime horario, int sala, Filme filme, Ingresso ingresso) {
////        this.id = id;
////        this.horario = horario;
////        this.sala = sala;
////        this.filme = filme;
////        this.ingresso = new ArrayList<>();
////    }
//
//    public Sessao(int id, LocalDateTime horario, int sala) {
//        this.id = id;
//        this.horario = horario;
//        this.sala = sala;
//        this.ingresso = new ArrayList<>();
//    }
//
//    public Sessao(){ this.ingresso = new ArrayList<>();}
//
//    public void vincularFilme(Filme f){
//        this.filme = f;
//    }
//
//    public void venderIngresso(int id, String assento, String tipo, float preco){
//        this.ingresso.add(new Ingresso(id, assento, tipo, preco));
//    }
//
//    @Override
//    public String toString() {
//        return "Sessao{" +
//                "id=" + id +
//                ", horario=" + horario +
//                ", sala=" + sala +
//                ", filme=" + filme +
//                ", ingresso=" + ingresso +
//                '}';
//    }
//}

package cineTeatro;

import java.time.LocalDateTime;
import java.util.ArrayList;


public class Sessao {
    private int id;
    private LocalDateTime horario;
    private int sala;

    // Agregação
    private Filme filme;

    // Composição
    private ArrayList<Ingresso> ingressos;

    public Sessao(int id, LocalDateTime horario, int sala) {
        this.id = id;
        this.horario = horario;
        this.sala = sala;
        this.ingressos = new ArrayList<>();
    }

    // Agregação
    public void vincularFilme(Filme f) {
        this.filme = f;
    }

    // Composição
    public void venderIngresso(int id, String assento, String tipo, float preco) {
        Ingresso ingresso = new Ingresso(id, assento, tipo, preco);
        ingressos.add(ingresso);
    }

    @Override
    public String toString() {
        return "Sessao{" +
                "id=" + id +
                ", horario=" + horario +
                ", sala=" + sala +
                ", filme=" + filme +
                ", ingressos=" + ingressos +
                '}';
    }
}