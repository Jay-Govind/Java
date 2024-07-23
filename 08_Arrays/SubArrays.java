import java.util.*;

public class SubArrays {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter the size of array : ");
        int size = sc.nextInt();
        int[] array = new int[size];

        for (int count = 0; count < size; count++) {
            System.out.print("Enter the " + (count + 1) + " element : ");
            array[count] = sc.nextInt();
        }

        System.out.println("----------------------------------------");
        PairFromArray(array);
        sc.close();
    }

    public static void PairFromArray(int[] array) {
        for (int firstElement = 0; firstElement < array.length; firstElement++) {
            for (int secondElement = firstElement; secondElement < array.length; secondElement++) {
                System.out.print("( ");
                for (int pair = firstElement; pair <= secondElement; pair++) {
                    System.out.print(array[pair] + " ");
                }
                System.out.print("),");
            }
            System.out.println();
        }
    }
}