package Practice.Function;

import java.util.*;

public class Palindrome {

    public static boolean isPalindrome(int num) {
        int temp = num;
        int reverse = 0;

        while (temp != 0) {
            int last = temp % 10;
            reverse = reverse * 10 + last;
            temp /= 10;
        }

        return num == reverse;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter a number: ");
        int num = sc.nextInt();

        if (isPalindrome(num)) {
            System.out.print(num + " is palindrome");
        } else {
            System.out.print(num + " is not palindrome");
        }

        sc.close();
    }
}
