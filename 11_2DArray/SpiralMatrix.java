import java.util.*;

public class SpiralMatrix {

    // print function
    public static void printMatrix(int[][] matrix) {

        int m = matrix.length;
        int n = matrix[0].length;

        System.out.println("__original matrix__");
        for (int i = 0; i < m; i++) {
            for (int j = 0; j < n; j++) {
                System.out.print(matrix[i][j] + " ");
            }
            System.out.println();
        }

    }

    // spiral Matrix
    public static void spiralMatrix(int[][] matrix) {

        int startRow = 0;
        int startCol = 0;
        int endRow = matrix.length - 1;
        int endCol = matrix[0].length - 1;

        System.out.println("__spiral matrix__");
        while (startRow <= endRow && startCol <= endRow) {

            // top
            for (int j = startCol; j <= endCol; j++) {
                System.out.print(matrix[startRow][j] + " ");
            }

            // right
            for (int i = (startRow + 1); i <= endRow; i++) {
                System.out.print(matrix[i][endCol] + " ");
            }

            // bottom
            for (int j = (endCol - 1); j >= startCol; j--) {
                if (startRow == endRow) {
                    break;
                }
                System.out.print(matrix[endRow][j] + " ");
            }

            // left
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

        System.out.println();

    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // input
        System.out.print("Enter the number of rows : ");
        int m = sc.nextInt();

        System.out.print("Enter the number of colummns : ");
        int n = sc.nextInt();

        int[][] matrix = new int[m][n];

        for (int i = 0; i < m; i++) {
            for (int j = 0; j < n; j++) {
                System.out.print("Enter the " + (i + 1) + "row and " + (j + 1) + " column element : ");
                matrix[i][j] = sc.nextInt();
            }
        }

        printMatrix(matrix);
        spiralMatrix(matrix);

        sc.close();

    }
}