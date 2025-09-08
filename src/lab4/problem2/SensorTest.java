package lab4.problem2;

import java.time.LocalDateTime;

public class SensorTest {
    public static void main(String[] args) {
        Sensor[] array = {
          new TemparatureSensor(Location.GARDEN, LocalDateTime.now(), 15.0),
          new TemparatureSensor(Location.LIVING_ROOM, LocalDateTime.of(2025,9,8,15,35), 35.0),
          new LightSensor(Location.KITCHEN, LocalDateTime.of(2025,8,9,14,35), 110),
          new LightSensor(Location.GARDEN, LocalDateTime.of(2025,9,9,13,35), 80),
          new SoundSensor(Location.LIVING_ROOM, LocalDateTime.of(2025,9,9,12,35), 71),
        };

        for(Sensor sensor : array){
            System.out.println(sensor);
        }
    }
}
