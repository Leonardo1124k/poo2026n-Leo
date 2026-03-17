import java.util.ArrayList;
import java.util.Date;

public class CarrinhoCompra {
    private Cliente cliente; // O de letra maiuscula é a classe; o menor é o objeto/ instancia
    private int id;
    private Date data;
    private ArrayList<ItemCarrinho> itensCarrinho;

    public CarrinhoCompra(){
        this.itensCarrinho = new ArrayList<>();
    }
    // Esse construtor caracteriza uma agregação
    //motivo: o cliente já vem pronto

    public CarrinhoCompra(Cliente cliente, int id, Date data) {
        this.cliente = cliente;
        this.id = id;
        this.data = data;
    }

    public void adicioneItemCarrinho(int id, float quant, Produto produto){
        ItemCarrinho aux = new ItemCarrinho(id, quant, produto);
        this.itensCarrinho.add(aux);
    }

    public Cliente getCliente() {
        return cliente;
    }

    //agregacao - cliente já veio criado é independente
    public void setCliente(Cliente cliente) {
        this.cliente = cliente;
    }

    public void calculaTotalCompra(){
        float valorTotal = 0;
        for(ItemCarrinho aux: this.itensCarrinho){
            valorTotal += aux.getQuant() * aux.getProduto().getPreco();
        }
        System.out.println("Valor total da compra R$" + valorTotal);
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public Date getData() {
        return data;
    }

    public void setData(Date data) {
        this.data = data;
    }

    @Override
    public String toString() {
        // o cliente aqui é o toString da classe cliente, não o get
        return "CarrinhoCompra{" +
                "cliente=" + cliente+
                ", id=" + id +
                ", data=" + data +
                ", item Carrinho=\n" + itensCarrinho +
                '}';
    }
}
