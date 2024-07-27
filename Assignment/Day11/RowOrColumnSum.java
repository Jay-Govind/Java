package Day11;

import java.util.*;

public class RowOrColumnSum {

    // Print the matrix
    public static void print(int[][] matrix) {
        int rows = matrix.length;
        int columns = matrix[0].length;

        System.out.println("-----------------");
        System.out.println("The matrix is: ");
        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < columns; j++) {
                System.out.print(matrix[i][j] + " ");
            }
            System.out.println();
        }
    }

    // Find the sum of a given row
    public static void rowSum(int[][] matrix, int row) {
        int columns = matrix[0].length;
        int sum = 0;

        for (int j = 0; j < columns; j++) {
            sum += matrix[row][j];
        }

        System.out.println("--------------------------");
        System.out.println("The sum of row " + (row + 1) + " is: " + sum);
    }

    // Find the sum of a given column
    public static void columnSum(int[][] matrix, int column) {
        int rows = matrix.length;
        int sum = 0;

        for (int i = 0; i < rows; i++) {
            sum += matrix[i][column];
        }

        System.out.println("--------------------------------");
        System.out.println("The sum of column " + (column + 1) + " is: " + sum);
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // Input no. of rows and columns
        // System.out.print("Enter the number of rows : ");
        // int rows = sc.nextInt();
        // System.out.print("Enter the number of columns : ");
        // int columns = sc.nextInt();

        int rows = 0;
        int columns = 0;

        // Input number of rows with error handling
        boolean validRows = false;
        while (!validRows) {
            try {
                System.out.print("Enter the number of rows: ");
                rows = sc.nextInt();
                if (rows > 0) {
                    validRows = true;
                } else {
                    System.out.println("Number of rows must be positive. Please try again.");
                }
            } catch (InputMismatchException e) {
                System.out.println("Invalid input. Please enter a valid integer for rows.");
                sc.nextLine(); // Clear input buffer
            }
        }

        // Input number of columns with error handling
        boolean validColumns = false;
        while (!validColumns) {
            try {
                System.out.print("Enter the number of columns: ");
                columns = sc.nextInt();
                if (columns > 0) {
                    validColumns = true;
                } else {
                    System.out.println("Number of columns must be positive. Please try again.");
                }
            } catch (InputMismatchException e) {
                System.out.println("Invalid input. Please enter a valid integer for columns.");
                sc.nextLine(); // Clear input buffer
            }
        }

        int[][] matrix = new int[rows][columns];

        // Input elements in the matrix
        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < columns; j++) {
                System.out.print("Enter the " + (i + 1) + " row " + (j + 1) + " column element : ");
                matrix[i][j] = sc.nextInt();
            }
        }

        // Choose which row or column you want to find the sum
        int choice = -1;
        while (choice != 0 && choice != 1) {
            System.out.print("Enter 0 for row sum or 1 for column sum: ");
            choice = sc.nextInt();
            if (choice != 0 && choice != 1) {
                System.out.println("Invalid choice. Please enter 0 or 1.");
            }
        }
        if (choice == 0) {
            int row = -1;
            while (row < 1 || row > rows) {
                System.out.print("Enter the row number (1 to " + rows + "): ");
                row = sc.nextInt();
                if (row < 1 || row > rows) {
                    System.out.println("Invalid row number. Please enter a number between 1 and " + rows + ".");
                }
            }
            rowSum(matrix, row - 1);

        } else {
            int column = -1;
            while (column < 1 || column > columns) {
                System.out.print("Enter the column number (1 to " + columns + "): ");
                column = sc.nextInt();
                if (column < 1 || column > columns) {
                    System.out.println("Invalid column number. Please enter a number between 1 and " + columns + ".");
                }
            }
            columnSum(matrix, column - 1);
        }

        print(matrix);
        sc.close();
    }
}