package com.leetcode;

import java.util.LinkedList;
import java.util.List;

//https://leetcode.com/problems/kth-smallest-element-in-a-bst/
public class KthSmallestElementBST {

    // No optimized , inorder till k nodes are added
    class Solution {

        public int kthSmallest(TreeNode root, int k) {
            List<TreeNode> arr = new LinkedList<>();
            inorder(root,arr,k);
            return arr.get(k-1).val;
        }

        public void inorder(TreeNode node , List<TreeNode> arr , int k){
            if(arr.size() == k) return;
            if(node == null) return;
            int val = node.val;
            inorder(node.left,arr,k);
            arr.add(node);
            inorder(node.right,arr,k);
        }
    }

    //We dont need to store all values . Memory optimized.
    class Solution2 {
        int count;
        int result;
        public int kthSmallest(TreeNode root, int k) {
            count = k;
            dfs(root);
            return result;
        }

        public void dfs(TreeNode node){
            if(node.left != null) dfs(node.left);
            count--;
            if(count == 0){//it will only happen once that count = 0 can also add if(count == 0) return; as first condition
                result = node.val;
                return;
            }
            if(node.right != null) dfs(node.right);

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


