package Practice.loops;

import java.util.*;

public class Prime {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter a number : ");
        int num = sc.nextInt();

        boolean isPrime = true;

        if (num == 1) {
            System.out.println("1 is neither prime nor composite");
        } else if (num == 2) {
            System.out.println("2 is a prime number");
        } else {
            for (int i = 2; i <= Math.sqrt(num); i++) {
                if (num % i == 0) {
                    isPrime = false;
                    break;
                }
            }
            if (isPrime == true) {
                System.out.print(num + " is a prime number");
            } else {
                System.out.print(num + " is a composite number");
            }
        }
        sc.close();
    }
}
