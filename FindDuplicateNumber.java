package com.leetcode;

import java.util.Arrays;

public class FindDuplicateNumber {

    //https://leetcode.com/problems/find-the-duplicate-number/
    class Solution {
        public int findDuplicate(int[] nums) {
            int n = nums.length;
            int l = 1;//[1,n] number to search
            int r = n-1;

            while(l<= r){
                int mid = l + (r-l)/2;//mid is potential number not index
                int count = count(nums,mid);//no of elements that are < mid
                if(count <= mid){
                    l = mid + 1;
                }else{
                    // we have more numbers > mid so look for a number in [l,mid)
                    r = mid - 1 ;
                }
            }

            return r+1;

        }

        public int count(int[] nums , int target){
            int result = 0;
            for(int n : nums){
                if(n <= target) result++;
            }
            return result;
        }
    }
}

// note
    /*

    //binary search on value will not work because number may repeat many time 1,3,3,4,5 or 2,2,3,4,5 so binary search will miss 3 and 2 respectively
    // Other test case  possible to have 2,2,2,1 or 1,1,2,2 where more than one duplicate in test cases
    public int findDuplicate(int[] nums) {
        Arrays.sort(nums);
        int n = nums.length;
        int l = 0;
        int r = n-1;

        while(l<=r){
            int mid = l + (r-l)/2;//index
            if(nums[mid] == mid+1){
                //search right
                l = mid+1;
            }else{
                r = mid-1;
            }
        }

        return (r>=0)?nums[r+1] : nums[0];
    }
    */
