package lab9.prob1;

import java.util.InputMismatchException;
import java.util.Scanner;

public class ShoppingCart {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        boolean isInputValid = false;

        while (!isInputValid){
            try {

                    System.out.print("Enter quantity of items to add (1-50): ");
                    int quantity = sc.nextInt();

                    if(quantity < 1 || quantity > 50){
                        throw new IllegalArgumentException("Invalid value, quantity must be between 1 and 50.");
                    }

                    System.out.println("Successfully added " + quantity + " items to your cart!");
                    isInputValid = true;

            } catch (InputMismatchException e) {
                System.out.println("Error: Please enter a valid integer. String, decimal, or symbol are not allowed.");
                sc.nextLine(); // Clear the invalid input from scanner
            }
            catch (IllegalArgumentException e) {
                System.out.println("Error: " + e.getMessage());
            }

        }

    }
}