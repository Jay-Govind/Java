import java.util.*;

public class Palindrome {
    public static boolean isPalindrome(String str) {
        int n = str.length();
        for (int i = 0; i < n / 2; i++) {
            if (str.charAt(i) == str.charAt(n - 1 - i)) {
                return true;
            }
        }
        return false;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // Input
        System.out.print("Enter a string : ");
        String str = sc.nextLine();

        // Logic
        System.out.println((isPalindrome(str) ? (str + " is palindrome") : (str + " is not palindrome")));

        sc.close();
    }
}
