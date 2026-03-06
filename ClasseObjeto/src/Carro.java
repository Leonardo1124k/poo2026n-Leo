public class Carro {
    public String marca, modelo, placa;
    public boolean motor; //true (ligado) false (Desligado)
    public float velAtual = 0;

    public Carro(String marca, String modelo, String placa, boolean motor, float velAtual){
        this.marca = marca;
        this.modelo = modelo;
        this.placa = placa;
        this.motor = motor;
        this.velAtual = velAtual;
    }

    public Carro(){

    }

    public void ligaCarro(){
        if(!this.motor){
            this.motor = true;
            System.out.println("Carro ligado");
        }
    }

    public void desligaCarro(){
        if(this.motor){
            this.motor = false;
            this.velAtual = 0;
            System.out.println("Carro desligado");
        }
    }

    public float acelerar(float aumento){
        this.velAtual = velAtual + aumento;
        System.out.println("Carro com velocidade aumentada ->" + velAtual + "km/h");
        return velAtual;
    }

    public float frear(float reducao){
        if(reducao <= velAtual ){
            this.velAtual = velAtual - reducao;
            System.out.println("Carro com velocidade reduzida ->" + velAtual + "km/h");
            return velAtual;
        }
        System.out.println("Impossível fazer a redução");
        return velAtual;
    }

    public String toString() {
        return "Marca: " + marca +
                " Modelo: " + modelo +
                " Placa: " + placa +
                " Vel Atual: " + velAtual +
                " Motor: " + (motor ? "ligado" : "desligado");

    }
}