package Practice.Function;

import java.util.*;

public class Swapping {

    public static void swapping(int num1, int num2) {
        int temp = num1;
        num1 = num2;
        num2 = temp;

        System.out.println("After swapping");
        System.out.println("a = " + num1 + ", b = " + num2);
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter first number: ");
        int num1 = sc.nextInt();

        System.out.print("Enter second number: ");
        int num2 = sc.nextInt();

        System.out.println("Before swapping");
        System.out.println("a = " + num1 + ", b = " + num2);

        swapping(num1, num2);
        sc.close();
    }
}
