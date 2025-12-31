package entidades;

public class Carro extends Veiculo {
    private Integer qtdPortas;
    private String tipoCarroceria;

    public Carro(){
    }

    public Carro(Integer cavalosPotencia, String fabricante, String modelo, Integer anoFabricacao, String cor,
            String placa, Integer quilometragem, Integer qtdPortas, String tipoCarroceria) {
        super(cavalosPotencia, fabricante, modelo, anoFabricacao, cor, placa, quilometragem);
        this.qtdPortas = qtdPortas;
        this.tipoCarroceria = tipoCarroceria;
    }

    public Integer getQtdPortas() {
        return qtdPortas;
    }

    public void setQtdPortas(Integer qtdPortas) {
        this.qtdPortas = qtdPortas;
    }

    public String getTipoCarroceria() {
        return tipoCarroceria;
    }

    public void setTipoCarroceria(String tipoCarroceria) {
        this.tipoCarroceria = tipoCarroceria;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("=== VEÍCULO ===\n");
        sb.append("Fabricante: ").append(fabricante).append("\n");
        sb.append("Modelo: ").append(modelo).append("\n");
        sb.append("Ano: ").append(anoFabricacao).append("\n");
        sb.append("Cor: ").append(cor).append("\n");
        sb.append("Placa: ").append(placa).append("\n");
        sb.append("Potência: ").append(cavalosPotencia).append(" cv\n");
        sb.append("Quilometragem: ").append(quilometragem).append(" km\n");
        return sb.toString();
    }
}
