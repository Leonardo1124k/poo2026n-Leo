package sistemaVeiculos;

public class TestaVeiculo {
    public static void main (String [] args) {
        Veiculo v1 = new Veiculo();
        Aviao a1 = new Aviao("Qatar Airways", "Run Away", 30, 70);
        CarroEletrico c1 = new CarroEletrico("Tesla", "Elon Musk", 120);

        Veiculo v2 = a1;
        v2.mover();

        v2 = c1;
        System.out.println();
        v2.mover();


    }
}
