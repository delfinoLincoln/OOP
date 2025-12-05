import java.util.Scanner;
import java.util.Locale;

public class ex2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Locale.setDefault(Locale.US);

        double pi = 3.14159;
        double raio;
        double area;

        System.out.print("Defina o valor do raio: ");
        raio = sc.nextDouble();
        sc.nextLine();

        area = pi * Math.pow(raio, 2.0);

        System.out.printf("%.4f\n", pi);
        System.out.printf("%.4f\n", raio);
        System.out.printf("Area do circulo: %.4f\n", area);
        
        sc.close();
    }
}
