import java.util.Scanner;
import java.util.Locale;

public class ex10 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        sc.useLocale(Locale.US);
        Locale.setDefault(Locale.US);

        System.out.println("Digite um valor: ");
        double n = sc.nextDouble();

        if (n >= 0 && n < 25) {
            System.out.println(n + " esta no intervalo de [0; 25]");
        }
        else if(n >= 25 && n < 50) {
            System.out.println(n + " esta no intervalo de [25; 50]");
        }
        else if(n >= 50 && n < 75 ) {
            System.out.println((n + " esta no intervalo de [50; 75]"));
        }
        else if(n >= 75 && n < 100) {
            System.out.println(n + " esta no intervalo de [75; 100]");
        }
        else {
            System.out.println("Nao esta no intervalo!!!");
        }


        sc.close();
    }
}
//Você deve fazer um programa que leia um valor qualquer e apresente uma mensagem dizendo em qual dos
// seguintes intervalos ([0,25], (25,50], (50,75], (75,100]) este valor se encontra. Obviamente se o valor não estiver em
// nenhum destes intervalos, deverá ser impressa a mensagem “Fora de intervalo”.