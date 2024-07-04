
import java.util.ArrayList;
import java.util.List;

    public class CarrinhoDeCompras  {
        private List<Passagem> passagens;
        private double desconto;

        public CarrinhoDeCompras() {
            this.passagens = new ArrayList<>();
            this.desconto = 0;
        }

        public void adicionarPassagem(Passagem passagem) {
            passagens.add(passagem);
        }

        public void removerPassagem(Passagem passagem) {
            passagens.remove(passagem);
        }

        public void aplicarDesconto(double percentual) {
            if (percentual >= 0 && percentual <= 100) {
                this.desconto = percentual;
            } else {
                throw new IllegalArgumentException("Desconto deve estar entre 0 e 100");
            }
        }

        public double calcularTotal() {
            double total = 0;
            for (Passagem passagem : passagens) {
                total += passagem.getPreco();
            }
            total -= total * (desconto / 100);
            return total;
        }

        public List<Passagem> getPassagens() {
            return passagens;
        }

        public double getDesconto() {
            return desconto;
        }

        public void setDesconto(double desconto) {
            this.desconto = desconto;
        }

        @Override
        public String toString() {
            return "CarrinhoDeCompras{" +
                    "passagens=" + passagens +
                    ", desconto=" + desconto +
                    '}';
        }
    }


