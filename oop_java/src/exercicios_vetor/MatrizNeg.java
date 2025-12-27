package exercicios_vetor;

import java.util.Scanner;

public class MatrizNeg {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Digite um numero: ");
        int n = sc.nextInt();

        int[][] matriz = new int[n][n];

        for(int i = 0; i < n; i++) {
            System.out.print("Digite um valor para linha: ");
            for(int j = 0; j < n; j++) {
                System.out.println("Digite um valor para coluna: ");
                matriz[i][j] = sc.nextInt();
            }
        }

        for(int i = 0; i < n; i++) {
            for(int j = 0; j < n; j++) {
                System.out.println(matriz[i][j]);
            }
        }

        sc.close();
    }
}
