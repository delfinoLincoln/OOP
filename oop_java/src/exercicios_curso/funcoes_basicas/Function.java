import java.util.Scanner;

public class Function {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Digite um numero: ");
        int a = sc.nextInt();

        System.out.print("Digite um numero: ");
        int b = sc.nextInt();
        sc.nextLine();

        System.out.print("Digite um numero: ");
        int c = sc.nextInt();
        sc.nextLine();

        int maior = max(a, b, c);

        mostrarResultado(maior);

        sc.close();
    }

    public static int max(int x, int y, int z) {
        int aux;
        if(x > y && x > z) {
            aux = x;
        }
        else if(y > z) {
            aux = y;
        }
        else {
            aux = z;
        }

        return aux;
    }
    public static void mostrarResultado(int valor) {
        System.out.println("Maior: " + valor);
    }
}