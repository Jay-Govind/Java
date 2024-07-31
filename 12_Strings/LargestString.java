/* find the largest string in lexicographical order. Lexicographical order, also known as dictionary order, is a way to arrange characters, words, or numbers in alphabetical order */

import java.util.*;

public class LargestString {

    public static String largestString(String[] str) {
        String largest = str[0];

        for (int i = 1; i < str.length; i++) {
            if (largest.compareTo(str[i]) < 0) {
                largest = str[i];
            }
        }

        return largest;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter the number of strings : ");
        int size = sc.nextInt();
        sc.nextLine(); // Consume newline character left by nextInt()

        String[] str = new String[size];

        for (int i = 0; i < size; i++) {
            System.out.print("Enter the " + (i + 1) + " string : ");
            str[i] = sc.nextLine();
        }

        System.out.println("The largest string is : " + largestString(str));

        sc.close();
    }
}
