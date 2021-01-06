package com.leetcode;

import java.util.Arrays;

public class ThreeSumClosest {
    //https://leetcode.com/problems/3sum-closest/

    //O(N*N) , alternative is fix p1 and p2 pointers and do binSearch for p3 closest to sum that worst case is O(N*N logN)
    class Solution {
        public int threeSumClosest(int[] nums, int target) {
            int n = nums.length;
            Arrays.sort(nums);
            int minDiff = Integer.MAX_VALUE;
            int result = 0;
            for(int p1 = 0 ; p1 < n-2 ; p1++){
                int rem = target - nums[p1];//remaining
                int l = p1+1;
                int r = n-1;
                while(l<r){
                    int sum = nums[l] + nums[r];
                    int diff = rem - sum;
                    if(minDiff > Math.abs(diff)){
                        minDiff = Math.abs(diff);
                        result = nums[p1] + nums[l] + nums[r];
                    }
                    if(diff == 0) return target;
                    if(diff > 0){
                        l++;
                    }
                    if(diff < 0){
                        r--;
                    }
                }
            }

            return result;
        }
    }
}
