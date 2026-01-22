package application;

import java.util.ArrayList;
import java.util.List;

import entities.ProductLambda;
import services.ProductService;
import util.ClearScreen;

public class PersonalizatedFunction {
    public static void main(String[] args) {
        ClearScreen.cls();
        List<ProductLambda> list = new ArrayList<>();
        list.add(new ProductLambda("Tv", 900.00));
        list.add(new ProductLambda("Mouse", 50.00));
        list.add(new ProductLambda("Tablet", 350.50));
        list.add(new ProductLambda("HD Case", 80.90));

        ProductService ps = new ProductService();
        double sum = ps.filteredSum(list, p -> p.getName().toUpperCase().charAt(0) == 'T');
        System.out.println("Sum = " + String.format("%.2f", sum));
    }
}
