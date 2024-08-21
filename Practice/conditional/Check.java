package Practice.conditional;

import java.util.*;

public class Check {

    public static void check(int num) {
        if (num == 0) {
            System.out.print(num + " is neither positive nor negative");
        } else if (num > 0) {
            System.out.print(num + " is a positive number");
        } else {
            System.out.print(num + " is a negative number");
        }
    }

    public static void fever(int temp) {
        if (temp > 100) {
            System.out.print("You have a fever");
        } else {
            System.out.print("You don't have a fever");
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter a number : ");
        int num = sc.nextInt();

        // check(num);   // --> check number
        
        fever(num);   // --> check fever

        sc.close();
    }
}