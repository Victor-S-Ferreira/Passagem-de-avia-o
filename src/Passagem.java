// Classe Passagem
public class Passagem extends Voo {
    private double preco;

    public Passagem(String destino, String origem, String data, String numeroVoo, double preco) {
        super(destino, origem, data, numeroVoo);
        this.preco = preco;
    }

    public double getPreco() {
        return preco;
    }

    public void setPreco(double preco) {
        this.preco = preco;
    }

    @Override
    public String toString() {
        return super.toString() + " Passagem{" +
                "preco=" + preco +
                '}';
    }
}
