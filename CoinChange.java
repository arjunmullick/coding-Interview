package com.leetcode;

public class CoinChange {

    class Solution {
        public int coinChange(int[] coins, int amount) {
            int [] memo = new int[amount+1];
            return coinChangeHelper(coins , amount , memo);
        }

        public int coinChangeHelper(int[] coins, int remaining , int[] memo) {
            if(remaining <0) return -1;

            if(remaining == 0) return 0;

            if(memo[remaining] != 0) return memo[remaining]; // if not found -1 stored

            int min = Integer.MAX_VALUE;
            for(int c : coins){
                int diff = remaining - c;
                if(diff >=0){
                    int r = coinChangeHelper(coins,diff,memo);
                    if(r>=0){
                        r = r+1;//count self
                        min = Math.min(r,min);
                    }

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
