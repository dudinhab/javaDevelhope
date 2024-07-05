public class Electronic extends AbstractItem {
    private String brand;

    public Electronic(String name, double price, boolean available, String brand) {
        super(name, price, available);
        this.brand = brand;
    }

    @Override
    public String displayDetails() {
        return "Nome: " + name + " | Prezzo: " + price + " | Avaliazion: " + available + " | Marca: " + brand;
    }
}
