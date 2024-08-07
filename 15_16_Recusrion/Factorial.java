import java.util.*;

public class Factorial {

    public static int factorial(int num) {
        if (num < 0) {
            System.out.print("Factorial of negative number does not exists\n");
            return -1;
        }
        if (num == 0 || num == 1) {
            return 1;
        }
        return num * factorial(num - 1);
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter a number : ");
        int num = sc.nextInt();

        int fact = factorial(num);
        if (fact >= 0) {
            System.out.println("Factorial of " + num + " is " + fact);
        }

        sc.close();
    }
}
