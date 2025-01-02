package Day10;

import java.util.*;

public class SelectionSort {

    public static void printArr(int[] arr) {

        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + " ");
        }
        System.out.println();
    }

    public static void selectionSort(int[] arr) {
        for (int i = 0; i < arr.length - 1; i++) {
            int minPosition = i;
            for (int j = (i + 1); j < arr.length; j++) {
                if (arr[minPosition] < arr[j]) {
                    minPosition = j;
                }
            }
            int temp = arr[i];
            arr[i] = arr[minPosition];
            arr[minPosition] = temp;
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

        selectionSort(arr);

        System.out.print("Sorted array : ");
        printArr(arr);

        sc.close();
    }
}

// Time Complexity : O(n^2)
// Space Complexity : O(1)
// Example : [6, 2, 9, 4, 3, 5, 7, 1, 8]
// Output : [9, 8, 7, 6, 5, 4, 3, 2, 1] Descending Order