package com.leetcode;

public class SortColors {

    //https://leetcode.com/problems/sort-colors/
    class Solution {
        public void sortColors(int[] nums) {
            int n = nums.length;
            int l = 0;
            int r = n-1;
            int temp;
            int i=0;
            while(i<=r){
                if(nums[i] == 0){
                    // put in beginning
                    temp = nums[l];
                    nums[l] = nums[i];
                    nums[i] = temp;
                    l++;
                    i++;//increase as we covered all before
                }else if(nums[i] == 2){
                    //put in last
                    temp = nums[r];
                    nums[r] = nums[i];
                    nums[i] = temp;
                    r--;
                }else if(nums[i] == 1){
                    i++;
                }
            }
        }
    }
}
