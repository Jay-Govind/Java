package Day10;

import java.util.*;

public class CountingSort {

    public static void printArr(int[] arr) {

        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + " ");
        }
        System.out.println();
    }

    public static void countingSort(int[] arr) {
        int largest = Integer.MIN_VALUE;
        for (int i = 0; i < arr.length; i++) {
            largest = Math.max(largest, arr[i]);
        }

        int count[] = new int[largest + 1];
        for (int i = 0; i < arr.length; i++) {
            count[arr[i]]++;
        }

        int j = 0;
        for (int i = count.length - 1; i >= 0; i--) {
            while (count[i] > 0) {
                arr[j] = i;
                j++;
                count[i]--;
            }
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

        countingSort(arr);

        System.out.print("Sorted array : ");
        printArr(arr);

        sc.close();
    }
}

// Time Complexity : O(n^2)
// Space Complexity : O(1)
// Example : [6, 2, 9, 4, 3, 5, 7, 1, 8]
// Output : [9, 8, 7, 6, 5, 4, 3, 2, 1] Descending Order