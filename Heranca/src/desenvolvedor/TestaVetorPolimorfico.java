package desenvolvedor;

import java.util.ArrayList;

public class TestaVetorPolimorfico {
    public static void main(String [] args) {
        ArrayList<Desenvolvedor> dev = new ArrayList<>();

        Desenvolvedor dv = new Desenvolvedor("Zuleide", "PHP", 2000);
        Junior jr = new Junior("Beltrano", "Fulano", "Java", 4000);
        Pleno pl = new Pleno("Beltrano", "Java", 6000, 8);
        Senior sr = new Senior("Ciclano", "Java", 9000, 30000);

        dev.add(jr);
        dev.add(pl);
        dev.add(sr);
        dev.add(dv);

        exibeDados(dev);
    }

    public static void exibeDados(ArrayList<Desenvolvedor> camaleao){
        for(Desenvolvedor developer : camaleao){
            developer.codar();
            System.out.println("Bônus " + developer.calculaBonus());
            System.out.println(developer.toString());
            System.out.println();
        }
    }
}
