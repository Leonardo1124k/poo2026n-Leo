import java.util.ArrayList;

public class Condominio {
    private String nome;
    private ArrayList<DispositivoSeguranca> dispositivos;

    public void adicionarDispositivo(DispositivoSeguranca d){
        dispositivos.add(d);
    }

    public void testeGeralSeguranca(){
        System.out.println("=== Teste Geral de Segurança - " + nome + " ===");
        for(DispositivoSeguranca d : dispositivos){
            d.dispararAlerta();
            if (d instanceof DispositivoConectado){
                ((DispositivoConectado) d).realizarAutodiagnostico();
            }
        }
    }

    public Condominio(String nome) {
        this.nome = nome;
        this.dispositivos = new ArrayList<>();
    }

    public Condominio(){

    }


}
