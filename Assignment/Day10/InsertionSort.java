package Day10;

import java.util.*;

public class InsertionSort {

    public static void printArr(int[] arr) {

        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + " ");
        }
        System.out.println();
    }

    public static void insertionSort(int[] arr) {
        for (int i = 1; i < arr.length; i++) {
            int curr = arr[i];
            int prev = i - 1;

            while (prev >= 0 && arr[prev] < curr) {
                arr[prev + 1] = arr[prev];
                prev--;
            }
            arr[prev + 1] = curr;
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // input
        System.out.print("Enter the size of the array : ");
        int size = sc.nextInt();

        int[] arr = new int[size];

        for (int i = 0; i < size; i++) {
            System.out.print("Enter the " + (i + 1) + " element : ");
            arr[i] = sc.nextInt();
        }

        // output the array
        System.out.print("Array : ");
        printArr(arr);

        insertionSort(arr);

        System.out.print("Sorted array : ");
        printArr(arr);

        sc.close();
    }
}

// Time Complexity : O(n^2)
// Space Complexity : O(1)
// Example : [6, 2, 9, 4, 3, 5, 7, 1, 8]
// Output : [9, 8, 7, 6, 5, 4, 3, 2, 1] Descending Order