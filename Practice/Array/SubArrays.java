package Practice.Array;

import java.util.*;

public class SubArrays {

    public static void printArr(int[] arr) {
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + " ");
        }
        System.out.println();
    }

    public static void subArrays(int[] arr) {
        System.out.println("Sub Arrays");

        for (int i = 0; i < arr.length; i++) {
            for (int j = i; j < arr.length; j++) {

                System.out.print("( ");
                for (int k = i; k <= j; k++) {
                    System.out.print(arr[k] + " ");
                }
                System.out.print(")");
                System.out.println();
            }
            // System.out.println();
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter the size of an array : ");
        int size = sc.nextInt();

        int[] arr = new int[size];

        for (int i = 0; i < size; i++) {
            System.out.print("Enter the " + (i + 1) + " element : ");
            arr[i] = sc.nextInt();
        }

        System.out.print("Original Array : ");
        printArr(arr);
        subArrays(arr);

        sc.close();
    }
}