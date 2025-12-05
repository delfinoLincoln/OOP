import java.util.Locale;

public class saidaDados {
    public static void main(String[] args) {
        
        double x = 10.35784;
        System.out.println("x = " + x);
        System.out.printf("%.2f\n", x);
        System.out.printf("%.4f\n", x);

        //troca de virgula(padrao br) para ponto(padrao EUA)
        Locale.setDefault(Locale.US);
        System.out.printf("%.2f\n", x);
        System.out.printf("%.4f\n", x);

        //concatenar varios elementos
        System.out.println("Resultado = " + x + " metros");

        //com printf
        System.out.printf("Resultado = %.2f metros\n", x);

        String nome = "link";       
        int idade = 19;             
        double salario = 4000.00;
        //%s
        //%d
        //%.2f || %.4f
        //quebra de linha = \n || %n

        //com printf
        System.out.printf("%s tem %d anos e ganha R$ %.2f\n", nome, idade, salario);

        //com sout
        System.out.println(nome + " tem " + idade + " anos e ganha R$ " + salario);
    }
}