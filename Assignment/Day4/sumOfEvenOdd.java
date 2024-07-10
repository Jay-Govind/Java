package Day4;

import java.util.*;

public class sumOfEvenOdd {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int num;
        int choice;
        int evenSum = 0;
        int oddSum = 0;

        do {
            System.out.print("Enter the number : ");
            num = sc.nextInt();
            if (num % 2 == 0) {
                evenSum += num;
            } else {
                oddSum += num;
            }
            System.out.println("Enter 1 to continue or 0 to exit : ");
            choice = sc.nextInt();
        } while (choice == 1);

        System.out.println("Sum of even numbers : " + evenSum);
        System.out.println("Sum of odd numbers : " + oddSum);

        sc.close();
    }
}
