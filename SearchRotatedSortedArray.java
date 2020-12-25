package com.leetcode;

public class SearchRotatedSortedArray {

    class Solution {
        public int search(int[] nums, int target) {
            int n = nums.length;
            int l = 0;
            int r = n-1;

            while(l<=r){//as we have no terminating condition on l and r and we are increasin deceasin respectively we include l==r as well in search
                int mid = l + (r-l)/2;
                if(nums[mid] == target)
                    return mid;
                if(nums[l] <= nums[mid]){
                    //first half sorted
                    if(target < nums[mid] && target >= nums[l]){
                        //target is between l --- mid
                        r = mid-1;
                    }else{
                        l = mid+1;
                    }
                }else{
                    // second half sorted
                    if(target > nums[mid] && target <= nums[r]){
                        //target is between mid and r
                        l = mid+1;
                    }else{
                        r = mid-1;
                    }
                }
            }
            return -1;
        }
    }
}
