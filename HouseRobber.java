package com.leetcode;

public class HouseRobber {
    //https://leetcode.com/problems/house-robber/
    /**
        Example 1:

        Input: nums = [1,2,3,1]
        Output: 4
        Explanation: Rob house 1 (money = 1) and then rob house 3 (money = 3).
        Total amount you can rob = 1 + 3 = 4.
        Example 2:
        
        Input: nums = [2,7,9,3,1]
        Output: 12
        Explanation: Rob house 1 (money = 2), rob house 3 (money = 9) and rob house 5 (money = 1).
        Total amount you can rob = 2 + 9 + 1 = 12.
    **/
    class Solution {
        public int rob(int[] nums) {

            int n = nums.length;

            if(n == 0) return 0;
            if(n == 1) return nums[0];
            if(n == 2) return Math.max(nums[0], nums[1]);

            int[] memo = new int[n];
            memo[0] = nums[0];
            memo[1] = Math.max(nums[0], nums[1]);
            memo[2] = Math.max((nums[2] + memo[0]), memo[1]);
            //memo[3] = Math.max((nums[3] + nums[1]),memo[2]);
            for(int i = 2 ; i < n ; i++){
                memo[i] = Math.max((nums[i] + memo[i-2]),memo[i-1]);
            }

            return memo[n-1];
        }
    }
}
