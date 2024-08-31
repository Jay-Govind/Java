package Practice.Array;

import java.util.*;

public class LinearSearch {

    public static void printArr(int arr[]) {
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + " ");
        }
        System.out.println();
    }

    // linear search - smallest in array
    public static void smallest(int arr[]) {
        int target = arr[0];

        for (int i = 0; i < arr.length; i++) {
            if (arr[i] < target) {
                target = arr[i];
            }
        }
        System.err.println("Smallest Element : " + target);
    }

    // linear search - largest in array
    public static void largest(int arr[]) {
        int target = arr[0];

        for (int i = 0; i < arr.length; i++) {
            if (arr[i] > target) {
                target = arr[i];
            }
        }
        System.err.println("Largest Element : " + target);
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter the size of array : ");
        int size = sc.nextInt();

        int[] array = new int[size];

        for (int i = 0; i < array.length; i++) {
            System.out.print("Enter the " + (i + 1) + " element : ");
            array[i] = sc.nextInt();
        }

        smallest(array);
        largest(array);
        printArr(array);
        sc.close();
    }
}
