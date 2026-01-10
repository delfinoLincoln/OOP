package application;

import java.util.Scanner;
import java.util.Locale;
import entidades.Triangle;

public class App {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        sc.useLocale(Locale.US);
        Locale.setDefault(Locale.US);

        Triangle x, y;
        x = new Triangle();
        y = new Triangle();

        System.out.print("Digite uma medida para o triangulo X: ");
        x.a = sc.nextDouble();
        System.out.print("Digite outra medida para o triangulo X: ");
        x.b = sc.nextDouble();
        System.out.print("Digite outra medida para o triangulo X: ");
        x.c = sc.nextDouble();

        System.out.print("Digite uma medida para o triangulo Y: ");
        y.a = sc.nextDouble();
        System.out.print("Digite outra medida para o triangulo Y: ");
        y.b = sc.nextDouble();
        System.out.print("Digite outra medida para o triangulo Y: ");
        y.c = sc.nextDouble();

        double areaX = x.area();
        double areaY = y.area();

        System.out.printf("Area do triangulo X: %.4f\n", areaX);
        System.out.printf("Area do triangulo Y: %.4f\n", areaY);

        if(areaX > areaY) {
            System.out.println("Maior: area X");
        }
        else {
            System.out.println("Maior: area Y");
        }

        sc.close();
    }
}
