package Practice.loops;

import java.util.*;

public class Factorial {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int num = 0;

        do {
            System.out.print("Enter a number : ");
            num = sc.nextInt();

            if (num >= 0) {
                if (num == 0 || num == 1) {
                    System.out.print("Factorial of " + num + " : " + 1);
                } else {
                    int fact = 1;

                    for (int i = 1; i <= num; i++) {
                        fact *= i;
                    }

                    System.out.print("Factorial of " + num + " : " + fact);
                }
            } else {
                System.out.println("Invalid input, Please try again");
            }
        } while (num < 0);

        sc.close();
    }
}
