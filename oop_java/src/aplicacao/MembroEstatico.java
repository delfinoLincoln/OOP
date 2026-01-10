package aplicacao;

import java.util.Locale;
import java.util.Scanner;

import util.StaticCalculator;

public class MembroEstatico {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Locale.setDefault(Locale.US);
        sc.useLocale(Locale.US);

        System.out.print("Insira o valor do raio: ");
        double raio = sc.nextDouble();

        double c = StaticCalculator.circunferencia(raio);

        double v = StaticCalculator.volume(raio);

        System.out.printf("Valor de PI: %.2f\n", StaticCalculator.PI);
        System.out.printf("Valor da circunferencia: %.2f\n", c);
        System.out.printf("Valor da circunferencia: %.2f\n", v);

        sc.close();
    }
}
