import java.util.*;

public class swapTwoNumber {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter the first number : ");
        int num1 = sc.nextInt();
        System.out.print("Enter the second number : ");
        int num2 = sc.nextInt();

        System.out.println("Before swapping = "  + num1 + ", " + num2);

        swap(num1, num2);

        sc.close();
    }

    public static void swap(int num1, int num2) {
        num1 = num1 + num2;
        num2 = num1 - num2;
        num1 = num1 - num2;
        System.out.println("After swapping  = "  + num1 + ", " + num2);
    }
}