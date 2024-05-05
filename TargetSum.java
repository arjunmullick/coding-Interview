package com.leetcode;

public class TargetSum {

    class Solution {

        //O(2^N) time and O(2^N) memory on stack
        /**
            Input: nums = [1,1,1,1,1], target = 3
            
            Output: 5
            Explanation: There are 5 ways to assign symbols to make the sum of nums be target 3.
            -1 + 1 + 1 + 1 + 1 = 3
            +1 - 1 + 1 + 1 + 1 = 3
            +1 + 1 - 1 + 1 + 1 = 3
            +1 + 1 + 1 - 1 + 1 = 3
            +1 + 1 + 1 + 1 - 1 = 3
        **/
        int result;
        public int findTargetSumWays(int[] nums, int S) {
            result = 0;
            dfs(nums,S,0,0);
            return result;

        }

        public void dfs(int [] nums , int target , int index , int currSum){
            if(index == nums.length){
                if(target == currSum){
                    result = result+1;
                }
                return;
            }

            dfs(nums,target,index+1,currSum+nums[index]);
            dfs(nums,target,index+1,currSum-nums[index]);
        }
    }

    //Alternate Solution
    /**
    class Solution2 {

        //Time: O(n^2), Space: O(n^2)
        int result;
        public int findTargetSumWays(int[] nums, int S) {
            result = 0;

            if (nums.length == 0)
                return 0;

            int sum = 0;
            for(int n: nums){
                sum += n;
            }

            // An edge case: when S is out of range [-sum, sum]
            if (S < -sum || S > sum)
                return 0;

            // the array index i,j store how many ways we cam make sum j at index i
            int[][] dp = new int[nums.length + 1][sum * 2 + 1];

            dp[0][sum] = 1; // here sum index is  0  sum as index 0 = -sum and index 2*sum = sum
            int leftBound = 0;
            int rightBound = sum * 2;
            for (int i = 1; i <= nums.length; i++) {
                for (int j = leftBound; j < rightBound + 1; j++) {
                    // try all possible sum of (previous sum j + current number nums[i - 1]) and all possible difference of
                    // (previous sum j - current number nums[i - 1])
                    if (j + nums[i - 1] <= rightBound) {
                        dp[i][j] += dp[i - 1][j + nums[i - 1]];
                    }
                    if (j - nums[i - 1] >= leftBound) {
                        dp[i][j] += dp[i - 1][j - nums[i - 1]];
                    }
                }
            }
            return dp[nums.length][sum + S];

        }
     */
}
