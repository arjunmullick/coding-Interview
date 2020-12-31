package com.leetcode;

public class LowestCommonAncestorBinaryTree {

    //https://leetcode.com/problems/lowest-common-ancestor-of-a-binary-search-tree/
    class Solution {
        public TreeNode lowestCommonAncestor(TreeNode root, TreeNode p, TreeNode q) {
            if (root == null || root == p || root == q) return root;
            TreeNode lt = lowestCommonAncestor(root.left, p, q);
            TreeNode rt = lowestCommonAncestor(root.right, p, q);
            if (lt == null && rt != null) return rt;
            if (lt != null && rt == null) return lt;
            if (lt == null && rt == null) return null;
            return root;
        }
    }
    //Definition for a binary tree node.
      public class TreeNode {
          int val;
          TreeNode left;
          TreeNode right;
          TreeNode(int x) { val = x; }
      }
}
