/* In a program input 3 numbers : A, B and C. You have to output the average of these 3 numbers */

import java.util.*;

public class average {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the first number : ");
        float num1 = sc.nextFloat();
        System.out.print("Enter the second number : ");
        float num2 = sc.nextFloat();
        System.out.print("Enter the third number : ");
        float num3 = sc.nextFloat();

        float average = (num1 + num2 + num3) / 3;

        System.out.println("Average of three numbers : " + average);
        sc.close();
    }
}
