package lab2.problem3;

import java.util.Scanner;

public class Main {
    public static void main(String[] args){
        boolean repeat = true;
        Scanner sc = new Scanner(System.in);

        do{
            System.out.println("Enter F for Flight Booking");
            System.out.println("Enter H for Hotel Booking");
            System.out.println("Enter C for Car Rental");
            System.out.println("Welcome please choose your service:");
            String ans = sc.nextLine();
            if(ans.isEmpty()){
                System.out.println("No input, Try again");
                continue;
            }

            char userChoice = Character.toUpperCase(ans.charAt(0));

            if(userChoice == 'F'){
                System.out.println("1. Enter origin:");
                String origin = sc.nextLine();

                System.out.println("2. Enter destination:");
                String destination = sc.nextLine();

                System.out.println("3. Enter distance in km:");
                double distanceKm = sc.nextDouble();

                System.out.println("4. Enter average speed (km/h):");
                double avgSpeed = sc.nextDouble();

                FlightBooking flightBooking = new FlightBooking(origin, destination, distanceKm);

                System.out.printf("Estimated Flight Time: %.2f hours\n", flightBooking.computeFlightTime(avgSpeed));

            }else if(userChoice == 'H'){

                System.out.println("1. Enter hotel name:");
                String hotelName = sc.nextLine();

                System.out.println("2. Enter number of nights:");
                int nights = sc.nextInt();

                System.out.println("3. Enter price per night:");
                float pricePerNight = sc.nextFloat();

                HotelBooking hotelBooking = new HotelBooking(hotelName, nights, pricePerNight);

                System.out.printf("Estimated Flight Time: %.2f$\n", hotelBooking.totalCost());

            }else if (userChoice == 'C'){
                System.out.println("1. Enter car model:");
                String carModel = sc.nextLine();

                System.out.println("2. Enter number of days:");
                int days = sc.nextInt();

                System.out.println("3. Enter rate per day:");
                float ratePerDay = sc.nextFloat();

                System.out.println("4. Enter miles per day:");
                float milesPerDay = sc.nextFloat();

                CarRental carRental = new CarRental(carModel, days, ratePerDay, milesPerDay);

                System.out.printf("Total Rental Cost: %.2f$\n", carRental.totalRentalCost());
                System.out.printf("Total Miles Allowed: %.2f$\n", carRental.totalMilesAllowed());
            }else{
                System.out.println("Unsupported choice please try again.");
                continue;
            }

            System.out.println("Do you want to continue (y/n)?");
            char isContinue = sc.next().toLowerCase().charAt(0);

            repeat = isContinue == 'y';
            sc.nextLine();

        }while (repeat);
        sc.close();

    }
}
