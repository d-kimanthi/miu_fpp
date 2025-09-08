package lab4.problem2;

import java.time.LocalDateTime;

/**
 * 1. Create a Sensor Interface with the following behaviors
 *    o getSensorType() – Return the name of the Sensor
 *    o getReading() – Return the sensor data in double
 *    o getLocation() – Return the Home location where sensor deployed. [ Garden,
 *    Kitchen, etc.,]
 *    o getLastUpdated() – Return the system current time.
 *    o String performAction(); - Return the action taken based on the Sensor alert
 */
public interface Sensor {
    String getSensorType();
    double getReading();
    Location getLocation();
    LocalDateTime getLastUpdated();
    String performAction();
}
