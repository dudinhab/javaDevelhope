import java.util.ArrayList;
import java.util.HashSet;

public class VehicleManager {
    private HashSet<AbstractVehicle> vehicles = new HashSet<AbstractVehicle>();

    public void addVehicle(AbstractVehicle vehicle) {
        if (vehicle != null) {
            vehicles.add(vehicle);
        }
    }

    public void addVehicle(HashSet<AbstractVehicle> vehicle) {
        if (vehicle != null) {
            for (AbstractVehicle i:vehicle){
                vehicles.add(i);
            }
        }
    }

    void removeVehicle(Vehicle vehicle) {
        vehicles.remove(vehicle);
    }

    void displayVehicles() {
        for (AbstractVehicle i : vehicles) {
            System.out.println(i.displayDetails());
        }
    }

    public ArrayList<AbstractVehicle> findVehicleByModel(String model) {
        try{
            ArrayList<AbstractVehicle> vehicles1 = new ArrayList<>();
            boolean vuoto = true;
            for (AbstractVehicle i : vehicles) {
                if (i.getModel().equals(model)){
                    System.out.println(i.displayDetails());
                    vehicles1.add(i);
                    vuoto = false;
                }
            }if (vuoto){
                throw new VehicleNotFoundException();
            }else{
                return vehicles1;
            }
        }catch (VehicleNotFoundException e){
            e.getMessage();
        }
        return null;
    }
}
