package com.leetcode;

public class BinaryTreeMaximumPathSum {

    //https://leetcode.com/problems/binary-tree-maximum-path-sum/
    class Solution {
        int max = Integer.MIN_VALUE;
        public int maxPathSum(TreeNode root) {
            if(root == null) return 0;
            contribution(root);
            return max;
        }

        public int contribution(TreeNode node){
            if(node == null) return  0 ; // dont include the path.

            int L = Math.max(contribution(node.left),0); // max contribution from left
            int R = Math.max(contribution(node.right),0); // max contribution from right

            int LR = L + R + node.val; // path starting left and ending right subtree or vice versa
            max = Math.max(max,LR);
            return node.val + Math.max(L,R); // for parent we can include only one path.    
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
