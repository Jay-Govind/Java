package Day12;

import java.util.*;

public class NumberOfVowels {

    public static int countVowels(String str) {
        int count = 0;

        for (int idx = 0; idx < str.length(); idx++) {
            char ch = str.charAt(idx);
            if (ch == 'a' || ch == 'e' || ch == 'i' || ch == 'o' || ch == 'u') {
                count++;
            }
        }
        return count;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // input
        System.out.print("Enter a string : ");
        String str = sc.nextLine();

        System.out.println("Number of Vowels : " + countVowels(str));
        sc.close();
    }
}