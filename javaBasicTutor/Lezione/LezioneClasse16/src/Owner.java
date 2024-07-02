public class Owner extends Person{
    private Car[] ownedCars;
    private int carCount;

    public Owner(String firstName, String lastName, int age){
        super(firstName, lastName, age);
        ownedCars = new Car[5];
        carCount =0;
    }

    public void addCar(Car c){
        if (ownedCars.length>=carCount){
            ownedCars[carCount] = c;
            carCount++;
        }else {
            System.out.println("Array pieno!");
        }
    }

    public void addCar(Car[] c){
        for (int i = 0; i < c.length; i++) {
            if (ownedCars.length>=carCount){
                ownedCars[carCount] = c[i];
                carCount++;
                System.out.println("Macchina add!");
            }else {
                System.out.println("Array pieno!");
            }
        }

    }

    public Car findCarByVIN(String vin){
        for (int i = 0; i < ownedCars.length; i++) {
            if (vin.equals(ownedCars[i].getVin())){
                return ownedCars[i];
            }
        }
        System.out.println("Macchina non trovata!");
        return null;
    }

    @Override
    public String getRole() {
        return "Owner";
    }
}
