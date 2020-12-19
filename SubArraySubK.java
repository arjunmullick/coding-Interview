package com.leetcode;

import java.util.HashMap;

public class SubArraySubK {
    //https://leetcode.com/problems/subarray-sum-equals-k/
    class Solution {
        public int subarraySum(int[] nums, int k) {
            HashMap<Integer, Integer> map = new HashMap<Integer, Integer>();
            map.put(0, 1);//needed as first value zero sum and count to return sum = 0.
            int sum = 0;
            int count = 0;
            for (int i = 0; i < nums.length; i++) {
                sum += nums[i];
                if (map.get(sum - k) != null) {
                    count += map.get(sum - k);
                }
                map.put(sum, map.getOrDefault(sum, 0) + 1);
            }

            return count;
        }
    }
}
