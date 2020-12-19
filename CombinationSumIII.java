package com.leetcode;

import java.util.ArrayList;
import java.util.List;

public class CombinationSumIII {

    //https://leetcode.com/problems/combination-sum-iii/
    class Solution {
        public List<List<Integer>> combinationSum3(int k, int n) {
            List<Integer> nums = new ArrayList<>();
            for(int i = 1 ; i <=9 ; i++){
                nums.add(i);
            }
            List<Integer> list = new ArrayList<>();
            List<List<Integer>> result = new ArrayList<>();
            backtrack(0,nums,0,k,n,list,result);
            return result;
        }

        public void backtrack(int start,List<Integer> nums, Integer sum , int k , int n ,List<Integer> list, List<List<Integer>> result){
            if(list.size() == k && sum == n){
                result.add(new ArrayList<>(list));
            }

            for(int i = start ; i < nums.size() ; i++){
                list.add(nums.get(i));
                sum = sum + nums.get(i);
                backtrack(i+1,nums,sum,k,n,list,result);
                sum = sum - nums.get(i);
                list.remove(list.size()-1);
            }
        }
    }
}
