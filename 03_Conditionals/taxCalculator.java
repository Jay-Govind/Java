import java.util.*;

public class taxCalculator {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // Input
        System.out.print("Enter the salary : ");
        float salary = sc.nextFloat();
        float tax = 0;

        /*
         * 5L => 5%
         * 5L - 10L => 20%
         * 10L => 30%
         */

        // Logic --> Calculation of Tax
        if (salary < 500000) {
            tax = (float) (salary * 0.05);
            System.out.println("---------------------------");
            System.out.println("Salary  : " + salary);
            System.out.println("Tax     : " + tax + " (5%)");
            System.out.println("---------------------------");
        } else if (salary >= 500000 && salary < 1000000) {
            tax = (float) (salary * 0.2);
            System.out.println("---------------------------");
            System.out.println("Salary  : " + salary);
            System.out.println("Tax     : " + tax + " (20%)");
            System.out.println("---------------------------");

        } else if (salary >= 1000000) {
            tax = (float) (salary * 0.3);
            System.out.println("---------------------------");
            System.out.println("Salary  : " + salary);
            System.out.println("Tax     : " + tax + " (30%)");
            System.out.println("---------------------------");
        }
        sc.close();
    }
}
