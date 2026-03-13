public class SmartTv {
    private String marca;
    private String modelo;
    private int volume;
    private boolean internet;

    public SmartTv(){
    }

    public SmartTv(String marca, String modelo, int volume, boolean internet){
        this.setMarca(marca);
        this.setVolume(volume);
        this.setModelo(modelo);
        this.internet = internet;
    }

    public int getVolume(){
        return this.volume;
    }

    public void setVolume(int volume){
        if(volume <= 0 && volume <= 100){
            this.volume = volume;
        }
        else{
            System.out.println("Volume invalido");
        }
    }

    public String getMarca(String marca){
        return this.marca;
    }

    public void setMarca(String marca){
        if(marca.length() <= 30){
            this.marca = marca;
        }else{
            System.out.println("Marca inválida.");
        }
    }

    public String getModelo(){
        return this.modelo;
    }

    public void setModelo(String modelo){
        char letraInicial = modelo.charAt(0);
        boolean resp = Character.isUpperCase(letraInicial);
        if(resp){
            this.modelo = modelo;
        }
        else{
            System.out.println("Modelo inválido");
        }
    }

    public void aumentaVolume(int x){
        this.setVolume(this.volume + x);
    }

    public void diminuirVolume(int x){
        this.setVolume(this.volume - x);
    }

    public void abrirYoutube(){
        //primeiro -> conectar na internet
        if(this.conectaInternet()){
            System.out.println("Youtube abrindo");
        }else{
            System.out.println("Sem internet para abrir Youtube");
        }
    }

    private boolean conectaInternet(){
        System.out.println("Verificando conexões disponíveis");
        System.out.println("Consultando credenciais");
        int randomico = (int) (Math.random() * 10);
        if(randomico < 5){
            System.out.println("IP gerado com sucesso");
            return true;
        }
        else{
            System.out.println("Falha na conexão");
            return false;
        }
    }


}
