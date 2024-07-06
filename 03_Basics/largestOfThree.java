import java.util.*;

public class largestOfThree {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // Input
        System.out.print("Enter the first number : ");
        int num1 = sc.nextInt();
        System.out.print("Enter the second number : ");
        int num2 = sc.nextInt();
        System.out.print("Enter the third number : ");
        int num3 = sc.nextInt();

        // Logic --> First Method

        if (num1 > num2) {
            if (num1 > num3) {
                System.out.println("Largest number is : " + num1);
            } else {
                System.out.println("Largest number is : " + num3);
            }
        } else if (num2 > num3) {
            System.out.println("Largest number is : " + num2);
        } else {
            System.out.println("Largest number is : " + num3);
        }

        // Logic --> Second Method

        if (num1 > num2 && num1 > num3) {
            System.out.println("Largest number is : " + num1);
        } else if (num2 > num1 && num2 > num3) {
            System.out.println("Largest number is : " + num2);
        } else {
            System.out.println("Largest number is : " + num3);
        }

        sc.close();
    }
}
