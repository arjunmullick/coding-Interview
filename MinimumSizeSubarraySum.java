package com.leetcode;

import java.util.HashMap;

public class MinimumSizeSubarraySum {

    class Solution {
        //O(n) - sliding window / two pointers
        public int minSubArrayLen(int s, int[] nums) {
            if(nums.length == 0){
                return 0;
            }
            int n = nums.length;
            int minLen = n+1;
            int sum = 0;
            int start = 0;

            for(int end = 0 ; end < n ; end++){
                sum = nums[end] + sum;
                while(sum >= s){
                    minLen = Math.min(minLen , end - start +1);
                    sum = sum - nums[start];
                    start++;//It means that the first index can safely be incremented, since, the minimum subarray starting with this index with sum >= s has been achieved
                }
            }
            if(minLen == n+1){
                return 0;
            }
            return minLen;
        }
    }

    //we need an array min length whose sum  == s
    class MinimumSizeSubarraySumEqualK {

        public int minSubArrayLen(int s, int[] nums) {
            HashMap<Integer,Integer> map = new HashMap<>();
            int minLen = Integer.MAX_VALUE;
            int sum = 0;

            // all positive integers so sum value is unique at each location
            for(int i = 0 ; i < nums.length; i++){
                sum = sum + nums[i];
                if(sum == s){
                    minLen = i+1;//from 0 to this position is an array with sum
                }
                map.put(sum,i);//sum at each index
            }

            sum = 0;
            for(int i = 0 ; i < nums.length; i++){
                sum = sum + nums[i];
                if(map.containsKey(sum - s)){
                    int len = i - map.get(sum-s);
                    minLen = Math.min(len,minLen);
                }
            }

            if(minLen == Integer.MAX_VALUE) return 0;
            return minLen;

        }
    }
}
