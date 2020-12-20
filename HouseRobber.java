package com.leetcode;

public class HouseRobber {
    //https://leetcode.com/problems/house-robber/
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
