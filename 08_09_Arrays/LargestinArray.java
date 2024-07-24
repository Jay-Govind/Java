import java.util.*;
import java.util.Arrays;

public class LargestinArray {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter the size of array : ");
        int size = sc.nextInt();
        int arr[] = new int[size];

        // input
        for (int count = 0; count < arr.length; count++) {
            System.out.print("Enter the " + (count + 1) + " element : ");
            arr[count] = sc.nextInt();
        }

        // output
        System.out.println("----------------------------------------");
        for (int count = 0; count < arr.length; count++) {
            System.out.print(arr[count] + " ");
        }

        // function call
        int max = getLargestNumber(arr);
        int max1 = getLargest(arr);

        System.out.println("\nLargest number in array is : " + max);
        System.out.println("Largest number in array is : " + max1);

        sc.close();
    }

    // Linear Search
    public static int getLargestNumber(int arr[]) {
        int max = arr[0];
        for (int count = 0; count < arr.length; count++) {
            if (arr[count] > max) {
                max = arr[count];
            }
        }
        return max;
    }

    public static int getLargest(int arr[]) {
        Arrays.sort(arr);
        return arr[arr.length - 1];
    }
}

/* Second function is avisable not to use due to time complexcity */