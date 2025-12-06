import java.util.Scanner;

public class ex6 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n;

        System.out.print("Digite um valor: ");
        n = sc.nextInt();
        if (n % 2 == 0) {
            System.out.println(n + " eh par");
        }
        else { 
            System.out.println(n + " eh impar");
        }

        sc.close();
    }  
}

//Fazer um programa para ler um número inteiro e dizer se este número é par ou ímpar.