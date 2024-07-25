import java.util.Arrays;
import java.util.Collections;

public class InbuiltSorting {
    public static void main(String[] args) {
        // int[] arr = { 5, 2, 8, 7, 3, 4, 6, 1, 9, 0 };
        // Arrays.sort(arr);
        // System.out.print("Sorted array in acsending order : ");
        // printArr(arr);

        Integer[] arr = { 5, 2, 8, 7, 3, 4, 6, 1, 9, 0 };
        Arrays.sort(arr, Collections.reverseOrder());
        System.out.print("Sorted array in descending order : ");
        printArr(arr);

    }

    public static void printArr(Integer[] arr) {
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + " ");
        }
    }
}
/*
 * Array.sort works with int data data type but
 * Arrays.sort(arr.Collections.reverseOrder()) works only with object.
 */