package aplicacao;

import java.util.ArrayList;
import java.util.List;
import java.util.Locale;
import java.util.Scanner;

import entidades.Company;
import entidades.Individual;
import entidades.TaxPayer;

public class ProgramTax {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        Locale.setDefault(Locale.US);
        sc.useLocale(Locale.US);

        List<TaxPayer> taxList = new ArrayList<>();

        System.out.print("Enter the number of tax payers: ");
        int n = sc.nextInt();

        for(int i = 1; i <= n; i++) {
            System.out.println("Tax payer #" + i + " data:");

            System.out.print("Individual or Company(i/c)? ");
            char ch = sc.next().toLowerCase().charAt(0);
            
            sc.nextLine();
            System.out.print("Name: ");
            String name = sc.nextLine();

            System.out.print("Anual Income: ");
            double anualIncome = sc.nextDouble();

            if (ch == 'i') {
                System.out.print("Health expenditures: ");
                double healthExpenditures = sc.nextDouble();
                taxList.add(new Individual(name, anualIncome, healthExpenditures));
            }
            else {
                System.out.print("Number of employees: ");
                int numberOfEmployees = sc.nextInt();
                taxList.add(new Company(name, anualIncome, numberOfEmployees));
            }
        }

        System.out.println("TAXES PAID:");

        double sum = 0.0;
        for (TaxPayer xPayer : taxList) {
            double tax = xPayer.tax();
            System.out.println(xPayer.getName() + ": $ " + String.format("%.2f", tax));
            sum += tax;
        }

        System.out.println();
        System.out.println("TOTAL TAX: " + String.format("%.2f", sum));

        sc.close();
    }
}
