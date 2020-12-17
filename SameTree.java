package com.leetcode;

public class SameTree {

    //https://leetcode.com/problems/same-tree/
    class Solution {
        public boolean isSameTree(TreeNode p, TreeNode q) {
            if(q == null && p == null) return true;

            if((q == null && p != null) || (p == null && q != null)) return false;

            if(q.val != p.val) return false;

            return isSameTree(p.left,q.left) && isSameTree(p.right,q.right);
        }
    }
    /**
     * Definition for a binary tree node.
     */

    public class TreeNode {
        int val;
        TreeNode left;
        TreeNode right;

        TreeNode() {
        }

        TreeNode(int val) {
            this.val = val;
        }

        TreeNode(int val, TreeNode left, TreeNode right){
            this.left = left;
            this.right = right;
        }
    }
}
