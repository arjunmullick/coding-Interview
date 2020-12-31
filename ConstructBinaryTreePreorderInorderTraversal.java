package com.leetcode;

import java.util.HashMap;

public class ConstructBinaryTreePreorderInorderTraversal {
    //https://leetcode.com/problems/construct-binary-tree-from-preorder-and-inorder-traversal/
    
    class Solution {

        int [] preorder;
        int [] inorder;
        int preid;
        HashMap<Integer,Integer> map;//inorder val to index lookup

        //preorder N L R
        //inorder L N R
        public TreeNode buildTree(int[] preorder, int[] inorder) {
            int n = inorder.length;
            if(preorder.length != n) return null;
            if(n == 0) return null;
            map = new HashMap<>();

            this.preorder = preorder;
            this.inorder = inorder;
            this.preid = 0;

            for(int i = 0 ; i < n ; i++){
                map.put(inorder[i],i);//inorder val to index
            }
            return constructTree(0,n);
        }

        public TreeNode constructTree(int left , int right){
            if(left == right) return null;
            int val = preorder[preid];
            TreeNode node = new TreeNode(val);
            preid++;
            int inIndex = map.get(val);
            node.left = constructTree(left,inIndex);
            node.right = constructTree(inIndex+1,right);
            return node;
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
