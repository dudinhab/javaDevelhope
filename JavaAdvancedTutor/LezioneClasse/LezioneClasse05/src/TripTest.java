import org.testng.annotations.Test;

import java.math.BigDecimal;
import java.time.LocalDate;

import static org.junit.Assert.assertEquals;

public class TripTest {
    @Test
    public void testTripCreation() {
        LocalDate date = LocalDate.now();

        Trip trip1 = new Trip.TripBuilder("Roma", date, date).setPrice(new BigDecimal(11.3)).setTravelName("Test").build();
        assertEquals("Roma",trip1.getDestination());
        assertEquals(true,trip1.getTripSummary().contains("Roma"));
        assertEquals(new BigDecimal(11.3),trip1.calculateTotalPrice(1));
    }

}
