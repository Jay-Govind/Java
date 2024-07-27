package Day11;

import java.util.*;

public class NumberOfElements {

    public static void numberOfElements(int[][] matrix, int target) {
        int rows = matrix.length;
        int columns = matrix[0].length;
        int count = 0;

        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < columns; j++) {
                if (matrix[i][j] == target) {
                    count++;
                }
            }
        }

        System.out.println("-----------------------");
        System.out.println(target + " appears " + count + " times.");

    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter the number of rows : ");
        int rows = sc.nextInt();
        System.out.print("Enter the number of columns : ");
        int columns = sc.nextInt();

        int[][] matrix = new int[rows][columns];

        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < columns; j++) {
                System.out.print("Enter the " + (i + 1) + " row " + (j + 1) + " column element : ");
                matrix[i][j] = sc.nextInt();
            }
        }

        System.out.print("Enter the element to be searched : ");
        int target = sc.nextInt();

        numberOfElements(matrix, target);

        sc.close();
    }
}