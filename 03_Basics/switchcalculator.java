import java.util.*;

public class switchcalculator {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // Input
        System.out.print("Enter the first number : ");
        int num1 = sc.nextInt();
        System.out.print("Enter the second number : ");
        int num2 = sc.nextInt();
        System.out.print("Enter the operator (+ - * / %) : ");
        char operator = sc.next().charAt(0);

        // Logic
        switch (operator) {
            case '+':
                System.out.println("Sum is : " + (num1 + num2));
                break;
            case '-':
                System.out.println("Difference is : " + (num1 - num2));
                break;
            case '*':
                System.out.println("Product is : " + (num1 * num2));
                break;
            case '/':
                System.out.println("Quotient is : " + (num1 / num2));
                break;
            case '%':
                System.out.println("Remainder is : " + (num1 % num2));
                break;
            default:
                System.out.println("Invalid operator");
        }

        sc.close();
    }
}
