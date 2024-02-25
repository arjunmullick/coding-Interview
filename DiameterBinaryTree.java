package com.leetcode;

public class DiameterBinaryTree {
    //https://leetcode.com/problems/diameter-of-binary-tree/
    class Solution {

        int max;
        public int diameterOfBinaryTree(TreeNode root) {
            max = Integer.MIN_VALUE;
            if(root == null) return 0;
            getDepth(root);
            return max == Integer.MIN_VALUE ? 0 : max;

        }

        public int getDepth(TreeNode node){
            if(node == null) return 0;
            if(node.left == null && node.right == null) return 1;
            int leftDepth = getDepth(node.left);
            int rightDepth = getDepth(node.right);
            int depth =  Math.max(leftDepth,rightDepth);// if both leaf 2 count,  counting self so L+R+1 not needed. 
            max = Math.max(leftDepth+rightDepth , max);
            return depth+1;
        }
    }

    //Definition for a binary tree node.
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
