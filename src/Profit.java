import java.util.*;
public class Profit {
    public static int maxProfit(int[] prices) {
        if (prices == null || prices.length == 0) {
            return 0;
        }
        int minPrice = Integer.MAX_VALUE;
        int maxProfit = 0;
        for (int price : prices) {
            if (price < minPrice) {
                minPrice = price;
            }
            // Calculate the profit if the stock was bought at minPrice and sold at current price
            else {
                int profit = price - minPrice;
                if (profit > maxProfit) {
                    maxProfit = profit;
                }
            }
        }
        return maxProfit;
    }
    public static void main(String[] args) {
        int[] prices1 = {7, 1, 5, 3, 6, 4};
        System.out.println("Maximum profit: " + maxProfit(prices1));
        int[] prices2 = {7, 6, 4, 3, 1};
        System.out.println("Maximum profit: " + maxProfit(prices2));
    }
}


