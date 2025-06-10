import java.math.BigDecimal;
import java.time.LocalDate;

public class Main {
    public static void main(String[] args) {
        Object localDate;
        Trip trip1 = new Trip.TripBuilder("Roma", LocalDate.now(),LocalDate.now()).setPrice(new BigDecimal(11.3)).setTravelName("Test").build();
    }
}
