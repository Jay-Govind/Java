import java.util.*;

public class Calculator {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // input
        System.out.print("Enter a number: ");
        int num1 = sc.nextInt();
        System.out.print("Enter another number : ");
        int num2 = sc.nextInt();

        System.out.print("Choose the operator (+, -, *, /) : ");
        char op = sc.next().charAt(0);

        switch (op) {
            case '+':
                System.out.println(num1 + num2);
                break;
            case '-':
                System.out.println(num1 - num2);
                break;
            case '*':
                System.out.println(num1 * num2);
                break;
            case '/':
                if (num1 < num2) {
                    System.out.println(num1 + " must be greater than " + num2);
                    break;
                } else {
                    System.out.println(num1 + num2);
                    break;
                }
            default:
                System.out.println("Please select a proper operand");
        }

        sc.close();
    }
}