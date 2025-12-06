import java.util.Scanner;
import java.util.Locale;

public class ex9 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        sc.useLocale(Locale.US);
        
        System.out.println("=== CARDÁPIO ===");
        System.out.println("1 - Cachorro quente: R$ 4.00");
        System.out.println("2 - X-Salada: R$ 4.50");
        System.out.println("3 - X-Bacon: R$ 5.00");
        System.out.println("4 - Torrada simples: R$ 2.00");
        System.out.println("5 - Refrigerante: R$ 1.50");
        System.out.println("=================");
        
        System.out.print("Digite o código do item (1-5): ");
        int codigo = sc.nextInt();
        
        System.out.print("Digite a quantidade: ");
        int quantidade = sc.nextInt();
        
        double preco = 0;
        String produto = "";
        
        switch (codigo) {
            case 1:
                preco = 4.00;
                produto = "Cachorro quente";
                break;
            case 2:
                preco = 4.50;
                produto = "X-Salada";
                break;
            case 3:
                preco = 5.00;
                produto = "X-Bacon";
                break;
            case 4:
                preco = 2.00;
                produto = "Torrada simples";
                break;
            case 5:
                preco = 1.50;
                produto = "Refrigerante";
                break;
            default:
                System.out.println("Código inválido!");
                sc.close();
                return; 
        }

        double total = preco * quantidade;
        
        System.out.println("\n=== CONTA ===");
        System.out.println("Produto: " + produto);
        System.out.println("Quantidade: " + quantidade);
        System.out.printf("Preço unitário: R$ %.2f%n", preco);
        System.out.printf("Total a pagar: R$ %.2f%n", total);
        
        sc.close();
    }
}