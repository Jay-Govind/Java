import java.util.*;

public class SubArraysSum {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter the size of the array : ");
        int size = sc.nextInt();
        int[] arr = new int[size];

        for (int ele = 0; ele < size; ele++) {
            System.out.print("Enter the " + (ele + 1) + " element : ");
            arr[ele] = sc.nextInt();
        }

        System.out.println("----------------------------------------");
        BruteForce(arr);
        PrefixSum(arr);
        KadanesAlgo(arr);
        System.out.println("\n----------------------------------------");
        sc.close();
    }

    // Brute Force Approach - time complexity O(n^3) - (bad time complexity)
    public static void BruteForce(int[] array) {

        int maxPairSum = Integer.MIN_VALUE;
        int totalpair = 0;
        int start = 0;
        int end = 0;

        for (int firstElement = 0; firstElement < array.length; firstElement++) {

            for (int secondElement = firstElement; secondElement < array.length; secondElement++) {

                System.out.print("( ");
                int sumOfpair = 0;

                for (int pair = firstElement; pair <= secondElement; pair++) {
                    System.out.print(array[pair] + " ");
                    sumOfpair += array[pair];
                }

                if (maxPairSum < sumOfpair) {
                    maxPairSum = sumOfpair;
                    start = firstElement;
                    end = secondElement;
                }

                totalpair++;
                System.out.print(") ");
            }
        }

        System.out.println("\nTotal pair : " + totalpair);
        System.out.println("Maximum pair sum : " + maxPairSum + " and its subarray is : ");
        for (int ele = start; ele <= end; ele++) {
            System.out.print(array[ele] + " ");
        }
        System.out.println();
    }

    // Prefix sum - time complexity O(n^2) - (good time complexity)
    public static void PrefixSum(int[] array) {

        // Prefix sum
        int[] prefixSum = new int[array.length];
        prefixSum[0] = array[0];
        for (int ele = 1; ele < array.length; ele++) {
            prefixSum[ele] = prefixSum[ele - 1] + array[ele];
        }

        int currSum = 0;
        int maxPairSum = Integer.MIN_VALUE;

        for (int firstelement = 0; firstelement < array.length; firstelement++) {
            for (int secondElement = firstelement; secondElement < array.length; secondElement++) {
                currSum = (firstelement == 0) ? prefixSum[secondElement]
                        : prefixSum[secondElement] - prefixSum[firstelement - 1];
                if (maxPairSum < currSum) {
                    maxPairSum = currSum;
                }
            }
        }
        System.out.println("Maximum pair sum : " + maxPairSum);
    }

    // Kadanes Algorithm - time complexity O(n) - (good time complexity)
    public static void KadanesAlgo(int[] array) {
        int currSum = 0;
        int maxSum = Integer.MIN_VALUE;

        for (int ele = 0; ele < array.length; ele++) {
            currSum = currSum + array[ele];
            if (currSum < 0) {
                currSum = 0;
            }
            maxSum = Math.max(maxSum, currSum);
        }

        System.out.println("Maximum pair sum : " + maxSum);
    }
}