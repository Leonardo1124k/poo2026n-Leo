public class Conta {
    public int numeroConta;
    public int agencia;
    public String nomeCliente;
    public float saldo = 0;
    public boolean status = true;

    //metodo construtor
    public Conta(int numeroConta, int agencia, String nomeCliente){
        this.numeroConta = numeroConta;
        this.agencia = agencia;
        this.nomeCliente = nomeCliente;
    }

    public Conta(){

    }

    public void depositar(float valor){
        if(status == true){
            saldo += valor; // é igual a saldo = saldo + adicionar
            System.out.println("Valor adicionado de R$" + valor + " -> Agora você possui R$" + saldo + " em conta.");
        }

    }

    public void sacar(float valor){
        if(status == true && this.saldo >= valor){
            saldo -= valor; // é igual a saldo = saldo - adicionar
            System.out.println("Você sacou R$" + valor + " de sua conta.");
        }
        else {
            if(status == false){
                System.out.println("A conta está inativa. Não é possível prosseguir");
            }else{
                System.out.println("A conta está com saldo insuficiente. Não é possível sacar esse valor");
            }
        }
    }

    public void encerrarConta(){
        if (saldo == 0){
            this.status = false;
            System.out.println("Conta encerrada.");
        }else{
            System.out.println("Não é possível encerrar a conta. Primeiro saque o saldo existente");
        }
    }

    public String toString(){
        return "Número da conta: " + numeroConta +
                "\nAgência: " + agencia +
                "\nCliente: " + nomeCliente +
                "\nSaldo atual: " + saldo +
                "\nSituação da conta: " + status;
    }

}
