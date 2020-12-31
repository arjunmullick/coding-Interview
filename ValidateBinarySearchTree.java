package com.leetcode;

public class ValidateBinarySearchTree {

    //https://leetcode.com/problems/validate-binary-search-tree/
    class Solution {
        public boolean isValidBST(TreeNode root) {
            if(root == null)
                return true;
            return isValidBSTHelper(root,null,null);//passing null is better than int max and int low as it will fail if node is equal to max or min . Also edge case has int.max_values
        }

        public boolean isValidBSTHelper(TreeNode root, Integer lower , Integer upper) {
            if(root == null)
                return true;
            int val = root.val;
            if(null != lower && lower >= val)
                return false;
            if(null != upper && upper <= val)
                return false;
            return isValidBSTHelper(root.left,lower,val) && isValidBSTHelper(root.right,val,upper);
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
