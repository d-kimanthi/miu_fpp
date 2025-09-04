package lab2.problem2;

import java.time.DateTimeException;
import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.Period;
import java.time.format.DateTimeFormatter;
import java.time.format.DateTimeParseException;
import java.time.temporal.ChronoUnit;
import java.util.Scanner;

public class TestEvent {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("yyyy-MM-dd HH:mm");
        String eventName;
        LocalDateTime eventDate;
        String userTimeZone;

        while (true){
            System.out.println("Enter event name:");
            eventName = sc.nextLine();

            System.out.println("Enter event date in the format - YYYY-MM-DD:");
            String date = sc.nextLine();

            System.out.println("Enter event time in the format - HH:mm):");
            String time = sc.nextLine();

            System.out.println("Enter your preferred TimeZone in the format - {Region}/{City} e.g America/Chicago:");
            userTimeZone = sc.nextLine();
            userTimeZone = (userTimeZone.isEmpty()) ? "America/Chicago" : userTimeZone;

            try {
                eventDate = LocalDateTime.parse(date +" "+ time, formatter);
                break;

            } catch (DateTimeParseException e){
                System.out.println("Error in date conversion. Try again");
            }

        }

        //initialize event object

        Event event = new Event(eventName,eventDate,userTimeZone);

        System.out.println("Event date: " + event.getEventDate() +"\n");
        System.out.println("Event day of week: " + event.getEventDate().getDayOfWeek() + "\n");
        System.out.println("Is year Leap year: " + event.getEventDate().toLocalDate().isLeapYear() + "\n");

        long daysBetween = ChronoUnit.DAYS.between(LocalDate.now(), eventDate);

        System.out.printf("The event is %d days away.\n",daysBetween);

        System.out.printf("Event date formatted in System TimeZone: %s\n",  event.formatEventDetails());

        System.out.printf("Event date formatted in user TimeZone: %s\n",  event.timeZoneConversion());

    }
}
