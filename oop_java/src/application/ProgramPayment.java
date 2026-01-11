package application;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.time.format.DateTimeParseException;
import java.util.InputMismatchException;
import java.util.Locale;
import java.util.Scanner;

import entities.Contract;
import entities.Installment;
import exceptions.DomainException;
import services.ContractService;
import services.PaypalService;

public class ProgramPayment {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Locale.setDefault(Locale.US);
        sc.useLocale(Locale.US);

        try{
            DateTimeFormatter fmt = DateTimeFormatter.ofPattern("dd/MM/yyyy"); 
            
            System.out.println("Enter the contract data:");

            int number = 0;
            
            try {
                System.out.print("Number: ");
                number = sc.nextInt();
                if (number <= 0) {
                    throw new DomainException("Contract must be positive");
                }
            }
            catch(InputMismatchException e) {
                System.out.println("Error: invalid number");
                sc.nextLine();
            }
            catch(DomainException e) {
                System.out.println("Validation error: " + e.getMessage());
                number = 0;
            }

            LocalDate date = LocalDate.now();

            try {
                System.out.print("Date(dd/MM/yyyy): ");
                date = LocalDate.parse(sc.next(), fmt);
                if (date.isAfter(LocalDate.now())) {
                    throw new DomainException("Contract date cannot be in the future");
                }
            }
            catch(DateTimeParseException e) {
                System.out.println("Error: invalid date format");
            }
            catch(DomainException e) {
                System.out.println("Validation error: " + e.getMessage());
                date = LocalDate.now();
            }

            double totalValue = 0.0;

            try {
                System.out.print("Contract value: ");
                totalValue = sc.nextDouble();
                if (totalValue < 0.0) {
                    throw new DomainException("Contract value must be positive");
                }
            }
            catch(InputMismatchException e) {
                System.out.println("Error: Invalid value format");
                sc.nextLine();
            }
            catch(DomainException e) {
                System.out.println("Validation error: " + e.getMessage());
                totalValue = 0.0;
            }

            Contract obj = new Contract(number, date, totalValue);

            System.out.print("Enter the number of installments: ");
            int n = 1;
            try{
                n = sc.nextInt();
                if (n < 0) {
                    throw new DomainException("Must have at least 1 installment");
                }
            }
            catch(InputMismatchException e) {
                System.out.println("Error: invalid number");
                sc.nextLine();
                n = 1;
            }
            catch(DomainException e) {
                System.out.println("Validation error: " + e.getMessage());
                n = 1;
            }

            ContractService contractService = new ContractService(new PaypalService());

            contractService.processContract(obj, n);

            System.out.println("INSTALLMENTS:");

            for (Installment inst : obj.getInstallments()) {
                System.out.println(inst);
            }
        }
        catch(RuntimeException e) {
            System.out.println("Fatal error: " + e.getMessage());
            e.printStackTrace();
        }
        finally {
            sc.close();
        }
    }
}