package Day5;

import java.util.*;

public class hollowrectangle {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        // Input
        System.out.print("Enter the number of rows : ");
        int rowNum = sc.nextInt();
        System.out.print("Enter the number of columns : ");
        int colNum = sc.nextInt();

        // Logic
        for (int row = 1; row <= rowNum; row++) {
            for (int col = 1; col <= colNum; col++) {
                if (row == 1 || row == rowNum || col == 1 || col == colNum) {
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
