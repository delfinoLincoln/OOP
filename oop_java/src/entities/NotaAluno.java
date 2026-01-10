package entities;

public class NotaAluno {

    public String nome;
    public double bim1;
    public double bim2;
    public double bim3;

    public double resultadoFinal() {
        return (bim1 + bim2 + bim3);
    }

    public double faltaPontos() {
        if(resultadoFinal() < 60.0) {
            return 60.0 - resultadoFinal();
        }
        else {
            return 0.0;
        }
    }
}
