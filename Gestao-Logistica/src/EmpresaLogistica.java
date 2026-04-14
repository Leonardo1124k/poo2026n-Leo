import java.util.ArrayList;

public class EmpresaLogistica {
    private String nomeEmpresa;
    private ArrayList<Veiculo> frota;

    public void adicionarVeiculo(Veiculo v){
        this.frota.add(v);
    }

    public void gerarRelatorioCustos(double distancia){
        for(Veiculo v : frota) {
            System.out.println("O valor da viagem do veiculo da placa " + v.getPlaca() + " é: " + v.calcularCustoViagem(distancia));
        }
    }

    public EmpresaLogistica(String nomeEmpresa) {
        this.nomeEmpresa = nomeEmpresa;
        this.frota = new ArrayList<>();
    }

    public EmpresaLogistica() {
        this.frota = new ArrayList<>();
    }

    public String getNomeEmpresa() {
        return nomeEmpresa;
    }

    public void setNomeEmpresa(String nomeEmpresa) {
        this.nomeEmpresa = nomeEmpresa;
    }

    public ArrayList<Veiculo> getFrota() {
        return frota;
    }

    public void setFrota(ArrayList<Veiculo> frota) {
        this.frota = frota;
    }

    @Override
    public String toString() {
        return "EmpresaLogistica{" +
                "nomeEmpresa='" + nomeEmpresa + '\'' +
                ", frota=" + frota +
                '}';
    }
}
