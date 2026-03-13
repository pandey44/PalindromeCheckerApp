/**
 * UC10: Case-Insensitive & Space-Ignored Palindrome
 * This class validates a palindrome after preprocessing the input string.
 */
public class PalindromeCheckerApp {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Input : ");
        String original = scanner.nextLine();

        String normalized = original.replaceAll("[^a-zA-Z0-9]", "").toLowerCase();

        // 2. Apply previous logic (Two-pointer approach/Loop)
        boolean isPalindrome = true;
        int length = normalized.length();

        for (int i = 0; i < length / 2; i++) {
            if (normalized.charAt(i) != normalized.charAt(length - 1 - i)) {
                isPalindrome = false;
                break;
            }
        }

        System.out.println("Is Palindrome? : " + isPalindrome);

        scanner.close();
    }
}
