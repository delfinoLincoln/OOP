package application;

import java.util.ArrayList;
import java.util.List;
//import java.util.function.Consumer;

import entities.ProductLambda;
import util.ClearScreen;

public class ConsumerTest {
    public static void main(String[] args) {
        //interfaceImplementation();
        //staticReferenceMethod();
        //nonStaticReferenceMethod();
        //declaratedLambda();
        lambdaInLine();
    }

        /* <Implementação da interface Consumer> */

    /*
    private static void interfaceImplementation() {
        ClearScreen.cls();
        List<ProductLambda> list = new ArrayList<>();

        list.add(new ProductLambda("Tv", 900.00));
        list.add(new ProductLambda("Mouse", 50.00));
        list.add(new ProductLambda("Tablet", 350.50));
        list.add(new ProductLambda("HD Case", 80.90));

        list.forEach(new PriceUpdate());
        list.forEach(System.out::println);
    }
    */

        /*<Referencia ao metodo estatico>*/

    /*
    private static void staticReferenceMethod() {
        ClearScreen.cls();
        List<ProductLambda> list = new ArrayList<>();

        list.add(new ProductLambda("Tv", 900.00));
        list.add(new ProductLambda("Mouse", 50.00));
        list.add(new ProductLambda("Tablet", 350.50));
        list.add(new ProductLambda("HD Case", 80.90));

        list.forEach(ProductLambda::staticProductPrice);
        list.forEach(System.out::println);
    }
    */

        /*<Referencia ao metodo não estático> */

    /*
    private static void nonStaticReferenceMethod() {
        ClearScreen.cls();
        List<ProductLambda> list = new ArrayList<>();

        list.add(new ProductLambda("Tv", 900.00));
        list.add(new ProductLambda("Mouse", 50.00));
        list.add(new ProductLambda("Tablet", 350.50));
        list.add(new ProductLambda("HD Case", 80.90));

        list.forEach(ProductLambda::nonStaticProductPrice);
        list.forEach(System.out::println);
    }
    */

        /* <Expressão Lambda declarada> */
    /*
    private static void declaratedLambda() {
        ClearScreen.cls();
        List<ProductLambda> list = new ArrayList<>();

        list.add(new ProductLambda("Tv", 900.00));
        list.add(new ProductLambda("Mouse", 50.00));
        list.add(new ProductLambda("Tablet", 350.50));
        list.add(new ProductLambda("HD Case", 80.90));

        Consumer<ProductLambda> cons = p -> {
            p.setPrice(p.getPrice() * 1.1);
        };
        list.forEach(cons);
        list.forEach(System.out::println);
    }
    */

    private static void lambdaInLine() {
        ClearScreen.cls();
        List<ProductLambda> list = new ArrayList<>();

        list.add(new ProductLambda("Tv", 900.00));
        list.add(new ProductLambda("Mouse", 50.00));
        list.add(new ProductLambda("Tablet", 350.50));
        list.add(new ProductLambda("HD Case", 80.90));

        list.forEach(p ->  p.setPrice(p.getPrice() * 1.1));
        list.forEach(System.out::println);
    }
}