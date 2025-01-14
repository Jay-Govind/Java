// What is the value of x^x for any valueof x?
package Assignment.Day13;

import java.util.Scanner;

public class Quiz {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter the value of x :");
        int x = sc.nextInt();
        int result = x ^ x;
        System.out.println("Value of " + x + " ^ " + x + " is: " + result);
        
        sc.close();
    }
}
