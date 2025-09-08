*Problem 2: Smart Home Sensors - Interface*
1. Create a Sensor Interface with the following behaviors
   o getSensorType() – Return the name of the Sensor
   o getReading() – Return the sensor data in double
   o getLocation() – Return the Home location where sensor deployed. [ Garden,
   Kitchen, etc.,]
   o getLastUpdated() – Return the system current time.
   o String performAction(); - Return the action taken based on the Sensor alert
2. Create Classes LightSensor, SoundSensor, TemparatureSensor implements
   Sensor. Add the common attributes such as location and lastupdated in each class.
3. LightSensor class has additional field lightlevel.
4. SoundSensor class has additional field soundlevel.
5. TemparatureSensor has additional field temperature.
6. If the user invoke the getLastUpdated() method return the current time and update
   the instance field lastupdated with the current time.
7. Do the below logic in each subclass for the performAction()
   o In LightSensor, if the lightlevel reaches below 100 return “an alert to turn on
   the light”, else “ Light is sufficient”
   o In SoundSensor, if the sound level reaches above 70 return “an alert to turn on
   noise cancellation”, else “ Sound is within normal range”
   o In TemparatureSensor, if the temperature reaches above 30 return “an alert to
   turn on the AC”, if it reaches below 18 return “an alert to turn on the Heater”
   otherwise “ Temperature is in normal range”
8. Write a SensorTest class with the main() method.
   a. Create an array of type Sensor, Store 5 different objects.
   b. Loop through the objects and print the status of the objects. (Override
   toString())
   c. Print the getLastUpdated() output shows the time in HH:MM am/pm
   Sample output:
   Sensor Type: Temperature
   Reading: 23.5
   Location: Living Room
   Last Updated: 03:55 PM
   Action: Temperature is within the normal range.
   Sensor Type: Light
   Reading: 80.0
   Location: Garden
   Last Updated: 03:55 PM
   Action: Light level is too low! Turning on the lights.
   Sensor Type: Sound
   Reading: 65.0
   Location: Bedroom
   Last Updated: 03:55 PM
   Action: Sound level is within the normal range.