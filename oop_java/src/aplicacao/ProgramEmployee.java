package aplicacao;

import java.util.Scanner;

import entidades.Employee;
import entidades.OutSourceEmployee;

import java.util.Locale;
import java.util.List;
import java.util.ArrayList;

public class ProgramEmployee {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Locale.setDefault(Locale.US);
        sc.useLocale(Locale.US);

        System.out.print("Enter the number of employees: ");
        int n = sc.nextInt();
        List<Employee> employeeList = new ArrayList<>();

        for(int i = 1; i <= n; i++) {
            System.out.println();
            
            System.out.println("Employee #" + i + " data: ");
            System.out.print("Outsourced(y/n)? ");
            char resp = sc.next().toLowerCase().charAt(0);
            
            sc.nextLine();
            System.out.print("Name: ");
            String name = sc.nextLine();

            System.out.print("Hours: ");
            int hours = sc.nextInt();

            System.out.print("Value per hour: ");
            double vph = sc.nextDouble();

            if (resp == 'y') {
                System.out.print("Additional charge: ");
                double additionalCharge = sc.nextDouble();
                Employee emp = new OutSourceEmployee(name, hours, vph, additionalCharge);
                employeeList.add(emp);
            }
            else {
                Employee emp = new Employee(name, hours, vph);
                employeeList.add(emp);
            }
        }

        System.out.println();
        System.out.println("PAYMENTS: ");
        for (Employee employee : employeeList) {
            System.out.println(employee.getName() + " - $" + String.format("%.2f", employee.payment()));
        }


        sc.close();
    }
}
