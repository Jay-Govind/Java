package Practice.Function;

import java.util.*;

public class IsEven {

    public static boolean isEven(int num) {
        if (num % 2 == 0) {
            return true;
        } else {
            return false;
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter a number : ");
        int num = sc.nextInt();

        if (isEven(num)) {
            System.out.print(num + " is Even");
        } else {
            System.out.print(num + " is Odd");
        }
        sc.close();
    }
}
