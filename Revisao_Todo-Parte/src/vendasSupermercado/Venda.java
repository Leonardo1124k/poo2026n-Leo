package vendasSupermercado;

import java.util.ArrayList;

public class Venda {
    private Cliente cliente;
    private ArrayList<ItemVenda> item;

    public Venda(Cliente cliente) {
        this.cliente = cliente;
        this.item = new ArrayList<>();
    }

    public Venda(){
        this.item = new ArrayList<>();
    }

    public Cliente getCliente() {
        return cliente;
    }

    public void setCliente(Cliente cliente) {
        this.cliente = cliente;
    }

    public void adicioneItemVenda(int id, int quant, Produto produto){
        ItemVenda aux = new ItemVenda(id, quant, produto);
        this.item.add(aux);
    }

    public ArrayList<ItemVenda> getItem() {
        return item;
    }

//    public void setItem(ArrayList<ItemVenda> item) {
//        this.item = item;
//    }

    @Override
    public String toString() {
        return "Venda{" +
                "cliente=" + cliente +
                ", item=" + item +
                '}';
    }
}