package Practice.Array;

import java.util.*;

public class SearchInSortedMatrix {

    public static boolean search(int matrix[][], int key) {
        int row = 0, col = matrix[0].length - 1;

        while (row < matrix.length && col >= 0) {
            if (matrix[row][col] == key) {
                System.out.print("Key found at (" + (row + 1) + "," + (col + 1) + ")");
                return true;
            } else if (key < matrix[row][col]) {
                col--;
            } else {
                row++;
            }
        }
        System.out.print("Key not found !");
        return false;
    }

    public static void main(String[] str) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter the size of array : ");
        int size = sc.nextInt();

        int[][] matrix = new int[size][size];

        for (int i = 0; i < size; i++) {
            for (int j = 0; j < size; j++) {
                while (true) {
                    System.out.print("Enter (" + (i + 1) + "," + (j + 1) + ") element : ");
                    int curr = sc.nextInt();

                    if (i > 0 && j > 0 && curr < matrix[i - 1][j - 1]) {
                        System.out.println("Please enter a greater number.");
                    } else {
                        matrix[i][j] = curr;
                        break;
                    }
                }
            }
        }

        System.out.print("Enter the element you want to search : ");
        int key = sc.nextInt();

        search(matrix, key);
        sc.close();
    }
}
