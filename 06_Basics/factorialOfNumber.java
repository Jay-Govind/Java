import java.util.*;

public class factorialOfNumber {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter the number : ");
        int n = sc.nextInt();

        if (n < 0) {
            System.out.println("Factorial of negative number doesn't exist");
        } else {
            long result = factorial(n);
            System.out.println(n + "! is " + result);
        }

        sc.close();
    }

    public static long factorial(int n) {
        long fact = 1;

        if (n == 0 || n == 1) {
            return 1;
        } else {
            for (int count = 2; count <= n; count++) {
                fact *= count;
            }
        }

        return fact;
    }
}
