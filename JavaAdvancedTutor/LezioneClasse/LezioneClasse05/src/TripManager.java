import java.util.List;

public class TripManager {
    private List<Trip> trips;
    private static TripManager manager;

    public static TripManager getInstance() {
        if (manager == null) {
            manager = new TripManager();
        }
        return manager;
    }

    private TripManager(){}

    //agg viaggio alla lista
    public void addTrip(Trip trip){
        trips.add(trip);
    }

    public void delTrip(Trip trip){
        trips.remove(trip);
    }

    public List<Trip> getTrips() {
        return trips;
    }
}
