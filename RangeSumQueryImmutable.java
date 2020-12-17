package com.leetcode;

import java.util.HashMap;

public class RangeSumQueryImmutable {

    //https://leetcode.com/problems/range-sum-query-immutable/
    class NumArray {
        //[-2, 0, 3, -5, 2, -1]
        //[-2,-2, 1, -4,-2, -1]


        HashMap<Integer,Integer> indexSum;
        int[] nums;//original
        public NumArray(int[] nums) {
            this.nums = nums;
            indexSum = new HashMap<>();
            int n = nums.length;
            int sum = 0;
            for(int i=0 ;i< n ; i++){
                sum += nums[i];
                indexSum.put(i,sum);
            }
        }

        public int sumRange(int i, int j) {
            int val1 = indexSum.get(i);
            int val2 = indexSum.get(j);
            return (val2 - val1) + nums[i];

        }
    }
}
