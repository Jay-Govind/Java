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
    

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // linearSearch(sc);
        binarySearch(sc);

        sc.close();
    }
}
