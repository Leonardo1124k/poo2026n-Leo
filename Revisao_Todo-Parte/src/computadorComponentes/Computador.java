package computadorComponentes;

public class Computador {
    private int id;
    private String marca;
    private Processador processador;

    public Computador(int id, String marca, Processador processador) {
        this.id = id;
        this.marca = marca;
        this.processador = processador;
    }

    public Computador(){}

//    public void inserirProcessador(String mar, String modelo, String frequencia) {
//        this.processador = new Processador(mar, modelo, frequencia);
//    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getMarca() {
        return marca;
    }

    public void setMarca(String marca) {
        this.marca = marca;
    }

    public Processador getProcessador() {
        return processador;
    }

    public void setProcessador(Processador processador) {
        this.processador = processador;
    }

    @Override
    public String toString() {
        return "Computador{" +
                "id=" + id +
                ", marca='" + marca + '\'' +
                ", processador=" + processador +
                '}';
    }
}
