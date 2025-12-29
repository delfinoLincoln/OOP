package aplicacao;

import java.util.Date;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Locale;
import java.util.Scanner;

import entidades.Departamento;
import entidades.HoraContrato;
import entidades.Trabalhador;
import entidades_enums.NivelTrabalhador;

public class ProgramaDep {
    public static void main(String[] args) throws ParseException{
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);
        sc.useLocale(Locale.US);
        SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy");  

        System.out.print("Insira o nome do departamento: ");
        String nomeDepartamento = sc.nextLine();
        System.out.println("---------------------");
        System.out.println("DADOS DO TRABALHADOR");
        System.out.print("Nome: ");
        String nomeTrabalhador = sc.nextLine();
        System.out.print("Nivel do trabalhador: ");
        String nivelTrabalhador = sc.nextLine();
        System.out.print("Base salarial: ");
        double baseSalarial = sc.nextDouble();
        Trabalhador trabalhador = new Trabalhador(nomeTrabalhador, NivelTrabalhador.valueOf(nivelTrabalhador), baseSalarial, new Departamento(nomeDepartamento));

        System.out.print("Insira o numero de contratos para esse funcionario: ");
        int n = sc.nextInt();

        for(int i = 1; i <= n; i++) {
            System.out.printf("Insira os dados do contrato #%d\n", i);
            System.out.print("Data(DD/MM/AAAA): ");
            Date dataContrato = sdf.parse(sc.next());
            System.out.print("Valor por hora: ");
            double valorPorHora = sc.nextDouble();
            System.out.print("Duracao(horas): ");
            int horas = sc.nextInt();
            HoraContrato contrato = new HoraContrato(dataContrato, valorPorHora, horas);
            trabalhador.addContrato(contrato);
        }

        System.out.println();
        System.out.print("Insira mes e ano para calcular a renda(MM/AAAA): ");
        String mes_ano = sc.next();
        int mes = Integer.parseInt(mes_ano.substring(0,2));
        int ano = Integer.parseInt(mes_ano.substring(3));
        
        System.out.println("Nome: " + trabalhador.getNome());
        System.out.println("Departamento: " + trabalhador.getDepartamento().getName());
        System.out.println("Renda para " + mes_ano + ": " + trabalhador.renda(ano, mes));

        sc.close();
    }
}
