package com.leetcode;

public class CoinChange {
    //https://leetcode.com/problems/coin-change/submissions/
    class Solution {
        public int coinChange(int[] coins, int amount) {
            int[] memo = new int[amount+1];
            return coinChangeRec(coins,amount,memo);
        }

        public int coinChangeRec(int[] coins, int remaining, int[] memo){
            if(remaining < 0){
                return -1;
            }

            if(remaining == 0) {
                return 0;
            }

            if(memo[remaining] != 0){
                return memo[remaining];
            }

            int min = Integer.MAX_VALUE;
            for(int i = coins.length-1; i>=0 ; i--){
                int diff = remaining-coins[i];
                int c = coinChangeRec(coins,diff,memo);
                if(c>=0){
                    min = Math.min(min,c+1) ; //add self
                }
            }

            if(min < Integer.MAX_VALUE){
                memo[remaining] = min;
            }else{
                memo[remaining] = -1;
            }

            return memo[remaining];
        }
    }
}
