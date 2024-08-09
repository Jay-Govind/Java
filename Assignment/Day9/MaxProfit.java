package Day9;

public class MaxProfit {

    public static int maxProfit(int[] price) {
        if (price == null || price.length < 2) {
            return 0; // Not enough data to make a transaction
        }

        int profit = 0;
        int buy = price[0]; // Initialize to the first day's price

        for (int i = 1; i < price.length - 1; i++) {
            if (price[i] < buy) {
                buy = price[i]; // update buy price
            } else {
                profit = Math.max(profit, (price[i] - buy));
            }
        }

        return profit;
    }

    public static void main(String[] args) {
        int[] arr = { 7, 1, 5, 3, 6, 4 };
        System.out.println(maxProfit(arr));
    }
}
