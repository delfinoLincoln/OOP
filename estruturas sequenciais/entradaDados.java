import java.util.Scanner;
import java.util.Locale;

public class entradaDados {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        String nome;
        int idade;
        double nota1;
        double nota2;
        double nota3;
        double media;

        sc.useLocale(Locale.US);
        
        System.out.print("Digite seu nome: ");
        nome = sc.nextLine();
        System.out.println("Nome: " + nome);

        System.out.print("Digite sua idade: ");
        idade = sc.nextInt();
        sc.nextLine();
        System.out.println("Idade: " + idade);

        System.out.print("Nota 1 bimestre: ");
        nota1 = sc.nextDouble();
        sc.nextLine();
        System.out.println("Nota: " + nota1);

        System.out.print("Nota 2 bimestre: ");
        nota2 = sc.nextDouble();
        sc.nextLine();
        System.out.println("Nota: " + nota2);

        System.out.print("Nota 3 bimestre: ");
        nota3 = sc.nextDouble();
        sc.nextLine();
        System.out.println("Nota: " + nota3);

        media = (nota1 + nota2 + nota3) / 3;
        System.out.printf("Media final: %.2f\n", media);

        if (media > 7.0) {
            System.out.println("Voce passou!!!");
        }
        else if(media == 6.0) {
            System.out.println("Voce esta de recuperacao!!!");
        }
        else {
            System.out.println("Voce esta de recuperacao!!!");
        }
        sc.close();
    }
}
