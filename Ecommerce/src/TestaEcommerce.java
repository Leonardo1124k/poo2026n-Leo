import java.util.Date;

public class TestaEcommerce {
    public static void main (String[] args){

        Cliente cliente = new Cliente("4854950", "Leandro", "Jardim Palestina");
        CarrinhoCompra carrinho = new CarrinhoCompra(cliente, 4846, new Date());

        System.out.println(carrinho.toString());

        Produto prod = new Produto(10, "Memoria RAM", "16 G", 100);
//        ItemCarrinho icar = new ItemCarrinho(100, 3, prod);
        carrinho.adicioneItemCarrinho(100, 3, prod);


        Produto prod2 = new Produto(100, "Memoria RAM", "32 G", 1000);
//        ItemCarrinho icar2 = new ItemCarrinho(1000, 30, prod2);
        carrinho.adicioneItemCarrinho(1000, 30, prod2);

        System.out.println(carrinho.toString());

//        System.out.println(prod2.toString());

    }
}
