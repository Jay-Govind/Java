package Practice.Array;

import java.util.*;

public class DiagonalSum {

    public static int diagonalSum(int[][] arr) {
        int n = arr.length;
        // int m = arr[0].length;
        int sum = 0;

        // Brute Force Approach -- > n(2)
        // for (int i = 0; i < n; i++) {
        //     for (int j = 0; j < m; j++) {
        //         if (i == j) {
        //             sum += arr[i][j];
        //         } else if ((i + j) == (n - 1)) {
        //             sum += arr[i][j];
        //         }
        //     }
        // }

        // linear search --> n
        for (int i = 0; i < n; i++) {
            // primary diagonal sum
            sum += arr[i][i];

            // secondary diagonal sum
            if (i != n - 1 - i)
                sum += arr[i][n - 1 - i];
        }
        return sum;
    }

    public static void main(String[] str) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter the size of array : ");
        int size = sc.nextInt();

        int[][] arr = new int[size][size];

        for (int i = 0; i < size; i++) {
            for (int j = 0; j < size; j++) {
                System.out.print("Enter the (" + (i + 1) + "," + (j + 1) + ") element : ");
                arr[i][j] = sc.nextInt();
            }
        }

        int result = diagonalSum(arr);
        System.out.print("The diagonal sum of the given array is : " + result);
        sc.close();
    }
}
