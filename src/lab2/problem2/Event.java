package lab2.problem2;

import java.time.*;
import java.time.format.DateTimeFormatter;

public class Event {
    private String name;
    private LocalDateTime eventDate;
    private String userTimeZone;

    public Event (String name, LocalDateTime eventDate, String tz) {
        this.name = name;
        this.eventDate = eventDate;
        this.userTimeZone = tz;

    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public LocalDateTime getEventDate() {
        return eventDate;
    }

    public void setEventDate(LocalDateTime eventDate) {
        this.eventDate = eventDate;
    }

    public String formatEventDetails() {
        // Get system timezone dynamically
        ZoneId systemZone = ZoneId.systemDefault();

        return _formatDate(systemZone.toString());
    }

    public String timeZoneConversion(){
        return _formatDate(userTimeZone);
    }

    private String _formatDate(String zone) {
        // Create formatter with timezone
        String pattern = String.format("EEEE, MMMM d, yyyy '@' HH:mm '[%s]'", zone);
        DateTimeFormatter formatter = DateTimeFormatter.ofPattern(pattern);

        return eventDate
                .atZone(ZoneId.systemDefault())
                .withZoneSameInstant(ZoneId.of(zone))
                .format(formatter);

    }
}
