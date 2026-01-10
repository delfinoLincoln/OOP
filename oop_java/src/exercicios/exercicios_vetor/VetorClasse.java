package exercicios.exercicios_vetor;

import java.util.Scanner;

import entities.VetProduct;

import java.util.Locale;

public class VetorClasse {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        sc.useLocale(Locale.US);
        Locale.setDefault(Locale.US);

        System.out.print("Digite um valor: ");
        int n = sc.nextInt();
        
        VetProduct[] produto = new VetProduct[n];
        
        for(int i = 0; i < produto.length; i++) {
            sc.nextLine();
            System.out.printf("Insira o nome do produto [%d]: ", i + 1);
            String nome = sc.nextLine();
            System.out.printf("Insira o preco do produto [%d]: ", i + 1);
            Double preco = sc.nextDouble(); 
            produto[i] = new VetProduct(nome, preco);
        }

        double soma = 0.0;
        for(int i = 0; i < produto.length; i++) {
            soma += produto[i].getPreco();
        }

        System.out.println("---DADOS DOS PRODUTOS---");
        for(int i = 0; i < produto.length; i++) {
            System.out.println(produto[i]);
        }

        double mediaFinal = soma / produto.length;
        System.out.printf("Media de precos: %.2f", mediaFinal);
        
        sc.close();
    }
}
