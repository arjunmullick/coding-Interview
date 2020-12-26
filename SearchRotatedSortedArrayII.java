package com.leetcode;

public class SearchRotatedSortedArrayII {
    //https://leetcode.com/problems/search-in-rotated-sorted-array-ii/
    //also check https://leetcode.com/problems/search-in-rotated-sorted-array/
    class Solution {
        public boolean search(int[] nums, int target) {
            int n = nums.length;
            int l = 0;
            int r = n-1;

            while(l<=r){
                int mid = l + (r-l)/2;
                if(nums[mid] == target) return true;
                if(nums[l] == target ) return true;
                if(nums[r] == target ) return true;
                //special case [1,3,1,1,1] when search for 3 , can be on left and right
                if(nums[l] <= nums[mid]){
                    if(target < nums[mid] && target >= nums[l]){
                        //search left
                        r = mid -1;
                    }else{
                        //search both side;
                        l++;
                        r--;
                    }
                }else{
                    if(target > nums[mid] && target <= nums[r]){
                        l = mid+1;
                    }else{
                        l++;
                        r--;
                    }
                }
            }

            return false;
        }
    }
}
