package Day3;

import java.util.*;

public class positiveOrNegative {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // Input
        System.out.print("Enter a number : ");
        int num = sc.nextInt();

        // Logic
        if (num == 0) {
            System.out.println("Number is zero");
        } else if (num > 0) {
            System.out.println("Number is positive");
        } else {
            System.out.println("Number is negative");
        }

        sc.close();
    }
}
