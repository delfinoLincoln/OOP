package application;
import entidades.NotaAluno;

import java.util.Locale;
import java.util.Scanner;

public class Aluno {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Locale.setDefault(Locale.US);
        sc.useLocale(Locale.US);

        NotaAluno aluno = new NotaAluno();

        System.out.println("---SISTEMA DA ESCOLA---");
        System.out.print("Digite o nome do aluno: ");
        aluno.nome = sc.nextLine();
        System.out.println();

        System.out.print("Digite a nota do bimestre 1: ");
        aluno.bim1 = sc.nextDouble();
        System.out.println();

        System.out.println("Digite a nota do bimestre 2: ");
        aluno.bim2 = sc.nextDouble();
        System.out.println();

        System.out.println("Digite a nota do bimestre 3: ");
        aluno.bim2 = sc.nextDouble();
        System.out.println();   

        System.out.println("---RESULTADO FINAL---");
        System.out.printf("%.2f\n", aluno.resultadoFinal());

        if(aluno.resultadoFinal() > 60.0) {
            System.out.println("ALUNO REPROVADO!!!");
            System.out.printf("FALTARAM %.2f pontos\n", aluno.faltaPontos());
        }
        else {
            System.out.println("ALUNO APROVADO!!!");
        }

        sc.close();
    }
}
