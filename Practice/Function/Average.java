package Practice.Function;

import java.util.*;

public class Average {

    public static float average(float num1, float num2, float num3) {
        return (num1 + num2 + num3) / 3;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter first number : ");
        float num1 = sc.nextFloat();

        System.out.print("Enter second number : ");
        float num2 = sc.nextFloat();

        System.out.print("Enter third number : ");
        float num3 = sc.nextFloat();

        float result = average(num1, num2, num3);
        System.out.println("The average of " + num1 + " , " + num2 + " & " + num3 + " is " + result);
        sc.close();
    }
}