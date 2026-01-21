package application;

import java.util.ArrayList;
import java.util.List;

import entities.ProductLambda;
import util.ClearScreen;

public class PredicateTest {
    public static void main(String[] args) {
        ClearScreen.cls();
        List<ProductLambda> list = new ArrayList<>();

        list.add(new ProductLambda("Tv", 900.00));
        list.add(new ProductLambda("Mouse", 50.00));
        list.add(new ProductLambda("Tablet", 350.50));
        list.add(new ProductLambda("HD Case", 80.90));

        double min = 100.0;

        list.removeIf(p -> p.getPrice() >= min);

        for (ProductLambda p : list) {
            System.out.println(p);
        }
    }
}
