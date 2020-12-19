package com.leetcode;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class PermutationsII {

    class Solution {
        public List<List<Integer>> permuteUnique(int[] nums) {

            List<List<Integer>> result = new ArrayList<>();
            List<Integer> list = new ArrayList<>();//first list
            for (int n : nums) {
                list.add(n);
            }
            backtrack(0, nums, list, result);
            return result;
        }

        public void backtrack(int index, int[] nums, List<Integer> list, List<List<Integer>> result) {
            if (index == list.size() && !result.contains(list)) { // last tree branch issue
                //the recursion start swaping from last element
                result.add(new ArrayList<>(list));//copy and add
            }
            for (int i = index; i < nums.length; i++) {
                swap(list, index, i);//swap all other with this index
                backtrack(index + 1, nums, list, result);
                swap(list, index, i);//reset
            }
        }

        private void swap(List<Integer> list, int index1, int index2) {
            int temp = list.get(index1);
            list.set(index1, list.get(index2));
            list.set(index2, temp);
        }
    }

    //Alternate Optimized
    class Solution2 {
        public List<List<Integer>> permuteUnique(int[] nums) {
            List<List<Integer>> res = new ArrayList<>();
            Arrays.sort(nums);
            boolean[] visited = new boolean[nums.length];
            helper(nums, res, new ArrayList<>(), visited);
            return res;
        }
        public void helper(int[] nums, List<List<Integer>> res, List<Integer> ans, boolean[] visited) {
            if (ans.size() == nums.length) {
                res.add(new ArrayList<>(ans));
                return;
            }
            for (int i = 0; i < nums.length; i++) {
                if (visited[i] || i > 0 && nums[i] == nums[i - 1] && !visited[i - 1]) {
                    continue;
                }
                ans.add(nums[i]);
                visited[i] = true;
                helper(nums, res, ans, visited);
                ans.remove(ans.size() - 1);
                visited[i] = false;
            }
        }
    }
}



