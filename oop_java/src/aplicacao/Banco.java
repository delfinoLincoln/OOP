package aplicacao;

import entidades.ContaBancaria;
import java.util.Scanner;
import java.util.Locale;

public class Banco {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Locale.setDefault(Locale.US);
        sc.useLocale(Locale.US);

        ContaBancaria conta;

        System.out.print("Insira o numero da conta: ");
        int numero = sc.nextInt();
        sc.nextLine();
        System.out.print("Insira o nome do titular: ");
        String nome = sc.nextLine();
        System.out.println("Esse eh seu primeiro deposito? (s/n)");
        char resp = sc.next().charAt(0);
        if (resp == 'y') {
            System.out.print("Insira o valor do seu deposito inicial: ");
			double depositoInicial = sc.nextDouble();
			conta = new ContaBancaria(numero, nome, depositoInicial);
        }
        else {
            conta = new ContaBancaria(numero, nome);
        }

        System.out.println("Dados da conta: ");
        System.out.print(conta);
        System.out.println();

        System.out.print("Insira um valor para deposito: ");
        double  depositarValor = sc.nextDouble();
        conta.depositar(depositarValor);
        System.out.println();

        System.out.println("Dados atualizados: ");
        System.out.print(conta);
        System.out.println();

        System.out.print("Insira um valor para sacar: ");
        double valorRetirado = sc.nextDouble();
        conta.sacar(valorRetirado);

        System.out.println();
        System.out.println("Dados atualizados:");
        System.out.println(conta);

        sc.close();
    }
}
