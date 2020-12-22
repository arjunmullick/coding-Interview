package com.leetcode;

public class BestTimeBuyAndSellStock {
    //only one transaction
    //https://leetcode.com/problems/best-time-to-buy-and-sell-stock/
    class Solution {
        public int maxProfit(int[] prices) {
            if (prices == null || prices.length < 2) return 0;
            int result = 0;
            int min = prices[0];
            for (int p : prices) {
                int profit = p - min;
                result = Math.max(profit, result);
                min = Math.min(min, p);
            }
            return result;
        }

        // if any number of transaction are allowed then
        //https://leetcode.com/problems/best-time-to-buy-and-sell-stock-ii/
        public int maxProfitAnyTransaction(int[] prices) {
            //sum of all positive slopes
            int result = 0;
            int last = prices[0];
            for(int p : prices){
                int profit = p - last;
                if(profit > 0){
                    result +=profit;
                }
                last = p;
            }
            return result;
        }
        //Best Time to Buy and Sell Stock with Cooldown = 1 day
        //https://leetcode.com/problems/best-time-to-buy-and-sell-stock-with-cooldown/
        /*
        Not allowed multiple transactions at the same time (sell the stock before you buy again).
        After sell cannot buy stock on next day. (ie, cooldown 1 day)
         */
        //buy can happen after hold.
        //sell can happen after buy
        //hold can happen after buy and sell or continue from last hold price.
        // by greedy at each state
        //day 1
        //if buy profit = -p
        public int maxProfitCooldown(int[] prices) {
            int n = prices.length;
            if(n <= 1) return 0;
            int[] buy = new int[n];
            int[] sell = new int[n];
            int[] hold = new int[n];

            buy[0] = - prices[0];
            sell[0] = hold[0] = 0;
            for(int i = 1 ; i < n ; i++){
                int p = prices[i];
                buy[i] = Math.max(buy[i-1],hold[i-1]-p);
                sell[i] = Math.max(buy[i-1] + p, sell[i-1]);
                hold[i] = Math.max(Math.max(hold[i-1],sell[i-1]), buy[i-1]);
            }

            return sell[n-1];

        }
    }
}
