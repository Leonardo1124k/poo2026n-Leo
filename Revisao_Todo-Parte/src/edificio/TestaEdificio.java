package edificio;

import computadorComponentes.Computador;
import computadorComponentes.Processador;

public class TestaEdificio {
    public static void main(String[] args){
        Edificio ed1 = new Edificio("Taiwan Hotel", "Rua São Vicente de Castro");
        System.out.println(ed1);

        ed1.construirApartamento(1, 1);
        ed1.construirApartamento(2, 1);
        System.out.println(ed1);

        ed1.getApart().remove(0);
        System.out.println(ed1);


//        System.out.println(com1.getProcessador());


    }
}
