package com.leetcode;

import java.util.HashMap;

public class JumpGame {

    //https://leetcode.com/problems/jump-game/
    /**
    Input: nums = [2,3,1,1,4]
    Output: true
    Explanation: Jump 1 step from index 0 to 1, then 3 steps to the last index.
    **/

    class Solution {
        public boolean canJump(int[] nums) {
            int reach=0,n=nums.length;
            for(int i=0;i<n;i++)
            {
                reach=Math.max(reach,i+nums[i]);
                if(reach>=n-1)
                    return true;
                if(!(reach>i))////means cannot go ahead than current reach < i or reach == i
                    return false;
            }
            return true;
        }
    }


    // Recursion with Memo
    class SolutionTLE {

        boolean canReach;//just need one path

        public boolean canJump(int[] nums) {
            HashMap<Integer,Boolean> memo = new HashMap<>(); // to store if at index if can be reached.
            int n = nums.length;
            return backtrack(0,n-1,nums,memo);

        }

        public boolean backtrack(int start, int target , int [] nums, HashMap<Integer,Boolean> memo){
            if(memo.containsKey(start)) return memo.get(start);
            if(canReach) return false;//terminate if any one solution is found

            if(start == target){
                memo.put(start,true);
                canReach = true;
                return true;
            }

            int jump = nums[start];

            boolean found = false;
            for(int i = 1 ; i <=jump ; i++){
                if(start+i <= target)
                    found = found || backtrack(start+i,target,nums,memo);
            }
            memo.put(start,found);
            return found;

        }
    }

    /**
     * Simple Recursion solution to add memo later.
     */

    class SolutionSimpleRec {

        boolean canReach;//just need one path

        public boolean canJump(int[] nums) {
            canReach = false;
            int n = nums.length;
            backtrack(0,n-1,nums);
            return canReach;
        }

        public void backtrack(int start, int target , int [] nums){

            if(canReach) return;//terminate if any one solution is found

            if(start == target){
                canReach = true;
                return;
            }

            int jump = nums[start];

            for(int i = 1 ; i <=jump ; i++){
                if(start+i <= target)
                    backtrack(start+i,target,nums);
            }
        }
    }
}
