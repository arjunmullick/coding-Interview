package com.leetcode;

public class LowestCommonAncestorBinarySearchTree {
    // https://leetcode.com/problems/lowest-common-ancestor-of-a-binary-search-tree/

    //Definition for a binary tree node.
      public class TreeNode {
          int val;
          TreeNode left;
          TreeNode right;
          TreeNode(int x) { val = x; }
      }

    class Solution {
        public TreeNode lowestCommonAncestor(TreeNode root, TreeNode p, TreeNode q) {
            if(root == null) return null;
            if(root == p) return p;
            if(root == q) return q;

            int val = root.val;
            int pval = p.val;
            int qval = q.val;

            //if(pval < val && qval > val){
            //    return root;
            //}

            if(pval < val && qval < val){
                return lowestCommonAncestor(root.left,p,q);
            }

            if(pval > val && qval > val){
                return lowestCommonAncestor(root.right,p,q);
            }

            return root;
        }

    }
}


// Not a BST 
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

/**
  Not a BST
  
  class Solution {
    public TreeNode lowestCommonAncestor(TreeNode root, TreeNode p, TreeNode q) {
       if(root == null) return root;
       if(p == q) return p;
       
       return contains(root , p, q);
    }
    
    public TreeNode contains(TreeNode node , TreeNode p , TreeNode q){
        if(node == null) return null;
        if(node == p) return p;
        if(node == q) return q;
        TreeNode left = contains(node.left , p,q);
        TreeNode right = contains(node.right , p,q);
        if(left != null && right != null){
            return node;
        }
        if(left == null && right != null) return right;
        if(left != null && right == null) return left;
        if(left == null && right == null) return null;
        return node;
        
        
    }
}
  
 // Alternate  
  class Solution {
      public TreeNode lowestCommonAncestor(TreeNode root, TreeNode p, TreeNode q) {
          if(root == null)
              return null;
 
          if(root == p){
              return p;
          }
 
          if(root == q){
              return q;
          }
 
          boolean pLeft = containsNode(root.left,p);
          boolean qLeft = containsNode(root.left,q);
          boolean pRight = containsNode(root.right,p);
          boolean qRight = containsNode(root.right,q);
 
          if((pLeft && qRight)|| (qLeft && qRight))
              return root;
 
          if(pLeft && qLeft)
              return lowestCommonAncestor(root.left,p,q);
          if(qRight && pRight)
              return lowestCommonAncestor(root.right,p,q);
 
          return root;
      }
 
      public boolean containsNode(TreeNode root , TreeNode node){
          if(root == null)
              return false;
          if(root == node)
              return true;
          return containsNode(root.left , node) || containsNode(root.right , node);
      }
  }
 **/
