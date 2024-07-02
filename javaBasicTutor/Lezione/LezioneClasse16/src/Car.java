public class Car {
    private String model, vin;

    public Car(String model, String vin){
        this.model=model;
        this.vin=vin;
    }

    public String getVin() {
        return vin;
    }
    public String getModel(){
        return model;
    }
}
