import java.util.*;

public class SearchInSortedMatrix {

    public static void searchInSortedMatrix(int[][] arr, int target) {
        int row = 0;
        int col = arr[0].length - 1;

        while (row < arr.length && col >= 0) {

            if (arr[row][col] == target) {
                System.out.println("| Target found at " + (row + 1) + " row " + (col + 1) + " column |");
                return;
            } else if (arr[row][col] > target) {
                col--;
            } else {
                row++;
            }
        }
        System.out.println("| Target not found |");
    }

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        // input
        System.out.print("Enter the number of rows : ");
        int rows = sc.nextInt();
        System.out.print("Enter the number of columns : ");
        int columns = sc.nextInt();
        System.out.println("Enter the elements : ");

        int[][] matrix = new int[rows][columns];

        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < columns; j++) {
                System.out.print("Enter the " + (i + 1) + " row " + (j + 1) + " column element : ");
                matrix[i][j] = sc.nextInt();
            }
        }

        System.out.print("Enter the element to be searched : ");
        int target = sc.nextInt();

        searchInSortedMatrix(matrix, target);

        sc.close();
    }
}
