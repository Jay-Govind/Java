package Practice.patternPrinting;

import java.util.*;

public class InvertedLowerTriangle {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter the number of lines : ");
        int lines = sc.nextInt();

        int spaces = lines - 1;

        for (int i = 1; i <= lines; i++) {
            for (int j = i; j <= spaces; j++) {
                System.out.print("  ");
            }
            for (int k = 1; k <= i; k++) {
                System.out.print("* ");
            }
            System.out.println();
        }

        sc.close();
    }
}
