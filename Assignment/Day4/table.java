package Day4;

import java.util.*;

public class table {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // input
        System.out.print("Enter the number : ");
        int num = sc.nextInt();

        // logic
        System.out.println("--Table of " + num + "--");
        for (int i = 1; i <= 10; i++) {
            System.out.println(num + " * " + i + " = " + (num * i));
        }
        sc.close();
    }
}
