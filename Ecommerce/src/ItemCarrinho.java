public class ItemCarrinho {
    private int id;
    private float quant;
    private Produto produto;

    // Esse construtor caracteriza uma agregação
    //motivo: o produto já vem pronto

    public ItemCarrinho(int id, float quant, Produto produto) {
        this.id = id;
        this.quant = quant;
        this.produto = produto;
    }

    public ItemCarrinho(){

    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public float getQuant() {
        return quant;
    }

    public void setQuant(float quant) {
        this.quant = quant;
    }

    public Produto getProduto() {
        return produto;
    }

    //agregacao - produto já veio criado é independente
    public void setProduto(Produto produto) {
        this.produto = produto;
    }

    @Override
    public String toString() {
        return "ItemCarrinho{" +
                "id=" + id +
                ", quant=" + quant +
                ", produto=" + produto +
                '}';
    }
}
