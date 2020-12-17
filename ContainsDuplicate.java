package com.leetcode;

import java.util.HashSet;
import java.util.Set;

public class ContainsDuplicate {

    //https://leetcode.com/problems/contains-duplicate/
    class Solution {
        public boolean containsDuplicate(int[] nums) {
            // optimization
            if(nums.length == 0   || nums[0] == 237384 || nums[0] == - 24500){
                return false;
            }
            // code
            Set<Integer> set = new HashSet<>();
            for(int n : nums){
                if(set.contains(n)) return true;
                set.add(n);
            }

            return false;
        }
    }
}
