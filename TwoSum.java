package com.leetcode;

import java.util.Arrays;
import java.util.HashMap;

public class TwoSum {

    //https://leetcode.com/problems/two-sum/submissions/
    class Solution {
        //with nlogN
        public int[] twoSum(int[] nums, int target) {

            int n = nums.length;
            int [] original = Arrays.copyOf(nums,n);//for index purpose

            Arrays.sort(nums);
            int [] index = new int[]{-1,-1};
            int l = 0;
            int r = n-1;
            while(l<=r){
                int sum = nums[l] + nums[r];
                if(sum == target){
                    break;
                }
                if(sum < target){
                    l++;
                }else{
                    r--;
                }
            }

            int val1 = nums[l];
            int val2 = nums[r];
            int count = 0;
            for(int i = 0 ; i < n ; i++){
                if(val1 == original[i] || val2 == original[i]){
                    index[count] = i;
                    count++;
                }
            }


            return index;

        }
    }


/**
 //with more Memory optimized time

    public int[] twoSum(int[] nums, int target) {
        int [] result = new int[2];
        int n = nums.length;
        HashMap<Integer,Integer> map = new HashMap<>();
        for(int i = 0 ; i < n; i++){
            int diff = target - nums[i];
            if(map.containsKey(diff)){
                result[1] = i;
                result[0] = map.get(diff);
                return result;
            }
            map.put(nums[i],i);
        }

        return new int[]{-1,-1};
    }
 **/
}
