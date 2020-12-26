package com.leetcode;

public class FindMinimumRotatedSortedArray {

    //4 , 5, 6 , 7 , 2, 3
    // mid 6 > r 3 - means min is on right
    // else its on left
    class Solution {
        public int findMin(int[] nums) {
            int n = nums.length;
            int l = 0;
            int r = n-1;
            while(l<r){
                int mid = l + (r-l)/2;
                if(nums[mid] < nums[r]){ // irrlevant nums[mid] < nums[mid+1] &&
                    r = mid;
                }else{
                    l = mid+1;
                }
            }
            return nums[r];
        }
    }
}
