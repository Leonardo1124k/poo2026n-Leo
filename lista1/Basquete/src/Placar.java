public class Placar {
    public String nomeTimeCasa;
    public String nomeTimeVisitante;
    public int pontosCasa = 0;
    public int pontosVisitante = 0;
    public int periodoQuarto = 1;

    public Placar(){

    }

    public Placar(String nomeTimeCasa, String nomeTimeVisitante){
        this.nomeTimeCasa = nomeTimeCasa;
        this.nomeTimeVisitante = nomeTimeVisitante;
    }

    public void registrarPonto(String time, int tipo){
        if(time == nomeTimeCasa){
            this.pontosCasa += tipo;
            System.out.println("Time da casa pontua " + tipo + " pontos.");
        }else if(time == nomeTimeVisitante){
            this.pontosVisitante += tipo;
            System.out.println("Time visitante pontua " + tipo + " pontos.");
        }

    }

    public void proximoQuarto(){
        if(periodoQuarto < 4){
            this.periodoQuarto += 1;
        }else{
            System.out.println("O jogo terminou!");
        }
    }

    public String toString(){
        return "Time " + nomeTimeCasa + " " + pontosCasa +
                " x " + pontosVisitante + " Time " + nomeTimeVisitante + " - Período: " +
                periodoQuarto;
    }


}
