package aplicacao;

import java.util.Locale;
import java.util.Scanner;
import entidades.Product;

public class ProgramEstoque {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Locale.setDefault(Locale.US);
        sc.useLocale(Locale.US);

        System.out.println("Insira os dados do produto");
        System.out.print("Digite o nome do produto desejado: ");
        String auxNome = sc.nextLine();
        System.out.print("Preco: ");
        double auxPreco = sc.nextDouble();
        System.out.print("Quantidade em estoque: ");
        int auxQuantidade = sc.nextInt();

        Product produto = new Product(auxNome, auxPreco, auxQuantidade);

        produto.setNome("Computador");
        System.out.println("Nome atualizado: " + produto.getNome());

        produto.setPreco(1200.00);
        System.out.println("Preco atualizado: " + produto.getPreco());


        System.out.println();
        System.out.println("Dados dos produtos: " + produto);
        System.out.println();

        System.out.print("Insira a quantidade de produtos a serem adicionados ao estoque: ");
        int quantidade = sc.nextInt();
        produto.adicionarProduto(quantidade);

        System.out.println();
        System.out.println("Dados atualizados: " + produto);
        System.out.println();

        System.out.print("Insira a quantidade de produtos a serem removidos do estoque: ");
        quantidade = sc.nextInt();
        produto.removerProduto(quantidade);

        System.out.println();
        System.out.println("Dados atualizados: " + produto);


        sc.close();
    }
}
