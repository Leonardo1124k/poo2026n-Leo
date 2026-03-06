import java.util.Scanner;

public class TestaCarro {
    public static void main(String args[]) {
        // Atributos/propriedades -> variaveis
        Scanner sc = new Scanner(System.in);
        Carro obj1 = new Carro();
        obj1.marca = "Fiat";
        obj1.modelo = "Palio";
        obj1.placa = "E3432TD";
        obj1.motor = true;
        obj1.velAtual = 0;
        System.out.println(obj1.toString());

        Carro obj2 = new Carro("Fiat", "Palio", "432dfs", false, 0);
        System.out.println(obj2.toString());

        System.out.println("Você deseja desligar o carro? 0 desliga | 1 liga");
        int hum = sc.nextInt();
        if(hum == 1 && obj1.motor != true){
            obj1.ligaCarro();
        }
        else if(hum == 1 && obj1.motor == true){
            System.out.println("O carro já está ligado! ");
        }
        else if (hum == 0 && obj1.motor != false){
            obj1.desligaCarro();
        }
        else if (hum == 0 && obj1.motor == false){
            System.out.println("O carro já está Desligado! ");
        }
        else{
            System.out.println("Código de resposta inválido!");
        }

        System.out.print("Quer aumentar a velocidade em quanto? ");
        float aumento = sc.nextFloat();
        obj1.acelerar(aumento);

        System.out.println("Quer reduzir a velocidade em quanto? ");
        float reducao = sc.nextFloat();
        obj1.frear(reducao);
    }
        //Metodos -> Operacoes
}
