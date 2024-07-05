public abstract class AbstractVehicle implements Vehicle {
    protected String model;
    protected double price;
    protected boolean available;

    public AbstractVehicle(String model, double price, boolean available) {
        this.model = model;
        this.price = price;
        this.available = available;
    }

    public abstract String displayDetails();

    public String getModel() {
        return model;
    }

    public double getPrice() {
        return 0;
    }

    public boolean isAvailable() {
        return false;
    }

    public String getType() {
        return null;
    }
}
