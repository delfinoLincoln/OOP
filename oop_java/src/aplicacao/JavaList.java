package aplicacao;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class JavaList {
    public static void main(String[] args) {
        List<String> lista = new ArrayList<>();
        lista.add("link");
        lista.add("lussani");
        lista.add("sena");
        lista.add("julio");
        lista.add("rhuan");
        lista.add("heitor");
        lista.add(2, "lucas");
        System.out.println("Tamanho da lista: " + lista.size());
        System.out.println("------------------------");
        System.out.println("Nomes listados: ");
        for (String list : lista) {
            System.out.println(list);
        }

        System.out.println("------------------------");
        lista.removeIf(list -> list.charAt(0) == 'l');
        for (String list : lista) {
            System.out.println(list);
        }

        System.out.println("------------------------");

        System.out.println("Index of heitor: " + lista.indexOf("heitor"));
        System.out.println("Index of link: " + lista.indexOf("link"));

        System.out.println("------------------------");
        System.out.println("Nomes filtrados: ");
        List<String> result = lista.stream().filter(list -> list.charAt(0) == 's').collect(Collectors.toList());
        for (String x : result) {
            System.out.println(x);
        }
        System.out.println("------------------------");
        String nome = lista.stream().filter(list -> list.charAt(0) == 's').findFirst().orElse(null);
        System.out.println("Primeiro elemento: ");
        System.out.println(nome);
    }
}
