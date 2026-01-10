package entities;

public class VetPensao {
    private String nomeInquilino;
    private String email;
    
    public VetPensao(String nomeInquilino, String email) {
        this.nomeInquilino = nomeInquilino;
        this.email = email;
    }
    public String getNomeInquilino() {
        return nomeInquilino;
    }
    public void setNomeInquilino(String nomeInquilino) {
        this.nomeInquilino = nomeInquilino;
    }
    public String getEmail() {
        return email;
    }
    public void setEmail(String email) {
        this.email = email;
    }
    public String toString() {
        return nomeInquilino + ", " + email;
    }
}
