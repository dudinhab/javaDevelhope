public abstract class Veicolo {
    protected String marca, modelo, targa;

    public Veicolo(String marca, String modelo, String targa) {
        this.marca = marca;
        this.modelo = modelo;
        this.targa = targa;
    }

    public String getTarga() {
        return targa;
    }
}
