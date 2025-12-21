package entidades;

public class Product {

    private String nome;
    private double preco;
    private int quantidade;

    /*<construtores> */
    public Product(){}          //construtor padrão

    public Product(String nome, double preco, int quantidade) {
        this.nome = nome;
        this.preco = preco;
        this.quantidade = quantidade;
    }
    public Product(String nome, double preco) {         //
        this.nome = nome;                               //sobrecarga
        this.preco = preco;                             //
    }
    
    /*<Getters e Setters> */
    public String getNome() {
        return nome;
    }
    public void setNome(String nome) {
        this.nome = nome;
    }
    public double getPreco() {
        return preco;
    }
    public void setPreco(double preco) {
        this.preco = preco;
    }
    public int getQuantidade() {
        return quantidade;
    }

    /*<métodos> */
    public double valorTotalEstoque() {
        return preco * quantidade;
    }
    public void adicionarProduto(int quantidade) {
        this.quantidade += quantidade;
    }
    public void removerProduto(int quantidade) {
        this.quantidade -= quantidade;
    }

    public String toString() {
        return nome
            + ", $ "
            + preco
            + ", "
            + quantidade
            + " unidades, total: $ "
            + valorTotalEstoque();
    }
    
}
