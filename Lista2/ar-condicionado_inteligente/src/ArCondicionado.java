public class ArCondicionado {
    private String marca;
    private String modelo;
    private int temperatura;
    private boolean ligado;

    public ArCondicionado(String marca, String modelo, int temperatura, boolean ligado) {
        this.setMarca(marca);
        this.modelo = modelo;
        this.setTemperatura(temperatura);
        this.ligado = ligado;
    }

    public ArCondicionado() {
    }

    public String getMarca() {
        return marca;
    }

    public void setMarca(String m) {
        if(m.length() < 3){
            System.out.println("Nome muito curto, não aceito.");
        }else{
            this.modelo = m;
            System.out.println("Nome " + m + " aceito!");
        }
    }

    public String getModelo() {
        return modelo;
    }

    public void setModelo(String modelo) {
        this.modelo = modelo;
    }

    public int getTemperatura() {
        return temperatura;
    }

    public void setTemperatura(int t) {
        if(t < 16 || t > 30){
            System.out.println("Temperatura não aceita. Deve ser entre 16 e 30 graus.");
        }else{
            this.temperatura = t;
            System.out.println("Temperatura aceita.");
        }
    }

    public boolean isLigado() {
        return ligado;
    }

    public void setLigado(boolean ligado) {
        this.ligado = ligado;
    }

    public void ativarModoTurbo(){
        if (verificarCompressor()){
            this.setTemperatura(16);
            System.out.println("Modo turbo ativado");
        }else{
            System.out.println("Modo turbo não ativado.");
        }
    }

    private boolean verificarCompressor(){
        int sorte = (int) (Math.random() * 10);
        if (sorte <= 2){
            System.out.println("Compressor com falha técnica!");
            return false;
        }
        else{
            System.out.println("Compressor funcionando corretamente!");
            return true;
        }
    }

    @java.lang.Override
    public java.lang.String toString() {
        return "ArCondicionado{" +
                "marca='" + marca + '\'' +
                ", modelo='" + modelo + '\'' +
                ", temperatura=" + temperatura +
                ", ligado=" + ligado +
                '}';
    }
}
