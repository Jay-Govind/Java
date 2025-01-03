package Practice.Mix;

import java.util.Scanner;

public class twoDArray {

    // Input
    public static void inputArr(int[][] matrix, int rows, int cols, Scanner sc) {
        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < cols; j++) {
                System.out.print("Enter the element at position (" + (i + 1) + ", " + (j + 1) + "): ");
                matrix[i][j] = sc.nextInt();
            }
        }
    }

    // Output
    public static void printArr(int[][] matrix, int rows, int cols) {
        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < cols; j++) {
                System.out.print(matrix[i][j] + " ");
            }
            System.out.println();
        }
    }

    // Search in a matrix
    public static int[] searchInMatrix(int[][] matrix, int rows, int cols, int target) {
        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < cols; j++) {
                if (matrix[i][j] == target) {
                    return new int[] { i, j };
                }
            }
        }
        return new int[] { -1, -1 };
    }

    // Spiral Matrix
    public static void spiralMatrix(int[][] matrix) {
        int startRow = 0;
        int startCol = 0;
        int endRow = matrix.length - 1;
        int endCol = matrix[0].length - 1;

        while (startRow <= endRow && startCol <= endCol) {

            // print startRow
            for (int j = startCol; j <= endCol; j++) {
                System.out.print(matrix[startRow][j] + " ");
            }

            // print endCol
            for (int i = (startRow + 1); i <= endRow; i++) {
                System.out.print(matrix[i][endCol] + " ");
            }

            // print endRow
            for (int j = (endCol - 1); j >= startCol; j--) {
                if (startRow == endRow) {
                    break;
                }
                System.out.print(matrix[endRow][j] + " ");
            }
            
            // print startCol
            for (int i = (endRow - 1); i >= startRow + 1; i--) {
                if (startCol == endCol) {
                    break;
                }
                System.out.print(matrix[i][startCol] + " ");
            }

            startRow++;
            startCol++;
            endRow--;
            endCol--;
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter the number of rows: ");
        int rows = sc.nextInt();
        System.out.print("Enter the number of columns: ");
        int cols = sc.nextInt();

        int[][] matrix = new int[rows][cols];

        inputArr(matrix, rows, cols, sc);
        printArr(matrix, rows, cols);

        // Search in a matrix
        // System.out.print("Enter the element to search: ");
        // int search = sc.nextInt();
        // int[] result = searchInMatrix(matrix, rows, cols, search);
        // if (result[0] != -1 && result[1] != -1) {
        // System.out.println("Element found at position (" + (result[0] + 1) + ", " +
        // (result[1] + 1) + ")");
        // } else {
        // System.out.println("Element not found");
        // }

        // Spiral Matrix
        spiralMatrix(matrix);
        sc.close();
    }
}
