import java.util.Stack;
import java.util.Scanner;

/**
 * MAIN CLASS - PalindromeCheckerApp
 * Demonstrates the Strategy Pattern for switching algorithms at runtime.
 */
public class PalindromeCheckerApp {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Input : ");
        String input = scanner.nextLine();

        PalindromeStrategy strategy = new StackStrategy();

        boolean isPalindrome = strategy.check(input);
        System.out.println("Is Palindrome? : " + isPalindrome);

        scanner.close();
    }
}

/**
 * INTERFACE - PalindromeStrategy
 * Defines the contract for all palindrome checking algorithms.
 */
interface PalindromeStrategy {
    boolean check(String input);
}

/**
 * CLASS - StackStrategy
 * Implements the PalindromeStrategy using a Stack (LIFO).
 */
class StackStrategy implements PalindromeStrategy {

    @Override
    public boolean check(String input) {
        String cleanInput = input.replaceAll("\\s+", "").toLowerCase();

        Stack<Character> stack = new Stack<>();

        for (char c : cleanInput.toCharArray()) {
            stack.push(c);
        }
        for (char c : cleanInput.toCharArray()) {
            if (c != stack.pop()) {
                return false;
            }
        }

        return true;
    }
}