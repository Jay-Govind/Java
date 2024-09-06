package Practice.Array;

import java.util.Scanner;

public class Stock {

    public static int stockProfit(int[] stockPrices) {
        int buyPrice = Integer.MAX_VALUE;
        int maxProfit = 0;

        for (int i = 0; i < stockPrices.length; i++) {

            if (buyPrice < stockPrices[i]) {
                int profit = stockPrices[i] - buyPrice;
                maxProfit = Math.max(maxProfit, profit);
            } else {
                buyPrice = stockPrices[i];
            }
        }

        return maxProfit;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter the size of an array : ");
        int size = sc.nextInt();

        int[] stockPrice = new int[size];

        for (int i = 0; i < size; i++) {
            System.out.print("Enter the " + (i + 1) + " Stock Price : ");
            stockPrice[i] = sc.nextInt();
        }

        System.out.println(stockProfit(stockPrice));

        sc.close();
    }
}
