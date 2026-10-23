public class Produto {

    // Atributos encapsulados (ETAPA 9)
    private String nome;
    private double preco;
    private int quantidade;

    // Construtor (ETAPA 7)
    public Produto(String nome, double preco, int quantidade) {
        this.nome = nome;
        this.preco = preco;
        this.quantidade = quantidade;
    }

    // Comportamentos (ETAPA 5)
    public void exibirDados() {
        System.out.println("=== PRODUTO ===");
        System.out.println("Nome: " + nome);
        System.out.println("Preço: R$ " + String.format("%.2f", preco));
        System.out.println("Quantidade: " + quantidade);
    }

    public double calcularValorEstoque() {
        return preco * quantidade;
    }

    // Getters (acesso controlado aos atributos privados)
    public String getNome() {
        return nome;
    }

    public double getPreco() {
        return preco;
    }

    public int getQuantidade() {
        return quantidade;
    }
}
