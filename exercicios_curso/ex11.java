import java.util.Scanner;

public class ex11 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Digite uma senha: ");
        int senha = sc.nextInt();
        int valido = 2002;
        while (true) {
            if (senha != valido) {
                System.out.println("Senha invalida");
                System.out.print("Digite novamente: ");
                senha = sc.nextInt();
            }
            else {
                System.out.println("Acesso permitido");
                break;
            }
        }

        sc.close();
    }
}
