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

        System.out.println(produto.nome + ", " + produto.preco + ", " + produto.quantidade);

        sc.close();
    }
}
