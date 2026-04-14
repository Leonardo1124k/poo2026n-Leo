public class Camera extends DispositivoSeguranca implements DispositivoConectado{
    private String resolucao;

    @Override
    public void dispararAlerta() {
        System.out.println("Gravando imagens em alta definicao de " + localizacao+ " e enviando para a central.");
    }

    @Override
    public void conectarWiTone() {
        System.out.println("Câmera conectada via protocolo seguro SSL");
    }

    @Override
    public void realizarAutodiagnostico() {
        System.out.println("Autodiagnostico da câmera OK");
    }

    public Camera(String localizacao, boolean ativo, String resolucao) {
        super(localizacao, ativo);
        this.resolucao = resolucao;
    }

    public Camera(){
        super();
    }

    public String getResolucao() {
        return resolucao;
    }

    public void setResolucao(String resolucao) {
        this.resolucao = resolucao;
    }

    @Override
    public String toString() {
        return "Camera{" +
                super.toString()+
                "resolucao='" + resolucao + '\'' +
                '}';
    }
}
