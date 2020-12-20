package com.leetcode;

import java.util.Arrays;

public class HouseRobberII {
    //https://leetcode.com/problems/house-robber-ii/
    class Solution {
        public int rob(int[] nums) {
            int n = nums.length;
            if(n == 0) return 0;
            if(n == 1) return nums[0];
            if(n == 2) return Math.max(nums[0],nums[1]);

            int[] memo = new int[n];
            memo[0] = nums[0];
            memo[1] = Math.max(nums[0],nums[1]);
            //cant rob 0 and 2 together
            memo[2] = Math.max(Math.max(memo[0] , nums[2]), memo[1]);

            //check [0 to n-2 ] and [1 to n-1]


            int [] nums1 = Arrays.copyOfRange(nums,0,n-1);
            int [] nums2 = Arrays.copyOfRange(nums,1,n);

            return Math.max(robInLine(nums1),robInLine(nums2));
        }

        public int robInLine(int[] nums) {
            int n = nums.length;
            if(n == 0) return 0;
            if(n == 1) return nums[0];
            if(n == 2) return Math.max(nums[0],nums[1]);

            int[] memo = new int[n];
            memo[0] = nums[0];
            memo[1] = Math.max(nums[0],nums[1]);
            memo[2] = Math.max(memo[0] + nums[2], memo[1]);

            for(int i = 3 ; i < nums.length ; i++){
                memo[i] = Math.max(memo[i-2] + nums[i] , memo[i-1]);
            }
            return memo[n-1];
        }
    }
}

// Alternate - above is better for concept and works for House Robber 1
/*
class Solution{

    public int rob(int[] nums) {
        if(nums== null || nums.length == 0){
            return 0;
        }

        if (nums.length == 1) return nums[0];

        return Math.max(rob(nums, 0, nums.length - 2), rob(nums, 1, nums.length - 1));
    }

    private int rob(int[] num, int lo, int hi) {
        int include = 0, exclude = 0;
        for (int j = lo; j <= hi; j++) {
            int i = include, e = exclude;
            include = e + num[j];
            exclude = Math.max(e, i);
        }
        return Math.max(include, exclude);
    }
}
 */
