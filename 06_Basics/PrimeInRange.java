import java.util.*;

public class PrimeInRange {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // input
        System.out.print("Enter the highest number : ");
        int num = sc.nextInt();

        // function call
        primeInRange(num);
        sc.close();
    }

    public static void primeInRange(int num) {
        if (num > 0) {
            if (num == 1) {
                System.out.println("1 is neither prime nor composite");
            } else {
                for (int count = 2; count <= num; count++) {
                    if (isPrime(count)) {
                        System.out.println(count + " is a prime number");
                    }
                }
            }
        } else {
            System.out.println("Invalid input, Enter a positive number");
        }
    }

    public static boolean isPrime(int num) {
        for (int count = 2; count <= Math.sqrt(num); count++) {
            if (num % count == 0) {
                return false;
            }
        }
        return true;
    }
}
