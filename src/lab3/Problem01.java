package lab3;

public class Problem01 {

    public static void main(String[] args) {
        String input = "akel";
        char minChar = findMinChar(input);
        System.out.println("Minimum character in \"" + input + "\" is: " + minChar);
    }

    public static char findMinChar(String str) {

        // Base case: if string has only one character
        if (str.length() == 1) {
            return str.charAt(0);
        }

        // Recursive case: compare first char with min of substring
        char firstChar = str.charAt(0);
        char minOfRest = findMinChar(str.substring(1));

        return (firstChar < minOfRest) ? firstChar : minOfRest;
    }
}
