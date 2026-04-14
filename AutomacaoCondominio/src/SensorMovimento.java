import java.sql.SQLOutput;

public class SensorMovimento extends DispositivoSeguranca implements DispositivoConectado {
    private double sensibilidade;

    @Override
    public void conectarWiTone() {
        System.out.println("Sensor conectado via rádio frequência 433MHz");
    }

    @Override
    public void realizarAutodiagnostico() {
        System.out.println("Autodiagnostico de Sensor de Movimento OK");
    }

    @Override
    public void dispararAlerta() {
        System.out.printf("Movimento detectado em %s. Acionando luzes de emergência%n", localizacao);
    }

    public SensorMovimento(String localizacao, boolean ativo, double sensibilidade) {
        super(localizacao, ativo);
        this.sensibilidade = sensibilidade;
    }

    public SensorMovimento(){
        super();
    }

    @Override
    public String toString() {
        return "SensorMovimento{" +
                super.toString() +
                "sensibilidade=" + sensibilidade +
                '}';
    }
}
