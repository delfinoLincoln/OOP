package application;

import java.util.Map;
import java.util.TreeMap;

import util.ClearScreen;

public class MapTest {
    public static void main(String[] args) {
        ClearScreen.cls();

        Map<String, String> cookies = new TreeMap<>();
        
        cookies.put("username", "link");
        cookies.put("email", "link@gmail.com");
        cookies.put("phone", "9988776655");

        cookies.remove("phone");

        for (String key: cookies.keySet()) {
            System.out.println(key + ": " + cookies.get(key));
        }
    }
}
