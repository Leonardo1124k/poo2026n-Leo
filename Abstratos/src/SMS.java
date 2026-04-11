public class SMS extends CanalNotificacao {
    protected int numeroTelefone;

    public SMS(String destinatario, String mensagem, int numeroTelefone) {
        super(destinatario, mensagem);
        this.numeroTelefone = numeroTelefone;
    }

    public SMS(){
        super();
    }

    @Override
    public void enviar(){
        System.out.println("Enviando SMS para o numero " + numeroTelefone + ":" + mensagem);
    }

    public int getNumeroTelefone() {
        return numeroTelefone;
    }

    public void setNumeroTelefone(int numeroTelefone) {
        this.numeroTelefone = numeroTelefone;
    }

    @Override
    public String toString() {
        return "SMS{" +
                super.toString()+
                "numeroTelefone=" + numeroTelefone +
                '}';
    }
}
