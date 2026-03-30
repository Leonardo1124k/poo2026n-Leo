package sistemaVeiculos;

public class CarroEletrico extends Veiculo {
    private int autonomiaBateria;

    public CarroEletrico(String marca, String modelo, float velocidade) {
        super(marca, modelo, velocidade);
        this.autonomiaBateria = autonomiaBateria;
    }

    @Override
    public void mover(){
        System.out.println("Carro eletrico movendo-se silenciosamente.");
    }

    @Override
    public void abastecer(){
        System.out.println("Recarregando bateria em posto de carga rápida");
    }


}
