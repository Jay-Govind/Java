package Assignment.Day9;

import java.util.Arrays;

public class ThreeSum {

    // Two Sum
    public static int[] twoSum(int[] arr, int target) {
        Arrays.sort(arr);
        int start = 0;
        int end = arr.length - 1;

        while (start < end) {
            int sum = arr[start] + arr[end];
            if (sum == target) {
                return new int[] { arr[start], arr[end] };
            } else if (sum < target) {
                start++;
            } else {
                end--;
            }
        }
        return new int[] {};
    }

    // Three Sum
    public static int[] threeSum(int[] arr, int target) {
        Arrays.sort(arr);
        for (int i = 0; i < arr.length; i++) {
            int sum = target - arr[i];
            int[] pair = twoSum(arr, sum);
            if (pair.length != 0) {
                return new int[] { arr[i], pair[0], pair[1] };
            }
        }
        return new int[] {};
    }

    // full code of threeSum
    public static int[] threeSum2(int[] arr, int target) {
        Arrays.sort(arr);
        for (int i = 0; i < arr.length; i++) {

            int newTarget = target - arr[i];

            int start = i + 1;
            int end = arr.length - 1;

            while (start < end) {
                int sum = arr[start] + arr[end];
                if (sum == newTarget) {
                    return new int[] { arr[i], arr[start], arr[end] };
                } else if (sum < newTarget) {
                    start++;
                } else {
                    end--;
                }
            }
        }
        return new int[] {};
    }

    public static void main(String[] args) {
        int arr[] = { -1, 0, 1, 2, -1, -4 };
        int target = 3;

        int ans[] = twoSum(arr, target);
        System.out.println(ans[0] + " " + ans[1]);

        int ans2[] = threeSum2(arr, target);
        System.out.println(ans2[0] + " " + ans2[1] + " " + ans2[2]);
    }
}
