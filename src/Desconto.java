public class Desconto {

    // armazena o valor do desconto
    private double valor;

    public Desconto(double valor) {
        this.valor = valor;
    }

    // obter o valor do desconto
    public double getValor() {
        return valor;
    }

    // definir o valor do desconto
    public void setValor(double valor) {
        this.valor = valor;
    }

    // método para calcular o desconto a ser aplicado em um valor total
    public double calcularDesconto(double valorTotal) {
        return valorTotal * (valor / 100);
    }

    // aplica o desconto em um valor total e retorna o valor final
    public double aplicarDesconto(double valorTotal) {
        double descontoAplicado = calcularDesconto(valorTotal);
        return valorTotal - descontoAplicado;
    }
}
