package Practice.Function;

import java.util.*;

public class Factorial {
    public static int factorial(int num) {
        int fact = 1;

        if (num < 0) {
            fact = -1;
        } else if (num == 0) {
            fact = 1;
        } else {
            for (int i = 1; i <= num; i++) {
                fact *= i;
            }
        }

        return fact;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter a number ");
        int num = sc.nextInt();

        int result = factorial(num);

        System.out.println("The factorial of " + num + " is " + result);

        sc.close();
    }
}
