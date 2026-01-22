package application;

import java.util.ArrayList;
import java.util.List;
import java.util.function.Function;
import java.util.stream.Collectors;

import entities.ProductLambda;
import util.ClearScreen;
import util.UpperCaseName;

public class FunctionTest {
    
    public static void main(String[] args) {
        interfaceImplementationFunction();
        staticUpperCaseName();
        nonStaticUpperCaseName();
        declaratedLambdaFunction();
        functionLambdaInLine();
    }

        /* <Implementação da Function> */

    private static void interfaceImplementationFunction() {
        ClearScreen.cls();
        List<ProductLambda> list = new ArrayList<>();

        list.add(new ProductLambda("Tv", 900.00));
        list.add(new ProductLambda("Mouse", 50.00));
        list.add(new ProductLambda("Tablet", 350.50));
        list.add(new ProductLambda("HD Case", 80.90));

        List<String> names = list.stream().map(new UpperCaseName()).collect(Collectors.toList());
        names.forEach(System.out::println);
    }

        /*<Referencia ao metodo estatico>*/

    private static void staticUpperCaseName() {
        ClearScreen.cls();
        List<ProductLambda> list = new ArrayList<>();

        list.add(new ProductLambda("Tv", 900.00));
        list.add(new ProductLambda("Mouse", 50.00));
        list.add(new ProductLambda("Tablet", 350.50));
        list.add(new ProductLambda("HD Case", 80.90));

        List<String> names = list.stream().map(ProductLambda::staticUpperCaseName).collect(Collectors.toList());
        names.forEach(System.out::println);
    }

        /*<Referencia ao metodo não estático> */

    private static void nonStaticUpperCaseName() {
        ClearScreen.cls();
        List<ProductLambda> list = new ArrayList<>();

        list.add(new ProductLambda("Tv", 900.00));
        list.add(new ProductLambda("Mouse", 50.00));
        list.add(new ProductLambda("Tablet", 350.50));
        list.add(new ProductLambda("HD Case", 80.90));

        List<String> names = list.stream().map(ProductLambda::staticUpperCaseName).collect(Collectors.toList());
        names.forEach(System.out::println);
    }
    
        /* <Expressão Lambda declarada> */
    
    private static void declaratedLambdaFunction() {
        ClearScreen.cls();
        List<ProductLambda> list = new ArrayList<>();

        list.add(new ProductLambda("Tv", 900.00));
        list.add(new ProductLambda("Mouse", 50.00));
        list.add(new ProductLambda("Tablet", 350.50));
        list.add(new ProductLambda("HD Case", 80.90));

        Function<ProductLambda, String> fn = p -> p.getName().toUpperCase();
        List<String> names = list.stream().map(fn).collect(Collectors.toList());
        names.forEach(System.out::println);
    }
    
        /* <Expressão Lambda em linha> */
    private static void functionLambdaInLine() {
        ClearScreen.cls();
        List<ProductLambda> list = new ArrayList<>();

        list.add(new ProductLambda("Tv", 900.00));
        list.add(new ProductLambda("Mouse", 50.00));
        list.add(new ProductLambda("Tablet", 350.50));
        list.add(new ProductLambda("HD Case", 80.90));

        List<String> names = list.stream().map(p -> p.getName().toUpperCase()).collect(Collectors.toList());
        names.forEach(System.out::println);
    }
}
