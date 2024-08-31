package Practice.Function;

import java.util.*;

public class DigitSum {

    public static int digitSum(int num) {
        int sum = 0;

        while (num != 0) {
            int last = num % 10;
            sum += last;
            num /= 10;
        }

        return sum;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter a number : ");
        int num = sc.nextInt();

        int result = digitSum(num);
        System.out.print("The sum of the digit of " + num + " is " + result);

        sc.close();
    }
}
