package Practice.Array;

import java.util.Scanner;

public class TrappedRainwater {

    public static int trappedWater(int[] height) {
        int n = height.length;

        if (n < 0) {
            return 0; // Handle empty array case
        }

        // Calculate leftMax boundary - array
        int[] leftMax = new int[n];
        leftMax[0] = height[0];
        for (int i = 1; i < n; i++) {
            leftMax[i] = Math.max(height[i], leftMax[i - 1]);
        }

        // Calculate rightMax boundary - array
        int[] rightMax = new int[n];
        rightMax[n - 1] = height[n - 1];
        for (int i = n - 2; i >= 0; i--) {
            rightMax[i] = Math.max(height[i], rightMax[i + 1]);
        }

        int i = 0;
        int totalWater = 0;

        while (i < n) {

            // waterLevel = min(leftMax, rightMax)
            int waterLevel = Math.min(leftMax[i], rightMax[i]);

            // totalWater += (waterLevel - height[i]) * width
            totalWater += waterLevel - height[i];

            i++;
        }

        return totalWater;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter the size of an array : ");
        int size = sc.nextInt();

        int[] height = new int[size];

        for (int i = 0; i < size; i++) {
        System.out.print("Enter the " + (i + 1) + " height : ");
        height[i] = sc.nextInt();
        }

        // int[] height = { 4, 2, 0, 6, 3, 2, 5 }; // eg

        System.out.println(trappedWater(height));

        sc.close();
    }
}
