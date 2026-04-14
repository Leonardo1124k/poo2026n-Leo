public class Caminhao extends Veiculo {
    private int quantidadeEixos;

    @Override
    public double calcularCustoViagem(double distancia){
        return distancia * 5 + (quantidadeEixos * 50);
    }

    public Caminhao(String placa, double capacidadeCarga, int quantidadeEixos) {
        super(placa, capacidadeCarga);
        this.quantidadeEixos = quantidadeEixos;
    }

    public Caminhao() {
        super();
    }

    public int getQuantidadeEixos() {
        return quantidadeEixos;
    }

    public void setQuantidadeEixos(int quantidadeEixos) {
        this.quantidadeEixos = quantidadeEixos;
    }

    @Override
    public String toString() {
        return "Caminhao{" +
                 super.toString()+
                "quantidadeEixos=" + quantidadeEixos +
                '}';
    }
}
