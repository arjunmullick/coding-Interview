package com.leetcode;

import java.util.ArrayList;
import java.util.Deque;
import java.util.LinkedList;
import java.util.List;

public class MaximumWidthOfBinaryTree {


    // Check BFS solution , its intutive 
    class Solution {

        //id left 2i and right is 21+1;
        //width is right - left +1
        public int widthOfBinaryTree(TreeNode root) {
            List<Integer> levelList = new ArrayList<>(); // this will store left most node in level
            return dfs(root,0,1,levelList);
        }

        public int dfs(TreeNode node , int level , int id , List<Integer> levelList){
            if(node == null) return 0;

            if(levelList.size() == level){// size is 0 at root and 1 at level 1
                levelList.add(id);//left mode node starting this level
            }

            //left child as parent_id  2 and right child as parent_id  2 + 1
            int left = dfs(node.left,level+1, 2* id , levelList);
            int right = dfs(node.right,level+1, 2* id + 1 , levelList);
            int maxChild = Math.max(left,right);
            //if this is the rightmost element then width
            int currentWidth = id - levelList.get(level) +1; //r-l+1
            int nextLevelSize = Math.max(maxChild,currentWidth);
            return nextLevelSize;
        }
    }


    class SolutionBFS {
        public int widthOfBinaryTree(TreeNode root) {

            if(root == null) return 0;

            Deque<TreeNode> queue = new LinkedList<>();
            queue.offer(root);
            int max = 0;
            int level = 0;
            while(queue.size() > 0){
                int size = queue.size();
                level++;
                max = Math.max(max,size);
                while(size > 0){
                    TreeNode node = queue.poll();
                    size--;
                    if(node == null){
                        queue.offer(null);
                        queue.offer(null);
                    }else {
                        queue.offer(node.left);
                        queue.offer(node.right);
                    }
                }
                //remove all null in begining and end
                while(queue.size() > 0 && queue.peekFirst() == null){
                    queue.pollFirst();
                }
                while(queue.size() > 0 && queue.peekLast() == null){
                    queue.pollLast();
                }
            }
            return max;
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
