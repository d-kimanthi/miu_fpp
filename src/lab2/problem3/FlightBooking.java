package lab2.problem3;

public record FlightBooking(String origin, String destination, double distanceKm) {
    public FlightBooking {
        if(origin == null || origin.isEmpty() || destination == null || destination.isEmpty() || distanceKm <= 0.0f){
            throw new IllegalArgumentException("Invalid input");
        }
    }

    public double computeFlightTime(double avgSpeed){
        return this.distanceKm / avgSpeed;
    }
}
