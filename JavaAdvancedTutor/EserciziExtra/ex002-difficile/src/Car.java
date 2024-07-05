public class Car extends AbstractVehicle {
    private String brand;

    public Car(String model, double price, boolean available, String brand) {
        super(model, price, available);
        this.brand = brand;
    }

    @Override
    public String displayDetails() {
        return "Modelo: " + model + " | Prezzo: " + price + " | Disponibile: " + available + " | Marca: " + brand;
    }

    @Override
    public String getType() {
        return "Car";
    }
}
