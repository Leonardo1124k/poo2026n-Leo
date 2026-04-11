public class Email extends CanalNotificacao{
    private String assunto;

    public Email(String destinatario, String mensagem, String assunto) {
        super(destinatario, mensagem);
        this.assunto = assunto;
    }

    public Email(){
        super();
    }

    public String getAssunto() {
        return assunto;
    }

    public void setAssunto(String assunto) {
        this.assunto = assunto;
    }

    @Override
    public void enviar() {
        System.out.println("Enviando e-mail para " + destinatario + " com o assunto " + assunto);
    }

    @Override
    public String toString() {
        return super.toString() +
                "Email{" +
                super.toString() +
                "assunto='" + assunto + '\'' +
                '}';
    }
}
