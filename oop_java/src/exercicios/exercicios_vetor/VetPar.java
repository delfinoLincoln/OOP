package exercicios.exercicios_vetor;

import java.util.Scanner;

public class VetPar {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Digite um numero inteiro: ");
        int n = sc.nextInt();
        int[] numero = new int[n];
        int contador = 0;

        for(int i = 0; i < numero.length; i++) {
            System.out.printf("Digite um valor para o indice [%d]: ", i);
            numero[i] = sc.nextInt();
        }

        for(int i = 0; i < numero.length; i++) {
            if (numero[i] % 2 == 0) {
                contador++;
            }
        }

        System.out.println("Valores pares: ");
        for(int i = 0; i < numero.length; i++) {
            if (numero[i] % 2 == 0) {
                System.out.println(numero[i]);
            }
        }
        System.out.printf("Quantidade de pares: %d\n", contador);

        sc.close();
    }
}
