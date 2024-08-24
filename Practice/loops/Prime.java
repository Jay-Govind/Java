package Practice.loops;

import java.util.*;

public class Prime {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int num;

        do {
            System.out.print("Enter a number : ");
            num = sc.nextInt();

            if (num > 0) {
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
                        System.out.println(num + " is a prime number");
                    } else {
                        System.out.println(num + " is a composite number");
                    }
                }
            } else {
                System.out.println("Invalid Input, Try Again");
            }

        } while (num <= 0);
        sc.close();
    }
}
