package com.leetcode;

import java.util.HashMap;

public class PathSumIII {

    class Solution {
        //https://leetcode.com/problems/path-sum-iii/submissions/
        //prepare a prefix sum map, with count of how many time sum appeared. if branch sum - target exist then update count .
        // Similar to 1D array of continuous subarray equal sum
        // the difference here is we need to start at all index. In TreeGraph its possible to backtrack by clearing sum
        // 1D array https://leetcode.com/problems/subarray-sum-equals-k/
        int count = 0;
        public int pathSum(TreeNode root, int sum) {
            HashMap<Integer,Integer> prefixSum = new HashMap<>();
            prefixSum.put(0,1);//zero sum count
            dfs(root,0,sum,prefixSum);
            return count;
        }

        public void dfs(TreeNode node, int sum , int target , HashMap<Integer,Integer> prefixSum ){

            if(node == null) return;

            sum = sum + node.val;
            if(prefixSum.containsKey(sum - target)){
                count = count + prefixSum.get(sum - target);
            }

            prefixSum.put(sum, prefixSum.getOrDefault(sum,0)+1);
            dfs(node.left,sum,target,prefixSum);
            dfs(node.right,sum,target,prefixSum);
            prefixSum.put(sum, prefixSum.getOrDefault(sum,0)-1);// this is be


        }
    }


    // Definition for a binary tree node.
      public class TreeNode {
          int val;
          TreeNode left;
          TreeNode right;
          TreeNode() {}
          TreeNode(int val) { this.val = val; }
          TreeNode(int val, TreeNode left, TreeNode right) {
              this.val = val;
              this.left = left;
              this.right = right;
          }
      }
}
