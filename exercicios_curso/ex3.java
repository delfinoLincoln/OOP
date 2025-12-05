import java.util.Scanner;
import java.util.Locale;

public class ex3 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Locale.setDefault(Locale.US);

        int a;
        int b;
        int c;
        int d;

        System.out.print("Digite um valor: ");
        a = sc.nextInt();
        sc.nextLine();

        System.out.print("Digite um valor: ");
        b = sc.nextInt();
        sc.nextLine();

        System.out.print("Digite um valor: ");
        c = sc.nextInt();
        sc.nextLine();

        System.out.print("Digite um valor: ");
        d = sc.nextInt();
        sc.nextLine();

        int diferenca = a * b - c * d;

        System.out.println(a);
        System.out.println(b);
        System.out.println(c);
        System.out.println(d);
        System.out.println("Diferenca: " + diferenca);
        
        sc.close();
    }
}
