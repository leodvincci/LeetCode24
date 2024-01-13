class Solution {
    public int maxProfit(int[] prices) {
        int low = prices[0];
        int profit = 0;

        for(int i = 0; i < prices.length; i++){
            int curProf = prices[i] - low;
            if(curProf > profit){
                profit = curProf;
            }

            if(prices[i] < low){
                low = prices[i];
            }
        }

        return profit;

        
    }
}