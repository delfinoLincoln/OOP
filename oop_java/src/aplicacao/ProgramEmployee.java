package aplicacao;

import java.util.Scanner;

import entidades.Employee;

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

        for(int i = 0; i < n; i++) {
            
        }


        sc.close();
    }
}
