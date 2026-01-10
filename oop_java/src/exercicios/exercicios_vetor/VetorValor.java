package exercicios.exercicios_vetor;

import java.util.Scanner;
import java.util.Locale;

public class VetorValor {
    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);
        Locale.setDefault(Locale.US);
        sc.useLocale(Locale.US);

        System.out.print("Insira um valor: ");
        int n = sc.nextInt();
        double[] altura = new double[n];
        System.out.println();
        System.out.printf("Insira %d valores\n", n);

        for(int i = 0; i < n; i++) {
            System.out.printf("Indice [%d]: ", i);
            altura[i] = sc.nextDouble();    
        }

        double soma = 0.0;
        for(int i = 0; i < n; i++) {
            soma += altura[i];
        }

        double alturaMedia = soma / n;
        System.out.printf("Media de alturas: %.2f", alturaMedia);


        sc.close();
    }
}
