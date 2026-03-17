public class Streaming {
    public String usuario;
    public String plano;
    public float mensalidade;
    public boolean ativo = true;
    public String ultimoFilmeAsssistido = null;

    public Streaming(){

    }

    public Streaming(String usuario, String plano){
        this.usuario = usuario;
        this.plano = plano;
        if(plano == "Básico") {
            this.mensalidade = 25.90f;
        }else if(plano == "Premium"){
            this.mensalidade = 45.90f;
        }else if(plano == "Família"){
            this.mensalidade = 60.90f;
        }
    }

    public void assistirFilme(String nomeFilme){
        if(ativo == true){
            System.out.println("Assistindo: " + ultimoFilmeAsssistido);
        }else{
            System.out.println("A conta está inativa. Pague a fatura.");
        }
    }

    public void cancelarAssinatura(){
        this.ativo = false;
    }

    public String toString(){
        String situacao;
        if(ativo == true){
            situacao = "Ativo";
        }else{
            situacao = "Suspenso";
        }
        return "Usuario: " + usuario +
                "\nPlano: " + plano +
                "\nMensalidade: " + mensalidade +
                "\nSituação da conta: " + ativo +
                "\nÚltimo filme assistido: " + ultimoFilmeAsssistido;
    }

}
