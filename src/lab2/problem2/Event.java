package lab2.problem2;

import java.time.LocalDate;

public class Event {
    private String name;
    private LocalDate eventDate;

    public Event (String name, LocalDate eventDate) {
        this.name = name;
        this.eventDate = eventDate;

    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public LocalDate getEventDate() {
        return eventDate;
    }

    public void setEventDate(LocalDate eventDate) {
        this.eventDate = eventDate;
    }
}
