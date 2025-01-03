package Practice.Mix;

import java.util.Scanner;

public class Strings {

    // Function to check if a string is palindrome
    public static boolean isPalindrome(String str) {
        int i = 0;
        int j = str.length() - 1;

        while (i < j) {
            if (str.charAt(i) != str.charAt(j)) {
                System.out.println(str + " is not a palindrome");
                return false;
            }
            i++;
            j--;
        }
        System.out.println(str + " is a palindrome");
        return true;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter a string: ");
        String str = sc.nextLine();

        // isPalindrome(str);
        // shortestPath(str);
        sc.close();
    }
}
