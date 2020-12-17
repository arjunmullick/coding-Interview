package com.leetcode;

import java.util.LinkedList;
import java.util.List;
import java.util.Queue;

public class BinaryTreeLevelOrderTraversalII {
    //https://leetcode.com/problems/binary-tree-level-order-traversal-ii/
    class Solution {
        public List<List<Integer>> levelOrderBottom(TreeNode root) {
            List<List<Integer>> result = new LinkedList<>();
            if(root == null) return result;
            Queue<TreeNode> queue = new LinkedList<>();

            queue.offer(root);

            while(queue.size() > 0){
                LinkedList<TreeNode> level = new LinkedList<>();
                List<Integer> values = new LinkedList<>();
                while(queue.size() > 0){
                    TreeNode node = queue.poll();
                    values.add(node.val);
                    if(node.left != null)
                        level.offer(node.left);
                    if(node.right != null)
                        level.offer(node.right);
                }
                result.add(0,values);
                queue = level;
            }

            return result;
        }
    }

    //Definition for a binary tree node.
    public class TreeNode {
        int val;
        TreeNode left;
        TreeNode right;

        TreeNode() {
        }

        TreeNode(int val) {
            this.val = val;
        }

        TreeNode(int val, TreeNode left, TreeNode right) {
            this.val = val;
            this.left = left;
            this.right = right;
        }
    }
}

