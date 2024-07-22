import java.math.BigDecimal;

public interface TripDetails {
    String getTripSummary();
    BigDecimal calculateTotalPrice(int person);
}
