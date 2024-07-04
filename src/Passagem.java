public class Passagem {

    // Atributo que representa o preço da passagem
    private double preco;

    // Atributo que representa o voo associado à passagem
    private Voo voo;

    // Construtor da classe `Passagem`
    // Este construtor recebe como parâmetros o preço da passagem e o voo associado
    public Passagem(double preco, Voo voo) {
        // Inicializa o atributo `preco` com o valor passado no parâmetro
        this.preco = preco;

        // Inicializa o atributo `voo` com o valor passado no parâmetro
        this.voo = voo;
    }

    // Método que retorna o preço da passagem
    public double getPreco() {
        // Retorna o valor do atributo `preco`
        return preco;
    }

    // Método que retorna o voo ligado à passagem
    public Voo getVoo() {
        // Retorna o valor do atributo `voo`
        return voo;
    }

    // Método que define o preço da passagem
    // Ele recebe como parâmetro o novo preço da passagem
    public void setPreco(double preco) {
        // Atualiza o valor do atributo `preco` com o novo valor passado no parâmetro
        this.preco = preco;
    }

    // Método que define o voo associado à passagem
    // Este método recebe como parâmetro o novo voo associado à passagem
    public void setVoo(Voo voo) {
        // Atualiza o valor do atributo `voo` com o novo valor passado no parâmetro
        this.voo = voo;
    }

    // Método `toString()` redefinido
    // Este método retorna uma String representando a passagem
    @Override
    public String toString() {
        // vai retornar uma String com as informações da passagem: preço e voo
        return "Passagem{" +
                "preco=" + preco +
                ", voo=" + voo +
                '}';
    }
}
