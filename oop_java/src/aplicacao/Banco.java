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

        if (resp == 's' || resp == 'S') {
            double depositoInicial;
            do {
                System.out.print("Insira o valor do seu deposito inicial: ");
                depositoInicial = sc.nextDouble();
                if (depositoInicial < 0) {
                    System.out.println("Deposito inicial nao pode ser negativo!");
                    System.out.println();
                }
            } while (depositoInicial < 0);
            conta = new ContaBancaria(numero, nome, depositoInicial);
        }

        else {
            conta = new ContaBancaria(numero, nome);
        }

        System.out.println("Dados da conta: ");
        System.out.print(conta);
        System.out.println();

        System.out.print("Insira um valor para deposito: ");
        double depositarValor = sc.nextDouble();
        conta.depositar(depositarValor);
        System.out.println();

        System.out.println("Dados atualizados: ");
        System.out.print(conta);
        System.out.println();

        double valorRetirado;
        boolean saqueValido = false;

        do {
            System.out.print("Insira um valor para sacar: ");
            valorRetirado = sc.nextDouble();

            if (valorRetirado <= conta.getSaldo() && valorRetirado > 0) {
                conta.sacar(valorRetirado);
                saqueValido = true;
            } 
            else {
                System.out.println("Saldo insuficiente! Tente novamente.");
                System.out.printf("Saldo atual: R$%.2f%n", conta.getSaldo());
                System.out.println();
            }
        } while (!saqueValido);

        System.out.println();
        System.out.println("Dados atualizados:");
        System.out.println(conta);

        sc.close();
    }
}
