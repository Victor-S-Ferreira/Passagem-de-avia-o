import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Cliente cliente = new Cliente();
        boolean running = true;

        while (running) {
            System.out.println("1. Adicionar passagem");
            System.out.println("2. Remover passagem");
            System.out.println("3. Aplicar desconto");
            System.out.println("4. Listar passagens");
            System.out.println("5. Finalizar compra");
            System.out.println("6. Sair");
            System.out.print("Escolha uma opção: ");
            int opcao = scanner.nextInt();
            scanner.nextLine(); // Consumir nova linha

            switch (opcao) {
                case 1:
                    adicionarPassagem(scanner, cliente);

                    break;
                case 2:
                    removerPassagem(scanner, cliente);
                    break;
                case 3:
                    aplicarDesconto(scanner, cliente);
                    break;
                case 4:
                    listarPassagens(cliente);
                    break;
                case 5:
                    finalizarCompra(cliente);
                    break;
                case 6:
                    running = false;
                    break;
                default:
                    System.out.println("Opção inválida.");
                    break;
            }
        }

        scanner.close();
    }

    private static void adicionarPassagem(Scanner scanner, Cliente cliente) {
        System.out.print("Destino: ");
        String destino = scanner.nextLine();
        System.out.print("Origem: ");
        String origem = scanner.nextLine();
        System.out.print("Data: ");
        String data = scanner.nextLine();
        System.out.print("Número do voo: ");
        String numeroVoo = scanner.nextLine();
        System.out.print("Preço: ");
        double preco = scanner.nextDouble();
        scanner.nextLine(); // Consumir nova linha

        Passagem passagem = new Passagem(destino, origem, data, numeroVoo, preco);
        cliente.adicionarPassagemNoCarrinho(passagem);
    }

    private static void removerPassagem(Scanner scanner, Cliente cliente) {
        // Remover passagem (simplificação: removendo a primeira passagem da lista)
        if (!cliente.getCarrinho().getPassagens().isEmpty()) {
            Passagem passagemRemover = cliente.getCarrinho().getPassagens().get(0);
            cliente.removerPassagemDoCarrinho(passagemRemover);
        } else {
            System.out.println("Nenhuma passagem para remover.");
        }
    }

    private static void aplicarDesconto(Scanner scanner, Cliente cliente) {
        System.out.print("Percentual de desconto: ");
        double percentual = scanner.nextDouble();
        scanner.nextLine(); // Consumir nova linha
        cliente.aplicarDescontoNoCarrinho(percentual);
    }

    private static void listarPassagens(Cliente cliente) {
        cliente.getCarrinho().getPassagens().forEach(System.out::println);
    }

    private static void finalizarCompra(Cliente cliente) {
        cliente.finalizarCompra();
    }
}

// Restante das classes (Voo, Passagem, CarrinhoDeCompras, ListaDePassagem, Cliente, Desconto, Compra) permanecem como anteriormente.
