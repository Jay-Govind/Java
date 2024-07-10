package Day4;

import java.util.*;

public class factorial {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // input
        System.out.print("Enter any positive number : ");
        int num = sc.nextInt();

        int fact = 1;
        if (num < 0) {
            System.out.println("The factorial of negative number doesn't exist.");
        } else if (num == 0 || num == 1) {
            System.out.println("The factorial of " + num + " is " + fact);
        } else {
            for (int count = num; count >= 1; count--) {
                fact *= count;
            }
            System.out.println("The factorial of " + num + " is " + fact);
        }
        sc.close();
    }
}
