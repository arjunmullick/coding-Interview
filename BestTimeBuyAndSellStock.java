package com.leetcode;

import java.util.Arrays;

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

        //Best Time to Buy and Sell Stock IV

        public int maxProfit(int k, int[] prices) {
            if (prices == null || prices.length <= 1) return 0;
            int[][] dp = new int[k+1][prices.length];

            for (int j = 1; j < k+1 ; j++) {
                int min = prices[0];
                for (int i = 1; i < prices.length; i++) {
                    min = Math.min(min, prices[i] - dp[j - 1][i - 1]);
                    dp[j][i] = Math.max(dp[j][i - 1], prices[i] - min);
                }
            }
            return dp[k][prices.length-1];
        }
        // Alternate  Best Time to Buy and Sell Stock IV
        public int maxProfitState(int k, int[] prices) {
            int buy[] = new int[k];
            int sell[] = new int[k];

            if(k <  1 || prices.length < 2) return 0;

            if(k > (prices.length /2)){
                //do as many transaction we want
                int total = 0;
                for(int i = 1 ; i< prices.length ; i++){
                    total += Math.max(0,prices[i] - prices[i-1]);
                }
                return total;
            }


            Arrays.fill(buy,Integer.MIN_VALUE);
            for(int p : prices){
                buy[0] = Math.max(buy[0] , -p);
                sell[0] = Math.max(sell[0] , p + buy[0]);
                for(int i = 1 ; i < k ; i++){
                    buy[i] = Math.max(buy[i] , sell[i-1] -p);
                    sell[i] = Math.max(sell[i] , buy[i] + p);
                }
            }
            return sell[k-1];
        }
    }
}
