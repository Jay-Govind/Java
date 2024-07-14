// Sum of natural numbers using functions

import java.util.*;

public class sum {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter the first number : ");
        int num1 = sc.nextInt();
        System.out.print("Enter the second number : ");
        int num2 = sc.nextInt();

        int sum = add(num1, num2);      // <-- Functions Call with Arguments
        System.out.println("Sum of two numbers : " + sum);
        sc.close();
    }

    // Function to add two numbers
            
    //         Return Type  
    //             |
    public static int add(int num1, int num2) {  // <-- Functions Parameters with local variables
        int sum = num1 + num2;  // <-- Body of Function
        return sum;             // <-- Return Statement
    }

}
