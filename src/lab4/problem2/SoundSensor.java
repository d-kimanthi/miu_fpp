package lab4.problem2;

import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

public class SoundSensor implements Sensor {
    private Location location;
    private LocalDateTime lastUpdated;
    private double soundLevel;

    public SoundSensor(Location location, LocalDateTime lastUpdated, double soundLevel){
        this.location = location;
        this.lastUpdated = lastUpdated;
        this.soundLevel = soundLevel;
    };

    @Override
    public String getSensorType() {
        return this.getClass().getSimpleName();
    }

    @Override
    public double getReading() {
        return this.soundLevel;
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
       /*
       In SoundSensor, if the sound level reaches above 70 return “an alert to turn on
        noise cancellation”, else “ Sound is within normal range ”
        */
        return this.soundLevel > 70 ? "an alert to turn on noise cancellation" : "Sound is within normal range";
    }

    public void setLastUpdated(LocalDateTime lastUpdated) {
        this.lastUpdated = lastUpdated;
    }

    public void setLocation(Location location) {
        this.location = location;
    }

    public void setSoundLevel(double soundLevel) {
        this.soundLevel = soundLevel;
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
