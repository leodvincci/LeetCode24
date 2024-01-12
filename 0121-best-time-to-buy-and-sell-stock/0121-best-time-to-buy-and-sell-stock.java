class Solution {
    public int maxProfit(int[] prices) {

        int low = prices[0];
        int profit = 0;

        for(int i = 0; i < prices.length; i++){
            if(prices[i] - low >= profit){
                profit = prices[i] - low;
            }

            if(prices[i] <= low){
                 low = prices[i];
            }
        }
        return profit;
        
    }
}