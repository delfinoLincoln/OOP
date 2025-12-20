package utilitario;

public class ConversorMoeda {
    public static double cotacao;
    public static double dolarComprado;

    public static double valorSemIOF() {
        return cotacao * dolarComprado;
    }

    public static double valorIOF() {
        return valorSemIOF() * 0.06;
    }

    public static double valorFinal() {
        return valorSemIOF() + valorIOF();
    }
}
