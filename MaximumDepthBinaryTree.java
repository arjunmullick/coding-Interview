package com.leetcode;

import java.util.LinkedList;
import java.util.Queue;

public class MaximumDepthBinaryTree {

    //https://leetcode.com/problems/maximum-depth-of-binary-tree/
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

    //BFS
    class Solution {

        public int maxDepth(TreeNode root) {
            if(root == null) return 0;
            Queue<TreeNode> queue = new LinkedList<>();
            queue.offer(root);
            int depth = 0;
            while(queue.size() > 0){
                depth++;
                Queue<TreeNode> level = new LinkedList<>();
                while(queue.size() >0){
                    TreeNode node = queue.poll();
                    if(node.left != null){
                        level.offer(node.left);
                    }
                    if(node.right != null){
                        level.offer(node.right);
                    }
                }
                queue = level;
            }

            return depth;
        }
    }

    //DFS
    class Solution2 {
        int max;
        public int maxDepth(TreeNode root) {
            if(root == null) return 0;
            max = Integer.MIN_VALUE;
            maxDepthHelper(root,0);
            return max;
        }

        public void maxDepthHelper(TreeNode node,int depth){
            if(node == null) return;

            if(node.left == null && node.right == null){
                max = Math.max(max,depth+1);
                return;
            }

            maxDepthHelper(node.left,depth+1);
            maxDepthHelper(node.right,depth+1);
        }
    }
}
