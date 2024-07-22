import java.util.*;
import java.util.Arrays;

public class BinarySearch {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter the size of array : ");
        int size = sc.nextInt();
        int[] arr = new int[size];

        for (int count = 0; count < size; count++) {
            System.out.print("Enter the " + (count + 1) + " element : ");
            arr[count] = sc.nextInt();
        }

        System.out.print("Enter the element to search : ");
        int target = sc.nextInt();
        int ans = binarySearch(arr, target);

        System.out.println("Target found at index : " + ans);
        sc.close();

    }

    public static int binarySearch(int[] arr, int target) {
        Arrays.sort(arr);
        int start = 0;
        int end = arr.length - 1;

        while (start <= end) {
            int mid = (start + end) / 2;
            if (arr[mid] == target) {
                return mid;
            } else if (target > arr[mid]) {
                start = mid + 1;
            } else {
                end = mid - 1;
            }
        }
        return -1;
    }
}
