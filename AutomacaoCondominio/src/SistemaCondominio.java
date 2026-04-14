//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class SistemaCondominio {
    public static void main(String[] args) {
        DispositivoSeguranca cam1 = new Camera("Patio B", true, "500px");
        DispositivoSeguranca cam2 = new Camera("Patio C", false, "400px");
        DispositivoSeguranca sen1 = new SensorMovimento("Patio D", true, 600);
        DispositivoSeguranca sen2 = new SensorMovimento("Patio E", false, 300);

        Condominio con = new Condominio("Franca Garden");

        con.adicionarDispositivo(cam1);
        con.adicionarDispositivo(cam2);
        con.adicionarDispositivo(sen1);
        con.adicionarDispositivo(sen2);


        con.testeGeralSeguranca();
    }
}