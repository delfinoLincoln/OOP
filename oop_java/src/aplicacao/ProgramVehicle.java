package aplicacao;

import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.util.Locale;
import java.util.Scanner;

import entidades.CarRental;
import entidades.Vehicle;
import services.BrazilTaxServices;
import services.RentalService;

public class ProgramVehicle {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Locale.setDefault(Locale.US);
        sc.useLocale(Locale.US);
        DateTimeFormatter dtf = DateTimeFormatter.ofPattern("dd:MM:yyyy HH:mm");

        System.out.println("Enter the car data:");
        System.out.print("Model car: ");
        String modelCar = sc.nextLine();    
        System.out.print("Pickup date(dd/MM/YYYY HH:mm): ");
        LocalDateTime start = LocalDateTime.parse(sc.nextLine(), dtf);
        System.out.print("Return date(DD/MM/YYYY HH:MM): ");
        LocalDateTime finish = LocalDateTime.parse(sc.nextLine(), dtf);

        CarRental cr = new CarRental(start, finish, new Vehicle(modelCar));

        System.out.print("Enter the value per hour: ");
        double  pricePerHour = sc.nextDouble();
        System.out.print("Enter the value per day: ");
        double pricePerDay = sc.nextDouble();

        RentalService rentalService = new RentalService(pricePerHour, pricePerDay, new BrazilTaxServices());

        rentalService.processInvoice(cr);

        System.out.println("Invoice:");
        System.out.println("Basic payment: " + cr.getInvoice().getBasicPayment());
        System.out.println("Tax: " + cr.getInvoice().getTax());
        System.out.println("Total payment: " + cr.getInvoice().getTotalPayment());

        sc.close();
    }
}