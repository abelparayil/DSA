/* https://leetcode.com/problems/best-time-to-buy-and-sell-stock/description/ */

class Solution {
    public int maxProfit(int[] prices) {
        int minPrice = prices[0], profit, maxProfit = 0;
        for( int i=1; i < prices.length; i++){
            if ( prices[i] < minPrice)
                minPrice = prices[i];
            else if (prices[i] > minPrice){
                profit = prices[i] - minPrice;
                if (profit > maxProfit)
                    maxProfit = profit;
            }
        }
        return maxProfit;
    }
}
