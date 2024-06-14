public class Studente {
    private String nome;
    private float voto;

    public Studente() {

    }

    public Studente(String nome, float voto) {
        this.nome = nome;
        this.voto = voto;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public float getVoto() {
        return voto;
    }

    public void setVoto(float voto) {
        this.voto = voto;
    }

    public String toString() {
        return "Studente: " + nome + "; Voto: " + voto;
    }
}
