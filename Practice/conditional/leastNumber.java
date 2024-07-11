package Practice.conditional;

import java.util.*;

public class leastNumber {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // input
        System.out.print("Enter the first number : ");
        int num1 = sc.nextInt();
        System.out.print("Enter the second number : ");
        int num2 = sc.nextInt();
        System.out.print("Enter the third number : ");
        int num3 = sc.nextInt();

        // Logic
        if (num1 < num2) {
            if (num1 < num3) {
                System.out.println("Least number is : " + num1);
            } else {
                System.out.println("Least number is : " + num3);
            }
        } else if (num2 < num3) {
            System.out.println("Least number is : " + num2);
        } else {
            System.out.println("Least number is : " + num3);
        }

        sc.close();
    }
}
