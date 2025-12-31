package aplicacao;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;
import entidades.Carro;

public class ProgramHeranca {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        List<Carro> carros = new ArrayList<>();

        System.out.print("Quantos carros deseja cadastrar? ");
        int n = sc.nextInt();
        System.out.println("---SISTEMA DE CADASTRO DE CARROS---");

        for(int i = 1; i <= n; i++) {
            System.out.println("CARRO #" + i);
            sc.nextLine();

            System.out.print("Marca: ");
            String marca = sc.nextLine();

            System.out.print("Modelo: ");
            String modelo = sc.nextLine();

            System.out.print("Cor: ");
            String cor = sc.nextLine();

            System.out.print("Placa: ");
            String placa = sc.nextLine();

            System.out.print("Tipo do carroceria: ");
            String tipoCarroceria = sc.nextLine();

            System.out.print("Ano de fabricacao: ");
            int anoFabricacao = sc.nextInt();

            System.out.print("Cavalos de potencia: ");
            int cv = sc.nextInt();

            System.out.print("Quantidade de portas: ");
            int qtdPortas = sc.nextInt();

            System.out.print("Quilometragem: ");
            int quilometragem = sc.nextInt();

            Carro novoCarro = new Carro(cv, marca, modelo, anoFabricacao, cor, placa, quilometragem, qtdPortas, tipoCarroceria);

            carros.add(novoCarro);
        }

        System.out.println();

        System.out.println("---CARROS CADASTRADOS---");
        for(Carro c : carros) {
            System.out.println(c);
        }

        sc.close();
    }
}
