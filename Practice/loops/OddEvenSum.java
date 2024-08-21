package Practice.loops;

import java.util.*;

public class OddEvenSum {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int num = 0;
        int evenSum = 0;
        int oddSum = 0;
        int choice = 0;

        do {
            System.out.print("Enter a number : ");
            num = sc.nextInt();

            if (num % 2 == 0) {
                evenSum += num;
            } else {
                oddSum += num;
            }

            System.out.print("Do you want to continue (1 for Yes || 0 for No) : ");
            choice = sc.nextInt();
        } while (choice == 1);

        System.err.println("Sum of even numbers : " + evenSum);
        System.err.println("Sum of odd numbers : " + oddSum);
        sc.close();
    }
}
