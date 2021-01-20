package com.leetcode;

public class BinarySearch {
    //https://leetcode.com/problems/binary-search/

    class Solution {
        public int search(int[] nums, int target) {

            int n = nums.length;

            int l = 0;
            int r = n - 1;

            while (l <= r) {
                int mid = l + (r - l) / 2;
                if (nums[mid] < target) {
                    l = mid + 1;
                } else {
                    r = mid - 1;
                }
            }
            if (r != n - 1 && nums[r + 1] == target) return r + 1;
            else return -1;

        }
    }
}

/**
    while(l<=r){
        int mid = l + (r-l)/2;
        if(nums[mid] == target){
            return mid;
        }
        if(nums[mid] < target){
            l = mid+1;
        }else{
            r = mid -1;
        }
    }
 **/

/**
        while(l<r){
            int mid = l + (r-l)/2;
            if(nums[mid] < target){
                l = mid+1;
            }else{
                r = mid;
            }
        }
        
        if(nums[r] == target) return r;
        else return -1;
**/
