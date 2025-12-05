import java.util.Scanner;
import java.util.Locale;

public class ex4 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        sc.useLocale(Locale.US);
        Locale.setDefault(Locale.US);

        int n;
        int horasTrabalhadas;
        double valorHora;
        double salario;

        System.out.print("Digite o numero do funcionario: ");
        n = sc.nextInt();
        sc.nextLine();

        System.out.print("Digite o numero de horas trabalhadas: ");
        horasTrabalhadas = sc.nextInt();
        sc.nextLine();

        System.out.print("Digite o valor ganho por hora: ");
        valorHora = sc.nextDouble();
        sc.nextLine();

        salario = horasTrabalhadas * valorHora;

        System.out.println("Numero do funcionario: " + n);
        System.out.println("Horas trabalhadas: " + horasTrabalhadas);
        System.out.printf("Valor ganho por hora: %.2f\n", valorHora);
        System.out.printf("Salario: %.2f", salario);

        sc.close();
    }
}
