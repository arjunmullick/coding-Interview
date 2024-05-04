package com.leetcode;

import java.util.ArrayList;
import java.util.List;

/**
Input: nums = [1,2,3]
Output: [[],[1],[2],[1,2],[3],[1,3],[2,3],[1,2,3]]

Time complexity: O(2^n)
Space complexity: O(n)

// Wrong //O(N×2^N) Space and same O(N×2^N) Time

**/
public class Subsets {
    //https://leetcode.com/problems/subsets/
    class Solution {
        public List<List<Integer>> subsets(int[] nums) {
            List<List<Integer>> result = new ArrayList<>();
            List<Integer> list = new ArrayList<>();//temp list
            backtrack(0,nums,list , result);
            return result;
        }

        public void backtrack(int index , int[] nums, List<Integer> list, List<List<Integer>> result){
            result.add(new ArrayList<>(list));//copy a new one
            for(int i = index ; i < nums.length ; i++){
                list.add(nums[i]);
                backtrack(i+1,nums,list,result);
                list.remove(list.size()-1);
            }
        }
    }
}
