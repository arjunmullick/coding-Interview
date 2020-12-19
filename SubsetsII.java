package com.leetcode;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class SubsetsII {
    //https://leetcode.com/problems/subsets-ii/
    class Solution {
        public List<List<Integer>> subsetsWithDup(int[] nums) {
            Arrays.sort(nums);
            List<List<Integer>> result = new ArrayList<>();
            List<Integer> list = new ArrayList<>();//temp list
            backtrack(0,nums,list , result);
            return result;
        }

        public void backtrack(int index , int[] nums, List<Integer> list, List<List<Integer>> result){
            result.add(new ArrayList<>(list));//copy a new one
            for(int i = index ; i < nums.length ; i++){
                if(i> index && nums[i] == nums[i-1]) continue;
                // i > index not i> 0 because we want first occurance to pass
                list.add(nums[i]);
                backtrack(i+1,nums,list,result);
                list.remove(list.size()-1);
            }
        }
    }
}
