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

    // helper function for binomialCoefficient
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

    public static void primeOrComposite(Scanner sc) {
        int num;
        do {
            System.out.print("Enter a number: ");
            num = sc.nextInt();
            if (num <= 0) {
                System.out.println("Please enter a positive number (greater than 0)");
            }
        } while (num <= 0);

        if (num == 1) {
            System.out.println(num + " is neither prime nor composite");
            return;
        }

        // If the number is 2, it is prime
        if (num == 2) {
            System.out.println(num + " is a prime number");
            return;
        }

        // If the number is even and not 2, it is composite
        if (num % 2 == 0) {
            System.out.println(num + " is a composite number");
            return;
        }

        // Check divisibility for odd numbers from 3 to sqrt(num)
        boolean isPrime = true;
        for (int i = 3; i <= Math.sqrt(num); i += 2) {
            if (num % i == 0) {
                isPrime = false;
                break;
            }
        }

        if (isPrime) {
            System.out.println(num + " is a prime number");
        } else {
            System.out.println(num + " is a composite number");
        }
    }

    public static void binaryToDecimal(Scanner sc) {
        System.out.print("Enter a binary number: ");
        long binary = sc.nextLong();
        long temp = binary;
        long decimal = 0;
        int power = 0;
        while (temp != 0) {
            long remainder = temp % 10;
            decimal += (remainder * (long) Math.pow(2, power));
            power++;
            temp /= 10;
        }
        System.out.println("Decimal equivalent of " + binary + " is " + decimal);
    }

    public static void decimalToBinary(Scanner sc) {
        System.out.print("Enter a decimal number: ");
        int num = sc.nextInt();
        int temp = num;
        long binary = 0;
        int power = 0;
        while (temp != 0) {
            int remainder = temp % 2;
            binary += (remainder * (long) Math.pow(10, power));
            power++;
            temp /= 2;
        }
        System.out.println("Binary equivalent of " + num + " is " + binary);
    }

    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);

        // factorial(sc);
        // binomialCoefficient(sc);
        // primeOrComposite(sc);
        // binaryToDecimal(sc);
        decimalToBinary(sc);
        sc.close();
    }
}