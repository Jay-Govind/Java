package Day6;

import java.util.*;

public class DigitSum {

    public static int digitSum(int num) {
        int sum = 0;
        while (num != 0) {
            int lastDigit = num % 10;
            sum += lastDigit;
            num /= 10;
        }

        return sum;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // Input
        System.out.print("Enter a number : ");
        int num = sc.nextInt();

        System.out.println("Sum of digits : " + digitSum(num));

        sc.close();
    }

}
