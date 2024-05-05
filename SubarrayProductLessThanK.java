package com.leetcode;

public class SubarrayProductLessThanK {

    //https://leetcode.com/problems/subarray-product-less-than-k/

    class Solution {

        // 10 5 2 6
        //--           10
        //-----        10  5
        //    -            5
        //    ---          5 2
        //    -----        5 2 6
/**
Input: nums = [10,5,2,6], k = 100
Output: 8
Explanation: The 8 subarrays that have product less than 100 are:
[10], [5], [2], [6], [10, 5], [5, 2], [2, 6], [5, 2, 6]
Note that [10, 5, 2] is not included as the product of 100 is not strictly less than k.
**/        
        //O(N)
        public int numSubarrayProductLessThanK(int[] nums, int k) {
            if (k <= 1) return 0;//see note below
            int n = nums.length;
            int l = 0;
            int r = 0;
            int prod = 1;

            int result =0;
            while(l<=r && r<n){
                prod = prod * nums[r];//increase
                while(prod >= k ){//can add l<=r to cover case k=0 but we checked edge condition above
                    prod = prod / nums[l];//reduce product Note:Array of positive integers so no divide by zero
                    l++;
                }
                result = result + (r-l)+1;//r=l=0 is one solution
                r++;
            }
            return result;
        }
    }

    //Recursive approach
    //O(N*N) - for array [1,1,1,1,1,1] k > 1 creates n branches or depth max n
    class SolutionTLE {
        int result;
        public int numSubarrayProductLessThanK(int[] nums, int k) {
            result = 0;
            for(int i = 0 ; i < nums.length ; i++){
                backtrack(nums,i,nums[i],k);
            }

            return result;
        }

        public void backtrack(int[] nums, int pos, int product, int k){
            if(pos == nums.length) return;

            if(product < k){
                result++;
            }else{
                return;
            }

            if(pos < nums.length -1){
                backtrack(nums,pos+1,product*nums[pos+1] , k);
            }
        }
    }
}
