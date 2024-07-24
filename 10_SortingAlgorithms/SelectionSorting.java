import java.util.*;

public class SelectionSorting {

    public static void selectionSort(int[] arr) {

        for (int i = 0; i < arr.length - 1; i++) {

            int minPosition = i;

            for (int j = (i + 1); j < arr.length - 1; j++) {
                if (arr[minPosition] > arr[j]) {
                    minPosition = j;
                }
            }

            int temp = arr[i];
            arr[i] = arr[minPosition];
            arr[minPosition] = temp;
        }
    }

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("How many number you want to store ? ");
        int size = sc.nextInt();

        int[] arr = new int[size];

        for (int i = 0; i < size; i++) {
            System.out.print("Enter the " + (i + 1) + " element : ");
            arr[i] = sc.nextInt();
        }

        selectionSort(arr);

        System.out.print("Sorted array : ");
        System.out.println(Arrays.toString(arr));

        sc.close();
    }
}
