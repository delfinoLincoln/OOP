package application;

import java.util.HashMap;
import java.util.Map;
import java.util.TreeMap;

import entities.Product;
import util.ClearScreen;

public class MapTest {
    public static void main(String[] args) {
        /* map<key, value> */

        treeMap();
        productMap();
        
    }

    private static void treeMap() {
        ClearScreen.cls();

        Map<String, String> cookies = new TreeMap<>();

        cookies.put("username", "link");
        cookies.put("email", "link@gmail.com");
        cookies.put("phone", "99887766");

        cookies.remove("phone");

        cookies.put("email", "delfino@gmail.com");

        System.out.println("All cookies:");
        for (String key : cookies.keySet()) {
            System.out.println(key + ": " + cookies.get(key));
        }

        System.out.println();
        System.out.println("Contains 'email' key: " + cookies.containsKey("email"));
        System.out.println("Email: " + cookies.get("email"));
        System.out.println("Phone number: " + cookies.get("phone"));
        System.out.println("Size: " + cookies.size());

        System.out.println();
    }

    private static void productMap() {
        ClearScreen.cls();

        Map<Product, Double> stock = new HashMap<>();

        Product p1 = new Product("Tv", 900.0);
        Product p2 = new Product("Notebook", 1200.0);
        Product p3 = new Product("Tablet", 400.0);

        stock.put(p1, 10000.0);
        stock.put(p2, 20000.0);
        stock.put(p3, 15000.0);

        Product ps = new Product("Tv", 900.0);

        System.out.println("Contains 'ps' key: " + stock.containsKey(ps));
    }
}
