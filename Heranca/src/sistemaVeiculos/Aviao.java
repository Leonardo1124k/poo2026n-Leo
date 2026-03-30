package sistemaVeiculos;

public class Aviao extends Veiculo {
    private float altitudeMax;

    public Aviao(String marca, String modelo, float velocidade, float altitudeMax) {
        super(marca, modelo, velocidade);
        this.altitudeMax = altitudeMax;
    }

    @Override
    public void mover(){
        System.out.printf("Avião voando a %.2f km/h e %.2f metros", velocidade, altitudeMax);
    }

    @Override
    public void abastecer(){
        System.out.println("Abastecendo com querosene de aviação.");
    }

}
