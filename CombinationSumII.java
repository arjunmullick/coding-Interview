package com.leetcode;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class CombinationSumII {

    //https://leetcode.com/problems/combination-sum-ii/
    class Solution {
        public List<List<Integer>> combinationSum2(int[] candidates, int target) {
            Arrays.sort(candidates);
            List<List<Integer>> result = new ArrayList<>();
            List<Integer> list = new ArrayList<>();
            backtrack(0,0,target,candidates,list,result);
            return result;
        }

        public void backtrack (int start,Integer sum,int target,int[] candidates,List<Integer> list,List<List<Integer>> result){
            if(sum == target)
                result.add(new ArrayList<>(list));

            if(sum > target) return;

            for(int i = start ; i < candidates.length ; i++){
                if(i>start && candidates[i] == candidates[i-1]) continue;
                list.add(candidates[i]);
                sum = sum+candidates[i];
                backtrack(i+1,sum,target,candidates,list,result);
                sum = sum-candidates[i];
                list.remove(list.size()-1);
            }
        }
    }


    //Alternate way of thinking is to use used variable
    class Solution2 {
        public List<List<Integer>> combinationSum2(int[] candidates, int target) {
            Arrays.sort(candidates);
            List<List<Integer>> result = new ArrayList<>();
            List<Integer> list = new ArrayList<>();
            boolean[] used = new boolean[candidates.length];
            backtrack(0,0,target,candidates,used,list,result);
            return result;
        }

        public void backtrack (int start,Integer sum,int target,int[] candidates,boolean[] used,List<Integer> list,List<List<Integer>> result){
            if(sum == target)
                result.add(new ArrayList<>(list));

            if(sum > target) return;

            for(int i = start ; i < candidates.length ; i++){
                if(used[i] || i>start && candidates[i] == candidates[i-1]) continue;
                list.add(candidates[i]);
                sum = sum+candidates[i];
                used[i] = true;
                backtrack(i+1,sum,target,candidates,used,list,result);
                used[i] = false;
                sum = sum-candidates[i];
                list.remove(list.size()-1);
            }
        }
    }

}
