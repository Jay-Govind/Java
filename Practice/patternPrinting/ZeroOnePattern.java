package Practice.patternPrinting;

import java.util.*;

public class ZeroOnePattern {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter the number of lines : ");
        int lines = sc.nextInt();

        for (int i = 1; i <= lines; i++) {
            for (int j = 1; j <= i; j++) {
                if ((i + j) % 2 == 0) {
                    System.out.print("1 ");
                } else {
                    System.out.print("0 ");
                }
            }
            System.out.println();
        }

        sc.close();
    }
}
