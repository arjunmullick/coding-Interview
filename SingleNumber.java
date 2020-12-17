package com.leetcode;

import java.util.Arrays;

public class SingleNumber {
    //https://leetcode.com/problems/single-number/
    class Solution {
        public int singleNumber(int[] nums) {
            int n = nums.length;

            Arrays.sort(nums);
            int l = 0 ; int r = n-1;
            while(l<r){
                int mid = l + (r-l)/2;
                if(mid%2 !=0) mid--;

                if(nums[mid] == nums[mid+1]){
                    //all number before mid are in pairs as index mathc
                    l = mid+2;
                }else{
                    r = mid;
                }
            }

            return nums[r];

        }
    }
}
