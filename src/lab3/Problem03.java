package lab3;

public class Problem03 {
    public static void main(String[] args) {
        int num = 1221;
        System.out.printf("%d is %s palindrome%n", num, isPalindrome(num) ? "a" : "not a");
    }

    // Public utility method
    public static boolean isPalindrome(int num) {
        if (num < 0) { //If your input is negative return false
            return false;
        }

        int reversed = reverseNumber(num, 0);
        return num == reversed;
    }

    // Private recursive method
    private static int reverseNumber(int num, int reversed) {
        // Base case: when num becomes 0
        if (num == 0) {
            return reversed;
        }

        // Extract last digit and add to reversed number
        int lastDigit = num % 10;
        reversed = reversed * 10 + lastDigit;

        // Recursive call with remaining number
        return reverseNumber(num / 10, reversed);
    }
}
