package lab4.problem2;

import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

public class TemparatureSensor implements Sensor {
    private Location location;
    private LocalDateTime lastUpdated;
    private double temperature;

    public TemparatureSensor(Location location, LocalDateTime lastUpdated, double temperature){
        this.location = location;
        this.lastUpdated = lastUpdated;
        this.temperature = temperature;
    };

    @Override
    public String getSensorType() {
        return this.getClass().getSimpleName();
    }

    @Override
    public double getReading() {
        return this.temperature;
    }

    @Override
    public Location getLocation() {
        return this.location;
    }

    @Override
    public LocalDateTime getLastUpdated() {
        LocalDateTime currentTime = LocalDateTime.now();
        setLastUpdated(currentTime);
        return currentTime;
    }


    @Override
    public String performAction() {
       /*
        In TemparatureSensor, if the temperature reaches above 30 return “an alert to
        turn on the AC”, if it reaches below 18 return “an alert to turn on the Heater”
        otherwise “ Temperature is in normal range ”
        */
        if(temperature > 30) return "an alert to turn on the AC";
        else if(temperature < 18) return "an alert to turn on the Heater";
        else return "Temperature is in normal range";
    }

    public void setLastUpdated(LocalDateTime lastUpdated) {
        this.lastUpdated = lastUpdated;
    }

    public void setLocation(Location location) {
        this.location = location;
    }

    public void setTemperature(double temperature) {
        this.temperature = temperature;
    }

    @Override
    public String toString() {
        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("hh:mm a");
        return String.format("""
            *************************\s
            Sensor Type: %s
            Reading: %.1f
            Location: %s
            Last Updated: %s
            Action: %s
            *************************
            """,
            this.getSensorType(),
            this.getReading(),
            this.getLocation().toString(),
            this.lastUpdated.format(formatter),
            this.performAction()
        );
    }
}
