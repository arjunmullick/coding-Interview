package com.leetcode;

import java.util.ArrayList;
import java.util.List;

public class CombinationSum {

    //https://leetcode.com/problems/combination-sum/submissions/
    //backtracking with sum passed as backtrack variable
    /**
    Input: candidates = [2,3,6,7], target = 7
    Output: [[2,2,3],[7]]

    Time complexity: O(2^n)
    Space complexity: O(n)
    **/
    class Solution {
        public List<List<Integer>> combinationSum(int[] candidates, int target) {
            List<List<Integer>> result = new ArrayList<>();
            List<Integer> list = new ArrayList<>();
            backtrack(0,0,target,candidates,list,result);
            return result;
        }

        public void backtrack (int start,Integer sum,int target,int[] candidates,List<Integer> list,List<List<Integer>> result){
            if(sum == target)
                result.add(new ArrayList<>(list));

            if(sum > target) return; // because no negative numbers.

            for(int i = start ; i < candidates.length ; i++){
                list.add(candidates[i]);
                sum = sum+candidates[i];
                backtrack(i,sum,target,candidates,list,result);
                sum = sum-candidates[i];
                list.remove(list.size()-1);
            }
        }
    }
    //backtracking with sum calculation at each level
    class Solution2 {
        public List<List<Integer>> combinationSum(int[] candidates, int target) {
            List<List<Integer>> result = new ArrayList<>();
            List<Integer> list = new ArrayList<>();
            backtrack(0,target,candidates,list,result);
            return result;
        }

        public void backtrack (int start,int target,int[] candidates,List<Integer> list,List<List<Integer>> result){
            int sum = sumAll(list);
            if( sum == target)
                result.add(new ArrayList<>(list));

            if(sum > target) return;

            for(int i = start ; i < candidates.length ; i++){
                list.add(candidates[i]);
                backtrack(i,target,candidates,list,result);
                list.remove(list.size()-1);
            }
        }

        public int sumAll(List<Integer> list){
            int sum = 0;
            for(int i : list){
                sum+= i;
            }
            return sum;
        }
    }
}
