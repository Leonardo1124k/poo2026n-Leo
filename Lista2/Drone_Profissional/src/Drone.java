public class Drone {
     private String codigo;
     private float altura;
     private int bateria;
     private boolean emVoo;

     public Drone(String codigo, float altura, int bateria, boolean emVoo){
         this.codigo = codigo;
         this.altura = altura;
         this.bateria = bateria;
         this.emVoo = emVoo;
     }

     public Drone(){
     }

     public String getCodigo(){
         return codigo;
     }

     public void setCodigo(String codigo){
         this.codigo = codigo;
     }

    public float getAltura() {
        return altura;
    }

    public void setAltura(float alt) {
         if(alt < 0 || alt > 120){
             System.out.println("Altura inválida!");
         }else{
             this.altura = alt;
             System.out.printf("Altura alterada para %.2f%n!", alt);
         }
    }

    public int getBateria() {
        return bateria;
    }

    public void setBateria(int bat) {
        if(bat < 0 || bat > 100){
            System.out.println("Bateria inválida!");
        }else{
            this.bateria = bat;
            System.out.printf("Bateria em %d%%%n", bat);
        }
    }

    public boolean isEmVoo() {
        return emVoo;
    }

    public void setEmVoo(boolean emVoo) {
        this.emVoo = emVoo;
    }

    public void decolar(){
        boolean motoresOk = testarMotores();
        if (this.bateria < 20){
            System.out.printf("Decolagem não permitida. Bateria em apenas %d%% porcento.", bateria);
        }else if(motoresOk == false){
            System.out.println("Motores não estão prontos. Decolagem não permitida");
        }else if(this.bateria >= 20 && motoresOk == true){
            this.emVoo = true;
            this.setAltura(2);
        }
    }

    private boolean testarMotores(){
        int sorte = (int) (Math.random() * 10);
        System.out.println("Testando hélices...");
        System.out.println("Calibrando GPS...");
        if (sorte <= 8){
            System.out.println("Motores disponiveis!");
            return true;
        }
        else{
            System.out.println("Motores não estão funcionando corretamente!");
            return false;
        }
    }

    public void subir(float x){
        this.setAltura(altura + x);
    }

    public void descer(float y){
        this.setAltura(altura - y);
    }

}
