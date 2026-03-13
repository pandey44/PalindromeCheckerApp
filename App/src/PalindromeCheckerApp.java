import java.util.Scanner;

/**
 * UC13: Performance Comparison
 * Measures and compares the execution time of different palindrome algorithms.
 */
public class UseCase13PalindromeCheckerApp {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Input : ");
        String input = scanner.nextLine();

        long startTime = System.nanoTime();
        boolean isPalTwoPointer = checkTwoPointer(input);
        long endTime = System.nanoTime();
        long durationTwoPointer = endTime - startTime;

        System.out.println("Is Palindrome? : " + isPalTwoPointer);
        System.out.println("Execution Time : " + durationTwoPointer + " ns");

        scanner.close();
    }

    /**
     * Efficient O(n) approach using two pointers.
     */
    public static boolean checkTwoPointer(String str) {
        if (str == null) return false;
        int left = 0;
        int right = str.length() - 1;

        while (left < right) {
            if (str.charAt(left) != str.charAt(right)) {
                return false;
            }
            left++;
            right--;
        }
        return true;
    }
}
