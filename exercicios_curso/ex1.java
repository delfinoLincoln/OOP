import java.util.Scanner;
public class ex1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int num1;
        int num2;
        int soma;

        System.out.print("Digite um numero: ");
        num1 = sc.nextInt();
        sc.nextLine();

        System.out.print("Digite outro numero: ");
        num2 = sc.nextInt();
        sc.nextLine();

        soma = num1 + num2;
        
        System.out.println("Primeiro valor: " + num1);
        System.out.println("Segundo valor: " + num2);
        System.out.println("Soma: " + soma);

        sc.close();
    }
}
