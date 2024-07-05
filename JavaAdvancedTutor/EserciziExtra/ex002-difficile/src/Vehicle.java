public interface Vehicle {
    public String getModel();
    public double getPrice();
    public boolean isAvailable();

    default String getType() {
        return null;
    }
}
