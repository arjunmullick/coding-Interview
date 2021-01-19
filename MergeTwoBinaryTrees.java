package com.leetcode;

public class MergeTwoBinaryTrees {

    class Solution {
        public TreeNode mergeTrees(TreeNode t1, TreeNode t2) {

            return merge(t1,t2);
        }

        public TreeNode merge(TreeNode t1 , TreeNode t2){
            if(t1 == null && t2 == null) return null;
            if(t1 ==null) return t2;
            if(t2 == null) return t1;
            TreeNode node = new TreeNode(t1.val + t2.val);
            node.left = merge(t1.left,t2.left);
            node.right = merge(t1.right,t2.right);
            return node;
        }
    }
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
