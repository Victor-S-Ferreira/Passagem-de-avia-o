import java.util.ArrayList;
import java.util.List;
public class ListaDePassagem extends CarrinhoDeCompras {

    // Uma lista para armazenar as passagens
    private List <Passagem> passagens;

    // Construtor da classe `ListaDePassagem` - nao recebe parametros
    public ListaDePassagem() {
        // iniciar com uma nova lista vazia
        this.passagens = new ArrayList<>();
    }

    // Método que adiciona uma passagem à lista recebendo o parametro como passagem
    public void adicionarPassagem(Passagem passagem) {
        // Adiciona a passagem à lista `passagens`
        passagens.add(passagem);
    }

    // Método que remove uma passagem da lista
    public void removerPassagem(Passagem passagem) {
        // Remove a passagem da lista `passagens`
        passagens.remove(passagem);
    }

    // Método para retornar a lista de passagens
    public List<Passagem> listarPassagens() {
        return passagens;
    }

    // Método `toString()` redefinido - retorna uma String representando a lista de passagens
    @Override
    public String toString() {
        // Cria um StringBuilder para construir a String
        StringBuilder sb = new StringBuilder();

        // Adiciona o título da lista de passagens
        sb.append("Lista de Passagens:\n");

        // Itera sobre a lista de passagens
        for (Passagem passagem : passagens) {
            // Adiciona o texto de cada passagem na strign
            sb.append(passagem).append("\n");
        }

        return sb.toString();
    }
}
