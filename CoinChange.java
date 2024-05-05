package com.leetcode;

public class CoinChange {
    //https://leetcode.com/problems/coin-change/submissions/
    /**
        Input: coins = [1,2,5], amount = 11
        Output: 3
        Explanation: 11 = 5 + 5 + 1
    **/
    //BottomUp
    class SolutionBottomUp {
        public int coinChange(int[] coins, int amount) {
            int dp[] = new int[amount+1];
            Arrays.fill(dp,amount+1); // Integer.MAX_VALUE
            int n = coins.length;
            dp[0] = 0;
            for(int i = 1 ; i < amount+1 ; i++){
                for(int j = 0 ; j < n; j++){
                    int diff = i - coins[j];
                    if(diff >=0 ){
                        dp[i] = Math.min(dp[i] , dp[diff]+1);
                    }
                }
            }

            return dp[amount] > amount ? -1 : dp[amount];
        }
    }
    
    
    //TopDown
    class SolutionTopDown {
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
