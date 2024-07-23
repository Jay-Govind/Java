import java.util.*;

public class TrappingRainwater {

    public static int trappingRainwater(int height[]) {

        /**
         * Calculates the amount of water that can be trapped between the bars after
         * rain.
         * Uses a two-pass approach with leftMax and rightMax arrays to compute
         * boundaries, then calculates trapped water based on the minimum of these
         * boundaries minus the height at each position.
         * 
         * @param height An array representing the heights of bars
         * @return The total amount of trapped water
         */

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

        // loop
        int i = 0;
        int totalWater = 0;

        while (i < height.length) {

            // waterLevel = min(leftMax, rightMax)
            int waterLevel = Math.min(leftMax[i], rightMax[i]);

            // trapperWater = waterLevel - height[i]
            totalWater += (waterLevel - height[i]);

            i++;
        }

        return totalWater;
    }

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        // Input
        System.out.print("Enter the size of array of bars : ");
        int size = sc.nextInt();

        int[] height = new int[size];

        for (int count = 0; count < size; count++) {
            System.out.print("Enter the " + (count + 1) + " element : ");
            height[count] = sc.nextInt();
        }

        System.out.println(trappingRainwater(height));

        sc.close();
    }
}