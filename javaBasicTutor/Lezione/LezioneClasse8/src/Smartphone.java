public class Smartphone extends Device{
    private int batteryLife;

    public Smartphone(int id, String brand, double price, DeviceType type, int batteryLife) {
        super(id, brand, price, type);
        this.batteryLife = batteryLife;
    }

    public void setBatteryLife(int batteryLife) {
        this.batteryLife = batteryLife;
    }

    @Override
    public boolean isEligibleForDiscount() {
        return batteryLife > 20 && price < 600;
    }
}
