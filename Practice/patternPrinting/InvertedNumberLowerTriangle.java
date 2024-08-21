package Practice.patternPrinting;

import java.util.*;

public class InvertedNumberLowerTriangle {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter the number of lines : ");
        int lines = sc.nextInt();

        for (int i = 0; i < lines; i++) {
            for (int j = i; j < lines - 1; j++) {
                System.out.print("  ");
            }
            for (int k = 0; k <= i; k++) {
                System.out.print((k + 1) + " ");
            }
            System.out.println();
        }
        sc.close();
    }
}
