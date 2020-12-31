package com.leetcode;

public class MaximumBinaryTree {
    //https://leetcode.com/problems/maximum-binary-tree/

    class Solution {
        public TreeNode constructMaximumBinaryTree(int[] nums) {
            int n = nums.length;
            return constructTree(nums,0,n-1);
        }

        public TreeNode constructTree(int [] nums ,int left , int right){
            int n = nums.length;
            if(left < 0 || right >=n || left>right)
                return null;

            if(left == right) return new TreeNode(nums[left]);

            int maxIndex = max(nums,left,right);
            TreeNode node = new TreeNode(nums[maxIndex]);
            node.left = constructTree(nums , left , maxIndex -1);
            node.right = constructTree(nums , maxIndex +1 , right);
            return node;
        }

        public int max(int[] nums , int left , int right){
            int maxIndex = left;
            for(int i = left ; i <= right ; i++){
                if(nums[i] > nums[maxIndex]){
                    maxIndex = i;
                }
            }
            return maxIndex;
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
