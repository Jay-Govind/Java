package Practice.Mix;

import java.util.*;

public class Arrays {

    // helper function for input any array
    public static void inputArr(int[] arr, Scanner sc) {
        for (int i = 0; i < arr.length; i++) {
            System.out.print("Enter element at index " + i + " : ");
            arr[i] = sc.nextInt();
        }
    }

    // helper function for print any array
    public static void printArr(int[] arr) {
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + " ");
        }
    }

    // linear search
    public static void linearSearch(Scanner sc) {
        System.out.print("Enter the size of an array : ");
        int size = sc.nextInt();

        int arr[] = new int[size];
        inputArr(arr, sc);

        System.out.print("Enter the element to search : ");
        int search = sc.nextInt();

        int index = -1;

        for (int i = 0; i < arr.length; i++) {
            if (arr[i] == search) {
                index = i;
                break;
            }
        }

        if (index != -1) {
            System.out.println("Element found at index " + index);
        } else {
            System.out.println("Element not found");
        }
    }

    // binary search
    public static void binarySearch(Scanner sc) {
        System.out.print("Enter the size of an array : ");
        int size = sc.nextInt();

        int arr[] = new int[size];
        inputArr(arr, sc);

        System.out.print("Enter the element to search : ");
        int search = sc.nextInt();

        int index = -1;
        int left = 0;
        int right = arr.length - 1;

        while (left <= right) {
            int mid = left + (right - left) / 2;

            if (arr[mid] == search) {
                index = mid;
                break;
            } else if (arr[mid] < search) {
                left = mid + 1;
            } else {
                right = mid - 1;
            }
        }

        if (index != -1) {
            System.out.println("Element found at index " + index);
        } else {
            System.out.println("Element not found");
        }
    }

    // largest element in an array
    public static void largestElement(Scanner sc) {
        System.out.print("Enter the size of an array : ");
        int size = sc.nextInt();

        int arr[] = new int[size];
        inputArr(arr, sc);

        int max = Integer.MIN_VALUE;

        for (int i = 0; i < arr.length; i++) {
            if (arr[i] > max) {
                max = arr[i];
            }
        }

        System.out.println("Largest element in an array is : " + max);
    }

    // smallest element in an array
    public static void smallestElement(Scanner sc) {
        System.out.print("Enter the size of an array : ");
        int size = sc.nextInt();

        int arr[] = new int[size];
        inputArr(arr, sc);

        int min = Integer.MAX_VALUE;

        for (int i = 0; i < arr.length; i++) {
            if (arr[i] < min) {
                min = arr[i];
            }
        }

        System.out.println("Smallest element in an array is : " + min);
    }

    // reverse an array
    public static void reverseArray(Scanner sc) {
        System.out.print("Enter the size of an array : ");
        int size = sc.nextInt();

        int arr[] = new int[size];
        inputArr(arr, sc);

        System.out.print("Original array : ");
        printArr(arr);

        for (int i = 0; i < arr.length / 2; i++) {
            int temp = arr[i];
            arr[i] = arr[arr.length - 1 - i];
            arr[arr.length - 1 - i] = temp;
        }

        System.out.print("\nReversed array : ");
        printArr(arr);
    }

    // pairs in an array
    public static void arrayPairs(Scanner sc) {
        System.out.print("Enter the size of an array : ");
        int size = sc.nextInt();

        int arr[] = new int[size];
        inputArr(arr, sc);

        System.out.print("Original array : ");
        printArr(arr);

        // pairs
        System.out.println("\nPairs in an array : ");
        for (int i = 0; i < arr.length; i++) {
            for (int j = (i + 1); j < arr.length; j++) {
                System.out.print("(" + arr[i] + "," + arr[j] + ")");
            }
            System.out.println();
        }
    }

    // subarrays from an array
    public static void subArrays(Scanner sc) {
        System.out.print("Enter the size of an array : ");
        int size = sc.nextInt();

        int arr[] = new int[size];
        inputArr(arr, sc);

        System.out.print("Original array : ");
        printArr(arr);

        // subarrays
        System.out.println("\nSubarrays in an array : ");
        for (int i = 0; i < arr.length; i++) {
            for (int j = i; j < arr.length; j++) {
                System.out.print("( ");
                for (int k = i; k <= j; k++) {
                    System.out.print(arr[k] + " ");
                }
                System.out.print(")");
            }
            System.out.println();
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // linearSearch(sc);
        // binarySearch(sc);
        // largestElement(sc);
        // smallestElement(sc);
        // reverseArray(sc);
        // arrayPairs(sc);
        // subArrays(sc);

        sc.close();
    }
}
