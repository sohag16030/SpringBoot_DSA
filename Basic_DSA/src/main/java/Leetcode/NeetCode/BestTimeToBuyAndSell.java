package Leetcode.NeetCode;

public class BestTimeToBuyAndSell {
    public static void main(String[] args) {
        int[] prices = {7, 3, 9, 15, 1, 8, 14};
        int ans = maxProfit(prices);
    }

    private static int maxProfit(int[] prices) {
        if(prices.length==1) return 0;
        int max = Math.max(prices[1]-prices[0],0);
        int minVal = prices[0];
        for (int i = 1; i < prices.length-1; i++) {
            minVal = Math.min(minVal, prices[i]);
            max = Math.max(max, prices[i + 1] - minVal);
        }
        return max;
    }
}
