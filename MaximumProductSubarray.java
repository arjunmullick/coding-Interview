package com.leetcode;

public class MaximumProductSubarray {

    //https://leetcode.com/problems/maximum-product-subarray/
    /**
    Example 1:

        Input: nums = [2,3,-2,4]
        Output: 6
        Explanation: [2,3] has the largest product 6.
    Example 2:
        
        Input: nums = [-2,0,-1]
        Output: 0
        Explanation: The result cannot be 2, because [-2,-1] is not a subarray.
    **/
    class Solution {

    /*
    Many sub problem to simply took the pattern below.
    // in once pass look for a max product of continious array from left to right
    // in second pass look for a max product of continious array from right to left
    // select max and return.
    // Why it words ?
    //  it covers all continious array growing in either direction example input = [-2 1 3]->  [-2,-2,-6] and [3,3,-6] at each index we select max
    */

        int max;

        public int maxProduct(int[] nums) {
            max = Integer.MIN_VALUE;
            int product = 1;
            for(int i = 0 ; i < nums.length ; i++){
                product = product * nums[i];
                max = Math.max(max,product);
                if(product == 0) product =1; //reset for next continious array
            }

            product = 1;//reset for right to left search
            for(int i = nums.length-1 ; i>=0 ; i--){
                product = product * nums[i];
                max = Math.max(max,product);
                if(product == 0) product =1;//reset for next continious array
            }

            return max;
        }
    }
}
