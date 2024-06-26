public class Laptop extends Device {
    private int ramSize;


    public void setRamSize(int ramSize) {
        this.ramSize = ramSize;
    }

    public Laptop(int id, String brand, double price, DeviceType type, int ramSize) {
        super(id, brand, price, type);
        this.ramSize = ramSize;
    }

    @Override
    public boolean isEligibleForDiscount() {
        return ramSize > 8 && price < 1000;
    }
}
