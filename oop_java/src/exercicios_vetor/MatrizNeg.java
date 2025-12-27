package exercicios_vetor;

import java.util.Scanner;

public class MatrizNeg {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Digite o tamanho da matriz (L x C): ");
        int n = sc.nextInt();

        int[][] matriz = new int[n][n];

        System.out.println("\nPreencha a matriz " + n + "x" + n + ":");
        
        for(int i = 0; i < n; i++) {
            for(int j = 0; j < n; j++) {
                System.out.printf("Posição [%d][%d]: ", i, j);
                matriz[i][j] = sc.nextInt();
            }
        }

        System.out.println("\n=== MATRIZ DIGITALIZADA ===");
        
        for(int i = 0; i < n; i++) {
            for(int j = 0; j < n; j++) {
                System.out.print(matriz[i][j] + "\t");
            }
            System.out.println();
        }

        sc.close();
    }
}