class Solution {
    public int maxProfit(int[] prices) {
        int maxProfit = 0;
        int price = prices[0];
        for (int i = 1; i < prices.length; i++) {
            if (price > prices[i])
                price = prices[i];
            else {
                int profit = prices[i] - price;
                maxProfit = Math.max(profit, maxProfit);
            }
        }
        return maxProfit;
    }
}
