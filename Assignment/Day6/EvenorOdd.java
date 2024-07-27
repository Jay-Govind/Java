package Day6;

import java.util.*;

public class EvenorOdd {

    public static boolean isEven(int num) {
        boolean result = (num % 2) == 0 ? true : false;
        return result;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter a number : ");
        int num = sc.nextInt();

        boolean result = isEven(num);
        System.out.println(result ? "Number is even" : "Number is odd");

        sc.close();
    }
}
