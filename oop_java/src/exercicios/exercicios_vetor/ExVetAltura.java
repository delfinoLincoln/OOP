package exercicios.exercicios_vetor;

import entidades.VetPessoa;
import java.util.Scanner;
import java.util.Locale;

public class ExVetAltura {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        sc.useLocale(Locale.US);
        Locale.setDefault(Locale.US);

        System.out.print("Digite um valor inteiro: ");
        int n = sc.nextInt();

        VetPessoa[] pessoa = new VetPessoa[n];

        for(int i = 0; i < pessoa.length; i++) {
            sc.nextLine();
            System.out.printf("Dados da pessoa [%d]\n", (i + 1));
            System.out.print("Nome: ");
            String nome = sc.nextLine();
            System.out.print("Idade: ");
            int idade = sc.nextInt();
            System.out.print("Altura: ");
            double altura = sc.nextDouble();
            pessoa[i] = new VetPessoa(nome, idade, altura);
        }

        double somaAlturas = 0.0;
        for(int i = 0; i < pessoa.length; i++) {
            somaAlturas = pessoa[i].getAltura();
        }

        double media = somaAlturas / pessoa.length;

        int menores = 0;
        double percentualMenor = 0.0;

        for(int i = 0; i < pessoa.length; i++) {
            if (pessoa[i].getIdade() < 16) {
                menores++;
            }
        }

        percentualMenor = ((double) menores / n) * 100.0;

        System.out.printf("Altura media: %.2f\n", media);
        System.out.printf("Pessoas com menos de 16: %.1f%s\n", percentualMenor, "%");
        System.out.println("Nomes: ");
        for(int i = 0; i < pessoa.length; i++) {
            if(pessoa[i].getIdade() < 16) {
            System.out.println(pessoa[i].getNome());
            }
        }

        sc.close();
    }
}
