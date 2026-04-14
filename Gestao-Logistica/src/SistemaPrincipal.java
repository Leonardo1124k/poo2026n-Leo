//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class SistemaPrincipal {
    public static void main(String[] args) {
        EmpresaLogistica empresa = new EmpresaLogistica("Grupo Henrique");

        Veiculo c1 = new Caminhao("102K8", 1000.50, 7);
        Veiculo c2 = new Caminhao("292K8", 2000.50, 8);

        Veiculo v1 = new Van("4554K3", 500.0, true);
        Veiculo v2 = new Van("5854K3", 400.0, false);

        empresa.adicionarVeiculo(c1);
        empresa.adicionarVeiculo(c2);
        empresa.adicionarVeiculo(v1);
        empresa.adicionarVeiculo(v2);

        empresa.gerarRelatorioCustos(300.0);

    }
}