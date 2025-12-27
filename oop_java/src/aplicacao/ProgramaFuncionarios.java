package aplicacao;

import java.util.Locale;
import java.util.Scanner;
import java.util.List;
import java.util.ArrayList;

import entidades.Funcionarios;

public class ProgramaFuncionarios {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Locale.setDefault(Locale.US);
        sc.useLocale(Locale.US);

        List<Funcionarios> lista = new ArrayList<>();

        System.out.println("Quantos funcionarios serao registrados?");
        int n = sc.nextInt();

        for(int i = 0; i < n; i++) {
            System.out.printf("Funcionario #%d:\n", i + 1);
            System.out.print("ID: ");
            int id =sc.nextInt();
            while(hasId(lista, id)) {
                System.out.print("ID em uso! Digite novamente: ");
                id = sc.nextInt();
            }

            System.out.print("Nome: ");
            sc.nextLine();
            String nome = sc.nextLine();

            System.out.print("Salario: ");
            double salario = sc.nextDouble();
            lista.add(new Funcionarios(id, nome, salario));
        }

        System.out.print("Insira o id do funcionario que recebera um aumento no salario: ");
        int id = sc.nextInt();
        Funcionarios funcionario = lista.stream().filter(x -> x.getId() == id).findFirst().orElse(null);
        if (funcionario == null) {
            System.out.println("Esse id nao existe!");
        }
        else {
            System.out.print("Insira a porcentagem do aumento: ");
            double porcentagem = sc.nextDouble();
            funcionario.aumentoSalario(porcentagem);
        }

        System.out.println("Lista de funcionarios:");
        for (Funcionarios x : lista) {
            System.out.println(x);
        }

        sc.close();
    }

    public static boolean hasId(List<Funcionarios> lista, int id) {
		Funcionarios funcionario = lista.stream().filter(x -> x.getId() == id).findFirst().orElse(null);
		return funcionario != null;
    }
}
