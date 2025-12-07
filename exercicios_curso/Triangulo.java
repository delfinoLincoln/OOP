
import java.util.Locale;
import java.util.Scanner;

public class Triangulo{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        Locale.setDefault(Locale.US);
        sc.useLocale(Locale.US);

        double xA, xB, xC, yA, yB, yC;
        System.out.print("Digite a medida do triangulo X: ");
        xA = sc.nextDouble();

        System.out.print("Digite outra medida: ");
        xB = sc.nextDouble();

        System.out.print("Digite outra medida: ");
        xC = sc.nextDouble();

        System.out.print("Digite a medida do triangulo y: ");
        yA = sc.nextDouble();

        System.out.print("Digite outra medida: ");
        yB = sc.nextDouble();

        System.out.print("Digite outra medida: ");
        yC = sc.nextDouble();

        double p = (xA + xB + xC) / 2.0;
        double areaX = Math.sqrt(p * (p - xA) * (p - xB) * (p - xC));

        p = (yA + yB + yC) / 2.0;
        double areaY = Math.sqrt(p * (p - yA) * (p - yB) * (p - yC));

        System.out.printf("Area do triangulo X: %.4f\n", areaX);
        System.out.printf("Area do triangulo Y: %.4f\n", areaY);

        if(areaX > areaY) {
            System.out.println("Maior area: X");
        }
        else {
            System.out.println("Maior area: Y");
        }
        sc.close();
    }
}
