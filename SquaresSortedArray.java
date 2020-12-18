package com.leetcode;

public class SquaresSortedArray {

    //https://leetcode.com/problems/squares-of-a-sorted-array/
    class Solution {
        public int[] sortedSquares(int[] nums) {
            int n = nums.length;
            int result[] = new int[n];
            int l = 0;
            int r = n-1;
            int counter = n-1;
            while(l<=r && counter >=0){
                if(Math.abs(nums[l])>Math.abs(nums[r])){
                    result[counter] = nums[l]*nums[l];
                    l++;
                }else{
                    result[counter] = nums[r]*nums[r];
                    r--;
                }
                counter--;
            }
            return result;

        }
    }
}
