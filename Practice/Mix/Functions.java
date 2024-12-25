package Practice.Mix;

import java.util.*;

public class Functions {

    public static void factorial(Scanner sc) {

        int num;
        do {
            System.out.print("Enter a positive number : ");
            num = sc.nextInt();
            long fact = 1;
            if (num == 0 || num == 1) {
                System.out.println("Factorial of " + num + " is " + fact);
            } else {
                for (int i = 1; i <= num; i++) {
                    fact *= i;
                }
                System.out.println("Factorial of " + num + " is " + fact);
            }
        } while (num < 0);
    }

    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);

        // factorial(sc);

        sc.close();
    }
}