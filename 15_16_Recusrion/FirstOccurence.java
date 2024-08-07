import java.util.*;

public class FirstOccurence {
    public static int firstOccurence(int[] arr, int i, int key) {
        if (i == arr.length) {
            return -1;
        } else if (arr[i] == key) {
            return i;
        } else {
            return firstOccurence(arr, (i + 1), key);
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter the size of array : ");
        int size = sc.nextInt();

        int[] arr = new int[size];

        for (int i = 0; i < size; i++) {
            System.out.print("Enter the " + (i + 1) + " element : ");
            arr[i] = sc.nextInt();
        }

        System.out.print("Enter the target element : ");
        int tar = sc.nextInt();

        int index = firstOccurence(arr, 0, tar);

        if (index < 0) {
            System.out.print(tar + " is not found.");
        } else {
            System.out.print(tar + " found at index : " + index);
        }

        sc.close();
    }
}
