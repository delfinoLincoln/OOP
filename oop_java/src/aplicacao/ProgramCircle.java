package aplicacao;
import utilitario.Calculator;

import java.util.Scanner;
import java.util.Locale;

public class ProgramCircle {
    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);
        Locale.setDefault(Locale.US);
        sc.useLocale(Locale.US);

        Calculator calc = new Calculator();

        System.out.print("Insira o valor do raio: ");
        double raio = sc.nextDouble();

        double c = calc.circunferencia(raio);

        double v = calc.volume(raio);

        System.out.printf("Valor de PI: %.2f\n", calc.PI);
        System.out.printf("Valor da circunferencia: %.2f\n", c);
        System.out.printf("Valor da circunferencia: %.2f\n", v);

        sc.close();
    }
}
