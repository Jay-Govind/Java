import java.util.Scanner;

public class Fibonacci {

    // Recursive approach for calculating Fibonacci number
    public static int fibo(int num) {
        if (num <= 0) {
            return 0;
        } else if (num == 1) {
            return 0;
        } else if (num == 2) {
            return 1;
        } else {
            return fibo(num - 1) + fibo(num - 2); // Recursive case
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter a term: ");
        int num = sc.nextInt();

        if (num <= 0) {
            System.out.println("Please enter a positive integer.");
        } else {
            int result = fibo(num);
            System.out.println("The Fibonacci number at term " + num + " is: " + result);
        }

        sc.close();
    }
}