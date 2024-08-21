package Practice.patternPrinting;

import java.util.*;

public class HollowRectangle {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter the number of rows : ");
        int rows = sc.nextInt();

        System.out.print("Enter the number of columns : ");
        int cols = sc.nextInt();

        if (rows > 2 && cols > 2) {
            for (int i = 1; i <= rows; i++) {
                for (int j = 1; j <= cols; j++) {
                    if (i == 1 || i == rows || j == 1 || j == cols) {
                        System.out.print("* ");
                    } else {
                        System.out.print("  ");
                    }
                }
                System.out.println();
            }
        } else {
            System.out.print("Rows and Columns must be greater than 2");
        }

        sc.close();
    }
}
