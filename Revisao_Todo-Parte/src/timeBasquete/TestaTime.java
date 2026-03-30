package timeBasquete;

public class TestaTime {
    public static void main(String[] args){
        Atleta at1 = new Atleta(101, "Yuri", "Pivô");
        Time ti1 = new Time(52, "The Boys", "Gustavo");
        ti1.contratarAtleta(at1);

        System.out.println(ti1);
        System.out.println(at1);

        ti1 = null; // Anulei objeto time

        System.out.println(ti1);
        System.out.println(at1);



//        Atleta at2 = new Atleta(103, "Iago", "Armador");
//        ti1.contratarAtleta(at2);
//
//        System.out.println(at2.toString());
//        System.out.println(ti1.toString());
//
//        ti1.

    }
}
