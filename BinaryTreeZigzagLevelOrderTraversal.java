package com.leetcode;

import java.util.LinkedList;
import java.util.List;
import java.util.Queue;

public class BinaryTreeZigzagLevelOrderTraversal {
    //https://leetcode.com/problems/binary-tree-zigzag-level-order-traversal/
    class Solution {
        public List<List<Integer>> zigzagLevelOrder(TreeNode root) {
            List<List<Integer>> result = new LinkedList<>();
            if(root == null) return result;

            Queue<TreeNode> queue = new LinkedList<>();
            queue.add(root);
            boolean direction = false;
            while(queue.size() > 0){
                direction = !direction;
                Queue<TreeNode> level = new LinkedList<>();
                List<Integer> rlevel = new LinkedList<>();
                while(queue.size() > 0){
                    TreeNode node = queue.poll();
                    if(direction){
                        rlevel.add(node.val);
                    }else{
                        rlevel.add(0,node.val);
                    }

                    if(node.left != null) level.add(node.left);
                    if(node.right != null) level.add(node.right);
                }
                result.add(rlevel);
                queue = level;
            }

            return result;

        }
    }


    //Definition for a binary tree node /
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
