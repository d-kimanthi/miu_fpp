package lab2.problem2;

import java.time.DateTimeException;
import java.time.LocalDate;
import java.time.Period;
import java.time.format.DateTimeFormatter;
import java.time.format.DateTimeParseException;
import java.util.Scanner;

public class TestEvent {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("yyyy-MM-dd HH:mm");
        String eventName;
        LocalDate eventDate;

        while (true){
            System.out.println("Enter event name:");
            eventName = sc.nextLine();

            System.out.println("Enter event date in the format (YYYY-MM-DD):");
            String date = sc.nextLine();

            System.out.println("Enter event time in the format (HH:mm):");
            String time = sc.nextLine();

            try {
                eventDate = LocalDate.parse(date +" "+ time, formatter);
                break;

            } catch (DateTimeParseException e){
                System.out.println("Error in date conversion. Try again");
            }

        }

        Event event = new Event(eventName,eventDate);


        System.out.println("Event day of week:\n" + event.getEventDate().getDayOfWeek());
        System.out.println("Is year Leap year:\n" + event.getEventDate().isLeapYear());

        Period duration = Period.between(LocalDate.now(),event.getEventDate());

        System.out.printf("The event is %d days away.",duration.getDays());

    }
}
