package Practice.Function;

import java.util.*;

public class Calculation {

    public static int add(int a, int b) {
        return a + b;
    }

    public static int minus(int a, int b) {
        return a - b;
    }

    public static int multiply(int a, int b) {
        return a * b;
    }

    public static int divide(int a, int b) {
        return a / b;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter first number: ");
        int num1 = sc.nextInt();

        System.out.print("Enter second number: ");
        int num2 = sc.nextInt();

        System.out.print("Enter operator (+, -, *, /) : ");
        char ch = sc.next().charAt(0);

        int result;

        switch (ch) {
            case '+':
                result = add(num1, num2);
                System.out.println(num1 + " + " + num2 + " = " + result);
                break;
            case '-':
                result = minus(num1, num2);
                System.out.println(num1 + " - " + num2 + " = " + result);
                break;
            case '*':
                result = multiply(num1, num2);
                System.out.println(num1 + " * " + num2 + " = " + result);
                break;
            case '/':
                result = divide(num1, num2);
                System.out.println(num1 + " / " + num2 + " = " + result);
                break;
            default:
                System.out.println("Invalid operator");
                break;
        }

        sc.close();
    }
}
