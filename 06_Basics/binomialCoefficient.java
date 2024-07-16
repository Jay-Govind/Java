
import java.util.*;

public class binomialCoefficient {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // Input
        System.out.print("Enter the total number of items (n): ");
        int n = sc.nextInt();
        System.out.print("Enter the number of items to choose (r): ");
        int r = sc.nextInt();

        // Validate input
        if (r < 0 || r > n) {
            System.out.println("Invalid input: r should be between 0 and n");
            sc.close();
            return;
        }

        // Logic
        long result = calculateBinomialCoefficient(n, r);
        System.out.println("C ( " + n + " , " + r + " ) " + " = " + result);

        sc.close();
    }

    public static long calculateBinomialCoefficient(int n, int r) {
        // Edge case: C(n, 0) or C(n, n) is always 1
        if (r == 0 || r == n) {
            return 1;
        }

        // Initialize result
        long result = 1;

        // Since C(n, r) == C(n, n-r), choose the smaller of r and n-r
        // if (r > n - r) {
        // r = n - r;
        // }
        // for (int i = 0; i < r; i++) {
        // result *= (n - i);
        // result /= (i + 1);
        // }

        long numerator = factorial(n);
        long denominator = factorial(r) * factorial(n - r);
        result = numerator / denominator;

        return result;
    }

    public static long factorial(int num) {
        long fact = 1;

        if (num < 0) {
            System.out.println("Factorial of negative number doesn't exist");
            return -1;
        } else if (num == 0 || num == 1) {
            return 1;
        } else {
            for (int count = 2; count <= num; count++) {
                fact *= count;
            }
        }

        return fact;
    }
}