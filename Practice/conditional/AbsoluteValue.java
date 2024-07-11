package Practice.conditional;

import java.util.*;

public class AbsoluteValue {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter the number : ");
        int num = sc.nextInt();
        if (num < 0)
            num = -num;
        System.out.println("Absolute value is " + num);

        sc.close();
    }
}
