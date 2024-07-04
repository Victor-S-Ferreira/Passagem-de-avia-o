import java.sql.SQLOutput;

public class Cliente {
        private String nome;


        private String email;
        private CarrinhoDeCompras carrinho;

        public Cliente(String nome, String email) {
            this.nome = nome;
            this.email = email;
            this.carrinho = new CarrinhoDeCompras();
        }

        public void adicionarPassagemNoCarrinho(Passagem passagem) {
            carrinho.adicionarPassagem(passagem);
        }

        public void removerPassagemDoCarrinho(Passagem passagem) {
            carrinho.removerPassagem(passagem);
        }

        public void aplicarDescontoNoCarrinho(double percentual) {
            carrinho.aplicarDesconto(percentual);
        }

        public void finalizarCompra() {
            // Implementação do processo de finalização da compra
            System.out.println("Compra finalizada. Total: " + carrinho.calcularTotal());
        }

        public CarrinhoDeCompras getCarrinho() {
            return carrinho;
        }

        public String getNome() {
            return nome;
        }

        public void setNome(String nome) {
            this.nome = nome;
        }

        public String getEmail() {
            return email;
        }

        public void setEmail(String email) {
            this.email = email;
        }

        @Override
        public String toString() {
            return "Cliente{" +
                    "nome='" + nome + '\'' +
                    ", email='" + email + '\'' +
                    ", carrinho=" + carrinho +
                    '}';
        }
    }


