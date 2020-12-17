package com.leetcode;

public class PathSum {

      //https://leetcode.com/problems/path-sum/

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

    class Solution {
        public boolean hasPathSum(TreeNode root, int sum) {

            if(root == null) return false;
            return hasPathSumHelper(root,sum,0);
        }

        public boolean hasPathSumHelper(TreeNode node, int target , int sum){

            sum = sum + node.val;
            if(node.left == null && node.right == null){
                if(sum == target) return true;
                else return false;
            }
            boolean leftHasSum = false;
            if(node.left != null){
                leftHasSum = hasPathSumHelper(node.left, target , sum);
            }

            boolean rightHasSum = false;
            if(node.right != null){
                rightHasSum = hasPathSumHelper(node.right, target , sum);
            }

            return rightHasSum || leftHasSum;
        }
    }
}
