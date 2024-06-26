public abstract class Device {
    protected int id;
    protected String brand;
    protected double price;
    protected DeviceType type;


    public Device(int id, String brand, double price, DeviceType type) {
        this.id = id;
        this.brand = brand;
        this.price = price;
        this.type = type;
    }

    public int getId() {
        return id;
    }

    public String getBrand() {
        return brand;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public DeviceType getType() {
        return type;
    }

    public abstract boolean isEligibleForDiscount();
}
