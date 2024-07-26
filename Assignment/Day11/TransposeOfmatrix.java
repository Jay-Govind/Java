package Day11;

import java.util.*;

public class TransposeOfmatrix {

    public static void print(int[][] matrix) {

        int m = matrix.length;
        int n = matrix[0].length;

        
        for (int i = 0; i < m; i++) {
            for (int j = 0; j < n; j++) {
                System.out.print(matrix[i][j] + " ");
            }
            System.out.println();
        }
    }

    public static void transpose(int[][] matrix) {

        int m = matrix.length;
        int n = matrix[0].length;

        int[][] transpose = new int[n][m];

        for (int i = 0; i < n; i++) {
            for (int j = 0; j < m; j++) {
                transpose[i][j] = matrix[j][i];
            }
        }

        System.out.println("----Transpose Matrix----");
        print(transpose);
    }

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        // input
        System.out.print("Enter the number of rows : ");
        int m = sc.nextInt();
        System.out.print("Enter the number of columns : ");
        int n = sc.nextInt();

        int[][] matrix = new int[m][n];
        for (int i = 0; i < m; i++) {
            for (int j = 0; j < n; j++) {
                System.out.print("Enter the " + (i + 1) + " row " + (j + 1) + " column element : ");
                matrix[i][j] = sc.nextInt();
            }
        }

        System.out.println("----Original Matrix----");
        print(matrix);

        transpose(matrix);

        sc.close();
    }
}