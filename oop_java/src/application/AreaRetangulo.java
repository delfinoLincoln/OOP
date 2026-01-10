package application;

import entidades.Retangulo;

import java.util.Scanner;
import java.util.Locale;

public class AreaRetangulo {
    public static void main(String[] args) {

        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);
        sc.useLocale(Locale.US);

        Retangulo retangulo = new Retangulo();

        System.out.print("Digite a altura do retangulo: ");
        retangulo.altura = sc.nextDouble();

        System.out.print("Digite a largura do retangulo: ");
        retangulo.largura = sc.nextDouble();

        System.out.printf("Area: %.2f\n", retangulo.area());
        System.out.printf("Perimetro: %.2f\n", retangulo.perimetro());
        System.out.printf("Diagonal: %.2f\n", retangulo.diagonal());

        sc.close();
    }
}
