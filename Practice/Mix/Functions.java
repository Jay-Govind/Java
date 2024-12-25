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

    public static long factorialofGivenNumber(int num) {
        long fact = 1;
        if (num == 0 || num == 1) {
            return fact;
        } else {
            for (int i = 1; i <= num; i++) {
                fact *= i;
            }
            return fact;
        }
    }

    public static void binomialCoefficient(Scanner sc) {

        int n, r;
        do {
            System.out.print("Enter total number of items (n) : ");
            n = sc.nextInt();
            System.out.print("Enter number of items to choose (r) : ");
            r = sc.nextInt();
            if (n < r) {
                System.out.println("n should be greater than or equal to r");
            }
        } while (n < r);

        long factn = factorialofGivenNumber(n);
        long factr = factorialofGivenNumber(r);
        long factnr = factorialofGivenNumber(n - r);
        long bc = factn / (factr * factnr);
        System.out.println("Binomial Coefficient of " + n + " and " + r + " is " + bc);

    }

    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);

        // factorial(sc);
        binomialCoefficient(sc);
        sc.close();
    }
}