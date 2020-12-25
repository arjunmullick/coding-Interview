package com.leetcode;

public class FindPeakElement {

    //https://leetcode.com/problems/find-peak-element/
    //Also refer https://leetcode.com/problems/peak-index-in-a-mountain-array/
    class Solution {
        public int findPeakElement(int[] nums) {
            int n = nums.length;
            int l = 0;
            int r = n-1;
            while(l<r){
                int mid = l + (r-l)/2;
                if(nums[mid] < nums[mid+1]){
                    l = mid+1;//forcing always l to move
                }else{
                    r = mid;
                }
            }
            return l; // or return r;
        }
    }
}
