package application;

import java.util.Locale;
import java.util.Scanner;

import interfaces.InterestService;
import services.BrazilInterestService;

public class ProgramDefaultMethods {
    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);
        Locale.setDefault(Locale.US);
        sc.useLocale(Locale.US);

        System.out.print("Amount: ");
        double amount = sc.nextDouble();
        System.out.print("Months: ");
        int months = sc.nextInt();

        InterestService is = new BrazilInterestService(2.0);
        double payment = is.payment(amount, months);

        System.out.print("Payment after: " + months + " months: ");
        System.out.println(String.format("%.2f", payment));

        sc.close();
    }
}
