import java.util.*;

public class ReverseArray {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter the size of array : ");
        int size = sc.nextInt();
        int[] arr = new int[size];

        for (int count = 0; count < size; count++) {
            System.out.print("Enter the " + (count + 1) + " element : ");
            arr[count] = sc.nextInt();
        }

        System.out.println("----------------------------------------");
        System.out.print("Original array : ");
        for (int count = 0; count < size; count++) {
            System.out.print(arr[count] + " ");
        }
        System.out.println();

        reverseArray(arr);

        System.out.print("Reversed array : ");
        for (int count = 0; count < size; count++) {
            System.out.print(arr[count] + " ");
        }
        System.out.println("\n----------------------------------------");
        sc.close();
    }

    public static void reverseArray(int[] arr) {
        int first = 0;
        int last = arr.length - 1;
        while (first < last) {
            arr[first] = arr[first] + arr[last];
            arr[last] = arr[first] - arr[last];
            arr[first] = arr[first] - arr[last];
            first++;
            last--;
        }
    }
}