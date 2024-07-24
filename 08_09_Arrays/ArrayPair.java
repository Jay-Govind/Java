import java.util.*;

public class ArrayPair {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter the  size of Array :");
        int size = sc.nextInt();
        int[] arr = new int[size];

        int count = 0;
        while (count < size) {
            System.out.print("Enter the " + (count + 1) + " element :");
            arr[count] = sc.nextInt();
            count++;
        }

        PairOfArray(arr);

        sc.close();
    }

    public static void PairOfArray(int[] arr) {
        int count = 0;
        while (count < arr.length) {
            for (int pair = (count + 1); pair < arr.length; pair++) {
                System.out.print("(" + arr[count] + "," + arr[pair] + ") ");
            }
            count++;
        }
    }
}
