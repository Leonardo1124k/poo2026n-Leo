public class Van extends Veiculo {
    private boolean refrigerada;

    @Override
    public double calcularCustoViagem(double distancia){
        if (refrigerada){
            return distancia * 3 + 100;
        }else{
            return distancia * 3;
        }
    }

    public Van(String placa, double capacidadeCarga, boolean refrigerada) {
        super(placa, capacidadeCarga);
        this.refrigerada = refrigerada;
    }

    public Van() {
        super();
    }

    public boolean isRefrigerada() {
        return refrigerada;
    }

    public void setRefrigerada(boolean refrigerada) {
        this.refrigerada = refrigerada;
    }

    @Override
    public String toString() {
        return "Van{" +
                super.toString()+
                "refrigerada=" + refrigerada +
                '}';
    }
}
