package Practice.loops;

import java.util.*;

public class Reverse {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter a number : ");
        int num = sc.nextInt();

        int reverseNum = 0;
        while (num > 0) {
            int lastDigit = num % 10;
            reverseNum = (10 * reverseNum) + lastDigit;
            num /= 10;
        }
        System.out.println(reverseNum);

        sc.close();
    }
}
