package vendasSupermercado;

import java.util.ArrayList;

public class TestaVenda {
    public static void main(String[] args) {

        // Criando produtos (existem independente da venda)
        Produto p1 = new Produto(1, "Arroz", 25.50);
        Produto p2 = new Produto(2, "Feijão", 8.99);
        Produto p3 = new Produto(3, "Macarrão", 5.75);

        // Criando cliente
        Cliente cliente = new Cliente(1, "Leonardo");

        // Criando venda (agrega cliente)
        Venda venda = new Venda(cliente);

        // Criando itens de venda (composição)

        // Adicionando itens à venda
        venda.adicioneItemVenda(1, 2, p1);
        venda.adicioneItemVenda(2, 3, p2);
        venda.adicioneItemVenda(3, 1, p3);

        // Exibindo dados da venda
        System.out.println("===== DADOS DA VENDA =====");
        System.out.println("Cliente: " + venda.getCliente().getNome());

        double total = 0;

        for (ItemVenda item : venda.getItem()) {
            double subtotal = item.getQuantidade() * item.getProduto().getPreco();

            System.out.println(
                    "Produto: " + item.getProduto().getNome() +
                            " | Quantidade: " + item.getQuantidade() +
                            " | Preço Unitário: " + item.getProduto().getPreco() +
                            " | Subtotal: " + subtotal
            );

            total += subtotal;
        }

        System.out.println("TOTAL DA VENDA: R$ " + total);
    }
}