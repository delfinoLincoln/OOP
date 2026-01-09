package aplicacao;

import java.util.InputMismatchException;
import java.util.Scanner;

public class TryCatch {
    public static void main(String[] args) {
        
        method();

        System.out.println();
        System.out.println("fim do programa!");
}

public static void method() {
    System.out.println("***METHOD 1 STARTED***");
    method2();
    System.out.println("***METHOD 1 END***");
}

public static void method2() {

        System.out.println("***METHOD 2 STARTED***");
        Scanner sc = new Scanner(System.in);

        try {
            System.out.print("Digite quantas strings desejar: ");
            String[] x = sc.nextLine().split(" ");
            System.out.print("Digite uma posicao: ");
            int posicao = sc.nextInt();
            System.out.println(x[posicao]);
        }
        catch(ArrayIndexOutOfBoundsException e) {
            System.out.println("Posicao invalida");
            e.printStackTrace();    //printa a pilha de chamada de de metodos(stack trace)
        }
        catch(InputMismatchException e) {
            System.out.println("Caracter invalido!");
            e.printStackTrace();
        }

        sc.close();
        System.out.println("***METHOD 2 END***");
    }
}