package Practice.Mix;

import java.util.Scanner;
import java.util.Arrays;

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

    // Function to convert a first character of each word of a string to uppercase
    public static String toUpperCase(String str) {
        if (str == null || str.isEmpty()) {
            return str;
        }

        StringBuilder newStr = new StringBuilder();

        newStr.append(Character.toUpperCase(str.charAt(0)));
        for (int i = 1; i < str.length(); i++) {
            if (str.charAt(i - 1) == ' ') {
                newStr.append(Character.toUpperCase(str.charAt(i)));
            } else {
                newStr.append(str.charAt(i));
            }
        }
        return newStr.toString();
    }

    // String Compression
    public static String compress(String str) {
        if (str == null || str.isEmpty()) {
            return str;
        }

        StringBuilder newStr = new StringBuilder();

        for (int i = 0; i < str.length(); i++) {
            Integer count = 1;
            while (i < (str.length() - 1) && str.charAt(i) == str.charAt(i + 1)) {
                count++;
                i++;
            }
            newStr.append(str.charAt(i));
            if (count > 1) {
                newStr.append(count);
            }
        }
        return newStr.toString();
    }

    // Count number of lowercase vowels in a string
    public static int countLowercaseVowels(String str) {
        int count = 0;
        String vowels = "aeiou";
        for (int i = 0; i < str.length(); i++) {
            if (vowels.contains(str.charAt(i) + "")) {
                count++;
            }
        }
        return count;
    }

    // Check if two strings are anagrams
    public static boolean anagrams(String str1, String str2) {
        if (str1.length() != str2.length()) {
            return false;
        }

        String newStr1 = str1.toLowerCase();
        String newStr2 = str2.toLowerCase();

        char[] arr1 = newStr1.toCharArray();
        char[] arr2 = newStr2.toCharArray();

        Arrays.sort(arr1);
        Arrays.sort(arr2);

        return Arrays.equals(arr1, arr2);
    }

    // Print largest string in lexicographical order
    public static String largestString(String[] str) {
        String largest = str[0];
        for (int i = 0; i < str.length; i++) {
            if (str[i].compareTo(largest) > 0) {
                largest = str[i];
            }
        }
        return largest;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // System.out.print("Enter a string: ");
        // String str = sc.nextLine();

        // System.out.println(isPalindrome(str));
        // System.out.println(shortestPath(str));
        // System.out.print(toUpperCase(str));
        // System.out.print(compress(str));
        // System.out.print(countLowercaseVowels(str));
        // System.out.print(anagrams("earth", "heat"));

        // String str2[] = { "mouse", "moniter", "mousepad" };
        // System.out.println(largestString(str2));

        sc.close();
    }
}
