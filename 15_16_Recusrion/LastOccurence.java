import java.util.*;

public class LastOccurence {

    public static int lastOccurence(int[] arr, int i, int key) {
        if (i == arr.length) {
            return -1;
        }

        int isFound = lastOccurence(arr, (i + 1), key);
        if (isFound == -1 && arr[i] == key) {
            return i;
        }

        return isFound; 
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter the size of the array : ");
        int size = sc.nextInt();

        int[] arr = new int[size];

        for (int i = 0; i < size; i++) {
            System.out.print("Enter the " + (i + 1) + " element : ");
            arr[i] = sc.nextInt();
        }

        System.out.print("Enter the target element : ");
        int key = sc.nextInt();

        int index = lastOccurence(arr, 0, key);

        if (index < 0) {
            System.out.print(key + " is not found.");
        } else {
            System.out.print("From last " + key + " found at index : " + index);
        }

        sc.close();
    }
}
