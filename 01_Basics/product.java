import java.util.*;

public class product {
    public static void main(String[] args) {
        //Input
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the first number : ");
        int num1 = sc.nextInt();
        System.out.print("Enter the second number : ");
        int num2 = sc.nextInt();   

        int product = num1 * num2;

        // Product of two numbers
        System.out.println("Product of two numbers : " + product);
        sc.close();
    }
}
