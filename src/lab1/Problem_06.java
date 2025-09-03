package lab1;

import java.util.Scanner;

public class Problem_06 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        char userChoice;
        do {

            System.out.println("Enter user type:");
            char userType = scanner.next().charAt(0);

            System.out.println("Enter units consumed:");
            int unitConusmed = scanner.nextInt();
            double electricityBill;
            switch (userType) {
                case 'R':
                    electricityBill = unitConusmed * 0.12;
                    break;
                case 'C':
                    electricityBill = unitConusmed * 0.20 ;
                    break;
                case 'I':
                    electricityBill = unitConusmed * 0.35;
                    break;
                default: electricityBill = 0;

            }

            displayBill(userType,unitConusmed,electricityBill);
            System.out.println("Do you want to calculate another bill? (y/n):");
            userChoice = scanner.next().charAt(0);
        }while (userChoice == 'y');

    }

    public static void displayBill (char userType, int units, double bill) {
        System.out.printf("==== Electricity Bill ====\n");
        System.out.println("User Type: \n" + userType);
        System.out.println("Units: \n" + units);
        System.out.printf("Bill Amount: %.2f\n",bill);
    }
}
