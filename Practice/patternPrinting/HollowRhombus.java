package Practice.patternPrinting;

import java.util.*;

public class HollowRhombus {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter number of lines : ");
        int lines = sc.nextInt();

        for (int i = 1; i <= lines; i++) {
            for (int j = 1; j <= lines - i; j++) {
                System.out.print("  ");
            }
            for (int k = 1; k <= lines; k++) {
                if (i == 1 || i == lines || k == 1 || k == lines) {
                    System.out.print("* ");
                } else {
                    System.out.print("  ");
                }
            }
            System.out.println();
        }
        sc.close();
    }
}
