package com.leetcode;

import java.util.ArrayList;
import java.util.List;

public class FindAllNumbersDisappeared {

    class Solution {
        public List<Integer> findDisappearedNumbers(int[] nums) {
            int n = nums.length;
            List<Integer> result = new ArrayList<>();
            for(int i = 0 ; i < n ; i++){
                int val = Math.abs(nums[i]);
                nums[val-1] = Math.abs(nums[val-1]) * -1;//index 0 so val -1
            }

            // find index where no is not positive
            for(int i = 0 ; i < n ; i++){
                if(nums[i] > 0){
                    result.add(i+1);
                }
            }

            return result;

        }
    }
}
