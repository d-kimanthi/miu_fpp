package lab1;

import java.util.Scanner;

/*
    authors: @Jephthah David,  @Temuujin Bat-Amgalan
    since: 2025-09-02
 */
public class Problem_06 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        char userChoice;
        do {

            System.out.println("Enter user type:");
            char userType = Character.toUpperCase(scanner.next().charAt(0));


            System.out.println("Enter units consumed:");
            int unitConusmed = scanner.nextInt();
            double electricityBill;
            electricityBill = unitConusmed * switch (userType) {
                case 'R'-> 0.12;
                case 'C'-> 0.20;
                case 'I'-> 0.35;
                default ->  0;
            };

            displayBill(userType,unitConusmed,electricityBill);
            System.out.println("Do you want to calculate another bill? (y/n):");
            userChoice = scanner.next().charAt(0);
        }while (userChoice == 'y');
        System.out.println("Goodbye! Thanks for using the Electricity Bill Generator.");

    }

    public static void displayBill (char userType, int units, double bill) {
        System.out.print("==== Electricity Bill ====\n");
        System.out.println("User Type: \n" + userType);
        System.out.println("Units: \n" + units);
        System.out.printf("Bill Amount: %.2f$\n",bill);
    }
}
