public abstract class Veiculo {
    protected String placa;
    protected double capacidadeCarga;

    public void exibirDados(){
        System.out.println(this.placa + " " + this.capacidadeCarga);
    }

    public abstract double calcularCustoViagem(double distancia);

    public Veiculo(String placa, double capacidadeCarga) {
        this.placa = placa;
        this.capacidadeCarga = capacidadeCarga;
    }

    public Veiculo(){

    }

    public String getPlaca() {
        return placa;
    }

    public void setPlaca(String placa) {
        this.placa = placa;
    }

    public double getCapacidadeCarga() {
        return capacidadeCarga;
    }

    public void setCapacidadeCarga(double capacidadeCarga) {
        this.capacidadeCarga = capacidadeCarga;
    }

    @Override
    public String toString() {
        return "Veiculo{" +
                "placa='" + placa + '\'' +
                ", capacidadeCarga=" + capacidadeCarga +
                '}';
    }
}
