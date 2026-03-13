import java.util.Scanner;

/**
 * UC9: Recursive Palindrome Checker
 * This class validates a palindrome by comparing outer characters
 * and moving inward using recursive calls.
 */
public class PalindromeCheckerApp {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Input : ");
        String input = scanner.nextLine();

        // Remove spaces and convert to lowercase for a robust check
        String cleanInput = input.replaceAll("\\s+", "").toLowerCase();

        boolean result = check(cleanInput, 0, cleanInput.length() - 1);

        System.out.println("Is Palindrome? : " + result);

        scanner.close();
    }

    /**
     * Recursively checks whether a string is a palindrome.
     * @param s Input string
     * @param start Starting index
     * @param end Ending index
     * @return true if palindrome, otherwise false
     */
    private static boolean check(String s, int start, int end) {
        if (start >= end) {
            return true;
        }

        if (s.charAt(start) != s.charAt(end)) {
            return false;
        }

        return check(s, start + 1, end - 1);
    }
}
