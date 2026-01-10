package exercicios.exercicios_vetor;

import java.util.Scanner;

import entities.VetPensao;

public class ExVetPensao {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Digite quantos quartos serao alugados: ");
        int n = sc.nextInt();
        VetPensao[] pensao = new VetPensao[10];

        for (int i = 0; i < n; i++) {
            sc.nextLine();
            System.out.printf("Inquilino #%d:\n", i + 1);
            System.out.print("Nome: ");
            String nome = sc.nextLine();
            System.out.print("Email: ");
            String email = sc.nextLine();
            System.out.print("Numero do quarto: ");
            int numeroQuarto = sc.nextInt();
            pensao[numeroQuarto] = new VetPensao(nome, email);
        }

        System.out.println();
        System.out.println("Quartos ocupados:");
        for (int i = 0; i < 10; i++) {
            if (pensao[i] != null) {
                System.out.println(i + ": " + pensao[i]);
            }
        }

        sc.close();
    }
}
