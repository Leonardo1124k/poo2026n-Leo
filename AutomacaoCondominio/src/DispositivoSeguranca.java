//Modelo base para itens de segurança. Não pode ser instanciada.
public abstract class DispositivoSeguranca {
    protected String localizacao;
    protected boolean ativo;

    public void status(){
        String st;
        if(ativo){
             st = "ativo";
        }else{
             st = "desativado";
        }
        System.out.println("O dispositivo está " + st +". Está localizado em " + localizacao);
    }

    public abstract void dispararAlerta();

    public DispositivoSeguranca(String localizacao, boolean ativo) {
        this.localizacao = localizacao;
        this.ativo = ativo;
    }

    public DispositivoSeguranca() {
    }

    public String getLocalizacao() {
        return localizacao;
    }

    public void setLocalizacao(String localizacao) {
        this.localizacao = localizacao;
    }

    public boolean isAtivo() {
        return ativo;
    }

    public void setAtivo(boolean ativo) {
        this.ativo = ativo;
    }

    @Override
    public String toString() {
        return "DispositivoSeguranca{" +
                "localizacao='" + localizacao + '\'' +
                ", ativo=" + ativo +
                '}';
    }
}
