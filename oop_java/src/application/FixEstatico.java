package application;
import java.util.Scanner;

import util.ConversorMoeda;

import java.util.Locale;

public class FixEstatico {
    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);
        Locale.setDefault(Locale.US);
        sc.useLocale(Locale.US);

        System.out.println("Qual a cotacao do dolar hoje?");
        ConversorMoeda.cotacao = sc.nextDouble();

        System.out.println("Quantos dolares vc pretende comprar?");
        ConversorMoeda.dolarComprado = sc.nextDouble();

        System.out.println("---IOF---");
        System.out.printf("Cotacao do dolar: %.2f\n", ConversorMoeda.cotacao);
        System.out.printf("Dolares comprados: %.2f\n", ConversorMoeda.dolarComprado);
        System.out.printf("Valor final a pagar: %.2f\n", ConversorMoeda.valorFinal());

        sc.close();
    }
}
