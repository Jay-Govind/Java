package Practice.loops;

import java.util.*;

public class PrintString {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("How many times you want to print : ");
        int count = sc.nextInt();

        for (int i = 0; i < count; i++) {
            System.out.println("Hello World !");
        }
        sc.close();
    }
}
