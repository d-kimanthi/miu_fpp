package lab4.problem2;

import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

public class LightSensor implements Sensor{
    private Location location;
    private LocalDateTime lastUpdated;
    private double lightLevel;

    public LightSensor(Location location, LocalDateTime lastUpdated, double lightLevel){
        this.location = location;
        this.lastUpdated = lastUpdated;
        this.lightLevel = lightLevel;
    };

    @Override
    public String getSensorType() {
        return this.getClass().getSimpleName();
    }

    @Override
    public double getReading() {
        return this.lightLevel;
    }

    @Override
    public Location getLocation() {
        return this.location;
    }

    @Override
    public LocalDateTime getLastUpdated() {
        return this.lastUpdated;
    }

    @Override
    public String performAction() {
        // In LightSensor, if the lightLevel reaches below 100 return “an alert to turn on
        // the light”, else “ Light is sufficient ”
        if(this.lightLevel < 100) return "an alert to turn on the light";
        return "Light is sufficient";
    }

    public void setLastUpdated(LocalDateTime lastUpdated) {
        this.lastUpdated = lastUpdated;
    }

    public void setLocation(Location location) {
        this.location = location;
    }

    public void setLightLevel(double lightLevel) {
        this.lightLevel = lightLevel;
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
