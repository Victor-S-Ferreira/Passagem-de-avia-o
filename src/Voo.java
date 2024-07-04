// Classe Voo
public class Voo {
    private String destino;
    private String origem;
    private String data;
    private String numeroVoo;

    public Voo(String destino, String origem, String data, String numeroVoo) {
        this.destino = destino;
        this.origem = origem;
        this.data = data;
        this.numeroVoo = numeroVoo;
    }

    public String getDestino() {
        return destino;
    }

    public void setDestino(String destino) {
        this.destino = destino;
    }

    public String getOrigem() {
        return origem;
    }

    public void setOrigem(String origem) {
        this.origem = origem;
    }

    public String getData() {
        return data;
    }

    public void setData(String data) {
        this.data = data;
    }

    public String getNumeroVoo() {
        return numeroVoo;
    }

    public void setNumeroVoo(String numeroVoo) {
        this.numeroVoo = numeroVoo;
    }

    @Override
    public String toString() {
        return "Voo{" +
                "destino='" + destino + '\'' +
                ", origem='" + origem + '\'' +
                ", data='" + data + '\'' +
                ", numeroVoo='" + numeroVoo + '\'' +
                '}';
    }
}