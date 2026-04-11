public class Whatsapp extends CanalNotificacao {
    private String statusLeitura;
    public Whatsapp(){super();}

    public Whatsapp(String destinatario, String mensagem, String statusLeitura) {
        super(destinatario, mensagem);
        this.statusLeitura = statusLeitura;
    }

    @Override
    public void enviar() {
        System.out.println("Enviando Zap para " + this.destinatario +
                " Mensagem:" + this.mensagem);
    }

    @Override
    public String toString() {
        return "WhatsApp{" +
                super.toString() +
                "statusLeitura='" + statusLeitura + '\'' +
                '}';
    }

    public String getStatusLeitura() {
        return statusLeitura;
    }

    public void setStatusLeitura(String statusLeitura) {
        this.statusLeitura = statusLeitura;
    }
}
