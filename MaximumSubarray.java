package com.leetcode;

public class MaximumSubarray {

    //https://leetcode.com/problems/maximum-subarray/
    class Solution {
        public int maxSubArray(int[] nums) {
            int n = nums.length;
            if(n == 0) return 0;

            if(n == 1) return nums[0];

            //   [-2,1,-3,4,-1,2,1,-5,4]
            // [0,-2,1,-2,4,3,5,6,1,5]
            // hint : what is the max subarray including this position and elements before it .

            int memo[] = new int[n+1];//memo[0] = 0 by default

            for(int i = 0 ; i < n ; i++){
                memo[i+1] = Math.max(nums[i], memo[i]+nums[i]);
            }


            //one way to avoid this memo array is to only keep memo[i] as local max and check max in above array . see below solution
            int max = Integer.MIN_VALUE;
            for(int i = 1 ; i <= n ; i++){
                max = Math.max(memo[i],max);
            }
            return max;
        }
    }


    //Alternate solutions
    class Solution2 {
        int max = Integer.MIN_VALUE;
        // Greedy - check local maximum in n time then check global maximum
        public int maxSubArray(int[] nums) {
            int n = nums.length;
            int max = nums[0];
            int localMaxSum = nums[0];
            for(int i = 1 ; i < n ; i++){
                localMaxSum = Math.max(localMaxSum + nums[i], nums[i]); // also can say if(nums[i] > localMaxSum) localMaxSum = nums[i];
                max = Math.max(max,localMaxSum);
            }
            return max;
        }
    }
}
