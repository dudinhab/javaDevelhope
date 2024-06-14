public class Auto {
    private String targa, marca, modello;
    private int cilindrata;


    public static void Auto() {

    }

    public Auto(String targa, String marca, String modello, int cilindrata) {
        this.targa = targa;
        this.marca = marca;
        this.modello = modello;
        this.cilindrata = cilindrata;
    }

    public String getModello() {
        return modello;
    }

    public int getCilindrata() {
        return cilindrata;
    }

    public String getTarga() {
        return targa;
    }

    public String getMarca() {
        return marca;
    }

    public void setCilindrata(int cilindrata) {
        this.cilindrata = cilindrata;
    }

    public void setTarga(String targa) {
        this.targa = targa;
    }

    public void setModello(String modello) {
        this.modello = modello;
    }

    public void setMarca(String marca) {
        this.marca = marca;
    }

}
