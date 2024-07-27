package Day6;

import java.util.*;

public class CalculateAverage {

    public static void calculateAverage(int num1, int num2, int num3) {
        int avg = (num1 + num2 + num3) / 3;
        System.out.println("Average of three numbers : " + avg);

    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // Input
        System.out.print("Enter the first number : ");
        int num1 = sc.nextInt();
        System.out.print("Enter the second number : ");
        int num2 = sc.nextInt();
        System.out.print("Enter the third number : ");
        int num3 = sc.nextInt();

        // Calling method
        calculateAverage(num1, num2, num3);
        
        sc.close();
    }
}
