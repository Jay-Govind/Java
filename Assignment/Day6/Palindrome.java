package Day6;

import java.util.*;

public class Palindrome {

    public static boolean isPalindrome(int num) {
        int temp = num;
        int reverse = 0;
        
        while (num != 0) {
            int lastdigit = num % 10;
            reverse = reverse * 10 + lastdigit;
            num = num / 10;
        }

        return temp == reverse;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // Input
        System.out.print("Enter a number : ");
        int num = sc.nextInt();

        // Logic
        boolean result = isPalindrome(num);
        System.out.println(result ? "Number is palindrome" : "Number is not palindrome");
        sc.close();
    }
}
