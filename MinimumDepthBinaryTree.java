package com.leetcode;

import java.util.LinkedList;
import java.util.Queue;

public class MinimumDepthBinaryTree {
    //https://leetcode.com/problems/minimum-depth-of-binary-tree/

    class Solution {

        //BFS
        public int minDepth(TreeNode root) {
            if(root == null) return 0;

            int depth = 0;
            Queue<TreeNode> queue = new LinkedList<>();
            queue.offer(root);

            while(queue.size() > 0){
                Queue<TreeNode> level = new LinkedList<>();
                depth++;
                while(queue.size() > 0){
                    TreeNode node = queue.poll();
                    if(node.left == null && node.right == null)
                        return depth;
                    if(node.left != null)
                        level.offer(node.left);
                    if(node.right != null)
                        level.offer(node.right);
                }
                queue = level;
            }
            return depth;
        }
    }


/** DFS
 * class Solution {
 *
 *     int min;
 *     public int minDepth(TreeNode root) {
 *         min = Integer.MAX_VALUE;
 *         if(root == null) return 0;
 *         minDepthHelper(root,1);
 *         return min;
 *     }
 *
 *     public void minDepthHelper(TreeNode root, int depth){
 *         if(root == null) return;
 *
 *         //if leaf then calculate
 *         if(root.left == null && root.right == null){
 *             min = Math.min(min,depth);
 *             return;
 *         }
 *         minDepthHelper(root.left, depth+1);
 *         minDepthHelper(root.right, depth+1);
 *     }
 * }
 **/

    /**
     * Definition for a binary tree node.
     */

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
