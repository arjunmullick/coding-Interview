package com.leetcode;

public class BestTimeBuyAndSellStock {
    //https://leetcode.com/problems/best-time-to-buy-and-sell-stock/
    //only one transaction
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
    }
}
