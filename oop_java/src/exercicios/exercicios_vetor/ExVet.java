package exercicios.exercicios_vetor;

import java.util.Scanner;
import java.util.Locale;

public class ExVet {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Locale.setDefault(Locale.US);
        sc.useLocale(Locale.US);

        System.out.print("Digite um valor inteiro: ");
        int n = sc.nextInt();
        double[] vet = new double[n];

        System.out.printf("Digite %d numero\n", n);
        for(int i = 0; i < vet.length; i++) {
            System.out.printf("Indice [%d]: ", i);
            vet[i] = sc.nextDouble();
        }

        double soma = 0.0;
        for(int i = 0; i < n; i++) {
            soma += vet[i];
        }
        
        System.out.println();
        System.out.println("Valores digitados: ");
        for(int i = 0; i < vet.length; i++) {
            System.out.printf("%.2f\n", vet[i]);
        }
        
        double media = soma / vet.length;
        System.out.printf("Soma: %.2f\n",soma);
        System.out.printf("media: %.2f\n", media);

        sc.close();
    }
}