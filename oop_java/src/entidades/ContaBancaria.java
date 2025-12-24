package entidades;

public class ContaBancaria {
    private int numeroConta;
    private String titular;
    private double saldo;

    public ContaBancaria(int numeroConta, String titular) {
        this.numeroConta = numeroConta;
        this.titular = titular;
    }

    public ContaBancaria(int numeroConta, String titular, double saldoInicial) {
        this.numeroConta = numeroConta;
        this.titular = titular;
        depositar(saldoInicial);
    }

    /*<getters> */
    public int getNumeroConta() {
        return numeroConta;
    }  
    public String getTitular() {
        return titular;
    }
    public double getSaldo() {
        return saldo;
    }
    /*<Setters> */
    public void setNome(String titular) {
        this.titular = titular;
    }

    /*<métodos> */
    public void depositar(double valor) {
        saldo += valor;
    }

    public void sacar(double valor) {
        saldo -= valor + 5.0;
    }

    @Override
    public String toString() {
        return "Numero da conta: "
                + numeroConta
                + ", titular: "
                + titular
                + ", Saldo: "
                + String.format("%.2f", saldo);
    }
}