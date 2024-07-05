public class Motorcycle extends AbstractVehicle {
    private String engineType;

    public Motorcycle(String model, double price, boolean available, String engineType) {
        super(model, price, available);
        this.engineType = engineType;
    }

    @Override
    public String displayDetails() {
        return "Modelo: " + model + " | Prezzo: " + price + " | Disponibile: " + available + " | Tipo di motore: " + engineType;
    }

    @Override
    public String getType() {
        return "Motorcycle";
    }
}
