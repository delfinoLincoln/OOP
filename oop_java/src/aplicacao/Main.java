package aplicacao;

import java.util.Locale;
import java.util.Scanner;
import entidades.Product;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Locale.setDefault(Locale.US);
        sc.useLocale(Locale.US);

        Product produto = new Product();

        System.out.println("Insira os dados do produto");
        System.out.print("Digite o nome do produto desejado: ");
        produto.nome = sc.nextLine();

        System.out.print("Preco: ");
        produto.preco = sc.nextDouble();

        System.out.print("Quantidade em estoque: ");
        produto.quantidade = sc.nextInt();

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
