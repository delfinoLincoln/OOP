package entidades;

public class Veiculo {
    private Integer cavalosPotencia;
    private String fabricante;
    private String modelo;
    private Integer anoFabricacao;
    private String cor;
    private String placa;
    private Integer quilometragem;
    
    public Veiculo() {
    }

    public Veiculo(Integer cavalosPotencia, String fabricante, String modelo, Integer anoFabricacao, String cor,
            String placa, Integer quilometragem) {
        this.cavalosPotencia = cavalosPotencia;
        this.fabricante = fabricante;
        this.modelo = modelo;
        this.anoFabricacao = anoFabricacao;
        this.cor = cor;
        this.placa = placa;
        this.quilometragem = quilometragem;
    }

    public Integer getCavalosPotencia() {
        return cavalosPotencia;
    }
    public void setCavalosPotencia(Integer cavalosPotencia) {
        this.cavalosPotencia = cavalosPotencia;
    }
    public String getFabricante() {
        return fabricante;
    }
    public void setFabricante(String fabricante) {
        this.fabricante = fabricante;
    }
    public String getModelo() {
        return modelo;
    }
    public void setModelo(String modelo) {
        this.modelo = modelo;
    }
    public Integer getAnoFabricacao() {
        return anoFabricacao;
    }
    public void setAnoFabricacao(Integer anoFabricacao) {
        this.anoFabricacao = anoFabricacao;
    }
    public String getCor() {
        return cor;
    }
    public void setCor(String cor) {
        this.cor = cor;
    }
    public String getPlaca() {
        return placa;
    }
    public void setPlaca(String placa) {
        this.placa = placa;
    }
    public Integer getQuilometragem() {
        return quilometragem;
    }
    public void setQuilometragem(Integer quilometragem) {
        this.quilometragem = quilometragem;
    }

    
}
