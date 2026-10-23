public class Pedido {

    private int numero;
    private double valor;
    private String status;

    // Associação: um Pedido possui (tem um) Cliente
    private Cliente cliente;

    public Pedido(int numero, double valor, String status, Cliente cliente) {
        this.numero = numero;
        this.valor = valor;
        this.status = status;
        this.cliente = cliente;
    }

    public void exibirPedido() {
        System.out.println("=== PEDIDO ===");
        System.out.println("Número: " + numero);
        System.out.println("Valor: R$ " + String.format("%.2f", valor));
        System.out.println("Status: " + status);
        System.out.println("Cliente: " + cliente.getNome());
    }

    // Evolução do sistema: altera o status do pedido
    public void alterarStatus(String novoStatus) {
        this.status = novoStatus;
    }

    public int getNumero() {
        return numero;
    }

    public double getValor() {
        return valor;
    }

    public String getStatus() {
        return status;
    }

    public Cliente getCliente() {
        return cliente;
    }
}
