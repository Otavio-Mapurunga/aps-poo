public class Sistema {

    public static void main(String[] args) {

        // ===== PRODUTOS (ETAPAS 7 e 8) =====
        Produto produto1 = new Produto("Notebook", 3500.00, 5);
        Produto produto2 = new Produto("Mouse", 80.00, 20);
        Produto produto3 = new Produto("Teclado", 150.00, 10);

        produto1.exibirDados();
        System.out.println("Valor em estoque: R$ " + String.format("%.2f", produto1.calcularValorEstoque()));
        System.out.println();

        produto2.exibirDados();
        System.out.println("Valor em estoque: R$ " + String.format("%.2f", produto2.calcularValorEstoque()));
        System.out.println();

        produto3.exibirDados();
        System.out.println("Valor em estoque: R$ " + String.format("%.2f", produto3.calcularValorEstoque()));
        System.out.println();

        // Requisito da situação-problema: valor total do estoque da loja
        double totalEstoque = produto1.calcularValorEstoque()
                + produto2.calcularValorEstoque()
                + produto3.calcularValorEstoque();
        System.out.println("VALOR TOTAL DO ESTOQUE DA LOJA: R$ " + String.format("%.2f", totalEstoque));
        System.out.println();

        // ===== DESAFIO PRÁTICO =====
        Cliente cliente = new Cliente("João Silva", "12345678900", "joao@email.com");
        cliente.exibirDados();
        System.out.println();

        Pedido pedido = new Pedido(1001, 2500.00, "Em processamento", cliente);
        pedido.exibirPedido();
        System.out.println();

        // Evolução do sistema: alterar o status e apresentar o pedido atualizado
        pedido.alterarStatus("Enviado");
        System.out.println(">>> Status alterado para \"Enviado\"");
        pedido.exibirPedido();
    }
}
