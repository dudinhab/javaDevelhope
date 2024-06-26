public class PianoForte extends Strumento {
    private int numeroTasti;

    public PianoForte() {
    }

    public PianoForte(int numeroTasti, String marca, String modelo, double prezzo) {
        this.numeroTasti = numeroTasti;
        this.marca = marca;
        this.modelo = modelo;
    }

    @Override
    public double calcoloPrezo() {
        return prezzo;
    }
}
