package Practice.Mix;

import java.util.*;

public class Mix_Basics {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        reverse(sc);
        // table(sc);
        // factorial(sc);
        // leapYear(sc);
        // day(sc);

        sc.close();
    }

    // Reverse
    public static void reverse(Scanner sc) {
        System.out.print(" Enter a number : ");
        int num = sc.nextInt();

        int reverse = 0;
        while (num > 0) {
            int last_digit = num % 10;
            reverse = (reverse * 10) + last_digit;
            num /= 10;
        }
        System.out.println("The reverse of the number is " + reverse);
    }

    // Table
    public static void table(Scanner sc) {
        System.out.print("Enter the number : ");
        int num = sc.nextInt();
        for (int i = 1; i <= 10; i++) {
            System.out.println(num + " x " + i + " = " + (num * i));
        }
    }

    // Factorial
    public static void factorial(Scanner sc) {
        System.out.print("Enter a number : ");
        int num = sc.nextInt();
        int fact = 1;
        for (int i = 1; i <= num; i++) {
            fact *= i;
        }
        System.out.println("The factorial of " + num + " is " + fact);
    }

    // Leap year
    public static void leapYear(Scanner sc) {
        System.out.print("Enter the year : ");
        int year = sc.nextInt();
        if ((year % 4 == 0 && year % 100 != 0) || year % 400 == 0) {
            System.out.println(year + " is a leap year");
        } else {
            System.out.println(year + " is not a leap year");
        }

    }

    // Day of the Week
    public static void day(Scanner sc) {

        System.out.print("Enter the day number :");
        int day = sc.nextInt();
        switch (day) {
            case 1:
                System.out.println("The day is 'Sunday'");
                break;
            case 2:
                System.out.println("The day is 'Monday'");
                break;
            case 3:
                System.out.println("The day is 'Tuesday'");
                break;
            case 4:
                System.out.println("The day is 'Wednesday'");
                break;
            case 5:
                System.out.println("The day is 'Thursday'");
                break;
            case 6:
                System.out.println("The day is 'Friday'");
                break;
            case 7:
                System.out.println("The day is 'Saturday'");
                break;
            default:
                System.out.println("The day is 'Invalid'");
                break;
        }
    }
}
