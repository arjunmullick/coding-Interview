package com.leetcode;

/* Note this question is named incorrectly it should be Permutation Sum
    [1,1,2] and [2,1,1] are same combination.

    Trying to focus easy of solving , concept building and recognizing pattern , will go in steps o best solution
*/

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class CombinationSumIV {

    // Intuition - Generate and store  - more memory for sure . A backtracking Algo seems good
    // Memory exceed and TLE
    class Solution {

        //backtrack and check sum to store or terminate condition
        public int combinationSum4(int[] nums, int target) {
            List<List<Integer>> result = new ArrayList<>();
            List<Integer> temp = new ArrayList<>();
            backtrack(0,0,target,nums,temp,result);
            return result.size();
        }

        public void backtrack(int pos , int sum , int target , int[] nums, List<Integer> list, List<List<Integer>> result){

            if(sum > target) return;
            if(sum == target) result.add(new ArrayList<>(list));//copy and add

            for(int i = 0 ; i < nums.length ; i++){ // do this for unique combination for(int i = pos ; i < nums.length ; i++)
                list.add(nums[i]);
                backtrack(pos,sum+nums[i],target,nums,list,result);
                list.remove(list.size()-1);
            }
        }
    }

    //We dont need to store list in this , lets use global variable and increase it when find a sum == target
    class SolutionTLE {

        int result;

        //backtrack and check sum to store or terminate condition
        public int combinationSum4(int[] nums, int target) {
            result = 0;
            List<Integer> temp = new ArrayList<>();

            //start, sum , ...
            backtrack(0, 0, target, nums, temp);
            return result;
        }

        public void backtrack(int pos, int sum, int target, int[] nums, List<Integer> list) {

            if (sum > target) return;
            if (sum == target) {
                this.result++;
            }

            for (int i = pos; i < nums.length; i++) {
                list.add(nums[i]);
                backtrack(pos, sum + nums[i], target, nums, list);
                list.remove(list.size() - 1);
            }
        }
    }

    //The above is backtracking , at each recursion tree end when sum > target
    // The recursion can also be done to generate sub problem and return combination count
    // Difference is instead of sum we use diff.// This is TLE too
    // The above backtrack we can store sum in dp / memory but increasing result is hard . DP on diff recursion can be an improvement

    // Adding Dynamic Programming/Memorization  on above recursion
    //top-down recursion
    class SolutionRecWithMemo {
        public int combinationSum4(int[] nums, int target) {
            HashMap<Integer,Integer> memo = new HashMap<>();
            return dfs(0,target,nums,memo);
        }

        public int dfs(int pos ,int amount, int[] nums , HashMap<Integer,Integer> memo){

            if(amount == 0){
                return 1;
            }
            if(memo.containsKey(amount)) return memo.get(amount);
            int c = 0;
            for(int i = 0 ; i < nums.length ; i++){ // this is permutation 
                int diff = amount - nums[i];

                if(diff >=0){
                    c += dfs(i, diff,nums,memo);
                }
            }
            memo.put(amount,c);
            return c;
        }
    }

    //bottom-up
    class SolutionAccepted2 {
        public int combinationSum4(int[] nums, int target) {
            int[] comb = new int[target + 1];
            comb[0] = 1;
            for (int i = 1; i < comb.length; i++) {
                for (int j = 0; j < nums.length; j++) {
                    if (i - nums[j] >= 0) {
                        comb[i] += comb[i - nums[j]];
                    }
                }
            }
            return comb[target];
        }
    }
}

