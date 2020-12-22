package com.leetcode;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class PartitionKEqualSumSubsets {
    //https://leetcode.com/problems/partition-to-k-equal-sum-subsets/
    //Reference https://leetcode.com/problems/partition-to-k-equal-sum-subsets/discuss/180014/Backtracking-Thinking-Process
    class Solution {
        public boolean canPartitionKSubsets(int[] nums, int k) {
            int sum = 0, maxNum = 0;
            for (int num : nums) {
                sum += num;
                maxNum = Math.max(maxNum, num);
            }
            if (sum % k != 0 || maxNum > sum / k) {
                return false;
            }
            return backtrack(nums, k, new boolean[nums.length], sum / k, 0, 0);
        }

        private boolean backtrack(int[] nums, int k, boolean[] visited, int target, int currentSum, int index) {
            if (k == 0) return true;
            //if(index >= nums.length) return false; // - check in loop due to many bracnh
            if(currentSum > target) return false;
            //if(visited[index]) return false;
            if (currentSum == target) {
                //NOTE : it may or may not be a right set say [1,2,2] in [4, 3, 2, 3, 5, 2, 1], k = 4 is not a valid ans
                return backtrack(nums,k-1,visited,target,0,0); //start search again keeping visited elements in child recursion tree k* 2^N complixity
            }

            for (int i = index; i < nums.length; i++) {
                if (!visited[i]) {
                    visited[i] = true;
                    if(backtrack(nums, k,visited,target, currentSum + nums[i], i+1)){
                        return true;
                    }
                    visited[i] = false;
                }
            }

            return false;
        }
    }

    class Error {
        //To do by backtracking we will need all permutation as
        //[4, 3, 2, 3, 5, 2, 1], k = 4 -> [1,2,2] is not a valid subset as if taken will not create 4 parts.

        //divide totalsum in K parts , find all partition whose sum equal to part by backtracking
        // Backtrack and use if found a list return true so visited array is not cleared
        //if found K such list in backtracking result (globally) we are successful
        //all positive so break if sum > required sum of part

        List<List<String>> result;
        int target;
        int len;
        boolean [] accounted;

        public boolean canPartitionKSubsets(int[] nums, int k) {
            Arrays.sort(nums);
            result = new ArrayList<>();
            len = k;
            List<Integer> temp = new ArrayList<>();
            int n = nums.length;
            int totalSum = 0;
            for(int i = 0 ; i < n ; i++){
                totalSum += nums[i];
            }

            if(totalSum%k != 0) return false;
            target = totalSum/k;
            boolean visiting[] = new boolean[n];
            accounted = new boolean[n];
            backtrack(0,0,nums,temp,visiting);


            for(boolean b : accounted){
                System.out.print(b + " ");
                //if(!b) return false;
            }
            return true;

        }


        public void backtrack(int index , int currentSum, int[] nums,List<Integer> list, boolean visiting []){
            if(index >= nums.length) return;

            if(visiting[index] || accounted[index]) return;

            if(currentSum > target) return;

            if(currentSum == target){//if we find K subproblems then all index will be accounted
                for(int i : list){
                    accounted[i] = true;//account for all index in a subset
                }
                return;
            }

            for(int i = index ; i < nums.length ; i++){
                visiting[i] = true;
                list.add(i);
                backtrack(i+1,currentSum+nums[i],nums,list,visiting);
                list.remove(list.size()-1);
                visiting[i] = false;
            }

        }
    }

}

