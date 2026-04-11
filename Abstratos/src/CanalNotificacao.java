public abstract class CanalNotificacao {
    protected String destinatario;
    protected String mensagem;

    public CanalNotificacao(String destinatario, String mensagem) {
        this.destinatario = destinatario;
        this.mensagem = mensagem;
    }

    public CanalNotificacao() {

    }

    public String getDestinatario() {
        return destinatario;
    }

    public void setDestinatario(String destinatario) {
        this.destinatario = destinatario;
    }

    public String getMensagem() {
        return mensagem;
    }

    public void setMensagem(String mensagem) {
        this.mensagem = mensagem;
    }

    public void exibirDados(){
    }

    public abstract void enviar();

    @Override
    public String toString() {
        return "CanalNotificacao{" +
                "destinatario='" + destinatario + '\'' +
                ", mensagem='" + mensagem + '\'' +
                '}';
    }
}
