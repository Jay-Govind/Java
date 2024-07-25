import java.util.*;

public class Matrix {
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

    public static boolean search(int[][] matrix, int key) {

        int m = matrix.length;
        int n = matrix[0].length;

        for (int i = 0; i < m; i++) {
            for (int j = 0; j < n; j++) {
                if (matrix[i][j] == key) {
                    System.out.println("| " + key + " found at " + (i + 1) + " row " + (j + 1) + " column |");
                    return true;
                }
            }
        }

        System.out.println("Not found\n");
        return false;
    }

    public static void largestInArray(int[][] matrix) {

        int m = matrix.length;
        int n = matrix[0].length;

        int max = matrix[0][0];

        for (int i = 0; i < m; i++) {
            for (int j = 0; j < n; j++) {
                if (matrix[i][j] > max) {
                    max = matrix[i][j];
                    ;
                }
            }
        }

        System.out.println("| " + max + " is the largest element |");
    }

    public static void smallestInArray(int[][] matrix) {

        int m = matrix.length;
        int n = matrix[0].length;

        int min = matrix[0][0];

        for (int i = 0; i < m; i++) {
            for (int j = 0; j < n; j++) {
                if (matrix[i][j] < min) {
                    min = matrix[i][j];
                }
            }
        }

        System.out.println("| " + min + " is the smallest element |");
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

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

        print(matrix); // print the matrix
        search(matrix, 6); // search an element from the array
        largestInArray(matrix);
        smallestInArray(matrix);

        sc.close();
    }
}