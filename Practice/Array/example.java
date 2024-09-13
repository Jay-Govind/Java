package Practice.Array;

import java.util.*;

public class example {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int[][][] matrix = new int[3][3][3];

        for (int i = 0; i < matrix.length; i++) {
            for (int j = 0; j < matrix[0].length; j++) {
                for (int k = 0; k < matrix[0][0].length; k++) {
                    System.out.print("Enter the element : ");
                    matrix[i][j][k] = sc.nextInt();
                }
            }
        }

        System.out.println("-----Output-----");
        for (int i = 0; i < matrix.length; i++) {
            for (int j = 0; j < matrix[0].length; j++) {
                for (int k = 0; k < matrix[0][0].length; k++) {
                    System.out.print(matrix[i][j][k] + " ");
                }
                System.out.println();
            }
            System.out.println();
        }
        sc.close();
    }
}
