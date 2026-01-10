package aplicacao;

import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.util.Locale;
import java.util.Scanner;

import entidades.CarRental;
import entidades.Vehicle;

public class ProgramVehicle {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Locale.setDefault(Locale.US);
        sc.useLocale(Locale.US);
        DateTimeFormatter dtf = DateTimeFormatter.ofPattern("dd:MM:yyyy HH:mm");

        System.out.println("Enter the car data:");
        System.out.print("Model car: ");
        String modelCar = sc.nextLine();    
        System.out.println("Pickup date(DD/MM/YYYY HH:MM): ");
        LocalDateTime start = LocalDateTime.parse(sc.nextLine(), dtf);
        System.out.println("Return date(DD/MM/YYYY HH:MM): ");
        LocalDateTime finish = LocalDateTime.parse(sc.nextLine(), dtf);

        CarRental cr = new CarRental(start, finish, new Vehicle(modelCar));

        sc.close();
    }
}
