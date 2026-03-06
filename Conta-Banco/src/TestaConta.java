//import java.util.Scanner;
//
//public class TestaConta {
//    public static void main(String[] args) {
//        Scanner sc = new Scanner(System.in);
//        Conta conta = new Conta();
//        System.out.print("A conta deve estar ativa ou não? (S para sim | N para não)");
//        char resposta = sc.next().charAt(0);
//        if(resposta == 's' || resposta == 'S'){
//            System.out.println("A conta permanece ativa");
//        }
//        else{
//            System.out.println("A conta está desativada. Fim de papo.");
//            conta.status = false;
//        }
//        System.out.println("Valor atual da conta = R$" + conta.saldo);
//        System.out.print("Digite o valor que quer adicionar a conta R$");
//        float adicionar = sc.nextFloat();
//        conta.depositar(adicionar);
//        System.out.println("Digite o valor que quer sacar da conta: R$");
//        float valor = sc.nextFloat();
//        conta.sacar(valor);
//    }
//}

import java.util.Locale;

public class TestaConta {
    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
//        Scanner sc = new Scanner(System.in);
        Conta c1 = new Conta(101042, 215, "Joao Silva");
//        c1.nomeCliente = "Joao Silva";
        c1.depositar(500.00f);
        c1.sacar(200.00f);
        System.out.println(c1.toString());

        Conta c2 = new Conta(101043, 845, "Maria Souza");
        c2.sacar(50.00f);

        c1.encerrarConta();

        c1.sacar(300);
        c1.encerrarConta();
        System.out.println(c1.toString());
    }
}