package exercicios.exercicios_vetor;

import java.util.Scanner;

public class VetNegativo {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Digite um valor: ");
        int n = sc.nextInt();
        int[] valor = new int[n];
        System.out.println();
        System.out.printf("Insira %d numeros\n", n);

        for(int i = 0; i < valor.length; i++) {
            System.out.printf("Indice [%d]: ", i);
            valor[i] = sc.nextInt();
        }

        System.out.println("Valores negativos: ");
        for(int i = 0; i < valor.length; i++) {
            if (valor[i] < 0) {
                System.out.println(valor[i]);
            }
        }


        sc.close();
    }
}
