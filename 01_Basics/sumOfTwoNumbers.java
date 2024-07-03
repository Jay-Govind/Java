import java.util.*;
public class sumOfTwoNumbers {
    public static void main(String[] args){

        // Input from user
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the first number : ");
        int num1 = sc.nextInt();
        System.out.print("Enter the second number : ");
        int num2 = sc.nextInt();

        // Sum of two numbers
        System.out.println("Sum of two numbers : " + (num1 + num2));
        sc.close();
    }
}