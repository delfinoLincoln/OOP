import java.util.Scanner;

public class ex5 {
    public static void main(String[] args) {
        //Fazer um programa para ler um número inteiro, e depois dizer se este número é negativo ou não.
        Scanner sc = new Scanner(System.in);

        int n;

        System.out.print("Digite um numero: ");
        n = sc.nextInt();
        if (n >= 0) {
            System.out.println(n + " eh positivo!");
        }
        else {
            System.out.println(n + " eh negativo");
        }
        sc.close();
    }
}
