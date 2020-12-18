package com.leetcode;

public class ProductArrayExceptSelf {

    //https://leetcode.com/problems/product-of-array-except-self/
    class Solution {
        public int[] productExceptSelf(int[] nums) {

            int n = nums.length;
            if(n <= 1) return nums;
            int [] L = new int[n];
            int [] R = new int[n];
            L[0] = 1;
            for(int i = 1 ; i < n ; i++){
                L[i] = L[i-1] * nums[i-1];
            }
            R[n-1] = 1;
            for(int i = n-2 ; i >= 0 ; i--){
                R[i] = R[i+1]* nums[i+1];
            }

            int result[] = new int[n];
            for(int i = 0 ; i < n ; i++){
                result[i] = L[i] * R[i];
            }

            return result;
        }
    }

}
