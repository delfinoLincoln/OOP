package entidades;

public class Product {

    public String nome;
    public double preco;
    public int quantidade;

    public double valorTotalEstoque() {
        return preco * quantidade;
    }
    public void adicionarProduto(int quantidade) {
        this.quantidade += quantidade;
    }
    public void removerProduto(int quantidade) {
        this.quantidade -= quantidade;
    }
}
