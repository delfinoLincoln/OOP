package application;

import entities.Client;

public class EqualsHashCode {
    public static void main(String[] args) {
        Client c1 = new Client("Link", "link@gmail.com");
        Client c2 = new Client("lussani", "lussani@gmail.com");

        System.out.println(c1.hashCode());
        System.out.println(c2.hashCode());
        System.out.println(c1.equals(c2));
    }
}
