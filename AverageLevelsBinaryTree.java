package com.leetcode;

import java.util.LinkedList;
import java.util.List;
import java.util.Queue;

public class AverageLevelsBinaryTree {
    //https://leetcode.com/problems/average-of-levels-in-binary-tree/
    //Definition for a binary tree node. /
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

    class Solution {
        public List<Double> averageOfLevels(TreeNode root) {
            List<Double> result = new LinkedList<>();

            if(root == null) return result;

            Queue<TreeNode> queue = new LinkedList<>();
            queue.offer(root);

            while(queue.size() > 0){
                Queue<Integer> values = new LinkedList<>();
                LinkedList <TreeNode> level = new LinkedList<>();
                while(queue.size() > 0){
                    TreeNode node = queue.poll();
                    values.add(node.val);
                    if(node.left != null)
                        level.add(node.left);
                    if(node.right != null)
                        level.add(node.right);
                }
                long num = 0;
                long den = 0;
                while(values.size() > 0){
                    num += values.poll();
                    den += 1;
                }
                Double average = (double) num/den;
                queue = level;
                result.add(average);
            }

            return result;
        }
    }

}
