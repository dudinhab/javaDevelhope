import java.math.BigDecimal;
import java.time.LocalDate;

public class Trip implements TripDetails {
    private String destination;
    private LocalDate startDate, endDate;
    private BigDecimal price;
    private String travelName;

    public Trip(TripBuilder tripBuilder){
        this.destination = tripBuilder.destination;
        this.endDate = tripBuilder.endDate;
        this.startDate = tripBuilder.startDate;
        this.price = tripBuilder.price;
        this.travelName = tripBuilder.travelName;
    }

    public String getDestination() {
        return destination;
    }

    public LocalDate getStartDate() {
        return startDate;
    }

    public LocalDate getEndDate() {
        return endDate;
    }

    public BigDecimal getPrice() {
        return price;
    }

    public String getTravelName() {
        return travelName;
    }

    @Override
    public String getTripSummary() {
        return "";
    }

    @Override
    public BigDecimal calculateTotalPrice(int person) {
        return null;
    }

    public static class TripBuilder{
        private String destination;
        private LocalDate startDate, endDate;
        private BigDecimal price;
        private String travelName;

        public TripBuilder(String destination, LocalDate startDate, LocalDate endDate) {
            this.destination = destination;
            this.startDate = startDate;
            this.endDate = endDate;
        }

        public TripBuilder setPrice(BigDecimal price) {
            this.price = price;
            return this;
        }

        public void setTravelName(String travelName) {
            this.travelName = travelName;
        }

        public Trip build(){
            return new Trip(this);
        }
    }

}
