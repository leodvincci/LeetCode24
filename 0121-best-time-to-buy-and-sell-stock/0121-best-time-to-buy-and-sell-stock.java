class Solution {
    public int maxProfit(int[] prices) {

        int low = prices[0];
        int profit = 0;

        for (int i = 0; i < prices.length; i++) {
            int cur = prices[i] - low;
            if (cur > profit) {
                profit = cur;
            }
            if (prices[i] < low) {
                low = prices[i];
            }
        }
        return profit;

    }
}