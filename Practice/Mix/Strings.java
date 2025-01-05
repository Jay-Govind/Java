package Practice.Mix;

import java.util.Scanner;

public class Strings {

    // Function to check if a string is palindrome
    public static boolean isPalindrome(String str) {
        int i = 0;
        int j = str.length() - 1;

        while (i < j) {
            if (str.charAt(i) != str.charAt(j)) {
                return false;
            }
            i++;
            j--;
        }
        return true;
    }

    // Function to find the shortest path to reach the destination
    public static float shortestPath(String path) {
        int x = 0, y = 0;

        for (int i = 0; i < path.length(); i++) {
            if (path.charAt(i) == 'N' || path.charAt(i) == 'n') {
                y++;
            } else if (path.charAt(i) == 'S' || path.charAt(i) == 's') {
                y--;
            } else if (path.charAt(i) == 'E' || path.charAt(i) == 'e') {
                x++;
            } else if (path.charAt(i) == 'W' || path.charAt(i) == 'w') {
                x--;
            }
        }

        return (float) Math.sqrt(x * x + y * y);
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter a string: ");
        String str = sc.nextLine();

        // system.out.println(isPalindrome(str));
        // System.out.println(shortestPath(str));
        sc.close();
    }
}
