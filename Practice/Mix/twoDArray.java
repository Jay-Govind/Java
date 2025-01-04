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

    // Diagonal Sum Matrix (only for square matrix)
    public static void diagonalSumMatrix(int[][] matrix) {
        int n = matrix.length;
        int sum = 0;

        for (int i = 0; i < n; i++) {
            // sum of the main diagonal
            sum += matrix[i][i];
            // sum of the anti-diagonal
            if (i != n - i - 1) {
                sum += matrix[i][n - i - 1];
            }
        }
        System.out.print("The sum of the diagonal elements is " + sum);
    }

    // Transpose of a matrix
    public static void transpose(int[][] matrix) {
        int rows = matrix.length - 1;
        int cols = matrix[0].length - 1;

        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < cols; j++) {
                matrix[i][j] = matrix[j][i];
            }
        }
    }

    // Search in a sorted matrix
    public static int[] searchInSortedMatrix(int[][] matrix, int target) {
        int rows = matrix.length - 1;
        int cols = matrix[0].length;

        int i = 0;
        int j = cols - 1;

        while (i < rows && j >= 0) {
            if (matrix[i][j] == target) {
                return new int[] { i, j };
            } else if (matrix[i][j] > target) {
                j--;
            } else {
                i++;
            }
        }
        return new int[] { -1, -1 };
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

        // spiralMatrix(matrix);
        // diagonalSumMatrix(matrix);
        transpose(matrix);

        // int[][] matrix = { { 10, 20, 30, 40 },
        // { 15, 25, 35, 45 },
        // { 27, 29, 37, 48 },
        // { 32, 33, 39, 50 } };
        // int target = 29;
        // int[] result = searchInSortedMatrix(matrix, target);
        // if (result[0] != -1 && result[1] != -1) {
        //     System.out.println("Element found at position (" + (result[0] + 1) + ", " +
        //             (result[1] + 1) + ")");
        // } else {
        //     System.out.println("Element not found");
        // }

        sc.close();
    }
}
